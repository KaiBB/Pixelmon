// Date: 2/12/2013 1:14:24 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.client.models.pokemon;


import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.Biped.SkeletonBiped;

public class ModelCranidos extends PixelmonModelBase
{
  //fields
    ModelRenderer Body;
  
  public ModelCranidos()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, "Body");
      Body.setRotationPoint(0, 16, 0);
      ModelRenderer body = new ModelRenderer(this, 0, 23);
      body.addBox(-2.5F, -1F, -1F, 5, 5, 4);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0.0698132F, 0F, 0F);
      Body.addChild(body);
      ModelRenderer body_2 = new ModelRenderer(this, 18, 25);
      body_2.addBox(-2F, -0.4333333F, -2F, 4, 4, 3);
      body_2.setTextureSize(64, 32);
      body_2.mirror = true;
      setRotation(body_2, -0.3839724F, 0F, 0F);
      Body.addChild(body_2);
      ModelRenderer neck = new ModelRenderer(this, 17, 18);
      neck.addBox(-1F, -0.9F, -1.666667F, 2, 3, 3);
      neck.setRotationPoint(0F, 0F, -2F);
      neck.setTextureSize(64, 32);
      neck.mirror = true;
      setRotation(neck, -0.9424778F, 0F, 0F);
      Body.addChild(neck);
      
      ModelRenderer Tail = new ModelRenderer(this, "Tail");
      Tail.setRotationPoint(0, 0, 3);
      ModelRenderer tail_1 = new ModelRenderer(this, 0, 17);
      tail_1.addBox(-1.5F, -1.1F, -1F, 3, 4, 2);
      tail_1.setTextureSize(64, 32);
      tail_1.mirror = true;
      setRotation(tail_1, 0.1745329F, 0F, 0F);
      Tail.addChild(tail_1);
      ModelRenderer tail_2 = new ModelRenderer(this, 0, 12);
      tail_2.addBox(-1F, -1.466667F, -2F, 2, 3, 2);
      tail_2.setRotationPoint(0F, 0F, 2);
      tail_2.setTextureSize(64, 32);
      tail_2.mirror = true;
      setRotation(tail_2, 0.2443461F, 0F, 0F);
      Tail.addChild(tail_2);
      ModelRenderer tail_3 = new ModelRenderer(this, 0, 8);
      tail_3.addBox(-0.5F, -1.4F, -1F, 1, 2, 2);
      tail_3.setRotationPoint(0F, 0F, 2F);
      tail_3.setTextureSize(64, 32);
      tail_3.mirror = true;
      setRotation(tail_3, 0.3490659F, 0F, 0F);
      Tail.addChild(tail_3);
      ModelRenderer tail_4 = new ModelRenderer(this, 0, 6);
      tail_4.addBox(-0.5F, -0.7F, -0.3333333F, 1, 1, 1);
      tail_4.setRotationPoint(0F, -1F, 3F);
      tail_4.setTextureSize(64, 32);
      tail_4.mirror = true;
      setRotation(tail_4, 0.3839724F, 0F, 0F);
      Tail.addChild(tail_4);
      Body.addChild(Tail);
      
      ModelRenderer Head = new ModelRenderer(this, "Head");
      Head.setRotationPoint(0, -1, -3);
      ModelRenderer head = new ModelRenderer(this, 39, 25);
      head.addBox(-1F, -2.033333F, -3.1F, 2, 3, 4);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0.4712389F, 0F, 0F);
      Head.addChild(head);
      ModelRenderer snout = new ModelRenderer(this, 47, 20);
      snout.addBox(-3F, -1.766667F, -3F, 2, 2, 2);
      snout.setTextureSize(64, 32);
      snout.mirror = true;
      setRotation(snout, 0.698131701F, -0.6457718F, -0.5235988F);
      Head.addChild(snout);
      ModelRenderer head_side_L = new ModelRenderer(this, 17, 12);
      head_side_L.addBox(0.9F, -1.9F, -2.166667F, 2, 3, 3);
      head_side_L.setTextureSize(64, 32);
      head_side_L.mirror = true;
      setRotation(head_side_L, 0.418879F, 0.4886922F, 0.2268928F);
      Head.addChild(head_side_L);
      ModelRenderer head_side_R = new ModelRenderer(this, 54, 26);
      head_side_R.addBox(-2.9F, -1.9F, -2.2F, 2, 3, 3);
      head_side_R.setTextureSize(64, 32);
      head_side_R.mirror = true;
      setRotation(head_side_R, 0.3490659F, -0.4886922F, -0.2268928F);
      Head.addChild(head_side_R);
      ModelRenderer head_2 = new ModelRenderer(this, 58, 20);
      head_2.addBox(0.6666667F, -2.033333F, -2.5F, 1, 3, 2);
      head_2.setTextureSize(64, 32);
      head_2.mirror = true;
      setRotation(head_2, 0.3490659F, -0.715585F, -0.2443461F);
      Head.addChild(head_2);
      ModelRenderer head_3 = new ModelRenderer(this, 58, 20);
      head_3.addBox(-1.666667F, -1.9F, -2.5F, 1, 3, 2);
      head_3.setTextureSize(64, 32);
      head_3.mirror = true;
      setRotation(head_3, 0.3490659F, 0.715585F, 0.2443461F);
      Head.addChild(head_3);
      ModelRenderer head_top_1 = new ModelRenderer(this, 35, 11);
      head_top_1.addBox(-1.5F, -3.166667F, -2.766667F, 3, 3, 4);
      head_top_1.setTextureSize(64, 32);
      head_top_1.mirror = true;
      setRotation(head_top_1, 0.5235988F, 0F, 0F);
      Head.addChild(head_top_1);
      ModelRenderer head_top_2 = new ModelRenderer(this, 37, 5);
      head_top_2.addBox(-1F, -3.633333F, -2.366667F, 2, 2, 3);
      head_top_2.setTextureSize(64, 32);
      head_top_2.mirror = true;
      setRotation(head_top_2, 0.5585054F, 0F, 0F);
      Head.addChild(head_top_2);
      ModelRenderer head_top_3 = new ModelRenderer(this, 33, 19);
      head_top_3.addBox(-1.933333F, -2.5F, -2.5F, 2, 2, 3);
      head_top_3.setTextureSize(64, 32);
      head_top_3.mirror = true;
      setRotation(head_top_3, 0.4712389F, -0.0698132F, 0.0174533F);
      Head.addChild(head_top_3);
      ModelRenderer head_top_4 = new ModelRenderer(this, 33, 19);
      head_top_4.addBox(-0.1F, -2.5F, -2.5F, 2, 2, 3);
      head_top_4.setTextureSize(64, 32);
      head_top_4.mirror = true;
      setRotation(head_top_4, 0.4712389F, 0.0698132F, -0.0174533F);
      Head.addChild(head_top_4);
      ModelRenderer head_detail_1_R = new ModelRenderer(this, 58, 29);
      head_detail_1_R.addBox(-2.9F, -1.433333F, -2.4F, 2, 1, 2);
      head_detail_1_R.setTextureSize(64, 32);
      head_detail_1_R.mirror = true;
      setRotation(head_detail_1_R, -0.1396263F, -0.5410521F, -0.2268928F);
      Head.addChild(head_detail_1_R);
      ModelRenderer head_detail_2_R = new ModelRenderer(this, 58, 29);
      head_detail_2_R.addBox(-2.7F, -0.9666666F, -1.6F, 2, 2, 1);
      head_detail_2_R.setTextureSize(64, 32);
      head_detail_2_R.mirror = true;
      setRotation(head_detail_2_R, -0.5410521F, -0.3141593F, 0.2617994F);
      Head.addChild(head_detail_2_R);
      ModelRenderer  head_detail_1_L = new ModelRenderer(this, 58, 29);
      head_detail_1_L.addBox(0.9F, -1.433333F, -2.4F, 2, 1, 2);
      head_detail_1_L.setTextureSize(64, 32);
      head_detail_1_L.mirror = true;
      setRotation(head_detail_1_L, -0.1396263F, 0.5410521F, 0.2268928F);
      Head.addChild(head_detail_1_L);
      ModelRenderer head_detail_2_L = new ModelRenderer(this, 58, 29);
      head_detail_2_L.addBox(0.7F, -0.9666666F, -1.6F, 2, 2, 1);
      head_detail_2_L.setTextureSize(64, 32);
      head_detail_2_L.mirror = true;
      setRotation(head_detail_2_L, -0.5410521F, 0.3141593F, -0.2617994F);
      Head.addChild(head_detail_2_L);
      ModelRenderer  head_side_R2 = new ModelRenderer(this, 59, 29);
      head_side_R2.addBox(-3.233333F, -2.1F, -1.066667F, 1, 1, 2);
      head_side_R2.setTextureSize(64, 32);
      head_side_R2.mirror = true;
      setRotation(head_side_R2, 1.204277F, -0.8203047F, -0.296706F);
      Head.addChild(head_side_R2);
      ModelRenderer  head_side_L2 = new ModelRenderer(this, 59, 29);
      head_side_L2.addBox(2.2F, -2.1F, -1.066667F, 1, 1, 2);
      head_side_L2.setTextureSize(64, 32);
      head_side_L2.mirror = true;
      setRotation(head_side_L2, 1.204277F, 0.8203047F, 0.296706F);
      Head.addChild(head_side_L2);
      ModelRenderer  spike_1 = new ModelRenderer(this, 0, 0);
      spike_1.addBox(1.4F, -3.3F, -1.1F, 1, 2, 1);
      spike_1.setTextureSize(64, 32);
      spike_1.mirror = true;
      setRotation(spike_1, -0.5410521F, 0.5934119F, 0.3141593F);
      Head.addChild(spike_1);
      ModelRenderer  spike_2 = new ModelRenderer(this, 0, 0);
      spike_2.addBox(-2.4F, -3.3F, -1.1F, 1, 2, 1);
      spike_2.setTextureSize(64, 32);
      spike_2.mirror = true;
      setRotation(spike_2, -0.5410521F, -0.5934119F, -0.3141593F);
      Head.addChild(spike_2);
      ModelRenderer  spike_3 = new ModelRenderer(this, 0, 0);
      spike_3.addBox(0.4F, -3.3F, -1.1F, 1, 2, 1);
      spike_3.setTextureSize(64, 32);
      spike_3.mirror = true;
      setRotation(spike_3, -0.5410521F, 0.5934119F, -0.1047198F);
      Head.addChild(spike_3);
      ModelRenderer  spike_4 = new ModelRenderer(this, 0, 0);
      spike_4.addBox(-1.4F, -3.3F, -1.1F, 1, 2, 1);
      spike_4.setTextureSize(64, 32);
      spike_4.mirror = true;
      setRotation(spike_4, -0.5410521F, -0.5934119F, 0.1047198F);
      Head.addChild(spike_4);
      Body.addChild(Head);
      
      ModelRenderer LeftLeg = new ModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(2, 2, 0);
      ModelRenderer leg_1_L = new ModelRenderer(this, 26, 0);
      leg_1_L.addBox(-1.066667F, -3F, 0F, 2, 3, 3);
      leg_1_L.setTextureSize(64, 32);
      leg_1_L.mirror = true;
      setRotation(leg_1_L, -1.745329F, -0.1047198F, 0F);
      LeftLeg.addChild(leg_1_L);
      ModelRenderer leg_2_L = new ModelRenderer(this, 11, 0);
      leg_2_L.addBox(-0.7333333F, 2.466667F, 1.666667F, 1, 3, 1);
      leg_2_L.setTextureSize(64, 32);
      leg_2_L.mirror = true;
      setRotation(leg_2_L, -0.2268928F, -0.1570796F, 0F);
      LeftLeg.addChild(leg_2_L);
      ModelRenderer leg_3_L_ = new ModelRenderer(this, 54, 7);
      leg_3_L_.addBox(-1.2F, 3.8F, -4.133333F, 2, 1, 3);
      leg_3_L_.setTextureSize(64, 32);
      leg_3_L_.mirror = true;
      setRotation(leg_3_L_, 0.8552113F, -0.1745329F, 0F);
      LeftLeg.addChild(leg_3_L_);
      ModelRenderer foot_L = new ModelRenderer(this, 50, 7);
      foot_L.addBox(-1.2F, 5F, -0.1333333F, 2, 1, 1);
      foot_L.setTextureSize(64, 32);
      foot_L.mirror = true;
      setRotation(foot_L, 0F, -0.1745329F, 0F);
      LeftLeg.addChild(foot_L);
      ModelRenderer toes_L = new ModelRenderer(this, 50, 12);
      toes_L.addBox(-2F, 5.466667F, -3.266667F, 4, 0, 4);
      toes_L.setTextureSize(64, 32);
      toes_L.mirror = true;
      setRotation(toes_L, 0.2094395F, -0.1745329F, 0F);
      LeftLeg.addChild(toes_L);
      ModelRenderer back_claw_L = new ModelRenderer(this, 0, 0);
      back_claw_L.addBox(-0.9333333F, 0.6666667F, -5F, 1, 1, 1);
      back_claw_L.setTextureSize(64, 32);
      back_claw_L.mirror = true;
      setRotation(back_claw_L, 1.989675F, -0.1745329F, 0F);
      LeftLeg.addChild(back_claw_L);
      Body.addChild(LeftLeg);
      
      
      ModelRenderer RightLeg = new ModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(-2, 2, 0);
      ModelRenderer  leg_1_R = new ModelRenderer(this, 54, 0);
      leg_1_R.addBox(-1.066667F, 0F, 0F, 2, 3, 3);
      leg_1_R.setTextureSize(64, 32);
      leg_1_R.mirror = true;
      setRotation(leg_1_R, -0.1745329F, 0.1570796F, 0F);
      RightLeg.addChild(leg_1_R);
      ModelRenderer  leg_2_R = new ModelRenderer(this, 11, 0);
      leg_2_R.addBox(-0.7333333F, 2.466667F, 1.666667F, 1, 3, 1);
      leg_2_R.setTextureSize(64, 32);
      leg_2_R.mirror = true;
      setRotation(leg_2_R, -0.2268928F, 0.1570796F, 0F);
      RightLeg.addChild(leg_2_R);
      ModelRenderer leg_3_R_ = new ModelRenderer(this, 54, 7);
      leg_3_R_.addBox(-1.2F, 3.8F, -4.133333F, 2, 1, 3);
      leg_3_R_.setTextureSize(64, 32);
      leg_3_R_.mirror = true;
      setRotation(leg_3_R_, 0.8552113F, 0.1745329F, 0F);
      RightLeg.addChild(leg_3_R_);
      ModelRenderer foot_R = new ModelRenderer(this, 50, 7);
      foot_R.addBox(-1.2F, 5F, -0.1333333F, 2, 1, 1);
      foot_R.setTextureSize(64, 32);
      foot_R.mirror = true;
      setRotation(foot_R, 0F, 0.1745329F, 0F);
      RightLeg.addChild(foot_R);
      ModelRenderer toes_R = new ModelRenderer(this, 50, 12);
      toes_R.addBox(-1.933333F, 5.466667F, -3.266667F, 4, 0, 4);
      toes_R.setTextureSize(64, 32);
      toes_R.mirror = true;
      setRotation(toes_R, 0.2094395F, 0.1745329F, 0F);
      RightLeg.addChild(toes_R);
      ModelRenderer back_claw_R = new ModelRenderer(this, 0, 0);
      back_claw_R.addBox(-0.5F, 0.6666667F, -5F, 1, 1, 1);
      back_claw_R.setTextureSize(64, 32);
      back_claw_R.mirror = true;
      setRotation(back_claw_R, 1.989675F, 0.1745329F, 0F);
      RightLeg.addChild(back_claw_R);
      Body.addChild(RightLeg);
      
      ModelRenderer LeftArm = new ModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(2, 1, -1);
      ModelRenderer L_arm = new ModelRenderer(this, 11, 0);
      L_arm.addBox(0F, 1F, -1F, 1, 3, 1);
      L_arm.setTextureSize(64, 32);
      L_arm.mirror = true;
      setRotation(L_arm, -0.1919862F, 0F, 0.3665191F);
      LeftArm.addChild(L_arm);
      ModelRenderer L_claws = new ModelRenderer(this, 16, 0);
      L_claws.addBox(-1.2F, 2.666667F, -0.6F, 3, 3, 0);
      L_claws.setTextureSize(64, 32);
      L_claws.mirror = true;
      setRotation(L_claws, -0.122173F, -0.3141593F, 0.478055F);
      LeftArm.addChild(L_claws);
      Body.addChild(LeftArm);
      
      ModelRenderer RightArm = new ModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-2, 1, -1);
      ModelRenderer  R_arm = new ModelRenderer(this, 11, 0);
      R_arm.addBox(-1F, 1F, -1F, 1, 3, 1);
      R_arm.setTextureSize(64, 32);
      R_arm.mirror = true;
      setRotation(R_arm, -0.1919862F, 0F, -0.3665191F);
      RightArm.addChild(R_arm);
      ModelRenderer  R_claws = new ModelRenderer(this, 16, 0);
      R_claws.addBox(-1.866667F, 2.666667F, -0.6F, 3, 3, 0);
      R_claws.setTextureSize(64, 32);
      R_claws.mirror = true;
      setRotation(R_claws, -0.122173F, 0.3141593F, -0.3665191F);
      RightArm.addChild(R_claws);
      Body.addChild(RightArm);
      
      ModuleHead headModule = new ModuleHead(Head);
      skeleton = new SkeletonBiped(Body, headModule, LeftArm, RightArm, LeftLeg, RightLeg);
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
   Body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

}
