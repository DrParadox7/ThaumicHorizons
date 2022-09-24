//
// Decompiled by Procyon v0.5.30
//

package com.kentington.thaumichorizons.client.renderer.block;

import com.kentington.thaumichorizons.common.ThaumicHorizons;
import com.kentington.thaumichorizons.common.blocks.BlockVatSolid;
import com.kentington.thaumichorizons.common.tiles.TileVat;
import com.kentington.thaumichorizons.common.tiles.TileVatSlave;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;

public class BlockVatSolidRender implements ISimpleBlockRenderingHandler {
    public void renderInventoryBlock(
            final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {}

    public boolean renderWorldBlock(
            final IBlockAccess world,
            final int x,
            final int y,
            final int z,
            final Block block,
            final int modelId,
            final RenderBlocks renderer) {
        if (world.getTileEntity(x, y, z) instanceof TileVatSlave) {
            final TileVatSlave tco = (TileVatSlave) world.getTileEntity(x, y, z);
            final TileVat boss = tco.getBoss(-1);
            if (boss == null) {
                return false;
            }
            Tessellator.instance.setColorOpaque_F(1.0f, 1.0f, 1.0f);
            Tessellator.instance.setBrightness(150);
            renderer.enableAO = false;
            final int dx = boss.xCoord - tco.xCoord;
            final int dy = boss.yCoord - tco.yCoord;
            final int dz = boss.zCoord - tco.zCoord;
            if (world.getBlockMetadata(x, y, z) == 6) {
                renderer.renderFaceXNeg(
                        block,
                        (double) x,
                        (double) y,
                        (double) z,
                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                renderer.renderFaceZNeg(
                        block,
                        (double) x,
                        (double) y,
                        (double) z,
                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                renderer.renderFaceXPos(
                        block,
                        (double) x,
                        (double) y,
                        (double) z,
                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                renderer.renderFaceZPos(
                        block,
                        (double) x,
                        (double) y,
                        (double) z,
                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                renderer.renderFaceYNeg(
                        block,
                        (double) x,
                        (double) y,
                        (double) z,
                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseCenter);
                renderer.renderFaceYPos(
                        block,
                        (double) x,
                        (double) y,
                        (double) z,
                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCenter);
            } else {
                if (world.getBlockMetadata(x, y, z) == 4) {
                    renderer.renderFaceXNeg(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                    renderer.renderFaceZNeg(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                    renderer.renderFaceXPos(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                    renderer.renderFaceZPos(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSide);
                    renderer.renderFaceYNeg(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseSideBottom);
                    if (dx == 0) {
                        if (dz == -1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerPosZ);
                        } else if (dz == 1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerNegZ);
                        }
                    } else if (dz == 0) {
                        if (dx == -1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerPosX);
                        } else if (dx == 1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerNegX);
                        }
                    }
                    return true;
                }
                if (world.getBlockMetadata(x, y, z) == 5 && dy == 3) {
                    renderer.renderFaceXNeg(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseLeftRight);
                    renderer.renderFaceZNeg(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseLeftRight);
                    renderer.renderFaceXPos(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseLeftRight);
                    renderer.renderFaceZPos(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseLeftRight);
                    renderer.renderFaceYNeg(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconBaseCenter);
                    if (dx == -1) {
                        if (dz == -1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerD);
                        } else if (dz == 1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerC);
                        }
                    } else if (dx == 1) {
                        if (dz == -1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerA);
                        } else if (dz == 1) {
                            renderer.renderFaceYPos(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerB);
                        }
                    }
                    return true;
                }
                if (world.getBlockMetadata(x, y, z) == 5) {
                    renderer.renderFaceYPos(
                            block,
                            (double) x,
                            (double) y,
                            (double) z,
                            ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconGreatwood);
                    if (dx == 0 || dz == 0) {
                        renderer.renderFaceXNeg(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidSideCenter);
                        renderer.renderFaceZNeg(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidSideCenter);
                        renderer.renderFaceXPos(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidSideCenter);
                        renderer.renderFaceZPos(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidSideCenter);
                        if (dz == -1) {
                            renderer.renderFaceYNeg(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerPosZ);
                        } else if (dz == 1) {
                            renderer.renderFaceYNeg(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerNegZ);
                        } else if (dx == -1) {
                            renderer.renderFaceYNeg(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerPosX);
                        } else if (dx == 1) {
                            renderer.renderFaceYNeg(
                                    block,
                                    (double) x,
                                    (double) y,
                                    (double) z,
                                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerNegX);
                        }
                    } else {
                        renderer.renderFaceXNeg(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidLeftRight);
                        renderer.renderFaceZNeg(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidLeftRight);
                        renderer.renderFaceXPos(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidLeftRight);
                        renderer.renderFaceZPos(
                                block,
                                (double) x,
                                (double) y,
                                (double) z,
                                ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidLeftRight);
                        if (dx == -1) {
                            if (dz == -1) {
                                renderer.renderFaceYNeg(
                                        block,
                                        (double) x,
                                        (double) y,
                                        (double) z,
                                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerD);
                            } else if (dz == 1) {
                                renderer.renderFaceYNeg(
                                        block,
                                        (double) x,
                                        (double) y,
                                        (double) z,
                                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerC);
                            }
                        } else if (dx == 1) {
                            if (dz == -1) {
                                renderer.renderFaceYNeg(
                                        block,
                                        (double) x,
                                        (double) y,
                                        (double) z,
                                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerA);
                            } else if (dz == 1) {
                                renderer.renderFaceYNeg(
                                        block,
                                        (double) x,
                                        (double) y,
                                        (double) z,
                                        ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCornerB);
                            }
                        }
                    }
                    return renderer.enableAO = true;
                }
            }
        } else if (world.getBlockMetadata(x, y, z) == 7) {
            Tessellator.instance.setColorOpaque_F(1.0f, 1.0f, 1.0f);
            renderer.enableAO = false;
            renderer.renderFaceYPos(
                    block,
                    (double) x,
                    (double) y,
                    (double) z,
                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconLidCenterTop);
            renderer.renderFaceYNeg(
                    block,
                    (double) x,
                    (double) y,
                    (double) z,
                    ((BlockVatSolid) ThaumicHorizons.blockVatSolid).iconInnerCenter);
            return renderer.enableAO = true;
        }
        renderer.enableAO = true;
        return false;
    }

    public boolean shouldRender3DInInventory(final int modelId) {
        return false;
    }

    public int getRenderId() {
        return ThaumicHorizons.blockVatSolidRI;
    }
}
