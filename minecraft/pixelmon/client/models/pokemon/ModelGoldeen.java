package pixelmon.client.models.pokemon;

import pixelmon.entities.pixelmon.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelGoldeen extends ModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer Lips;
	ModelRenderer Tail_fin;
	ModelRenderer Right_fin;
	ModelRenderer Left_fin;
	ModelRenderer Top_Fin;
	ModelRenderer Body1;
	ModelRenderer Body2;
	ModelRenderer Body3;
	ModelRenderer Shape2;
	ModelRenderer Lips1;
	ModelRenderer Black;
	ModelRenderer Lips2;
	ModelRenderer Lips3;
	ModelRenderer Eyelid;
	ModelRenderer Eyelid1;
	ModelRenderer black;
	ModelRenderer Black1;
	ModelRenderer White;
	ModelRenderer Black2;
	ModelRenderer Black3;
	ModelRenderer Black4;
	ModelRenderer White2;
	ModelRenderer Black5;
	ModelRenderer Black6;
	ModelRenderer White3;
	ModelRenderer Horn;
	ModelRenderer Horn1;

	public ModelGoldeen() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this, 0, 11);
		Body.addBox(-4F, 0F, -3F, 9, 6, 11);
		Body.setRotationPoint(-0.5F, 15F, 0.5F);
		Body.setTextureSize(64, 64);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Lips = new ModelRenderer(this, 58, 10);
		Lips.addBox(0F, 0F, 0F, 4, 1, 1);
		Lips.setRotationPoint(-2F, 19F, -4F);
		Lips.setTextureSize(64, 64);
		Lips.mirror = true;
		setRotation(Lips, 0F, 0F, 0F);
		Tail_fin = new ModelRenderer(this, -15, 30);
		Tail_fin.addBox(-10.5F, 0F, 0F, 22, 0, 15);
		Tail_fin.setRotationPoint(0F, 18F, 9.5F);
		Tail_fin.setTextureSize(64, 64);
		Tail_fin.mirror = true;
		setRotation(Tail_fin, 0.1858931F, 0F, 0F);
		Right_fin = new ModelRenderer(this, 43, 58);
		Right_fin.addBox(-7F, 0F, -3F, 7, 0, 6);
		Right_fin.setRotationPoint(-4F, 19F, 3F);
		Right_fin.setTextureSize(64, 64);
		Right_fin.mirror = true;
		setRotation(Right_fin, 0.2230717F, 0F, -0.1858931F);
		Right_fin.mirror = false;
		Left_fin = new ModelRenderer(this, 43, 58);
		Left_fin.addBox(0F, 0F, -3F, 7, 0, 6);
		Left_fin.setRotationPoint(4F, 19F, 3F);
		Left_fin.setTextureSize(64, 64);
		Left_fin.mirror = true;
		setRotation(Left_fin, 0.2974289F, 0F, 0.2230717F);
		Top_Fin = new ModelRenderer(this, 0, -4);
		Top_Fin.addBox(0F, -1F, -3F, 0, 2, 5);
		Top_Fin.setRotationPoint(0F, 16.5F, 1F);
		Top_Fin.setTextureSize(64, 64);
		Top_Fin.mirror = true;
		setRotation(Top_Fin, 0F, 0F, 3.141593F);
		Body1 = new ModelRenderer(this, 0, 45);
		Body1.addBox(-4F, 0F, -3F, 7, 8, 11);
		Body1.setRotationPoint(0.5F, 14F, 0.5F);
		Body1.setTextureSize(64, 64);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
		Body2 = new ModelRenderer(this, 0, 11);
		Body2.addBox(-4F, 0F, -3F, 7, 6, 13);
		Body2.setRotationPoint(0.5F, 15F, -0.5F);
		Body2.setTextureSize(64, 64);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, 0F);
		Body3 = new ModelRenderer(this, 0, 11);
		Body3.addBox(-4F, 0F, -3F, 8, 7, 12);
		Body3.setRotationPoint(0F, 14.5F, 0F);
		Body3.setTextureSize(64, 64);
		Body3.mirror = true;
		setRotation(Body3, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 44, 43);
		Shape2.addBox(0F, -1.5F, -5F, 0, 2, 10);
		Shape2.setRotationPoint(0F, 14F, 3.5F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 3.141593F, 0F);
		Lips1 = new ModelRenderer(this, 60, 9);
		Lips1.addBox(0F, 0F, 0F, 1, 2, 1);
		Lips1.setRotationPoint(1F, 17.8F, -4F);
		Lips1.setTextureSize(64, 64);
		Lips1.mirror = true;
		setRotation(Lips1, 0F, 0F, 0F);
		Black = new ModelRenderer(this, 48, 9);
		Black.addBox(0F, 0F, 0F, 3, 1, 1);
		Black.setRotationPoint(-1.5F, 18.8F, -3.9F);
		Black.setTextureSize(64, 64);
		Black.mirror = true;
		setRotation(Black, 0F, 0F, 0F);
		Lips2 = new ModelRenderer(this, 60, 9);
		Lips2.addBox(0F, 0F, 0F, 1, 2, 1);
		Lips2.setRotationPoint(-2F, 17.8F, -4F);
		Lips2.setTextureSize(64, 64);
		Lips2.mirror = true;
		setRotation(Lips2, 0F, 0F, 0F);
		Lips3 = new ModelRenderer(this, 57, 9);
		Lips3.addBox(0F, 0F, 0F, 4, 1, 1);
		Lips3.setRotationPoint(-2F, 17.8F, -4F);
		Lips3.setTextureSize(64, 64);
		Lips3.mirror = true;
		setRotation(Lips3, 0F, 0F, 0F);
		Eyelid = new ModelRenderer(this, 25, 0);
		Eyelid.addBox(-1F, 0F, -1F, 1, 1, 2);
		Eyelid.setRotationPoint(-3.8F, 16.5F, -0.5F);
		Eyelid.setTextureSize(64, 64);
		Eyelid.mirror = true;
		setRotation(Eyelid, 0F, 0F, 0.1495747F);
		Eyelid1 = new ModelRenderer(this, 25, 0);
		Eyelid1.addBox(0F, 0F, -1F, 1, 1, 2);
		Eyelid1.setRotationPoint(3.8F, 16.5F, -0.5F);
		Eyelid1.setTextureSize(64, 64);
		Eyelid1.mirror = true;
		setRotation(Eyelid1, 0F, 0F, -0.1869996F);
		black = new ModelRenderer(this, 50, 9);
		black.addBox(0F, 0F, 0F, 1, 1, 1);
		black.setRotationPoint(3.8F, 17.2F, -1F);
		black.setTextureSize(64, 64);
		black.mirror = true;
		setRotation(black, 0F, 0F, 0F);
		Black1 = new ModelRenderer(this, 51, 9);
		Black1.addBox(0F, 0F, 0F, 1, 1, 1);
		Black1.setRotationPoint(-4.8F, 17.2F, -1F);
		Black1.setTextureSize(64, 64);
		Black1.mirror = true;
		setRotation(Black1, 0F, 0F, 0F);
		White = new ModelRenderer(this, 39, 9);
		White.addBox(0F, 0F, 0F, 1, 1, 2);
		White.setRotationPoint(-4.7F, 17.3F, -1.5F);
		White.setTextureSize(64, 64);
		White.mirror = true;
		setRotation(White, 3.141593F, 3.141593F, 3.141593F);
		Black2 = new ModelRenderer(this, 49, 9);
		Black2.addBox(0F, 0F, 0F, 1, 1, 2);
		Black2.setRotationPoint(-4.55F, 17.3F, -1.47F);
		Black2.setTextureSize(64, 64);
		Black2.mirror = true;
		setRotation(Black2, 3.141593F, 3.141593F, 3.141593F);
		Black3 = new ModelRenderer(this, 49, 9);
		Black3.addBox(0F, 0F, 0F, 1, 1, 2);
		Black3.setRotationPoint(-4.55F, 17.3F, -1.55F);
		Black3.setTextureSize(64, 64);
		Black3.mirror = true;
		setRotation(Black3, 3.141593F, 3.141593F, 3.141593F);
		Black4 = new ModelRenderer(this, 40, 9);
		Black4.addBox(0F, 0F, 0F, 1, 1, 2);
		Black4.setRotationPoint(3.7F, 17.3F, -1.5F);
		Black4.setTextureSize(64, 64);
		Black4.mirror = true;
		setRotation(Black4, 3.141593F, 3.141593F, 3.141593F);
		White2 = new ModelRenderer(this, 49, 9);
		White2.addBox(0F, 0F, 0F, 1, 1, 2);
		White2.setRotationPoint(-4.51F, 17.35F, -1.5F);
		White2.setTextureSize(64, 64);
		White2.mirror = true;
		setRotation(White2, 3.141593F, 3.141593F, 3.141593F);
		Black5 = new ModelRenderer(this, 49, 9);
		Black5.addBox(0F, 0F, 0F, 1, 1, 2);
		Black5.setRotationPoint(3.61F, 17.3F, -1.47F);
		Black5.setTextureSize(64, 64);
		Black5.mirror = true;
		setRotation(Black5, 3.141593F, 3.141593F, 3.141593F);
		Black6 = new ModelRenderer(this, 49, 9);
		Black6.addBox(0F, 0F, 0F, 1, 1, 2);
		Black6.setRotationPoint(3.61F, 17.3F, -1.55F);
		Black6.setTextureSize(64, 64);
		Black6.mirror = true;
		setRotation(Black6, 3.141593F, 3.141593F, 3.141593F);
		White3 = new ModelRenderer(this, 49, 9);
		White3.addBox(0F, 0F, 0F, 1, 1, 2);
		White3.setRotationPoint(3.65F, 17.35F, -1.5F);
		White3.setTextureSize(64, 64);
		White3.mirror = true;
		setRotation(White3, 3.141593F, 3.141593F, 3.141593F);
		Horn = new ModelRenderer(this, 36, 0);
		Horn.addBox(-1F, -3F, -1F, 2, 5, 2);
		Horn.setRotationPoint(0F, 15F, -2.5F);
		Horn.setTextureSize(64, 64);
		Horn.mirror = true;
		setRotation(Horn, 0.4136121F, 0.7482196F, 0.4136121F);
		Horn1 = new ModelRenderer(this, 36, 0);
		Horn1.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		Horn1.setRotationPoint(0F, 13F, -3.7F);
		Horn1.setTextureSize(64, 64);
		Horn1.mirror = true;
		setRotation(Horn1, 0.4136121F, 0.7482196F, 0.4136121F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Lips.render(f5);
		Tail_fin.render(f5);
		Right_fin.render(f5);
		Left_fin.render(f5);
		Top_Fin.render(f5);
		Body1.render(f5);
		Body2.render(f5);
		Body3.render(f5);
		Shape2.render(f5);
		Lips1.render(f5);
		Black.render(f5);
		Lips2.render(f5);
		Lips3.render(f5);
		Eyelid.render(f5);
		Eyelid1.render(f5);
		black.render(f5);
		Black1.render(f5);
		White.render(f5);
		Black2.render(f5);
		Black3.render(f5);
		Black4.render(f5);
		White2.render(f5);
		Black5.render(f5);
		Black6.render(f5);
		White3.render(f5);
		Horn.render(f5);
		Horn1.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		Tail_fin.rotateAngleX = MathHelper.cos(f * 1F) * .75F * f1;
		Right_fin.rotateAngleZ = MathHelper.cos(f * .5F) * 1F * f1;
		Left_fin.rotateAngleZ = MathHelper.cos(f * .5F + 3.141593F) * 1F * f1;
	}

}