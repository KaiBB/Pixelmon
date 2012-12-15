// Date: 4/24/2012 12:45:27 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import pixelmon.entities.pixelmon.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelWartortle extends ModelBase {
	// fields
	ModelRenderer body4;
	ModelRenderer body3;
	ModelRenderer body1;
	ModelRenderer body6;
	ModelRenderer body5;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer head1;
	ModelRenderer leftleg1;
	ModelRenderer leftleg2;
	ModelRenderer rightleg1;
	ModelRenderer rightleg2;
	ModelRenderer leftleg3;
	ModelRenderer rightleg3;
	ModelRenderer leftarm2;
	ModelRenderer leftarm1;
	ModelRenderer rightarm1;
	ModelRenderer rightarm2;
	ModelRenderer leftleg4;
	ModelRenderer rightleg4;
	ModelRenderer leftleg7;
	ModelRenderer leftleg5;
	ModelRenderer leftleg6;
	ModelRenderer rightleg5;
	ModelRenderer rightleg6;
	ModelRenderer rightleg7;
	ModelRenderer leftarm4;
	ModelRenderer leftarm5;
	ModelRenderer leftarm3;
	ModelRenderer rightarm3;
	ModelRenderer rightarm4;
	ModelRenderer rightarm5;
	ModelRenderer headleft1;
	ModelRenderer headright1;
	ModelRenderer tail1;
	ModelRenderer body2;
	ModelRenderer ArmR;
	ModelRenderer ArmL;
	ModelRenderer HeadBase;
	ModelRenderer LegL;
	ModelRenderer LegR;

	public ModelWartortle() {
		textureWidth = 128;
		textureHeight = 64;

		body4 = new ModelRenderer(this, 92, 20);
		body4.addBox(-7F, 0F, -1.5F, 14, 15, 4);
		body4.setRotationPoint(0F, 4.2F, 0F);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, 0.1396263F, 0F, 0F);
		body3 = new ModelRenderer(this, 98, 41);
		body3.addBox(-6F, 1F, -3F, 12, 13, 3);
		body3.setRotationPoint(0F, 4.2F, 0F);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 0.1396263F, 0F, 0F);
		body1 = new ModelRenderer(this, 52, 0);
		body1.addBox(-0.25F, 2F, -4F, 5, 11, 3);
		body1.setRotationPoint(0F, 4.2F, 0F);
		body1.setTextureSize(128, 64);
		body1.mirror = false;
		setRotation(body1, 0.1396263F, 0F, 0F);
		body6 = new ModelRenderer(this, 79, 0);
		body6.addBox(-5.75F, 0.5F, 1F, 6, 14, 4);
		body6.setRotationPoint(0F, 4.2F, 0F);
		body6.setTextureSize(128, 64);
		body6.mirror = true;
		setRotation(body6, 0.1396263F, 0F, 0F);
		body5 = new ModelRenderer(this, 79, 0);
		body5.addBox(-0.25F, 0.5F, 1F, 6, 14, 4);
		body5.setRotationPoint(0F, 4.2F, 0F);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, 0.1396263F, 0F, 0F);
		body7 = new ModelRenderer(this, 106, 0);
		body7.addBox(-4.75F, 1.5F, 2.5F, 5, 12, 4);
		body7.setRotationPoint(0F, 4.2F, 0F);
		body7.setTextureSize(128, 64);
		body7.mirror = true;
		setRotation(body7, 0.1396263F, 0F, 0F);
		body8 = new ModelRenderer(this, 106, 0);
		body8.addBox(-0.25F, 1.5F, 2.5F, 5, 12, 4);
		body8.setRotationPoint(0F, 4.2F, 0F);
		body8.setTextureSize(128, 64);
		body8.mirror = true;
		setRotation(body8, 0.1396263F, 0F, 0F);
		tail1 = new ModelRenderer(this, 57, 24);
		tail1.addBox(0F, -18.5F, -3.5F, 0, 20, 20);
		tail1.setRotationPoint(0F, 18.2F, 4F);
		tail1.setTextureSize(128, 64);
		tail1.mirror = true;
		setRotation(tail1, 0F, 0F, 0F);
		body2 = new ModelRenderer(this, 52, 0);
		body2.addBox(-4.75F, 2F, -4F, 5, 11, 3);
		body2.setRotationPoint(0F, 4.2F, 0F);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 0.1396263F, 0F, 0F);
		ArmR = new ModelRenderer(this, "ArmR");
		ArmR.setRotationPoint(-5F, 7F, -1F);
		setRotation(ArmR, 0F, 0F, 0F);
		ArmR.mirror = true;
		rightarm1 = new ModelRenderer(this, 0, 0);
		rightarm1.addBox(-7F, -2F, -1F, 7, 2, 3);
		rightarm1.setRotationPoint(0F, 0F, 0F);
		rightarm1.setTextureSize(128, 64);
		rightarm1.mirror = true;
		setRotation(rightarm1, 0.2617994F, -0.1047198F, -0.9075712F);
		rightarm2 = new ModelRenderer(this, 0, 0);
		rightarm2.addBox(-7F, -0.6F, -1F, 7, 2, 3);
		rightarm2.setRotationPoint(0F, 0F, 0F);
		rightarm2.setTextureSize(128, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.2617994F, -0.1396263F, -0.8028515F);
		rightarm3 = new ModelRenderer(this, 25, 0);
		rightarm3.addBox(-9F, 0.3F, -0.6F, 3, 1, 0);
		rightarm3.setRotationPoint(0F, 0F, 0F);
		rightarm3.setTextureSize(128, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.2617994F, -0.1396263F, -0.7853982F);
		rightarm4 = new ModelRenderer(this, 25, 2);
		rightarm4.addBox(-9F, -1.6F, -0.2F, 3, 0, 1);
		rightarm4.setRotationPoint(0F, 0F, 0F);
		rightarm4.setTextureSize(128, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0.7504916F, -0.1047198F, -0.9075712F);
		rightarm5 = new ModelRenderer(this, 25, 2);
		rightarm5.addBox(-9F, -2F, -0.2F, 3, 0, 1);
		rightarm5.setRotationPoint(0F, 0F, 0F);
		rightarm5.setTextureSize(128, 64);
		rightarm5.mirror = true;
		setRotation(rightarm5, -0.4537856F, -0.1047198F, -0.9250245F);

		ArmR.addChild(rightarm1);
		ArmR.addChild(rightarm2);
		ArmR.addChild(rightarm3);
		ArmR.addChild(rightarm4);
		ArmR.addChild(rightarm5);

		ArmL = new ModelRenderer(this, "ArmL");
		ArmL.setRotationPoint(5F, 7.2F, -1F);
		setRotation(ArmL, 0F, 0F, 0F);
		ArmL.mirror = true;
		leftarm1 = new ModelRenderer(this, 0, 0);
		leftarm1.addBox(0F, -2F, -1F, 7, 2, 3);
		leftarm1.setRotationPoint(0F, 0F, 0F);
		leftarm1.setTextureSize(128, 64);
		leftarm1.mirror = true;
		setRotation(leftarm1, 0.2617994F, 0.1047198F, 0.9948377F);
		leftarm2 = new ModelRenderer(this, 0, 0);
		leftarm2.addBox(0F, -0.6F, -1F, 7, 2, 3);
		leftarm2.setRotationPoint(0F, 0F, 0F);
		leftarm2.setTextureSize(128, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.2617994F, 0.1396263F, 0.9075712F);
		leftarm3 = new ModelRenderer(this, 25, 0);
		leftarm3.addBox(6F, 0.3F, -0.6F, 3, 1, 0);
		leftarm3.setRotationPoint(0F, 0F, 0F);
		leftarm3.setTextureSize(128, 64);
		leftarm3.mirror = true;
		setRotation(leftarm3, 0.2617994F, 0.1396263F, 0.8901179F);
		leftarm4 = new ModelRenderer(this, 25, 2);
		leftarm4.addBox(6F, -1.6F, -0.2F, 3, 0, 1);
		leftarm4.setRotationPoint(0F, 0F, 0F);
		leftarm4.setTextureSize(128, 64);
		leftarm4.mirror = true;
		setRotation(leftarm4, 0.7504916F, 0.1047198F, 0.9773844F);
		leftarm5 = new ModelRenderer(this, 25, 2);
		leftarm5.addBox(6F, -2F, -0.2F, 3, 0, 1);
		leftarm5.setRotationPoint(0F, 0F, 0F);
		leftarm5.setTextureSize(128, 64);
		leftarm5.mirror = true;
		setRotation(leftarm5, -0.4537856F, 0.1047198F, 1.012291F);

		ArmL.addChild(leftarm1);
		ArmL.addChild(leftarm2);
		ArmL.addChild(leftarm3);
		ArmL.addChild(leftarm4);
		ArmL.addChild(leftarm5);

		HeadBase = new ModelRenderer(this, "HeadBase");
		HeadBase.setRotationPoint(0F, 4.2F, 0F);
		setRotation(HeadBase, 0F, 0F, 0F);
		HeadBase.mirror = true;
		head1 = new ModelRenderer(this, 50, 20);
		head1.addBox(-5F, -9.5F, -4.5F, 10, 10, 10);
		head1.setRotationPoint(0F, 0F, 0F);
		head1.setTextureSize(128, 64);
		head1.mirror = true;
		setRotation(head1, 0.0698132F, 0F, 0F);
		headleft1 = new ModelRenderer(this, 31, -6);
		headleft1.addBox(5.5F, -14.5F, -3.2F, 0, 11, 10);
		headleft1.setRotationPoint(0F, 0F, 0F);
		headleft1.setTextureSize(128, 64);
		headleft1.mirror = true;
		setRotation(headleft1, 0F, 0.296706F, 0F);
		headright1 = new ModelRenderer(this, 31, -6);
		headright1.addBox(-5.5F, -14.5F, -3.2F, 0, 11, 10);
		headright1.setRotationPoint(0F, 0F, 0F);
		headright1.setTextureSize(128, 64);
		headright1.mirror = true;
		setRotation(headright1, 0F, -0.296706F, 0F);

		HeadBase.addChild(head1);
		HeadBase.addChild(headleft1);
		HeadBase.addChild(headright1);

		LegL = new ModelRenderer(this, "LegL");
		LegL.setRotationPoint(6F, 17.2F, 0F);
		setRotation(LegL, 0F, 0F, 0F);
		LegL.mirror = true;
		leftleg1 = new ModelRenderer(this, 0, 0);
		leftleg1.addBox(-3F, -4F, -2.1F, 4, 5, 4);
		leftleg1.setRotationPoint(0F, 2F, 0F);
		leftleg1.setTextureSize(128, 64);
		leftleg1.mirror = true;
		setRotation(leftleg1, -0.3490659F, -0.6283185F, -0.1919862F);
		leftleg2 = new ModelRenderer(this, 0, 0);
		leftleg2.addBox(-3F, -0.1F, -2.2F, 4, 4, 3);
		leftleg2.setRotationPoint(0F, 2F, 0.3333333F);
		leftleg2.setTextureSize(128, 64);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0.1570796F, -0.6283185F, -0.1919862F);
		leftleg3 = new ModelRenderer(this, 0, 0);
		leftleg3.addBox(-3F, -0.1F, -1.6F, 4, 4, 3);
		leftleg3.setRotationPoint(0F, 2F, 0F);
		leftleg3.setTextureSize(128, 64);
		leftleg3.mirror = true;
		setRotation(leftleg3, 0.0523599F, -0.6283185F, -0.1919862F);
		leftleg4 = new ModelRenderer(this, 0, 0);
		leftleg4.addBox(-2.3F, 3.6F, -1.6F, 4, 1, 3);
		leftleg4.setRotationPoint(0F, 2F, 0F);
		leftleg4.setTextureSize(128, 64);
		leftleg4.mirror = true;
		setRotation(leftleg4, 0.0523599F, -0.6283185F, 0F);
		leftleg5 = new ModelRenderer(this, 0, 0);
		leftleg5.addBox(-0.3F, 4.6F, -3F, 1, 0, 3);
		leftleg5.setRotationPoint(0F, 2F, 0F);
		leftleg5.setTextureSize(128, 64);
		leftleg5.mirror = true;
		setRotation(leftleg5, 0.0523599F, -1.117011F, 0F);
		leftleg6 = new ModelRenderer(this, 0, 0);
		leftleg6.addBox(-0.8F, 4.6F, -3F, 1, 0, 3);
		leftleg6.setRotationPoint(0F, 2F, 0F);
		leftleg6.setTextureSize(128, 64);
		leftleg6.mirror = true;
		setRotation(leftleg6, 0.0523599F, -0.6283185F, 0F);
		leftleg7 = new ModelRenderer(this, 0, 0);
		leftleg7.addBox(-1.3F, 4.6F, -3.6F, 1, 0, 3);
		leftleg7.setRotationPoint(0F, 2F, 0F);
		leftleg7.setTextureSize(128, 64);
		leftleg7.mirror = true;
		setRotation(leftleg7, 0.0523599F, -0.1745329F, 0F);

		LegL.addChild(leftleg1);
		LegL.addChild(leftleg2);
		LegL.addChild(leftleg3);
		LegL.addChild(leftleg4);
		LegL.addChild(leftleg5);
		LegL.addChild(leftleg6);
		LegL.addChild(leftleg7);

		LegR = new ModelRenderer(this, "LegR");
		LegR.setRotationPoint(-6F, 17.2F, 0F);
		setRotation(LegR, 0F, 0F, 0F);
		LegR.mirror = true;
		rightleg1 = new ModelRenderer(this, 0, 0);
		rightleg1.addBox(-1F, -4F, -2.1F, 4, 5, 4);
		rightleg1.setRotationPoint(0F, 2F, 0F);
		rightleg1.setTextureSize(128, 64);
		rightleg1.mirror = true;
		setRotation(rightleg1, -0.3490659F, 0.6283185F, 0.1919862F);
		rightleg2 = new ModelRenderer(this, 0, 0);
		rightleg2.addBox(-1F, -0.1F, -2.2F, 4, 4, 3);
		rightleg2.setRotationPoint(0F, 2F, 0F);
		rightleg2.setTextureSize(128, 64);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0.1570796F, 0.6283185F, 0.1919862F);
		rightleg3 = new ModelRenderer(this, 0, 0);
		rightleg3.addBox(-1F, -0.1F, -1.6F, 4, 4, 3);
		rightleg3.setRotationPoint(0F, 2F, 0F);
		rightleg3.setTextureSize(128, 64);
		rightleg3.mirror = true;
		setRotation(rightleg3, 0.0523599F, 0.6283185F, 0.1919862F);
		rightleg4 = new ModelRenderer(this, 0, 0);
		rightleg4.addBox(-1.7F, 3.6F, -1.6F, 4, 1, 3);
		rightleg4.setRotationPoint(0F, 2F, 0F);
		rightleg4.setTextureSize(128, 64);
		rightleg4.mirror = true;
		setRotation(rightleg4, 0.0523599F, 0.6283185F, 0F);
		rightleg5 = new ModelRenderer(this, 0, 0);
		rightleg5.addBox(0.3F, 4.6F, -3.6F, 1, 0, 3);
		rightleg5.setRotationPoint(0F, 2F, 0F);
		rightleg5.setTextureSize(128, 64);
		rightleg5.mirror = true;
		setRotation(rightleg5, 0.0523599F, 0.1745329F, 0F);
		rightleg6 = new ModelRenderer(this, 0, 0);
		rightleg6.addBox(-0.2F, 4.6F, -3F, 1, 0, 3);
		rightleg6.setRotationPoint(0F, 2F, 0F);
		rightleg6.setTextureSize(128, 64);
		rightleg6.mirror = true;
		setRotation(rightleg6, 0.0523599F, 0.6283185F, 0F);
		rightleg7 = new ModelRenderer(this, 0, 0);
		rightleg7.addBox(-0.7F, 4.6F, -3F, 1, 0, 3);
		rightleg7.setRotationPoint(0F, 2F, 0F);
		rightleg7.setTextureSize(128, 64);
		rightleg7.mirror = true;
		setRotation(rightleg7, 0.0523599F, 1.117011F, 0F);

		LegR.addChild(rightleg1);
		LegR.addChild(rightleg2);
		LegR.addChild(rightleg3);
		LegR.addChild(rightleg4);
		LegR.addChild(rightleg5);
		LegR.addChild(rightleg6);
		LegR.addChild(rightleg7);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body4.render(f5);
		body3.render(f5);
		body1.render(f5);
		body6.render(f5);
		body5.render(f5);
		body7.render(f5);
		body8.render(f5);
		tail1.render(f5);
		body2.render(f5);
		ArmR.render(f5);
		ArmL.render(f5);
		HeadBase.render(f5);
		LegL.render(f5);
		LegR.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HeadBase.rotateAngleY = f3 / (180F / (float) Math.PI);
		HeadBase.rotateAngleX = f4 / (180F / (float) Math.PI);
		LegR.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		LegL.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		LegR.rotateAngleY = 0.0F;
		LegL.rotateAngleY = 0.0F;
		ArmR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * .5F * f1;
		ArmL.rotateAngleX = MathHelper.cos(f * 0.6662F) * .5F * f1;
	}

}
