package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelPonyta extends ModelBase {
	// fields
	ModelRenderer neckbridge;
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer tailfire;
	ModelRenderer fronthaunch1;
	ModelRenderer fronthaunch2;
	ModelRenderer neck1;
	ModelRenderer neckfire;
	ModelRenderer neck2;
	ModelRenderer bodyfire;
	ModelRenderer bodyextra1;
	ModelRenderer bodyextra2;
	ModelRenderer backrightlegfire;
	ModelRenderer backrightleg1;
	ModelRenderer backrightleg3;
	ModelRenderer backleftleg1;
	ModelRenderer backleftleg3;
	ModelRenderer backleftlegfire;
	ModelRenderer frontrightleg1;
	ModelRenderer frontleftleg1;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer jaw;
	ModelRenderer head2;
	ModelRenderer head1;
	ModelRenderer BACKLEFTLEGPIECE;
	ModelRenderer FRONTRIGHTLEGPIECE;
	ModelRenderer BACKRIGHTLEGPIECE;
	ModelRenderer FRONTLEFTLEGPIECE;
	ModelRenderer HEADPIECE;
	ModelRenderer backleftleghoof;
	ModelRenderer backrightleghoof;
	ModelRenderer frontrightlegfire;
	ModelRenderer frontrightleghoof;
	ModelRenderer frontrightleg3;
	ModelRenderer frontleftleg3;
	ModelRenderer frontleftleghoof;
	ModelRenderer frontleftlegfire;
	ModelRenderer headfire;

	public ModelPonyta() {
		textureWidth = 128;
		textureHeight = 128;
		setTextureOffset("BACKLEFTLEGPIECE.DELETETHIS1", 0, 0);
		setTextureOffset("FRONTRIGHTLEGPIECE.DELETE_THIS_4", 0, 0);
		setTextureOffset("BACKRIGHTLEGPIECE.DELETETHIS2", 0, 0);
		setTextureOffset("FRONTLEFTLEGPIECE.DELETE_THIS_3", 0, 0);
		setTextureOffset("HEADPIECE.DELETE_THIS_4", 0, 0);

		neckbridge = new ModelRenderer(this, 22, 15);
		neckbridge.addBox(0F, 0F, 0F, 5, 4, 10);
		neckbridge.setRotationPoint(-1.5F, -8F, -8F);
		neckbridge.setTextureSize(128, 128);
		neckbridge.mirror = true;
		setRotation(neckbridge, -0.7807508F, 0F, 0F);
		body1 = new ModelRenderer(this, 0, 0);
		body1.addBox(0F, 0F, 0F, 10, 10, 25);
		body1.setRotationPoint(-4F, -2F, -7F);
		body1.setTextureSize(128, 128);
		body1.mirror = true;
		setRotation(body1, 0F, 0F, 0F);
		body2 = new ModelRenderer(this, 0, 0);
		body2.addBox(0F, 0F, 0F, 10, 9, 2);
		body2.setRotationPoint(-4F, -1.7F, -9F);
		body2.setTextureSize(128, 128);
		body2.mirror = true;
		setRotation(body2, 0.1487144F, 0F, 0F);
		body3 = new ModelRenderer(this, 0, 0);
		body3.addBox(0F, 0F, 0F, 8, 9, 2);
		body3.setRotationPoint(-3F, -1F, -10.7F);
		body3.setTextureSize(128, 128);
		body3.mirror = true;
		setRotation(body3, 0.3346075F, 0F, 0F);
		tailfire = new ModelRenderer(this, 62, 102);
		tailfire.addBox(0F, -11F, 0F, 2, 16, 10);
		tailfire.setRotationPoint(0F, 1F, 29F);
		tailfire.setTextureSize(128, 128);
		tailfire.mirror = true;
		setRotation(tailfire, 1.891462F, 0F, 0F);
		fronthaunch1 = new ModelRenderer(this, 0, 0);
		fronthaunch1.addBox(0F, 0F, 0F, 2, 6, 3);
		fronthaunch1.setRotationPoint(4.5F, 5F, -8F);
		fronthaunch1.setTextureSize(128, 128);
		fronthaunch1.mirror = true;
		setRotation(fronthaunch1, 0.074351F, 0F, 0F);
		fronthaunch2 = new ModelRenderer(this, 0, 0);
		fronthaunch2.addBox(0F, 0F, 0F, 2, 6, 3);
		fronthaunch2.setRotationPoint(-4.5F, 5F, -7F);
		fronthaunch2.setTextureSize(128, 128);
		fronthaunch2.mirror = true;
		setRotation(fronthaunch2, 0.074351F, 0F, 0F);
		neck1 = new ModelRenderer(this, 0, 0);
		neck1.addBox(-2.5F, -8F, -2F, 5, 10, 5);
		neck1.setRotationPoint(1F, -3F, -9F);
		neck1.setTextureSize(128, 128);
		neck1.mirror = true;
		setRotation(neck1, 0.2602503F, 0F, 0F);
		neckfire = new ModelRenderer(this, 22, 67);
		neckfire.addBox(0F, 0F, -1F, 2, 3, 18);
		neckfire.setRotationPoint(0F, -10F, -7F);
		neckfire.setTextureSize(128, 128);
		neckfire.mirror = true;
		setRotation(neckfire, -0.7063936F, 0F, 0F);
		neck2 = new ModelRenderer(this, 0, 0);
		neck2.addBox(-2.5F, 0F, -2.5F, 5, 3, 5);
		neck2.setRotationPoint(1F, -12.7F, -11.9F);
		neck2.setTextureSize(128, 128);
		neck2.mirror = true;
		setRotation(neck2, 0.5576792F, 0F, 0F);
		bodyfire = new ModelRenderer(this, 59, 66);
		bodyfire.addBox(0F, 0F, 0F, 2, 3, 22);
		bodyfire.setRotationPoint(0F, -5F, -3F);
		bodyfire.setTextureSize(128, 128);
		bodyfire.mirror = true;
		setRotation(bodyfire, 0F, 0F, 0F);
		bodyextra1 = new ModelRenderer(this, 0, 0);
		bodyextra1.addBox(0F, 0F, 0F, 1, 7, 24);
		bodyextra1.setRotationPoint(5.5F, -1F, -7F);
		bodyextra1.setTextureSize(128, 128);
		bodyextra1.mirror = true;
		setRotation(bodyextra1, 0F, 0F, 0F);
		bodyextra2 = new ModelRenderer(this, 0, 0);
		bodyextra2.addBox(0F, 0F, -2F, 1, 7, 24);
		bodyextra2.setRotationPoint(-4.5F, -1F, -5F);
		bodyextra2.setTextureSize(128, 128);
		bodyextra2.mirror = true;
		setRotation(bodyextra2, 0F, 0F, 0F);
		backrightlegfire = new ModelRenderer(this, 0, 101);
		backrightlegfire.addBox(-0.7F, 2F, 2F, 2, 5, 3);
		backrightlegfire.setRotationPoint(0F, 0F, 0F);
		backrightlegfire.setTextureSize(128, 128);
		backrightlegfire.mirror = true;
		setRotation(backrightlegfire, 0.1904329F, 0F, 0.1047198F);
		backrightleg1 = new ModelRenderer(this, 0, 0);
		backrightleg1.addBox(-0.7F, -2F, -3F, 2, 10, 5);
		backrightleg1.setRotationPoint(0F, 0F, 0F);
		backrightleg1.setTextureSize(128, 128);
		backrightleg1.mirror = true;
		setRotation(backrightleg1, 0.1904329F, 0F, 0.1047198F);
		backrightleg3 = new ModelRenderer(this, 0, 0);
		backrightleg3.addBox(-1.3F, 2.2F, -15F, 2, 2, 10);
		backrightleg3.setRotationPoint(0F, 0F, 0F);
		backrightleg3.setTextureSize(128, 128);
		backrightleg3.mirror = true;
		setRotation(backrightleg3, 1.375609F, 0F, 0F);
		backleftleg1 = new ModelRenderer(this, 0, 0);
		backleftleg1.addBox(-1F, -6F, -2F, 2, 10, 5);
		backleftleg1.setRotationPoint(0F, 0F, 0F);
		backleftleg1.setTextureSize(128, 128);
		backleftleg1.mirror = true;
		setRotation(backleftleg1, 0.1904371F, 0F, -0.1047198F);
		backleftleg3 = new ModelRenderer(this, 2, 2);
		backleftleg3.addBox(-0.8F, 1.5F, -12F, 2, 2, 10);
		backleftleg3.setRotationPoint(0F, 0F, 0F);
		backleftleg3.setTextureSize(128, 128);
		backleftleg3.mirror = true;
		setRotation(backleftleg3, 1.375609F, 0F, 0F);
		backleftlegfire = new ModelRenderer(this, 0, 101);
		backleftlegfire.addBox(-1.01F, -2F, 2.8F, 2, 5, 3);
		backleftlegfire.setRotationPoint(0F, 0F, 0F);
		backleftlegfire.setTextureSize(128, 128);
		backleftlegfire.mirror = true;
		setRotation(backleftlegfire, 0.1904329F, 0F, -0.1047198F);
		frontrightleg1 = new ModelRenderer(this, 0, 0);
		frontrightleg1.addBox(-1.5F, -1F, 0.8F, 2, 9, 2);
		frontrightleg1.setRotationPoint(0F, 0F, 0F);
		frontrightleg1.setTextureSize(128, 128);
		frontrightleg1.mirror = true;
		setRotation(frontrightleg1, 0.0151844F, 0F, 0F);
		frontleftleg1 = new ModelRenderer(this, 0, 0);
		frontleftleg1.addBox(-1.5F, -1F, 0.8F, 2, 9, 2);
		frontleftleg1.setRotationPoint(0F, 0F, 0F);
		frontleftleg1.setTextureSize(128, 128);
		frontleftleg1.mirror = true;
		setRotation(frontleftleg1, 0.0151844F, 0F, 0F);
		head3 = new ModelRenderer(this, 4, 54);
		head3.addBox(-2F, -2.3F, -3.2F, 4, 2, 3);
		head3.setRotationPoint(0F, 0F, 0F);
		head3.setTextureSize(128, 128);
		head3.mirror = true;
		setRotation(head3, 0.7063936F, 0F, 0F);
		head4 = new ModelRenderer(this, 0, 27);
		head4.addBox(-1F, -6F, 2F, 2, 3, 1);
		head4.setRotationPoint(0F, 0F, 0F);
		head4.setTextureSize(128, 128);
		head4.mirror = true;
		setRotation(head4, -0.5774073F, 0.5948578F, 0.0743572F);
		head5 = new ModelRenderer(this, 0, 0);
		head5.addBox(-1F, -6F, 2F, 2, 3, 1);
		head5.setRotationPoint(0F, 0F, 0F);
		head5.setTextureSize(128, 128);
		head5.mirror = true;
		setRotation(head5, -0.5774073F, -0.5948606F, 0.074351F);
		jaw = new ModelRenderer(this, 5, 39);
		jaw.addBox(-1.5F, 2F, -7F, 3, 2, 6);
		jaw.setRotationPoint(0F, 0F, 0F);
		jaw.setTextureSize(128, 128);
		jaw.mirror = true;
		setRotation(jaw, 0.1745329F, 0F, 0F);
		head2 = new ModelRenderer(this, 0, 53);
		head2.addBox(-2F, 0F, -7F, 4, 4, 5);
		head2.setRotationPoint(0F, 0F, 0F);
		head2.setTextureSize(128, 128);
		head2.mirror = true;
		setRotation(head2, 0.0743572F, 0F, 0F);
		head1 = new ModelRenderer(this, 0, 39);
		head1.addBox(-3F, -2F, -2F, 6, 6, 7);
		head1.setRotationPoint(0F, 0F, 0F);
		head1.setTextureSize(128, 128);
		head1.mirror = true;
		setRotation(head1, 0.0743572F, 0F, 0F);
		BACKLEFTLEGPIECE = new ModelRenderer(this, "BACKLEFTLEGPIECE");
		BACKLEFTLEGPIECE.setRotationPoint(6F, 11F, 14.7F);
		setRotation(BACKLEFTLEGPIECE, 0F, 0F, 0F);
		BACKLEFTLEGPIECE.mirror = true;
		backleftleghoof = new ModelRenderer(this, 45, 45);
		backleftleghoof.addBox(0.3F, 0F, 0F, 2, 2, 2);
		backleftleghoof.setRotationPoint(-1.01F, 11F, -1.2F);
		backleftleghoof.setTextureSize(128, 128);
		backleftleghoof.mirror = true;
		setRotation(backleftleghoof, 0F, 0F, 0F);
		FRONTRIGHTLEGPIECE = new ModelRenderer(this, "FRONTRIGHTLEGPIECE");
		FRONTRIGHTLEGPIECE.setRotationPoint(-3F, 7F, -8F);
		setRotation(FRONTRIGHTLEGPIECE, 0F, 0F, 0F);
		FRONTRIGHTLEGPIECE.mirror = true;
		frontrightleg3 = new ModelRenderer(this, 0, 0);
		frontrightleg3.addBox(0F, 0F, 0F, 2, 8, 2);
		frontrightleg3.setRotationPoint(-1.5F, 7F, 0.9F);
		frontrightleg3.setTextureSize(128, 128);
		frontrightleg3.mirror = true;
		setRotation(frontrightleg3, 0F, 0F, 0F);
		frontrightleghoof = new ModelRenderer(this, 45, 45);
		frontrightleghoof.addBox(0F, 0F, 0F, 2, 2, 2);
		frontrightleghoof.setRotationPoint(-1.51F, 15F, 0.4F);
		frontrightleghoof.setTextureSize(128, 128);
		frontrightleghoof.mirror = true;
		setRotation(frontrightleghoof, 0F, 0F, 0F);
		frontrightlegfire = new ModelRenderer(this, 15, 101);
		frontrightlegfire.addBox(0F, -1F, 0.5F, 2, 6, 4);
		frontrightlegfire.setRotationPoint(-1.51F, 2.5F, 2F);
		frontrightlegfire.setTextureSize(128, 128);
		frontrightlegfire.mirror = true;
		setRotation(frontrightlegfire, 0F, 0F, 0F);
		BACKRIGHTLEGPIECE = new ModelRenderer(this, "BACKRIGHTLEGPIECE");
		BACKRIGHTLEGPIECE.setRotationPoint(-4F, 7F, 14.7F);
		setRotation(BACKRIGHTLEGPIECE, 0F, 0F, 0F);
		BACKRIGHTLEGPIECE.mirror = true;
		backrightleghoof = new ModelRenderer(this, 45, 45);
		backrightleghoof.addBox(-0.3F, 0F, 0F, 2, 2, 2);
		backrightleghoof.setRotationPoint(-1.01F, 15F, -1.2F);
		backrightleghoof.setTextureSize(128, 128);
		backrightleghoof.mirror = true;
		setRotation(backrightleghoof, 0F, 0F, 0F);
		FRONTLEFTLEGPIECE = new ModelRenderer(this, "FRONTLEFTLEGPIECE");
		FRONTLEFTLEGPIECE.setRotationPoint(6F, 7F, -8F);
		setRotation(FRONTLEFTLEGPIECE, 0F, 0F, 0F);
		FRONTLEFTLEGPIECE.mirror = true;
		frontleftleg3 = new ModelRenderer(this, 0, 0);
		frontleftleg3.addBox(0F, 0F, 0F, 2, 8, 2);
		frontleftleg3.setRotationPoint(-1.5F, 7F, 0.9F);
		frontleftleg3.setTextureSize(128, 128);
		frontleftleg3.mirror = true;
		setRotation(frontleftleg3, 0F, 0F, 0F);
		frontleftleghoof = new ModelRenderer(this, 45, 45);
		frontleftleghoof.addBox(0F, 0F, 0F, 2, 2, 2);
		frontleftleghoof.setRotationPoint(-1.51F, 15F, 0.4F);
		frontleftleghoof.setTextureSize(128, 128);
		frontleftleghoof.mirror = true;
		setRotation(frontleftleghoof, 0F, 0F, 0F);
		frontleftlegfire = new ModelRenderer(this, 15, 101);
		frontleftlegfire.addBox(0F, 0F, 0F, 2, 6, 4);
		frontleftlegfire.setRotationPoint(-1.51F, 1.5F, 2F);
		frontleftlegfire.setTextureSize(128, 128);
		frontleftlegfire.mirror = true;
		setRotation(frontleftlegfire, 0F, 0F, 0F);
		HEADPIECE = new ModelRenderer(this, "HEADPIECE");
		HEADPIECE.setRotationPoint(1F, -13F, -12F);
		setRotation(HEADPIECE, 0F, 0F, 0F);
		HEADPIECE.mirror = true;
		headfire = new ModelRenderer(this, 10, 76);
		headfire.addBox(0F, 0F, 0F, 2, 6, 10);
		headfire.setRotationPoint(-1F, -7F, -4F);
		headfire.setTextureSize(128, 128);
		headfire.mirror = true;
		setRotation(headfire, 0F, 0F, 0F);

		HEADPIECE.addChild(head1);
		HEADPIECE.addChild(head2);
		HEADPIECE.addChild(head3);
		HEADPIECE.addChild(head4);
		HEADPIECE.addChild(head5);
		HEADPIECE.addChild(jaw);
		HEADPIECE.addChild(headfire);

		BACKLEFTLEGPIECE.addChild(backleftleg1);
		BACKLEFTLEGPIECE.addChild(backleftleg3);
		BACKLEFTLEGPIECE.addChild(backleftleghoof);
		BACKLEFTLEGPIECE.addChild(backleftlegfire);

		BACKRIGHTLEGPIECE.addChild(backrightleg1);
		BACKRIGHTLEGPIECE.addChild(backrightleg3);
		BACKRIGHTLEGPIECE.addChild(backrightleghoof);
		BACKRIGHTLEGPIECE.addChild(backrightlegfire);

		FRONTRIGHTLEGPIECE.addChild(frontrightleg1);
		FRONTRIGHTLEGPIECE.addChild(frontrightleg3);
		FRONTRIGHTLEGPIECE.addChild(frontrightleghoof);
		FRONTRIGHTLEGPIECE.addChild(frontrightlegfire);

		FRONTLEFTLEGPIECE.addChild(frontleftleg1);
		FRONTLEFTLEGPIECE.addChild(frontleftleg3);
		FRONTLEFTLEGPIECE.addChild(frontleftleghoof);
		FRONTLEFTLEGPIECE.addChild(frontleftlegfire);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		neckbridge.render(f5);
		body1.render(f5);
		body2.render(f5);
		body3.render(f5);
		tailfire.render(f5);
		fronthaunch1.render(f5);
		fronthaunch2.render(f5);
		neck1.render(f5);
		neckfire.render(f5);
		neck2.render(f5);
		bodyfire.render(f5);
		bodyextra1.render(f5);
		bodyextra2.render(f5);

		BACKLEFTLEGPIECE.render(f5);
		FRONTRIGHTLEGPIECE.render(f5);
		BACKRIGHTLEGPIECE.render(f5);
		FRONTLEFTLEGPIECE.render(f5);
		HEADPIECE.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HEADPIECE.rotateAngleY = f3 / (180F / (float) Math.PI);
		HEADPIECE.rotateAngleX = f4 / (180F / (float) Math.PI);
		FRONTLEFTLEGPIECE.rotateAngleX = MathHelper.cos(f * .5F + (float) Math.PI) * .4F * f1;
		FRONTRIGHTLEGPIECE.rotateAngleX = MathHelper.cos(f * .5F) * .4F * f1;
		BACKLEFTLEGPIECE.rotateAngleX = MathHelper.cos(f * .5F) * .7F * f1;
		BACKRIGHTLEGPIECE.rotateAngleX = MathHelper.cos(f * .5F + (float) Math.PI) * .7F * f1;
	}

}
