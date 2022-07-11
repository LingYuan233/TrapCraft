package top.furryliy.trap_craft.blocks.mine.normal;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

public class NormalMineO extends Block {
    public NormalMineO(Settings settings) {
        super(settings);
    }
    private String playerName;
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0,0.0,3.25,13.0,0.2,13.25);

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (placer instanceof PlayerEntity){
            this.playerName = placer.getName().asString();
        }
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof PlayerEntity){
            String name = entity.getName().asString();
            if (name == this.playerName){
                return;
            }
        }
        world.createExplosion(entity, entity.getX(), entity.getY(), entity.getZ(), 5, true, Explosion.DestructionType.DESTROY);
        entity.damage(DamageSource.explosion((Explosion) null),100.0f);
    }
}
