// Date: 5/12/2012 4:39:52 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelWigglytuff extends ModelBase {
	// fields
	ModelRenderer Pooftop;
	ModelRenderer Poofbase;
	ModelRenderer Head1;
	ModelRenderer HeadT;
	ModelRenderer HeadW;
	ModelRenderer HeadBW;
	ModelRenderer Body;
	ModelRenderer BodyB;
	ModelRenderer BodyW;
	ModelRenderer BodyBW;
	ModelRenderer PalmR;
	ModelRenderer Arm;
	ModelRenderer PalmL;
	ModelRenderer FootR;
	ModelRenderer FootL;
	ModelRenderer EarL;
	ModelRenderer EarR;
	ModelRenderer EarTipR;
	ModelRenderer EarTipL;
	ModelRenderer ArmL;

	public ModelWigglytuff() {
		textureWidth = 128;
		textureHeight = 64;

		Pooftop = new ModelRenderer(this, 0, 0);
		Pooftop.addBox(-1.5F, -2F, -1F, 3, 2, 1);
		Pooftop.setRotationPoint(0.1F, 9F, -3F);
		Pooftop.setTextureSize(128, 64);
		Pooftop.mirror = true;
		setRotation(Pooftop, -0.1745329F, 0F, 0F);
		Poofbase = new ModelRenderer(this, 9, 0);
		Poofbase.addBox(-1F, -1F, -1F, 2, 1, 1);
		Poofbase.setRotationPoint(0.6F, 7.1F, -2.7F);
		Poofbase.setTextureSize(128, 64);
		Poofbase.mirror = true;
		setRotation(Poofbase, -0.1745329F, 0F, 0F);
		Head1 = new ModelRenderer(this, 31, 52);
		Head1.addBox(-3.5F, -6F, -3F, 7, 6, 6);
		Head1.setRotationPoint(0F, 14.5F, -0.5F);
		Head1.setTextureSize(128, 64);
		Head1.mirror = true;
		setRotation(Head1, 0.0349066F, 0F, 0F);
		HeadT = new ModelRenderer(this, 31, 28);
		HeadT.addBox(-3F, -3F, -2.5F, 6, 6, 5);
		HeadT.setRotationPoint(0F, 11F, -0.5F);
		HeadT.setTextureSize(128, 64);
		HeadT.mirror = true;
		setRotation(HeadT, 0.0349066F, 0F, 0F);
		HeadW = new ModelRenderer(this, 31, 40);
		HeadW.addBox(-4F, -3F, -2.5F, 8, 6, 5);
		HeadW.setRotationPoint(0F, 12F, -0.5F);
		HeadW.setTextureSize(128, 64);
		HeadW.mirror = true;
		setRotation(HeadW, 0.0349066F, 0F, 0F);
		HeadBW = new ModelRenderer(this, 31, 16);
		HeadBW.addBox(-3F, -3F, -1.5F, 6, 6, 5);
		HeadBW.setRotationPoint(0F, 12F, -0.5F);
		HeadBW.setTextureSize(128, 64);
		HeadBW.mirror = true;
		setRotation(HeadBW, 0.0349066F, 0F, 0F);
		Body = new ModelRenderer(this, 0, 49);
		Body.addBox(-4F, -3.5F, -3.5F, 8, 8, 7);
		Body.setRotationPoint(0F, 17.7F, 0F);
		Body.setTextureSize(128, 64);
		Body.mirror = true;
		setRotation(Body, 0.0872665F, 0F, 0F);
		BodyB = new ModelRenderer(this, 0, 20);
		BodyB.addBox(-3.5F, -4F, -3F, 7, 8, 6);
		BodyB.setRotationPoint(0F, 18.7F, 0F);
		BodyB.setTextureSize(128, 64);
		BodyB.mirror = true;
		setRotation(BodyB, 0.0872665F, 0F, 0F);
		BodyW = new ModelRenderer(this, 0, 35);
		BodyW.addBox(-4.5F, -3.5F, -3F, 9, 7, 6);
		BodyW.setRotationPoint(0F, 18.2F, 0F);
		BodyW.setTextureSize(128, 64);
		BodyW.mirror = true;
		setRotation(BodyW, 0.0872665F, 0F, 0F);
		BodyBW = new ModelRenderer(this, 0, 5);
		BodyBW.addBox(-3.5F, -3.5F, -3.5F, 7, 7, 7);
		BodyBW.setRotationPoint(0F, 18.2F, 0.5F);
		BodyBW.setTextureSize(128, 64);
		BodyBW.mirror = true;
		setRotation(BodyBW, 0.0872665F, 0F, 0F);
		PalmR = new ModelRenderer(this, 31, 8);
		PalmR.addBox(-1F, -0.5F, -0.5F, 1, 1, 1);
		PalmR.setRotationPoint(-6F, 19.4F, -2.833333F);
		PalmR.setTextureSize(128, 64);
		PalmR.mirror = true;
		setRotation(PalmR, 0F, -0.5235988F, -0.8726646F);
		Arm = new ModelRenderer(this, 31, 11);
		Arm.addBox(-5F, -1F, -1F, 5, 2, 2);
		Arm.setRotationPoint(-3.4F, 15.8F, -1.3F);
		Arm.setTextureSize(128, 64);
		Arm.mirror = true;
		setRotation(Arm, 0F, -0.5235988F, -0.8726646F);
		PalmL = new ModelRenderer(this, 31, 8);
		PalmL.addBox(0F, -0.5F, -0.5F, 1, 1, 1);
		PalmL.setRotationPoint(6F, 19.4F, -2.8F);
		PalmL.setTextureSize(128, 64);
		PalmL.mirror = true;
		setRotation(PalmL, 0F, 0.5235988F, 0.8726646F);
		FootR = new ModelRenderer(this, 58, 57);
		FootR.addBox(-1.5F, 0F, -5F, 3, 1, 6);
		FootR.setRotationPoint(-2.5F, 22.5F, 1.5F);
		FootR.setTextureSize(128, 64);
		FootR.mirror = true;
		setRotation(FootR, 0.0872665F, 0.2617994F, 0F);
		FootL = new ModelRenderer(this, 58, 57);
		FootL.addBox(-1.5F, 0F, -5F, 3, 1, 6);
		FootL.setRotationPoint(2.7F, 22.5F, 1.5F);
		FootL.setTextureSize(128, 64);
		FootL.mirror = true;
		setRotation(FootL, 0.0872665F, -0.2617994F, 0F);
		EarL = new ModelRenderer(this, 38, 3);
		EarL.addBox(-1.5F, -6F, -0.5F, 3, 6, 1);
		EarL.setRotationPoint(2.5F, 10.5F, 0.5F);
		EarL.setTextureSize(128, 64);
		EarL.mirror = true;
		setRotation(EarL, 0.0872665F, -0.3490659F, 0.5759587F);
		EarL.mirror = false;
		EarR = new ModelRenderer(this, 38, 3);
		EarR.addBox(-1.5F, -6F, -0.5F, 3, 6, 1);
		EarR.setRotationPoint(-2.5F, 10.5F, 0.5F);
		EarR.setTextureSize(128, 64);
		EarR.mirror = true;
		setRotation(EarR, 0.0872665F, 0.3490659F, -0.5759587F);
		EarTipR = new ModelRenderer(this, 31, 4);
		EarTipR.addBox(-1F, -2F, -0.5F, 2, 2, 1);
		EarTipR.setRotationPoint(-5.6F, 5.5F, 1.1F);
		EarTipR.setTextureSize(128, 64);
		setRotation(EarTipR, 0.0872665F, 0.3490659F, -0.5759587F);
		EarTipR.mirror = false;
		EarTipL = new ModelRenderer(this, 31, 4);
		EarTipL.addBox(-1F, -2F, -0.5F, 2, 2, 1);
		EarTipL.setRotationPoint(5.6F, 5.5F, 1.1F);
		EarTipL.setTextureSize(128, 64);
		EarTipL.mirror = true;
		setRotation(EarTipL, 0.0872665F, -0.3490659F, 0.5759587F);
		ArmL = new ModelRenderer(this, 31, 11);
		ArmL.addBox(-5F, -1F, -1F, 5, 2, 2);
		ArmL.setRotationPoint(3.4F, 15.8F, -1.3F);
		ArmL.setTextureSize(128, 64);
		ArmL.mirror = true;
		setRotation(ArmL, 0F, -2.6529F, -0.8726646F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Pooftop.render(f5);
		Poofbase.render(f5);
		Head1.render(f5);
		HeadT.render(f5);
		HeadW.render(f5);
		HeadBW.render(f5);
		Body.render(f5);
		BodyB.render(f5);
		BodyW.render(f5);
		BodyBW.render(f5);
		PalmR.render(f5);
		Arm.render(f5);
		PalmL.render(f5);
		FootR.render(f5);
		FootL.render(f5);
		EarL.render(f5);
		EarR.render(f5);
		EarTipR.render(f5);
		EarTipL.render(f5);
		ArmL.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	}

}
