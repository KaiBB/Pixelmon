// Date: 02/11/2012 10:11:12
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX




//Model is working.
//Model is working.
package pixelmon.models.trainers;
//Model is working.
import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelFisherman extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer mouth1;
    ModelRenderer HeadBase;
    ModelRenderer ARMWITHRODPIECE;
    ModelRenderer mouth2;
    ModelRenderer head;
    ModelRenderer Hat;
    ModelRenderer HatTop;
    ModelRenderer rightarm;
    ModelRenderer fishingrod;
    ModelRenderer fishingline;
    
  
  public ModelFisherman()
  {
    textureWidth = 64;
    textureHeight = 64;

    
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, -3F, -2F, 7, 12, 3);
      body.setRotationPoint(0F, 3F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(0F, -2F, -1F, 2, 11, 2);
      leftarm.setRotationPoint(3F, 2F, -1F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.0743572F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 3, 12, 3);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 3, 12, 3);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      mouth1 = new ModelRenderer(this, 20, 0);
      mouth1.addBox(-2F, 0F, 0F, 1, 1, 0);
      mouth1.setRotationPoint(1.05F, -3F, -3.01F);
      mouth1.setTextureSize(64, 64);
      mouth1.mirror = true;
      setRotation(mouth1, 0F, 0F, -0.6320364F);
    HeadBase = new ModelRenderer(this, "HeadBase");
    HeadBase.setRotationPoint(0F, 0F, 0F);
    setRotation(HeadBase, 0F, 0F, 0F);
    HeadBase.mirror = true;
      mouth2 = new ModelRenderer(this, 20, 0);
      mouth2.addBox(-1F, 0F, 1F, 2, 1, 0);
      mouth2.setRotationPoint(-1F, -2F, -4F);
      mouth2.setTextureSize(64, 64);
      mouth2.mirror = true;
      setRotation(mouth2, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-2.5F, -5F, -3F, 5, 5, 5);
      head.setRotationPoint(-0.5F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Hat = new ModelRenderer(this, 40, 0);
      Hat.addBox(-2F, 0F, -4F, 5, 0, 7);
      Hat.setRotationPoint(-1F, -5F, -1F);
      Hat.setTextureSize(64, 64);
      Hat.mirror = true;
      setRotation(Hat, 0F, 0F, 0F);
      HatTop = new ModelRenderer(this, 44, 8);
      HatTop.addBox(-2F, -1F, -2F, 5, 2, 5);
      HatTop.setRotationPoint(-1F, -6F, -1F);
      HatTop.setTextureSize(64, 64);
      HatTop.mirror = true;
      setRotation(HatTop, 0F, 0F, 0F);
    ARMWITHRODPIECE = new ModelRenderer(this, "ARMWITHRODPIECE");
    ARMWITHRODPIECE.setRotationPoint(-5F, 2F, 0F);
    setRotation(ARMWITHRODPIECE, 0F, 0F, 0F);
    ARMWITHRODPIECE.mirror = true;
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-1F, -2F, -1.5F, 2, 11, 2);
      rightarm.setRotationPoint(0F,0F,0F);
      rightarm.setTextureSize(64, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.074351F);
      fishingrod = new ModelRenderer(this, 0, 38);
      fishingrod.addBox(-1F, 4F, -15F, 1, 1, 25);
      fishingrod.setRotationPoint(0F,0F,0F);
      fishingrod.setTextureSize(64, 64);
      fishingrod.mirror = true;
      setRotation(fishingrod, -1.152537F, 0F, 0F);
      fishingline = new ModelRenderer(this, 60, 44);
      fishingline.addBox(-1F, -8.5F, -13.3F, 1, 19, 0);
      fishingline.setRotationPoint(0F,0F,0F);
      fishingline.setTextureSize(64, 64);
      fishingline.mirror = true;
      setRotation(fishingline, -0.2602503F, 0F, 0F);
      
      
      ARMWITHRODPIECE.addChild(fishingline);
      ARMWITHRODPIECE.addChild(fishingrod);
      ARMWITHRODPIECE.addChild(rightarm);
      
      HeadBase.addChild(mouth1);
      HeadBase.addChild(mouth2);
      HeadBase.addChild(head);
      HeadBase.addChild(Hat);
      HeadBase.addChild(HatTop);
      
     
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    HeadBase.render(f5);
    ARMWITHRODPIECE.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  HeadBase.rotateAngleY = f3 / (180F / (float) Math.PI);
	  HeadBase.rotateAngleX = f4 / (180F / (float) Math.PI);
	  rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  rightleg.rotateAngleY = 0.0F;
	  leftleg.rotateAngleY = 0.0F;
	  ARMWITHRODPIECE.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * .8F * f1;
	  leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * .8F * f1;
   
  }

}
