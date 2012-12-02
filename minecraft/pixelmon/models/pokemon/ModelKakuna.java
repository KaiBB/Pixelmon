// Date: 8/4/2012 11:01:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelKakuna extends ModelBase {
	// fields
	ModelRenderer whole_thing;

	public ModelKakuna() {
		textureWidth = 256;
		textureHeight = 128;

		whole_thing = new ModelRenderer(this, "whole_thing");
		whole_thing.setRotationPoint(0F, -10F, 0F);
		setRotation(whole_thing, 0F, 0F, 0F);
		whole_thing.mirror = true;

		ModelRenderer Head_main = new ModelRenderer(this, 165, 45);
		Head_main.addBox(-13F, -26F, -12F, 21, 12, 21);
		Head_main.setRotationPoint(0F, 0F, 15F);
		Head_main.setTextureSize(256, 128);
		Head_main.mirror = true;
		setRotation(Head_main, 0.122173F, -0.7853982F, -0.122173F);
		ModelRenderer Head_Vertical_middle = new ModelRenderer(this, 168, 44);
		Head_Vertical_middle.addBox(-12F, -27F, -11F, 19, 14, 19);
		Head_Vertical_middle.setRotationPoint(0F, 0F, 15F);
		Head_Vertical_middle.setTextureSize(256, 128);
		Head_Vertical_middle.mirror = true;
		setRotation(Head_Vertical_middle, 0.122173F, -0.7853982F, -0.122173F);
		ModelRenderer Head_front_middle = new ModelRenderer(this, 77, 10);
		Head_front_middle.addBox(-12F, -25F, -13F, 19, 10, 23);
		Head_front_middle.setRotationPoint(0F, 0F, 15F);
		Head_front_middle.setTextureSize(256, 128);
		Head_front_middle.mirror = true;
		setRotation(Head_front_middle, 0.122173F, -0.7853982F, -0.122173F);
		ModelRenderer Head_horizontal_middle = new ModelRenderer(this, 74, 99);
		Head_horizontal_middle.addBox(-14F, -25F, -11F, 23, 10, 19);
		Head_horizontal_middle.setRotationPoint(0F, 0F, 15F);
		Head_horizontal_middle.setTextureSize(256, 128);
		Head_horizontal_middle.mirror = true;
		setRotation(Head_horizontal_middle, 0.122173F, -0.7853982F, -0.122173F);
		ModelRenderer Stinger_base = new ModelRenderer(this, 0, 52);
		Stinger_base.addBox(-8F, -1F, 2F, 14, 14, 14);
		Stinger_base.setRotationPoint(0F, 0F, 5F);
		Stinger_base.setTextureSize(256, 128);
		Stinger_base.mirror = true;
		setRotation(Stinger_base, -0.4014257F, 0F, 0F);
		ModelRenderer stinger_middle = new ModelRenderer(this, 0, 2);
		stinger_middle.addBox(-7F, 13F, 3F, 12, 2, 12);
		stinger_middle.setRotationPoint(0F, 0F, 5F);
		stinger_middle.setTextureSize(256, 128);
		stinger_middle.mirror = true;
		setRotation(stinger_middle, -0.4014257F, 0F, 0F);
		ModelRenderer Stinger_end_bottom = new ModelRenderer(this, 67, 69);
		Stinger_end_bottom.addBox(-5F, 14F, 5.2F, 8, 2, 8);
		Stinger_end_bottom.setRotationPoint(0F, 0F, 5F);
		Stinger_end_bottom.setTextureSize(256, 128);
		Stinger_end_bottom.mirror = true;
		setRotation(Stinger_end_bottom, -0.4014257F, 0F, 0F);
		ModelRenderer Stinger_end = new ModelRenderer(this, 73, 81);
		Stinger_end.addBox(-4F, 15F, 6F, 6, 2, 6);
		Stinger_end.setRotationPoint(0F, 0F, 5F);
		Stinger_end.setTextureSize(256, 128);
		Stinger_end.mirror = true;
		setRotation(Stinger_end, -0.4014257F, 0F, 0F);
		ModelRenderer MB_center = new ModelRenderer(this, 0, 80);
		MB_center.addBox(-10F, -17F, 1F, 18, 30, 18);
		MB_center.setRotationPoint(0F, 0F, 0F);
		MB_center.setTextureSize(256, 128);
		MB_center.mirror = true;
		setRotation(MB_center, 0F, 0F, 0F);
		ModelRenderer MB_Front_middle = new ModelRenderer(this, 163, 80);
		MB_Front_middle.addBox(-9F, -16F, 0F, 16, 28, 20);
		MB_Front_middle.setRotationPoint(0F, 0F, 0F);
		MB_Front_middle.setTextureSize(256, 128);
		MB_Front_middle.mirror = true;
		setRotation(MB_Front_middle, 0F, 0F, 0F);
		ModelRenderer MB_Horizontal_middle = new ModelRenderer(this, 163, 35);
		MB_Horizontal_middle.addBox(-11F, -16F, 2F, 20, 28, 16);
		MB_Horizontal_middle.setRotationPoint(0F, 0F, 0F);
		MB_Horizontal_middle.setTextureSize(256, 128);
		MB_Horizontal_middle.mirror = true;
		setRotation(MB_Horizontal_middle, 0F, 0F, 0F);
		ModelRenderer MB_Vertical_middle = new ModelRenderer(this, 99, 46);
		MB_Vertical_middle.addBox(-9F, -17F, 2F, 16, 31, 16);
		MB_Vertical_middle.setRotationPoint(0F, 0F, 0F);
		MB_Vertical_middle.setTextureSize(256, 128);
		MB_Vertical_middle.mirror = true;
		setRotation(MB_Vertical_middle, 0F, 0F, 0F);
		ModelRenderer MB_Back_enhancer = new ModelRenderer(this, 0, 103);
		MB_Back_enhancer.addBox(-8F, -10F, 20F, 14, 23, 1);
		MB_Back_enhancer.setRotationPoint(0F, -2F, 0F);
		MB_Back_enhancer.setTextureSize(256, 128);
		MB_Back_enhancer.mirror = true;
		setRotation(MB_Back_enhancer, 0F, 0F, 0F);
		ModelRenderer Tie_p1 = new ModelRenderer(this, 75, 62);
		Tie_p1.addBox(-5F, -16F, -4F, 8, 2, 4);
		Tie_p1.setRotationPoint(0F, 0F, 0F);
		Tie_p1.setTextureSize(256, 128);
		Tie_p1.mirror = true;
		setRotation(Tie_p1, 0F, 0F, 0F);
		ModelRenderer Tie_p2 = new ModelRenderer(this, 75, 56);
		Tie_p2.addBox(-4F, -14F, -3.5F, 6, 2, 4);
		Tie_p2.setRotationPoint(0F, 0F, 0F);
		Tie_p2.setTextureSize(256, 128);
		Tie_p2.mirror = true;
		setRotation(Tie_p2, 0F, 0F, 0F);
		ModelRenderer Tie_p3 = new ModelRenderer(this, 57, 60);
		Tie_p3.addBox(-2F, -11F, -2F, 2, 17, 2);
		Tie_p3.setRotationPoint(0F, 0F, 0F);
		Tie_p3.setTextureSize(256, 128);
		Tie_p3.mirror = true;
		setRotation(Tie_p3, 0F, 0F, 0F);
		ModelRenderer Tie_p4 = new ModelRenderer(this, 0, 48);
		Tie_p4.addBox(-9F, -16F, -1F, 16, 3, 1);
		Tie_p4.setRotationPoint(0F, 0F, 0F);
		Tie_p4.setTextureSize(256, 128);
		Tie_p4.mirror = true;
		setRotation(Tie_p4, 0F, 0F, 0F);
		ModelRenderer Tie_p5 = new ModelRenderer(this, 34, 48);
		Tie_p5.addBox(7F, -17F, -1F, 1, 3, 1);
		Tie_p5.setRotationPoint(0F, 0F, 0F);
		Tie_p5.setTextureSize(256, 128);
		Tie_p5.mirror = true;
		setRotation(Tie_p5, 0F, 0F, 0F);
		ModelRenderer Tie_p6 = new ModelRenderer(this, 0, 44);
		Tie_p6.addBox(8F, -13F, 0F, 3, 3, 1);
		Tie_p6.setRotationPoint(0F, 0F, 0F);
		Tie_p6.setTextureSize(256, 128);
		Tie_p6.mirror = true;
		setRotation(Tie_p6, 0F, 0F, 0F);
		ModelRenderer Tie_p7 = new ModelRenderer(this, 0, 44);
		Tie_p7.addBox(-13F, -13F, 0F, 3, 3, 1);
		Tie_p7.setRotationPoint(0F, 0F, 0F);
		Tie_p7.setTextureSize(256, 128);
		Tie_p7.mirror = true;
		setRotation(Tie_p7, 0F, 0F, 0F);
		ModelRenderer Tie_p8 = new ModelRenderer(this, 34, 48);
		Tie_p8.addBox(-10F, -17F, -1F, 1, 3, 1);
		Tie_p8.setRotationPoint(0F, 0F, 0F);
		Tie_p8.setTextureSize(256, 128);
		Tie_p8.mirror = true;
		setRotation(Tie_p8, 0F, 0F, 0F);
		ModelRenderer Tie_p9 = new ModelRenderer(this, 56, 46);
		Tie_p9.addBox(-3F, -8F, -3F, 4, 12, 2);
		Tie_p9.setRotationPoint(0F, 0F, 1F);
		Tie_p9.setTextureSize(256, 128);
		Tie_p9.mirror = true;
		setRotation(Tie_p9, 0F, 0F, 0F);
		ModelRenderer Tie_p10 = new ModelRenderer(this, 69, 58);
		Tie_p10.addBox(-2F, 0F, -1F, 2, 9, 1);
		Tie_p10.setRotationPoint(0F, 0F, 0F);
		Tie_p10.setTextureSize(256, 128);
		Tie_p10.mirror = true;
		setRotation(Tie_p10, 0F, 0F, 0F);
		ModelRenderer Tie_p11 = new ModelRenderer(this, 73, 53);
		Tie_p11.addBox(-3F, -12F, -2F, 4, 1, 2);
		Tie_p11.setRotationPoint(0F, 0F, 0F);
		Tie_p11.setTextureSize(256, 128);
		Tie_p11.mirror = true;
		setRotation(Tie_p11, 0F, 0F, 0F);
		ModelRenderer Tie_p12 = new ModelRenderer(this, 38, 46);
		Tie_p12.addBox(-5F, -3F, -1F, 8, 5, 1);
		Tie_p12.setRotationPoint(0F, 0F, 0F);
		Tie_p12.setTextureSize(256, 128);
		Tie_p12.mirror = true;
		setRotation(Tie_p12, 0F, 0F, 0F);
		ModelRenderer top_fold_main = new ModelRenderer(this, 164, 10);
		top_fold_main.addBox(-13F, -17F, 0F, 24, 3, 22);
		top_fold_main.setRotationPoint(0F, 0F, 0F);
		top_fold_main.setTextureSize(256, 128);
		top_fold_main.mirror = true;
		setRotation(top_fold_main, 0F, 0F, 0F);
		ModelRenderer Spacer = new ModelRenderer(this, 0, 23);
		Spacer.addBox(-12F, -14F, 0.99F, 22, 1, 20);
		Spacer.setRotationPoint(0F, 0F, 0F);
		Spacer.setTextureSize(256, 128);
		Spacer.mirror = true;
		setRotation(Spacer, 0F, 0F, 0F);
		ModelRenderer bottom_fold_main = new ModelRenderer(this, 166, 11);
		bottom_fold_main.addBox(-13F, -13F, 1F, 24, 3, 21);
		bottom_fold_main.setRotationPoint(0F, 0F, 0F);
		bottom_fold_main.setTextureSize(256, 128);
		bottom_fold_main.mirror = true;
		setRotation(bottom_fold_main, 0F, 0F, 0F);
		ModelRenderer Shell_front = new ModelRenderer(this, 0, 17);
		Shell_front.addBox(-10F, -12F, -1F, 18, 3, 2);
		Shell_front.setRotationPoint(0F, 0F, 0F);
		Shell_front.setTextureSize(256, 128);
		Shell_front.mirror = true;
		setRotation(Shell_front, 0F, 0F, 0F);

		whole_thing.addChild(Head_main);
		whole_thing.addChild(Head_Vertical_middle);
		whole_thing.addChild(Head_front_middle);
		whole_thing.addChild(Head_horizontal_middle);
		whole_thing.addChild(Stinger_base);
		whole_thing.addChild(stinger_middle);
		whole_thing.addChild(Stinger_end_bottom);
		whole_thing.addChild(Stinger_end);
		whole_thing.addChild(MB_center);
		whole_thing.addChild(MB_Front_middle);
		whole_thing.addChild(MB_Horizontal_middle);
		whole_thing.addChild(MB_Vertical_middle);
		whole_thing.addChild(MB_Back_enhancer);
		whole_thing.addChild(Tie_p1);
		whole_thing.addChild(Tie_p2);
		whole_thing.addChild(Tie_p3);
		whole_thing.addChild(Tie_p4);
		whole_thing.addChild(Tie_p5);
		whole_thing.addChild(Tie_p6);
		whole_thing.addChild(Tie_p7);
		whole_thing.addChild(Tie_p8);
		whole_thing.addChild(Tie_p9);
		whole_thing.addChild(Tie_p10);
		whole_thing.addChild(Tie_p11);
		whole_thing.addChild(Tie_p12);
		whole_thing.addChild(top_fold_main);
		whole_thing.addChild(Spacer);
		whole_thing.addChild(bottom_fold_main);
		whole_thing.addChild(Shell_front);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		whole_thing.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	}

}
