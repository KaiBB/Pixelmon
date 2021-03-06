// Date: 4/17/2013 8:55:14 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package pixelmon.client.models.pokemon;


import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.SkeletonBase;

public class ModelWeepinbell extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
    
    
  public ModelWeepinbell()
  {
    textureWidth = 64;
    textureHeight = 64;
    
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0,17,5);
      PixelmonModelRenderer eardrum = new PixelmonModelRenderer(this, 0, 0);
      eardrum.addBox(0F, 1.5F, -5F, 4, 1, 1);
      eardrum.setTextureSize(64, 64);
      eardrum.mirror = true;
      setRotation(eardrum, -0.5855631F, 1.570796F, -2.007645F);
      PixelmonModelRenderer tonsil = new PixelmonModelRenderer(this, 0, 0);
      tonsil.addBox(-0.8F, -0.7F, -5F, 2, 1, 1);
      tonsil.setTextureSize(64, 64);
      tonsil.mirror = true;
      setRotation(tonsil, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer rightear = new PixelmonModelRenderer(this, 0, 0);
      rightear.addBox(3F, -2.4F, -3F, 8, 4, 1);
      rightear.setTextureSize(64, 64);
      rightear.mirror = true;
      setRotation(rightear, -0.6599204F, 1.570796F, -2.007645F);
      PixelmonModelRenderer rightear2 = new PixelmonModelRenderer(this, 0, 0);
      rightear2.addBox(1F, -2F, -5F, 8, 5, 2);
      rightear2.setTextureSize(64, 64);
      rightear2.mirror = true;
      setRotation(rightear2, -0.5855631F, 1.570796F, -2.007645F);
      PixelmonModelRenderer horizontalmouth = new PixelmonModelRenderer(this, 0, 50);
      horizontalmouth.addBox(2.5F, -2.7F, -4.2F, 1, 5, 9);
      horizontalmouth.setRotationPoint(0F, 2F, -5F);
      horizontalmouth.setTextureSize(64, 64);
      horizontalmouth.mirror = true;
      setRotation(horizontalmouth, 0.5483845F, 1.570796F, 0F);
      PixelmonModelRenderer ass = new PixelmonModelRenderer(this, 0, 0);
      ass.addBox(-3.8F, -3F, -5F, 2, 6, 1);
      ass.setRotationPoint(0F, 1F, -2F);
      ass.setTextureSize(64, 64);
      ass.mirror = true;
      setRotation(ass, 1.570796F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer leftwisdomtooth = new PixelmonModelRenderer(this, 0, 0);
      leftwisdomtooth.addBox(-1F, 0F, -5F, 4, 2, 1);
      leftwisdomtooth.setRotationPoint(0F, 2F, -5F);
      leftwisdomtooth.setTextureSize(64, 64);
      leftwisdomtooth.mirror = true;
      setRotation(leftwisdomtooth, 2.648976F, 1.570796F, 0F);
      PixelmonModelRenderer rightwisdomtooth = new PixelmonModelRenderer(this, 0, 0);
      rightwisdomtooth.addBox(-1F, -2F, -5F, 4, 2, 1);
      rightwisdomtooth.setRotationPoint(0F, 2F, -5F);
      rightwisdomtooth.setTextureSize(64, 64);
      rightwisdomtooth.mirror = true;
      setRotation(rightwisdomtooth, 0.4926166F, 1.570796F, 0F);
      PixelmonModelRenderer toprightlip = new PixelmonModelRenderer(this, 37, 33);
      toprightlip.addBox(3F, -3F, -5.4F, 1, 6, 1);
      toprightlip.setRotationPoint(0F, 2F, -5F);
      toprightlip.setTextureSize(64, 64);
      toprightlip.mirror = true;
      setRotation(toprightlip, -0.5855631F, 1.570796F, 0F);
      PixelmonModelRenderer topleftlip = new PixelmonModelRenderer(this, 37, 34);
      topleftlip.addBox(3F, -3F, -5.5F, 1, 6, 1);
      topleftlip.setRotationPoint(0F, 2F, -5F);
      topleftlip.setTextureSize(64, 64);
      topleftlip.mirror = true;
      setRotation(topleftlip, -2.593208F, 1.570796F, 0F);
      PixelmonModelRenderer botjaw = new PixelmonModelRenderer(this, 2, 39);
      botjaw.addBox(-2F, -3F, -5F, 6, 6, 1);
      botjaw.setRotationPoint(0F, 2F, -5F);
      botjaw.setTextureSize(64, 64);
      botjaw.mirror = true;
      setRotation(botjaw, 1.570796F, 1.570796F, 0F);
      PixelmonModelRenderer rightbuttock = new PixelmonModelRenderer(this, 0, 0);
      rightbuttock.addBox(-3.5F, -2.4F, -5F, 7, 5, 1);
      rightbuttock.setRotationPoint(0F, 1F, -2F);
      rightbuttock.setTextureSize(64, 64);
      rightbuttock.mirror = true;
      setRotation(rightbuttock, -0.6007444F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer buttock = new PixelmonModelRenderer(this, 0, 0);
      buttock.addBox(-3.5F, -3F, -5F, 7, 6, 1);
      buttock.setRotationPoint(0F, 1F, -2F);
      buttock.setTextureSize(64, 64);
      buttock.mirror = true;
      setRotation(buttock, 1.570796F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer leftbuttock = new PixelmonModelRenderer(this, 0, 0);
      leftbuttock.addBox(-3.5F, -3F, -5F, 7, 6, 1);
      leftbuttock.setRotationPoint(0F, 1F, -2F);
      leftbuttock.setTextureSize(64, 64);
      leftbuttock.mirror = true;
      setRotation(leftbuttock, 2.648976F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer leftdimple = new PixelmonModelRenderer(this, 0, 0);
      leftdimple.addBox(-3.5F, -2.4F, -5F, 7, 5, 1);
      leftdimple.setRotationPoint(0F, 1F, -2F);
      leftdimple.setTextureSize(64, 64);
      leftdimple.mirror = true;
      setRotation(leftdimple, -2.573483F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer rightcheek2 = new PixelmonModelRenderer(this, 0, 0);
      rightcheek2.addBox(-3.5F, -3F, -5F, 7, 6, 1);
      rightcheek2.setRotationPoint(0F, 1F, -2F);
      rightcheek2.setTextureSize(64, 64);
      rightcheek2.mirror = true;
      setRotation(rightcheek2, 0.4774353F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer leftear3 = new PixelmonModelRenderer(this, 0, 0);
      leftear3.addBox(1F, -2F, -5F, 8, 3, 1);
      leftear3.setTextureSize(64, 64);
      leftear3.mirror = true;
      setRotation(leftear3, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer spine7 = new PixelmonModelRenderer(this, 0, 0);
      spine7.addBox(-2F, 2F, -5F, 8, 1, 1);
      spine7.setTextureSize(64, 64);
      spine7.mirror = true;
      setRotation(spine7, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer spine6 = new PixelmonModelRenderer(this, 0, 0);
      spine6.addBox(-1.5F, 1F, -5F, 8, 1, 1);
      spine6.setTextureSize(64, 64);
      spine6.mirror = true;
      setRotation(spine6, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer lefthip = new PixelmonModelRenderer(this, 0, 0);
      lefthip.addBox(-2F, 1.3F, -5F, 2, 1, 1);
      lefthip.setTextureSize(64, 64);
      lefthip.mirror = true;
      setRotation(lefthip, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer leftear2 = new PixelmonModelRenderer(this, 0, 0);
      leftear2.addBox(-1F, 0F, -5F, 8, 3, 1);
      leftear2.setTextureSize(64, 64);
      leftear2.mirror = true;
      setRotation(leftear2, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer leftear = new PixelmonModelRenderer(this, 0, 0);
      leftear.addBox(0F, -3F, -5F, 8, 4, 1);
      leftear.setTextureSize(64, 64);
      leftear.mirror = true;
      setRotation(leftear, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer spine5 = new PixelmonModelRenderer(this, 0, 0);
      spine5.addBox(-1.5F, 0.3F, -5F, 2, 1, 1);
      spine5.setTextureSize(64, 64);
      spine5.mirror = true;
      setRotation(spine5, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer leftcheek2 = new PixelmonModelRenderer(this, 0, 0);
      leftcheek2.addBox(-2F, -3F, -5F, 11, 5, 1);
      leftcheek2.setTextureSize(64, 64);
      leftcheek2.mirror = true;
      setRotation(leftcheek2, -3.671388F, 1.570796F, -2.007645F);
      PixelmonModelRenderer leftcheekbone = new PixelmonModelRenderer(this, 0, 0);
      leftcheekbone.addBox(-2F, -3F, -5F, 11, 5, 2);
      leftcheekbone.setTextureSize(64, 64);
      leftcheekbone.mirror = true;
      setRotation(leftcheekbone, -3.671388F, 1.570796F, -2.007645F);
      PixelmonModelRenderer leftcheek = new PixelmonModelRenderer(this, 0, 0);
      leftcheek.addBox(-3.5F, -3F, -5F, 7, 5, 1);
      leftcheek.setRotationPoint(0F, 1F, -2F);
      leftcheek.setTextureSize(64, 64);
      leftcheek.mirror = true;
      setRotation(leftcheek, -2.573483F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer rightcheek = new PixelmonModelRenderer(this, 0, 0);
      rightcheek.addBox(-3.5F, -2F, -5F, 7, 5, 1);
      rightcheek.setRotationPoint(0F, 1F, -2F);
      rightcheek.setTextureSize(64, 64);
      rightcheek.mirror = true;
      setRotation(rightcheek, -0.6007444F, 1.570796F, 0.4461433F);
      PixelmonModelRenderer spine4 = new PixelmonModelRenderer(this, 0, 0);
      spine4.addBox(-1.8F, -1.5F, -5F, 4, 1, 1);
      spine4.setTextureSize(64, 64);
      spine4.mirror = true;
      setRotation(spine4, -0.5855631F, 1.570796F, -2.007645F);
      PixelmonModelRenderer spine3 = new PixelmonModelRenderer(this, 0, 0);
      spine3.addBox(-1F, -0.5F, -5F, 4, 1, 1);
      spine3.setTextureSize(64, 64);
      spine3.mirror = true;
      setRotation(spine3, -0.5855631F, 1.570796F, -2.007645F);
      PixelmonModelRenderer spine2 = new PixelmonModelRenderer(this, 0, 0);
      spine2.addBox(-2F, -2.5F, -5F, 4, 1, 1);
      spine2.setTextureSize(64, 64);
      spine2.mirror = true;
      setRotation(spine2, -0.5855631F, 1.570796F, -2.007645F);
      PixelmonModelRenderer spine = new PixelmonModelRenderer(this, 0, 0);
      spine.addBox(-0.3F, 0.5F, -5F, 4, 1, 1);
      spine.setTextureSize(64, 64);
      spine.mirror = true;
      setRotation(spine, -0.5855631F, 1.570796F, -2.007645F);
      PixelmonModelRenderer botrightmouth = new PixelmonModelRenderer(this, 4, 39);
      botrightmouth.addBox(0F, -3F, -5F, 4, 6, 1);
      botrightmouth.setRotationPoint(0F, 2F, -5F);
      botrightmouth.setTextureSize(64, 64);
      botrightmouth.mirror = true;
      setRotation(botrightmouth, 0.4926166F, 1.570796F, 0F);
      PixelmonModelRenderer jawbone6 = new PixelmonModelRenderer(this, 0, 0);
      jawbone6.addBox(-2F, 2F, -5F, 4, 1, 1);
      jawbone6.setRotationPoint(0F, 2F, -5F);
      jawbone6.setTextureSize(64, 64);
      jawbone6.mirror = true;
      setRotation(jawbone6, 0.4926166F, 1.570796F, 0F);
      PixelmonModelRenderer jawbone5 = new PixelmonModelRenderer(this, 0, 0);
      jawbone5.addBox(-1.6F, 1F, -5F, 4, 1, 1);
      jawbone5.setRotationPoint(0F, 2F, -5F);
      jawbone5.setTextureSize(64, 64);
      jawbone5.mirror = true;
      setRotation(jawbone5, 0.4926166F, 1.570796F, 0F);
      PixelmonModelRenderer jawbone4 = new PixelmonModelRenderer(this, 0, 0);
      jawbone4.addBox(-1.3F, 0F, -5F, 4, 1, 1);
      jawbone4.setRotationPoint(0F, 2F, -5F);
      jawbone4.setTextureSize(64, 64);
      jawbone4.mirror = true;
      setRotation(jawbone4, 0.4926166F, 1.570796F, 0F);
      PixelmonModelRenderer botrightlip2 = new PixelmonModelRenderer(this, 37, 34);
      botrightlip2.addBox(3F, -3F, -5.5F, 1, 6, 1);
      botrightlip2.setRotationPoint(0F, 2F, -5F);
      botrightlip2.setTextureSize(64, 64);
      botrightlip2.mirror = true;
      setRotation(botrightlip2, 2.648976F, 1.570796F, 0F);
      PixelmonModelRenderer jawbone3 = new PixelmonModelRenderer(this, 0, 0);
      jawbone3.addBox(-1.9F, -3F, -5F, 4, 1, 1);
      jawbone3.setRotationPoint(0F, 2F, -5F);
      jawbone3.setTextureSize(64, 64);
      jawbone3.mirror = true;
      setRotation(jawbone3, 2.648976F, 1.570796F, 0F);
      PixelmonModelRenderer jawbone2 = new PixelmonModelRenderer(this, 0, 0);
      jawbone2.addBox(-1.6F, -2F, -5F, 4, 1, 1);
      jawbone2.setRotationPoint(0F, 2F, -5F);
      jawbone2.setTextureSize(64, 64);
      jawbone2.mirror = true;
      setRotation(jawbone2, 2.648976F, 1.570796F, 0F);
      PixelmonModelRenderer jawbone = new PixelmonModelRenderer(this, 0, 0);
      jawbone.addBox(-1.3F, -1F, -5F, 4, 1, 1);
      jawbone.setRotationPoint(0F, 2F, -5F);
      jawbone.setTextureSize(64, 64);
      jawbone.mirror = true;
      setRotation(jawbone, 2.648976F, 1.570796F, 0F);
      PixelmonModelRenderer leftleaf = new PixelmonModelRenderer(this, 40, 0);
      leftleaf.addBox(-15F, -6.7F, -0.2F, 12, 9, 0);
      leftleaf.setRotationPoint(-0.5F, 1F, -3F);
      leftleaf.setTextureSize(64, 64);
      leftleaf.mirror = true;
      setRotation(leftleaf, 0.7807508F, 3.141593F, 0F);
      PixelmonModelRenderer verticalmouth = new PixelmonModelRenderer(this, 0, 50);
      verticalmouth.addBox(2.5F, -2.7F, -4.2F, 1, 5, 9);
      verticalmouth.setRotationPoint(0F, 2F, -5F);
      verticalmouth.setTextureSize(64, 64);
      verticalmouth.mirror = true;
      setRotation(verticalmouth, -1.570796F, 1.570796F, 0F);
      PixelmonModelRenderer mouth = new PixelmonModelRenderer(this, 0, 50);
      mouth.addBox(2.5F, -2.7F, -4.2F, 1, 5, 9);
      mouth.setRotationPoint(0F, 2F, -5F);
      mouth.setTextureSize(64, 64);
      mouth.mirror = true;
      setRotation(mouth, -0.5669738F, 1.570796F, 0F);
      PixelmonModelRenderer rightleaf = new PixelmonModelRenderer(this, 40, 0);
      rightleaf.addBox(-15F, -7.7F, -0.2F, 12, 9, 0);
      rightleaf.setRotationPoint(0.5F, 1F, -3F);
      rightleaf.setTextureSize(64, 64);
      rightleaf.mirror = true;
      setRotation(rightleaf, -1.006094F, -0.1858931F, 0F);
      PixelmonModelRenderer toplip = new PixelmonModelRenderer(this, 37, 34);
      toplip.addBox(7F, -2.6F, -6.2F, 1, 6, 1);
      toplip.setRotationPoint(0.5F, 2.7F, -1F);
      toplip.setTextureSize(64, 64);
      toplip.mirror = true;
      setRotation(toplip, -1.570796F, 1.570796F, 0F);
      PixelmonModelRenderer back = new PixelmonModelRenderer(this, 0, 0);
      back.addBox(-2F, -3F, -5F, 11, 5, 1);
      back.setTextureSize(64, 64);
      back.mirror = true;
      setRotation(back, -1.515028F, 1.570796F, -2.007645F);
      PixelmonModelRenderer face = new PixelmonModelRenderer(this, 0, 21);
      face.addBox(-2F, -3F, -5F, 11, 6, 2);
      face.setTextureSize(64, 64);
      face.mirror = true;
      setRotation(face, 1.570796F, 1.570796F, -2.007645F);
      PixelmonModelRenderer faceright = new PixelmonModelRenderer(this, 0, 0);
      faceright.addBox(1F, -3F, -5F, 8, 6, 2);
      faceright.setTextureSize(64, 64);
      faceright.mirror = true;
      setRotation(faceright, 0.4926166F, 1.570796F, -2.007645F);
      PixelmonModelRenderer facebackright = new PixelmonModelRenderer(this, 0, 0);
      facebackright.addBox(1F, -2.5F, -5F, 8, 5, 1);
      facebackright.setTextureSize(64, 64);
      facebackright.mirror = true;
      setRotation(facebackright, -0.5855631F, 1.570796F, -2.007645F);
      PixelmonModelRenderer faceback = new PixelmonModelRenderer(this, 0, 0);
      faceback.addBox(-2F, -2.5F, -5F, 11, 5, 2);
      faceback.setTextureSize(64, 64);
      faceback.mirror = true;
      setRotation(faceback, -1.515028F, 1.570796F, -2.007645F);
      PixelmonModelRenderer facebackleft = new PixelmonModelRenderer(this, 0, 0);
      facebackleft.addBox(1F, -3F, -5F, 8, 6, 2);
      facebackleft.setTextureSize(64, 64);
      facebackleft.mirror = true;
      setRotation(facebackleft, -2.593208F, 1.570796F, -2.007645F);
      PixelmonModelRenderer faceleft = new PixelmonModelRenderer(this, 0, 0);
      faceleft.addBox(0F, -2F, -5F, 9, 5, 2);
      faceleft.setTextureSize(64, 64);
      faceleft.mirror = true;
      setRotation(faceleft, -3.671388F, 1.570796F, -2.007645F);
      PixelmonModelRenderer stembotright = new PixelmonModelRenderer(this, 0, 0);
      stembotright.addBox(3F, -2F, -3F, 8, 4, 3);
      stembotright.setTextureSize(64, 64);
      stembotright.mirror = true;
      setRotation(stembotright, 0.4926166F, 1.570796F, -2.007645F);
      PixelmonModelRenderer stembothead2 = new PixelmonModelRenderer(this, 0, 0);
      stembothead2.addBox(3F, -1.9F, -3.4F, 8, 4, 4);
      stembothead2.setTextureSize(64, 64);
      stembothead2.mirror = true;
      setRotation(stembothead2, 1.756689F, 1.570796F, -2.007645F);
      PixelmonModelRenderer stembothead = new PixelmonModelRenderer(this, 0, 0);
      stembothead.addBox(3F, -2F, -3F, 8, 4, 3);
      stembothead.setTextureSize(64, 64);
      stembothead.mirror = true;
      setRotation(stembothead, -1.961172F, 1.570796F, -2.007645F);
      PixelmonModelRenderer frontrightbrow = new PixelmonModelRenderer(this, 0, 0);
      frontrightbrow.addBox(2F, -2F, -4F, 8, 5, 1);
      frontrightbrow.setTextureSize(64, 64);
      frontrightbrow.mirror = true;
      setRotation(frontrightbrow, 0.4926166F, 1.570796F, -2.007645F);
      PixelmonModelRenderer backtophead = new PixelmonModelRenderer(this, 0, 0);
      backtophead.addBox(3F, -3F, -3F, 8, 5, 3);
      backtophead.setTextureSize(64, 64);
      backtophead.mirror = true;
      setRotation(backtophead, -0.6599204F, 1.570796F, -2.007645F);
      PixelmonModelRenderer frontrightmidhead = new PixelmonModelRenderer(this, 0, 0);
      frontrightmidhead.addBox(2F, -2.5F, -4F, 8, 5, 1);
      frontrightmidhead.setTextureSize(64, 64);
      frontrightmidhead.mirror = true;
      setRotation(frontrightmidhead, 0.4926166F, 1.570796F, -2.007645F);
      PixelmonModelRenderer backrightmidhead2 = new PixelmonModelRenderer(this, 0, 0);
      backrightmidhead2.addBox(2F, -2.4F, -4F, 8, 5, 1);
      backrightmidhead2.setTextureSize(64, 64);
      backrightmidhead2.mirror = true;
      setRotation(backrightmidhead2, -0.6599204F, 1.570796F, -2.007645F);
      PixelmonModelRenderer frontleftmidhead = new PixelmonModelRenderer(this, 0, 0);
      frontleftmidhead.addBox(2F, -3F, -4F, 8, 6, 1);
      frontleftmidhead.setTextureSize(64, 64);
      frontleftmidhead.mirror = true;
      setRotation(frontleftmidhead, 1.756689F, 1.570796F, -2.007645F);
      PixelmonModelRenderer backleftmidhead = new PixelmonModelRenderer(this, 0, 0);
      backleftmidhead.addBox(2F, -3F, -4F, 8, 6, 1);
      backleftmidhead.setTextureSize(64, 64);
      backleftmidhead.mirror = true;
      setRotation(backleftmidhead, -1.961172F, 1.570796F, -2.007645F);
      PixelmonModelRenderer leftmidhead = new PixelmonModelRenderer(this, 0, 0);
      leftmidhead.addBox(2F, -3F, -4F, 8, 6, 1);
      leftmidhead.setTextureSize(64, 64);
      leftmidhead.mirror = true;
      setRotation(leftmidhead, 3.057941F, 1.570796F, -2.007645F);
      PixelmonModelRenderer backrightmidhead = new PixelmonModelRenderer(this, 0, 0);
      backrightmidhead.addBox(2F, -3F, -4F, 8, 5, 1);
      backrightmidhead.setTextureSize(64, 64);
      backrightmidhead.mirror = true;
      setRotation(backrightmidhead, -0.6599204F, 1.570796F, -2.007645F);
      PixelmonModelRenderer righttophead = new PixelmonModelRenderer(this, 0, 0);
      righttophead.addBox(3F, -1.4F, -3F, 8, 4, 1);
      righttophead.setTextureSize(64, 64);
      righttophead.mirror = true;
      setRotation(righttophead, 0.4926166F, 1.570796F, -2.007645F);
      PixelmonModelRenderer tophead = new PixelmonModelRenderer(this, 0, 0);
      tophead.addBox(3F, -2.56F, -3F, 8, 5, 4);
      tophead.setTextureSize(64, 64);
      tophead.mirror = true;
      setRotation(tophead, 3.057941F, 1.570796F, -2.007645F);
      PixelmonModelRenderer botstem = new PixelmonModelRenderer(this, 28, 11);
      botstem.addBox(-2F, 0F, -1.5F, 2, 2, 3);
      botstem.setRotationPoint(-0.2F, -12F, 4F);
      botstem.setTextureSize(64, 64);
      botstem.mirror = true;
      setRotation(botstem, 3.057941F, 1.570796F, -2.007645F);
      PixelmonModelRenderer topstem = new PixelmonModelRenderer(this, 28, 11);
      topstem.addBox(0F, -0.2F, -1.5F, 4, 2, 3);
      topstem.setRotationPoint(0F, -13F, 7.5F);
      topstem.setTextureSize(64, 64);
      topstem.mirror = true;
      setRotation(topstem, 3.092847F, 1.64061F, -3.142109F);
      PixelmonModelRenderer midstem = new PixelmonModelRenderer(this, 28, 11);
      midstem.addBox(0F, 0F, -1.5F, 4, 2, 3);
      midstem.setRotationPoint(-0.2F, -12F, 4F);
      midstem.setTextureSize(64, 64);
      midstem.mirror = true;
      setRotation(midstem, 3.092847F, 1.64061F, -2.82795F);
      PixelmonModelRenderer righteye = new PixelmonModelRenderer(this, 56, 59);
      righteye.addBox(0F, 0F, 0F, 4, 4, 0);
      righteye.setRotationPoint(-5F, -4F, -3.6F);
      righteye.setTextureSize(64, 64);
      righteye.mirror = true;
      setRotation(righteye, 2.649802F, 0.260246F, 0F);
      PixelmonModelRenderer lefteye = new PixelmonModelRenderer(this, 56, 59);
      lefteye.addBox(0F, 0F, 0F, 4, 4, 0);
      lefteye.setRotationPoint(1F, -4F, -4.6F);
      lefteye.setTextureSize(64, 64);
      lefteye.mirror = true;
      setRotation(lefteye, 2.649802F, -0.2602503F, 0F);
      PixelmonModelRenderer topmouth = new PixelmonModelRenderer(this, 2, 39);
      topmouth.addBox(-2F, -2.6F, -5.2F, 6, 5, 1);
      topmouth.setRotationPoint(0F, 2F, -5F);
      topmouth.setTextureSize(64, 64);
      topmouth.mirror = true;
      setRotation(topmouth, -1.570796F, 1.570796F, 0F);
      PixelmonModelRenderer topleftmouth = new PixelmonModelRenderer(this, 4, 39);
      topleftmouth.addBox(0F, -3F, -5F, 4, 6, 1);
      topleftmouth.setRotationPoint(0F, 2F, -5F);
      topleftmouth.setTextureSize(64, 64);
      topleftmouth.mirror = true;
      setRotation(topleftmouth, -2.593208F, 1.570796F, 0F);
      PixelmonModelRenderer Botleftmouth = new PixelmonModelRenderer(this, 4, 39);
      Botleftmouth.addBox(0F, -3F, -5F, 4, 6, 1);
      Botleftmouth.setRotationPoint(0F, 2F, -5F);
      Botleftmouth.setTextureSize(64, 64);
      Botleftmouth.mirror = true;
      setRotation(Botleftmouth, 2.648976F, 1.570796F, 0F);
      PixelmonModelRenderer Toprightlip = new PixelmonModelRenderer(this, 4, 39);
      Toprightlip.addBox(0F, -3F, -5F, 4, 6, 1);
      Toprightlip.setRotationPoint(0F, 2F, -5F);
      Toprightlip.setTextureSize(64, 64);
      Toprightlip.mirror = true;
      setRotation(Toprightlip, -0.5855631F, 1.570796F, 0F);
      PixelmonModelRenderer Botrightlip = new PixelmonModelRenderer(this, 37, 33);
      Botrightlip.addBox(3F, -3F, -5.5F, 1, 6, 1);
      Botrightlip.setRotationPoint(0F, 2F, -5F);
      Botrightlip.setTextureSize(64, 64);
      Botrightlip.mirror = true;
      setRotation(Botrightlip, 0.4926166F, 1.570796F, 0F);
      PixelmonModelRenderer Botrightmouth = new PixelmonModelRenderer(this, 4, 39);
      Botrightmouth.addBox(0F, -3F, -5F, 4, 6, 1);
      Botrightmouth.setRotationPoint(0F, 2F, -5F);
      Botrightmouth.setTextureSize(64, 64);
      Botrightmouth.mirror = true;
      setRotation(Botrightmouth, 0.4926166F, 1.570796F, 0F);
      Body.addChild(eardrum);
      Body.addChild(tonsil);
      Body.addChild(rightear);
      Body.addChild(rightear2);
      Body.addChild(horizontalmouth);
      Body.addChild(ass);
      Body.addChild(leftwisdomtooth);
      Body.addChild(rightwisdomtooth);
      Body.addChild(toprightlip);
      Body.addChild(topleftlip);
      Body.addChild(botjaw);
      Body.addChild(rightbuttock);
      Body.addChild(buttock);
      Body.addChild(leftbuttock);
      Body.addChild(leftdimple);
      Body.addChild(rightcheek2);
      Body.addChild(leftear3);
      Body.addChild(spine7);
      Body.addChild(spine6);
      Body.addChild(lefthip);
      Body.addChild(leftear2);
      Body.addChild(leftear);
      Body.addChild(spine5);
      Body.addChild(leftcheek2);
      Body.addChild(leftcheekbone);
      Body.addChild(leftcheek);
      Body.addChild(rightcheek);
      Body.addChild(spine4);
      Body.addChild(spine3);
      Body.addChild(spine2);
      Body.addChild(spine);
      Body.addChild(botrightmouth);
      Body.addChild(jawbone6);
      Body.addChild(jawbone5);
      Body.addChild(jawbone4);
      Body.addChild(botrightlip2);
      Body.addChild(jawbone3);
      Body.addChild(jawbone2);
      Body.addChild(jawbone);
      Body.addChild(leftleaf);
      Body.addChild(verticalmouth);
      Body.addChild(mouth);
      Body.addChild(rightleaf);
      Body.addChild(toplip);
      Body.addChild(back);
      Body.addChild(face);
      Body.addChild(faceright);
      Body.addChild(facebackright);
      Body.addChild(faceback);
      Body.addChild(facebackleft);
      Body.addChild(faceleft);
      Body.addChild(stembotright);
      Body.addChild(stembothead2);
      Body.addChild(stembothead);
      Body.addChild(frontrightbrow);
      Body.addChild(backtophead);
      Body.addChild(frontrightmidhead);
      Body.addChild(backrightmidhead2);
      Body.addChild(frontleftmidhead);
      Body.addChild(backleftmidhead);
      Body.addChild(leftmidhead);
      Body.addChild(backrightmidhead);
      Body.addChild(righttophead);
      Body.addChild(tophead);
      Body.addChild(botstem);
      Body.addChild(topstem);
      Body.addChild(midstem);
      Body.addChild(righteye);
      Body.addChild(lefteye);
      Body.addChild(topmouth);
      Body.addChild(topleftmouth);
      Body.addChild(Botleftmouth);
      Body.addChild(Toprightlip);
      Body.addChild(Botrightlip);
      Body.addChild(Botrightmouth);
      
      
      skeleton = new SkeletonBase(Body);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
