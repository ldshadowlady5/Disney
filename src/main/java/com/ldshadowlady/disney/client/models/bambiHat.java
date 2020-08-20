package com.ldshadowlady.disney.client.model.bambiHat;
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports



import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.minecraft.entity.Entity;


public class bambiHat extends BipedModel {
	private final RendererModel group;
	private final RendererModel bone;

	public bambiHat() {
		textureWidth = 16;
		textureHeight = 16;

		group = new RendererModel(this);
		group.setRotationPoint(-8.0F, 16.0F, 8.0F);
		group.cubeList.add(new ModelBox(group, 14, 12, 2.5F, -4.0F, -8.5F, 1, 4, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 12, 12.5F, -4.0F, -8.5F, 1, 4, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 2, 11, 3.5F, -5.0F, -8.5F, 1, 3, 1, 0.0F, true));
		group.cubeList.add(new ModelBox(group, 2, 11, 11.5F, -5.0F, -8.5F, 1, 3, 1, 0.0F, true));
		group.cubeList.add(new ModelBox(group, 12, 12, 5.5F, -3.0F, -8.5F, 1, 1, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 12, 12, 9.5F, -3.0F, -8.5F, 1, 1, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 12, 12, 4.5F, -4.0F, -8.5F, 1, 2, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 1, 12, 10.5F, -4.0F, -8.5F, 1, 2, 1, 0.0F, true));

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 9, 12, -3.5F, -10.0F, -4.5F, 7, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 4, -3.5F, -10.0F, 3.5F, 7, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 9, 6, -4.5F, -10.0F, -3.5F, 9, 1, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 3, 8, -4.5F, -9.0F, -4.5F, 9, 4, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 13, -1.5F, -7.0F, -6.5F, 3, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 13, -2.5F, -7.0F, -5.5F, 5, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}