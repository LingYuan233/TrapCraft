package top.furryliy.trap_craft.blocks.trap;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GrassTrap extends Block {
    public GrassTrap(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Block.createCuboidShape(0.0,14.0,0.0,16.0,16.0,16.0);
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        //
        world.breakBlock(pos,false, entity);
    }
}
