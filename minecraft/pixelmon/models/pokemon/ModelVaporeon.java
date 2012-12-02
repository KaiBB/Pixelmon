// Date: 17/07/2012 9:29:42 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelVaporeon extends ModelBase {
	// fields
	ModelRenderer ManeFin;
	ModelRenderer BackFin;
	ModelRenderer UpperBody;
	ModelRenderer TopLowerBody;
	ModelRenderer UnderLowerBody;
	ModelRenderer TailBase;
	ModelRenderer TailSeg2;
	ModelRenderer TailTip;
	ModelRenderer TailFlipper;
	ModelRenderer TailFin1;
	ModelRenderer TailFin2;
	ModelRenderer TailFin3;
	ModelRenderer HEADBASE;
	ModelRenderer FRONTLEFTLEG;
	ModelRenderer FRONTRIGHTLEG;
	ModelRenderer REARRIGHTLEG;
	ModelRenderer REARLEFTLEG;

	public ModelVaporeon() {
		textureWidth = 64;
		textureHeight = 32;

		ManeFin = new ModelRenderer(this, 16, 25);
		ManeFin.addBox(-3.5F, -4F, -2.1F, 7, 7, 0);
		ManeFin.setRotationPoint(0F, 17.5F, -1.5F);
		ManeFin.setTextureSize(64, 32);
		ManeFin.mirror = true;
		setRotation(ManeFin, -0.0872665F, 0F, 0F);
		BackFin = new ModelRenderer(this, 46, 22);
		BackFin.addBox(0F, -2.3F, -2.5F, 0, 1, 9);
		BackFin.setRotationPoint(0F, 17.3F, -1.5F);
		BackFin.setTextureSize(64, 32);
		BackFin.mirror = true;
		setRotation(BackFin, -0.1047198F, 0F, 0F);
		UpperBody = new ModelRenderer(this, 0, 24);
		UpperBody.addBox(-2F, -1.5F, -2.1F, 4, 4, 4);
		UpperBody.setRotationPoint(0F, 17.3F, -1.5F);
		UpperBody.setTextureSize(64, 32);
		UpperBody.mirror = true;
		setRotation(UpperBody, 0F, 0F, 0F);
		TopLowerBody = new ModelRenderer(this, 0, 16);
		TopLowerBody.addBox(-2F, -1.5F, 1.5F, 4, 3, 5);
		TopLowerBody.setRotationPoint(0F, 17.5F, -1.5F);
		TopLowerBody.setTextureSize(64, 32);
		TopLowerBody.mirror = true;
		setRotation(TopLowerBody, 0F, 0F, 0F);
		UnderLowerBody = new ModelRenderer(this, 0, 11);
		UnderLowerBody.addBox(-2F, 1.5F, 1.5F, 4, 1, 4);
		UnderLowerBody.setRotationPoint(0F, 17.5F, -1.5F);
		UnderLowerBody.setTextureSize(64, 32);
		UnderLowerBody.mirror = true;
		setRotation(UnderLowerBody, 0.122173F, 0F, 0F);
		TailBase = new ModelRenderer(this, 18, 19);
		TailBase.addBox(-1.5F, -1.3F, -0.5F, 3, 3, 3);
		TailBase.setRotationPoint(0F, 17.5F, 5F);
		TailBase.setTextureSize(64, 32);
		TailBase.mirror = true;
		setRotation(TailBase, -0.3490659F, 0F, 0F);
		TailSeg2 = new ModelRenderer(this, 18, 14);
		TailSeg2.addBox(-1F, -1.4F, 2.1F, 2, 2, 3);
		TailSeg2.setRotationPoint(0F, 17.5F, 5F);
		TailSeg2.setTextureSize(64, 32);
		TailSeg2.mirror = true;
		setRotation(TailSeg2, -0.6108652F, 0F, 0F);
		TailTip = new ModelRenderer(this, 18, 10);
		TailTip.addBox(-0.5F, 0F, 4.5F, 1, 1, 3);
		TailTip.setRotationPoint(0F, 17.5F, 5F);
		TailTip.setTextureSize(64, 32);
		TailTip.mirror = true;
		setRotation(TailTip, -0.4363323F, 0F, 0F);
		TailFlipper = new ModelRenderer(this, 41, 18);
		TailFlipper.addBox(-2F, 2.5F, 7F, 4, 0, 4);
		TailFlipper.setRotationPoint(0F, 17.5F, 5F);
		TailFlipper.setTextureSize(64, 32);
		TailFlipper.mirror = true;
		setRotation(TailFlipper, -0.1570796F, 0F, 0F);
		TailFin1 = new ModelRenderer(this, 52, 28);
		TailFin1.addBox(0F, -1.7F, -0.5F, 0, 1, 3);
		TailFin1.setRotationPoint(0F, 17.5F, 5F);
		TailFin1.setTextureSize(64, 32);
		TailFin1.mirror = true;
		setRotation(TailFin1, -0.3490659F, 0F, 0F);
		TailFin2 = new ModelRenderer(this, 52, 28);
		TailFin2.addBox(0F, -1.9F, 2.1F, 0, 1, 3);
		TailFin2.setRotationPoint(0F, 17.5F, 5F);
		TailFin2.setTextureSize(64, 32);
		TailFin2.mirror = true;
		setRotation(TailFin2, -0.6108652F, 0F, 0F);
		TailFin3 = new ModelRenderer(this, 53, 29);
		TailFin3.addBox(0F, -0.5F, 5.2F, 0, 1, 2);
		TailFin3.setRotationPoint(0F, 17.5F, 5F);
		TailFin3.setTextureSize(64, 32);
		TailFin3.mirror = true;
		setRotation(TailFin3, -0.4363323F, 0F, 0F);

		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0F, 16.5F, -3.4F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		ModelRenderer Nose = new ModelRenderer(this, 0, 1);
		Nose.addBox(-1.5F, -1.1F, -3.1F, 3, 2, 1);
		Nose.setRotationPoint(0F, 0F, 0F);
		Nose.setTextureSize(64, 32);
		Nose.mirror = true;
		setRotation(Nose, 0.1745329F, 0F, 0F);
		ModelRenderer HeadLeftFin = new ModelRenderer(this, 31, 25);
		HeadLeftFin.addBox(2.5F, -2.9F, 0.3F, 0, 3, 3);
		HeadLeftFin.setRotationPoint(0F, 0F, 0F);
		HeadLeftFin.setTextureSize(64, 32);
		HeadLeftFin.mirror = true;
		setRotation(HeadLeftFin, 0.0872665F, 0.8203047F, 0.0872665F);
		ModelRenderer HeadRightFin = new ModelRenderer(this, 31, 25);
		HeadRightFin.addBox(-2.5F, -2.9F, 0.3F, 0, 3, 3);
		HeadRightFin.setRotationPoint(0F, 0F, 0F);
		HeadRightFin.setTextureSize(64, 32);
		HeadRightFin.mirror = true;
		setRotation(HeadRightFin, 0.0872665F, -0.8203047F, -0.0872665F);
		ModelRenderer HeadTopFin = new ModelRenderer(this, 38, 25);
		HeadTopFin.addBox(0F, -5.8F, -3F, 0, 3, 4);
		HeadTopFin.setRotationPoint(0F, 0F, 0F);
		HeadTopFin.setTextureSize(64, 32);
		HeadTopFin.mirror = true;
		setRotation(HeadTopFin, 0.0872665F, 0F, 0F);
		ModelRenderer Head = new ModelRenderer(this, 0, 4);
		Head.addBox(-2F, -2.8F, -3F, 4, 4, 3);
		Head.setRotationPoint(0F, 0F, 0F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0.0872665F, 0F, 0F);

		HEADBASE.addChild(Nose);
		HEADBASE.addChild(Head);
		HEADBASE.addChild(HeadRightFin);
		HEADBASE.addChild(HeadLeftFin);
		HEADBASE.addChild(HeadTopFin);

		FRONTLEFTLEG = new ModelRenderer(this, "FRONTLEFTLEG");
		FRONTLEFTLEG.setRotationPoint(2F, 18F, -2.5F);
		setRotation(FRONTLEFTLEG, 0F, 0F, 0F);
		FRONTLEFTLEG.mirror = true;
		ModelRenderer FrontToesLeft = new ModelRenderer(this, 8, 1);
		FrontToesLeft.addBox(-1F, 5F, -1F, 2, 1, 1);
		FrontToesLeft.setRotationPoint(-0.8F, 0F, 0F);
		FrontToesLeft.setTextureSize(64, 32);
		FrontToesLeft.mirror = true;
		setRotation(FrontToesLeft, 0F, 0F, 0F);
		FrontToesLeft.mirror = false;
		ModelRenderer FrontLeftLeg = new ModelRenderer(this, 19, 0);
		FrontLeftLeg.addBox(-1F, 0F, -0.5F, 2, 7, 1);
		FrontLeftLeg.setRotationPoint(-0.8F, -1F, 0F);
		FrontLeftLeg.setTextureSize(64, 32);
		FrontLeftLeg.mirror = true;
		setRotation(FrontLeftLeg, 0F, 0F, 0F);
		FrontLeftLeg.mirror = false;

		FRONTLEFTLEG.addChild(FrontToesLeft);
		FRONTLEFTLEG.addChild(FrontLeftLeg);

		FRONTRIGHTLEG = new ModelRenderer(this, "FRONTRIGHTLEG");
		FRONTRIGHTLEG.setRotationPoint(-2F, 18F, -2.5F);
		setRotation(FRONTRIGHTLEG, 0F, 0F, 0F);
		FRONTRIGHTLEG.mirror = true;
		ModelRenderer FrontToesRight = new ModelRenderer(this, 8, 1);
		FrontToesRight.addBox(-1F, 5F, -1F, 2, 1, 1);
		FrontToesRight.setRotationPoint(0.8F, 0F, 0F);
		FrontToesRight.setTextureSize(64, 32);
		FrontToesRight.mirror = true;
		setRotation(FrontToesRight, 0F, 0F, 0F);
		ModelRenderer FrontRightLeg = new ModelRenderer(this, 19, 0);
		FrontRightLeg.addBox(-1F, 0F, -0.5F, 2, 7, 1);
		FrontRightLeg.setRotationPoint(0.8F, -1F, 0F);
		FrontRightLeg.setTextureSize(64, 32);
		FrontRightLeg.mirror = true;
		setRotation(FrontRightLeg, 0F, 0F, 0F);

		FRONTRIGHTLEG.addChild(FrontToesRight);
		FRONTRIGHTLEG.addChild(FrontRightLeg);

		REARRIGHTLEG = new ModelRenderer(this, "REARRIGHTLEG");
		REARRIGHTLEG.setRotationPoint(-2F, 17.53333F, 4F);
		setRotation(REARRIGHTLEG, 0F, 0F, 0F);
		REARRIGHTLEG.mirror = true;
		ModelRenderer RearUpperRightLeg = new ModelRenderer(this, 18, 0);
		RearUpperRightLeg.addBox(-1.6F, -0.5F, -1.5F, 2, 4, 2);
		RearUpperRightLeg.setRotationPoint(1.4F, -0.5F, 0.5F);
		RearUpperRightLeg.setTextureSize(64, 32);
		RearUpperRightLeg.mirror = true;
		setRotation(RearUpperRightLeg, 0.0872665F, 0F, 0F);
		ModelRenderer RearKneeRight = new ModelRenderer(this, 8, 1);
		RearKneeRight.addBox(-1.6F, 1.7F, -3.3F, 2, 1, 1);
		RearKneeRight.setRotationPoint(1.4F, -0.5F, 0.5F);
		RearKneeRight.setTextureSize(64, 32);
		RearKneeRight.mirror = true;
		setRotation(RearKneeRight, 0.7853982F, 0F, 0F);
		ModelRenderer RearToesRight = new ModelRenderer(this, 8, 1);
		RearToesRight.addBox(-1.6F, 6F, -1.3F, 2, 1, 1);
		RearToesRight.setRotationPoint(1.4F, -0.5F, 0.5F);
		RearToesRight.setTextureSize(64, 32);
		RearToesRight.mirror = true;
		setRotation(RearToesRight, 0F, 0F, 0F);
		ModelRenderer RearlowerRightLeg = new ModelRenderer(this, 19, 2);
		RearlowerRightLeg.addBox(-1.6F, 2.9F, 0.4F, 2, 4, 1);
		RearlowerRightLeg.setRotationPoint(1.4F, -0.5F, 0.5F);
		RearlowerRightLeg.setTextureSize(64, 32);
		RearlowerRightLeg.mirror = true;
		setRotation(RearlowerRightLeg, -0.2094395F, 0F, 0F);

		REARRIGHTLEG.addChild(RearUpperRightLeg);
		REARRIGHTLEG.addChild(RearKneeRight);
		REARRIGHTLEG.addChild(RearlowerRightLeg);
		REARRIGHTLEG.addChild(RearToesRight);

		REARLEFTLEG = new ModelRenderer(this, "REARLEFTLEG");
		REARLEFTLEG.setRotationPoint(2F, 17.5F, 4F);
		setRotation(REARLEFTLEG, 0F, 0F, 0F);
		REARLEFTLEG.mirror = true;
		ModelRenderer RearUpperLeftLeg = new ModelRenderer(this, 18, 0);
		RearUpperLeftLeg.addBox(-0.4F, -0.5F, -1.5F, 2, 4, 2);
		RearUpperLeftLeg.setRotationPoint(-1.4F, -0.5F, 0.5F);
		RearUpperLeftLeg.setTextureSize(64, 32);
		RearUpperLeftLeg.mirror = true;
		setRotation(RearUpperLeftLeg, 0.0872665F, 0F, 0F);
		RearUpperLeftLeg.mirror = false;
		ModelRenderer RearKneeLeft = new ModelRenderer(this, 8, 1);
		RearKneeLeft.addBox(-0.4F, 1.7F, -3.3F, 2, 1, 1);
		RearKneeLeft.setRotationPoint(-1.4F, -0.5F, 0.5F);
		RearKneeLeft.setTextureSize(64, 32);
		RearKneeLeft.mirror = true;
		setRotation(RearKneeLeft, 0.7853982F, 0F, 0F);
		ModelRenderer RearlowerLeftLeg = new ModelRenderer(this, 19, 2);
		RearlowerLeftLeg.addBox(-0.4F, 2.9F, 0.4F, 2, 4, 1);
		RearlowerLeftLeg.setRotationPoint(-1.4F, -0.5F, 0.5F);
		RearlowerLeftLeg.setTextureSize(64, 32);
		RearlowerLeftLeg.mirror = true;
		setRotation(RearlowerLeftLeg, -0.2094395F, 0F, 0F);
		RearlowerLeftLeg.mirror = false;
		ModelRenderer RearToesLeft = new ModelRenderer(this, 8, 1);
		RearToesLeft.addBox(-0.4F, 6F, -1.3F, 2, 1, 1);
		RearToesLeft.setRotationPoint(-1.4F, -0.5F, 0.5F);
		RearToesLeft.setTextureSize(64, 32);
		RearToesLeft.mirror = true;
		setRotation(RearToesLeft, 0F, 0F, 0F);
		RearToesLeft.mirror = false;

		REARLEFTLEG.addChild(RearUpperLeftLeg);
		REARLEFTLEG.addChild(RearKneeLeft);
		REARLEFTLEG.addChild(RearlowerLeftLeg);
		REARLEFTLEG.addChild(RearToesLeft);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		ManeFin.render(f5);
		BackFin.render(f5);
		UpperBody.render(f5);
		TopLowerBody.render(f5);
		UnderLowerBody.render(f5);
		TailBase.render(f5);
		TailSeg2.render(f5);
		TailTip.render(f5);
		TailFlipper.render(f5);
		TailFin1.render(f5);
		TailFin2.render(f5);
		TailFin3.render(f5);
		HEADBASE.render(f5);
		FRONTLEFTLEG.render(f5);
		FRONTRIGHTLEG.render(f5);
		REARRIGHTLEG.render(f5);
		REARLEFTLEG.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HEADBASE.rotateAngleX = f4 / 57.29578F;
		HEADBASE.rotateAngleY = f3 / 57.29578F;
		REARRIGHTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F) * 0.8F * f1;
		REARLEFTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 0.8F * f1;
		FRONTRIGHTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 0.8F * f1;
		FRONTLEFTLEG.rotateAngleX = MathHelper.cos(f * 0.6662F) * 0.8F * f1;
	}

}
