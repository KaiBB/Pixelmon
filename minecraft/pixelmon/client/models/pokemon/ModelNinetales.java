// Date: 7/31/2012 8:01:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelNinetales extends ModelBase {
	// fields
	ModelRenderer Neck;
	ModelRenderer UpperBody;
	ModelRenderer ManeBase;
	ModelRenderer ManeM;
	ModelRenderer ManeRS;
	ModelRenderer ManeURS;
	ModelRenderer ManeLS;
	ModelRenderer ManeULS;
	ModelRenderer ManeMB;
	ModelRenderer ManeBBase;
	ModelRenderer LowerBody;
	ModelRenderer Booty;
	ModelRenderer MiddleTailBase;
	ModelRenderer MiddleTailSeg2;
	ModelRenderer InnerTailBaseL;
	ModelRenderer InnerTailSeg2L;
	ModelRenderer InnerTail2BaseL;
	ModelRenderer OuterTailBaseL;
	ModelRenderer OuterTail2BaseL;
	ModelRenderer InnerTailBaseR;
	ModelRenderer InnerTailSeg2R;
	ModelRenderer InnerTail2BaseR;
	ModelRenderer OuterTailBaseR;
	ModelRenderer OuterTail2BaseR;
	ModelRenderer InnerTail2Seg2L;
	ModelRenderer InnerTail2Seg2R;
	ModelRenderer OuterTailSeg2L;
	ModelRenderer OuterTailSeg2R;
	ModelRenderer OuterTail2Seg2L;
	ModelRenderer OuterTail2Seg2R;
	ModelRenderer MiddleTailFlip;
	ModelRenderer InnerTailFlipL;
	ModelRenderer InnerTailFlipR;
	ModelRenderer InnerTail2FlipL;
	ModelRenderer InnerTail2FlipR;
	ModelRenderer OuterTailFlipR;
	ModelRenderer OuterTailFlipL;
	ModelRenderer OuterTail2FlipR;
	ModelRenderer OuterTail2FlipL;
	ModelRenderer HEADBASE;
	ModelRenderer FRONTLEFTLEG;
	ModelRenderer FRONTRIGHTLEG;
	ModelRenderer REARRIGHTLEG;
	ModelRenderer RIGHTLEFTLEG;
	ModelRenderer NoseBridge;
	ModelRenderer Nose;
	ModelRenderer EarR;
	ModelRenderer EarL;
	ModelRenderer HeadSpike4;
	ModelRenderer HeadSpike3;
	ModelRenderer HeadSpike2;
	ModelRenderer HeadSpike1;
	ModelRenderer Head;
	ModelRenderer FrontUpperLegL;
	ModelRenderer FrontLowerLegL;
	ModelRenderer FrontUpperLegR;
	ModelRenderer FrontLowerLegR;
	ModelRenderer RearUpperLegR;
	ModelRenderer RearLowerLegR;
	ModelRenderer RearUpperLegL;
	ModelRenderer RearLowerLegL;

	public ModelNinetales() {
		textureWidth = 64;
		textureHeight = 32;

		Neck = new ModelRenderer(this, 0, 14);
		Neck.addBox(-1.5F, -1.5F, 0F, 3, 3, 6);
		Neck.setRotationPoint(0F, 8F, -6.4F);
		Neck.setTextureSize(64, 32);
		Neck.mirror = true;
		setRotation(Neck, -1.22173F, 0F, 0F);
		UpperBody = new ModelRenderer(this, 44, 0);
		UpperBody.addBox(-2.5F, -2F, 0F, 5, 5, 5);
		UpperBody.setRotationPoint(0F, 13.2F, -6F);
		UpperBody.setTextureSize(64, 32);
		UpperBody.mirror = true;
		setRotation(UpperBody, -0.2443461F, 0F, 0F);
		ManeBase = new ModelRenderer(this, 7, 0);
		ManeBase.addBox(-0.5F, 0F, -0.5F, 3, 5, 1);
		ManeBase.setRotationPoint(-1F, 11F, -6.3F);
		ManeBase.setTextureSize(64, 32);
		ManeBase.mirror = true;
		setRotation(ManeBase, -0.0872665F, 0F, 0F);
		ManeM = new ModelRenderer(this, 32, 25);
		ManeM.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
		ManeM.setRotationPoint(0F, 11F, -6.4F);
		ManeM.setTextureSize(64, 32);
		ManeM.mirror = true;
		setRotation(ManeM, -0.1396263F, 0F, 0F);
		ManeRS = new ModelRenderer(this, 22, 6);
		ManeRS.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		ManeRS.setRotationPoint(-1.8F, 11.1F, -6F);
		ManeRS.setTextureSize(64, 32);
		ManeRS.mirror = true;
		setRotation(ManeRS, -0.122173F, 0F, 0F);
		ManeURS = new ModelRenderer(this, 31, 20);
		ManeURS.addBox(-0.5F, 0F, -0.5F, 1, 1, 3);
		ManeURS.setRotationPoint(-1.8F, 11F, -5.8F);
		ManeURS.setTextureSize(64, 32);
		ManeURS.mirror = true;
		setRotation(ManeURS, -0.2617994F, 0F, 0F);
		ManeLS = new ModelRenderer(this, 22, 6);
		ManeLS.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		ManeLS.setRotationPoint(1.8F, 11.1F, -6F);
		ManeLS.setTextureSize(64, 32);
		ManeLS.mirror = true;
		setRotation(ManeLS, -0.122173F, 0F, 0F);
		ManeULS = new ModelRenderer(this, 31, 20);
		ManeULS.addBox(-0.5F, 0F, -0.5F, 1, 1, 3);
		ManeULS.setRotationPoint(1.8F, 11F, -5.8F);
		ManeULS.setTextureSize(64, 32);
		ManeULS.mirror = true;
		setRotation(ManeULS, -0.2617994F, 0F, 0F);
		ManeMB = new ModelRenderer(this, 16, 0);
		ManeMB.addBox(-0.5F, -1F, -1F, 1, 1, 4);
		ManeMB.setRotationPoint(0F, 12F, -3.5F);
		ManeMB.setTextureSize(64, 32);
		ManeMB.mirror = true;
		setRotation(ManeMB, -0.4363323F, 0F, 0F);
		ManeBBase = new ModelRenderer(this, 0, 7);
		ManeBBase.addBox(-2F, -0.5F, -1.5F, 4, 1, 5);
		ManeBBase.setRotationPoint(0F, 11.5F, -4.8F);
		ManeBBase.setTextureSize(64, 32);
		ManeBBase.mirror = true;
		setRotation(ManeBBase, -0.3141593F, 0F, 0F);
		LowerBody = new ModelRenderer(this, 40, 11);
		LowerBody.addBox(-2F, -2F, 0F, 4, 4, 8);
		LowerBody.setRotationPoint(0F, 14.5F, -1.7F);
		LowerBody.setTextureSize(64, 32);
		LowerBody.mirror = true;
		setRotation(LowerBody, 0F, 0F, 0F);
		Booty = new ModelRenderer(this, 46, 24);
		Booty.addBox(-2.5F, -2.5F, 0F, 5, 4, 4);
		Booty.setRotationPoint(0F, 15F, 3.5F);
		Booty.setTextureSize(64, 32);
		Booty.mirror = true;
		setRotation(Booty, 0.0872665F, 0F, 0F);
		MiddleTailBase = new ModelRenderer(this, 0, 25);
		MiddleTailBase.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		MiddleTailBase.setRotationPoint(0F, 12.5F, 6.3F);
		MiddleTailBase.setTextureSize(64, 32);
		MiddleTailBase.mirror = true;
		setRotation(MiddleTailBase, -0.1745329F, 0F, 0F);
		MiddleTailSeg2 = new ModelRenderer(this, 0, 25);
		MiddleTailSeg2.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		MiddleTailSeg2.setRotationPoint(0F, 8.1F, 6.9F);
		MiddleTailSeg2.setTextureSize(64, 32);
		MiddleTailSeg2.mirror = true;
		setRotation(MiddleTailSeg2, -0.6981317F, 0F, 0F);
		InnerTailBaseL = new ModelRenderer(this, 0, 25);
		InnerTailBaseL.addBox(0F, -5F, -1F, 1, 5, 2);
		InnerTailBaseL.setRotationPoint(0F, 12.5F, 6.3F);
		InnerTailBaseL.setTextureSize(64, 32);
		InnerTailBaseL.mirror = true;
		setRotation(InnerTailBaseL, -0.1745329F, 0F, 0.2617994F);
		InnerTailSeg2L = new ModelRenderer(this, 0, 25);
		InnerTailSeg2L.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		InnerTailSeg2L.setRotationPoint(1.6F, 8.3F, 6.9F);
		InnerTailSeg2L.setTextureSize(64, 32);
		InnerTailSeg2L.mirror = true;
		setRotation(InnerTailSeg2L, -0.6981317F, 0F, 0.2617994F);
		InnerTail2BaseL = new ModelRenderer(this, 0, 25);
		InnerTail2BaseL.addBox(0F, -5F, -1F, 1, 5, 2);
		InnerTail2BaseL.setRotationPoint(0F, 12.5F, 6.3F);
		InnerTail2BaseL.setTextureSize(64, 32);
		InnerTail2BaseL.mirror = true;
		setRotation(InnerTail2BaseL, -0.1745329F, 0F, 0.6981317F);
		OuterTailBaseL = new ModelRenderer(this, 0, 25);
		OuterTailBaseL.addBox(0F, -5F, -1F, 1, 5, 2);
		OuterTailBaseL.setRotationPoint(0F, 12.5F, 6.3F);
		OuterTailBaseL.setTextureSize(64, 32);
		OuterTailBaseL.mirror = true;
		setRotation(OuterTailBaseL, -0.3490659F, 0F, 1.22173F);
		OuterTail2BaseL = new ModelRenderer(this, 0, 25);
		OuterTail2BaseL.addBox(0F, -5F, -1F, 1, 5, 2);
		OuterTail2BaseL.setRotationPoint(0F, 12.5F, 6.3F);
		OuterTail2BaseL.setTextureSize(64, 32);
		OuterTail2BaseL.mirror = true;
		setRotation(OuterTail2BaseL, -0.5235988F, 0F, 1.832596F);
		InnerTailBaseR = new ModelRenderer(this, 0, 25);
		InnerTailBaseR.addBox(-1F, -5F, -1F, 1, 5, 2);
		InnerTailBaseR.setRotationPoint(0F, 12.5F, 6.3F);
		InnerTailBaseR.setTextureSize(64, 32);
		InnerTailBaseR.mirror = true;
		setRotation(InnerTailBaseR, -0.1745329F, 0F, -0.2617994F);
		InnerTailSeg2R = new ModelRenderer(this, 0, 25);
		InnerTailSeg2R.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		InnerTailSeg2R.setRotationPoint(-1.6F, 8.3F, 6.9F);
		InnerTailSeg2R.setTextureSize(64, 32);
		InnerTailSeg2R.mirror = true;
		setRotation(InnerTailSeg2R, -0.6981317F, 0F, -0.2617994F);
		InnerTail2BaseR = new ModelRenderer(this, 0, 25);
		InnerTail2BaseR.addBox(-1F, -5F, -1F, 1, 5, 2);
		InnerTail2BaseR.setRotationPoint(0F, 12.5F, 6.3F);
		InnerTail2BaseR.setTextureSize(64, 32);
		InnerTail2BaseR.mirror = true;
		setRotation(InnerTail2BaseR, -0.1745329F, 0F, -0.6981317F);
		OuterTailBaseR = new ModelRenderer(this, 0, 25);
		OuterTailBaseR.addBox(-1F, -5F, -1F, 1, 5, 2);
		OuterTailBaseR.setRotationPoint(0F, 12.5F, 6.3F);
		OuterTailBaseR.setTextureSize(64, 32);
		OuterTailBaseR.mirror = true;
		setRotation(OuterTailBaseR, -0.3490659F, 0F, -1.22173F);
		OuterTail2BaseR = new ModelRenderer(this, 0, 25);
		OuterTail2BaseR.addBox(-1F, -5F, -1F, 1, 5, 2);
		OuterTail2BaseR.setRotationPoint(0F, 12.5F, 6.3F);
		OuterTail2BaseR.setTextureSize(64, 32);
		OuterTail2BaseR.mirror = true;
		setRotation(OuterTail2BaseR, -0.5235988F, 0F, -1.832596F);
		InnerTail2Seg2L = new ModelRenderer(this, 0, 25);
		InnerTail2Seg2L.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		InnerTail2Seg2L.setRotationPoint(3.2F, 9.4F, 6.9F);
		InnerTail2Seg2L.setTextureSize(64, 32);
		InnerTail2Seg2L.mirror = true;
		setRotation(InnerTail2Seg2L, -0.6981317F, 0F, 0.6981317F);
		InnerTail2Seg2R = new ModelRenderer(this, 0, 25);
		InnerTail2Seg2R.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		InnerTail2Seg2R.setRotationPoint(-3.2F, 9.4F, 6.9F);
		InnerTail2Seg2R.setTextureSize(64, 32);
		InnerTail2Seg2R.mirror = true;
		setRotation(InnerTail2Seg2R, -0.6981317F, 0F, -0.6981317F);
		OuterTailSeg2L = new ModelRenderer(this, 0, 25);
		OuterTailSeg2L.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		OuterTailSeg2L.setRotationPoint(4.1F, 11.5F, 7.6F);
		OuterTailSeg2L.setTextureSize(64, 32);
		OuterTailSeg2L.mirror = true;
		setRotation(OuterTailSeg2L, -0.8726646F, 0F, 1.22173F);
		OuterTailSeg2R = new ModelRenderer(this, 0, 25);
		OuterTailSeg2R.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		OuterTailSeg2R.setRotationPoint(-4.1F, 11.5F, 7.6F);
		OuterTailSeg2R.setTextureSize(64, 32);
		OuterTailSeg2R.mirror = true;
		setRotation(OuterTailSeg2R, -0.8726646F, 0F, -1.22173F);
		OuterTail2Seg2L = new ModelRenderer(this, 0, 25);
		OuterTail2Seg2L.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		OuterTail2Seg2L.setRotationPoint(-3.7F, 14F, 8.4F);
		OuterTail2Seg2L.setTextureSize(64, 32);
		OuterTail2Seg2L.mirror = true;
		setRotation(OuterTail2Seg2L, -1.047198F, 0F, -1.832596F);
		OuterTail2Seg2R = new ModelRenderer(this, 0, 25);
		OuterTail2Seg2R.addBox(-0.5F, -5F, -1F, 1, 5, 2);
		OuterTail2Seg2R.setRotationPoint(3.7F, 14F, 8.4F);
		OuterTail2Seg2R.setTextureSize(64, 32);
		OuterTail2Seg2R.mirror = true;
		setRotation(OuterTail2Seg2R, -1.047198F, 0F, 1.832596F);
		MiddleTailFlip = new ModelRenderer(this, 21, 28);
		MiddleTailFlip.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		MiddleTailFlip.setRotationPoint(0F, 5.1F, 10.4F);
		MiddleTailFlip.setTextureSize(64, 32);
		MiddleTailFlip.mirror = true;
		setRotation(MiddleTailFlip, 0.3490659F, 0F, 0F);
		InnerTailFlipL = new ModelRenderer(this, 21, 28);
		InnerTailFlipL.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		InnerTailFlipL.setRotationPoint(2.4F, 5.4F, 10.4F);
		InnerTailFlipL.setTextureSize(64, 32);
		InnerTailFlipL.mirror = true;
		setRotation(InnerTailFlipL, 0.3490659F, 0F, 0.2617994F);
		InnerTailFlipR = new ModelRenderer(this, 21, 28);
		InnerTailFlipR.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		InnerTailFlipR.setRotationPoint(-2.4F, 5.4F, 10.4F);
		InnerTailFlipR.setTextureSize(64, 32);
		InnerTailFlipR.mirror = true;
		setRotation(InnerTailFlipR, 0.3490659F, 0F, -0.2617994F);
		InnerTail2FlipL = new ModelRenderer(this, 21, 28);
		InnerTail2FlipL.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		InnerTail2FlipL.setRotationPoint(5.1F, 7.1F, 10.4F);
		InnerTail2FlipL.setTextureSize(64, 32);
		InnerTail2FlipL.mirror = true;
		setRotation(InnerTail2FlipL, 0.3490659F, 0F, 0.6981317F);
		InnerTail2FlipR = new ModelRenderer(this, 21, 28);
		InnerTail2FlipR.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		InnerTail2FlipR.setRotationPoint(-5.1F, 7.1F, 10.4F);
		InnerTail2FlipR.setTextureSize(64, 32);
		InnerTail2FlipR.mirror = true;
		setRotation(InnerTail2FlipR, 0.3490659F, 0F, -0.6981317F);
		OuterTailFlipR = new ModelRenderer(this, 21, 28);
		OuterTailFlipR.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		OuterTailFlipR.setRotationPoint(-6.3F, 10.7F, 11.6F);
		OuterTailFlipR.setTextureSize(64, 32);
		OuterTailFlipR.mirror = true;
		setRotation(OuterTailFlipR, 0.2617994F, 0F, -1.22173F);
		OuterTailFlipL = new ModelRenderer(this, 21, 28);
		OuterTailFlipL.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		OuterTailFlipL.setRotationPoint(6.3F, 10.7F, 11.6F);
		OuterTailFlipL.setTextureSize(64, 32);
		OuterTailFlipL.mirror = true;
		setRotation(OuterTailFlipL, 0.2617994F, 0F, 1.22173F);
		OuterTail2FlipR = new ModelRenderer(this, 21, 28);
		OuterTail2FlipR.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		OuterTail2FlipR.setRotationPoint(-5.3F, 14.4F, 12.7F);
		OuterTail2FlipR.setTextureSize(64, 32);
		OuterTail2FlipR.mirror = true;
		setRotation(OuterTail2FlipR, 0F, 0F, -1.832596F);
		OuterTail2FlipL = new ModelRenderer(this, 21, 28);
		OuterTail2FlipL.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
		OuterTail2FlipL.setRotationPoint(5.3F, 14.4F, 12.7F);
		OuterTail2FlipL.setTextureSize(64, 32);
		OuterTail2FlipL.mirror = true;
		setRotation(OuterTail2FlipL, 0F, 0F, 1.832596F);
		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0F, 8F, -6.5F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		NoseBridge = new ModelRenderer(this, 29, 15);
		NoseBridge.addBox(-0.5F, -0.5F, -4F, 1, 1, 4);
		NoseBridge.setRotationPoint(0F, -0.3F, -1.5F);
		NoseBridge.setTextureSize(64, 32);
		NoseBridge.mirror = true;
		setRotation(NoseBridge, 0.2617994F, 0F, 0F);
		Nose = new ModelRenderer(this, 29, 9);
		Nose.addBox(-1F, -1F, -3F, 2, 2, 3);
		Nose.setRotationPoint(0F, 0.8F, -2.2F);
		Nose.setTextureSize(64, 32);
		Nose.mirror = true;
		setRotation(Nose, 0.1396263F, 0F, 0F);
		EarR = new ModelRenderer(this, 14, 27);
		EarR.addBox(-1F, -3F, 0F, 2, 4, 1);
		EarR.setRotationPoint(-1.5F, -1.7F, 0.2F);
		EarR.setTextureSize(64, 32);
		EarR.mirror = true;
		setRotation(EarR, 0F, 0.2617994F, -0.4363323F);
		EarL = new ModelRenderer(this, 14, 27);
		EarL.addBox(-1F, -3F, 0F, 2, 4, 1);
		EarL.setRotationPoint(1.5F, -1.7F, 0.2F);
		EarL.setTextureSize(64, 32);
		EarL.mirror = true;
		setRotation(EarL, 0F, -0.2617994F, 0.4363323F);
		EarL.mirror = false;
		HeadSpike4 = new ModelRenderer(this, 32, 25);
		HeadSpike4.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
		HeadSpike4.setRotationPoint(0F, -2F, -0.5F);
		HeadSpike4.setTextureSize(64, 32);
		HeadSpike4.mirror = true;
		setRotation(HeadSpike4, 1.396263F, 0F, 0F);
		HeadSpike3 = new ModelRenderer(this, 32, 25);
		HeadSpike3.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
		HeadSpike3.setRotationPoint(0F, -2.2F, -1.5F);
		HeadSpike3.setTextureSize(64, 32);
		HeadSpike3.mirror = true;
		setRotation(HeadSpike3, 1.745329F, 0F, 0F);
		HeadSpike2 = new ModelRenderer(this, 32, 25);
		HeadSpike2.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
		HeadSpike2.setRotationPoint(0F, -2F, -2.5F);
		HeadSpike2.setTextureSize(64, 32);
		HeadSpike2.mirror = true;
		setRotation(HeadSpike2, 2.094395F, 0F, 0F);
		HeadSpike1 = new ModelRenderer(this, 16, 0);
		HeadSpike1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 4);
		HeadSpike1.setRotationPoint(0F, -2F, -2.5F);
		HeadSpike1.setTextureSize(64, 32);
		HeadSpike1.mirror = true;
		setRotation(HeadSpike1, 1.099557F, 0F, 0F);
		Head = new ModelRenderer(this, 27, 0);
		Head.addBox(-2F, -4F, -3F, 4, 4, 4);
		Head.setRotationPoint(0F, 1.5F, 0.9F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0.1745329F, 0F, 0F);
		FRONTLEFTLEG = new ModelRenderer(this, "FRONTLEFTLEG");
		FRONTLEFTLEG.setRotationPoint(2F, 15F, -5F);
		setRotation(FRONTLEFTLEG, 0F, 0F, 0F);
		FRONTLEFTLEG.mirror = true;
		FrontUpperLegL = new ModelRenderer(this, 37, 25);
		FrontUpperLegL.addBox(-1F, 0F, -1F, 2, 5, 2);
		FrontUpperLegL.setRotationPoint(-0.3F, -0.7F, -0.2F);
		FrontUpperLegL.setTextureSize(64, 32);
		FrontUpperLegL.mirror = true;
		setRotation(FrontUpperLegL, 0.1396263F, 0F, 0F);
		FrontLowerLegL = new ModelRenderer(this, 37, 25);
		FrontLowerLegL.addBox(-1F, 0F, 0F, 2, 5, 2);
		FrontLowerLegL.setRotationPoint(-0.3F, 4F, -0.5F);
		FrontLowerLegL.setTextureSize(64, 32);
		FrontLowerLegL.mirror = true;
		setRotation(FrontLowerLegL, -0.0872665F, 0F, 0F);
		FRONTRIGHTLEG = new ModelRenderer(this, "FRONTRIGHTLEG");
		FRONTRIGHTLEG.setRotationPoint(-2F, 15F, -5F);
		setRotation(FRONTRIGHTLEG, 0F, 0F, 0F);
		FRONTRIGHTLEG.mirror = true;
		FrontUpperLegR = new ModelRenderer(this, 37, 25);
		FrontUpperLegR.addBox(-1F, 0F, -1F, 2, 5, 2);
		FrontUpperLegR.setRotationPoint(0.3F, -0.7F, -0.2F);
		FrontUpperLegR.setTextureSize(64, 32);
		FrontUpperLegR.mirror = true;
		setRotation(FrontUpperLegR, 0.1396263F, 0F, 0F);
		FrontLowerLegR = new ModelRenderer(this, 37, 25);
		FrontLowerLegR.addBox(-1F, 0F, 0F, 2, 5, 2);
		FrontLowerLegR.setRotationPoint(0.3F, 4F, -0.5F);
		FrontLowerLegR.setTextureSize(64, 32);
		FrontLowerLegR.mirror = true;
		setRotation(FrontLowerLegR, -0.0872665F, 0F, 0F);
		FrontLowerLegR.mirror = false;
		REARRIGHTLEG = new ModelRenderer(this, "REARRIGHTLEG");
		REARRIGHTLEG.setRotationPoint(-2F, 15F, 5F);
		setRotation(REARRIGHTLEG, 0F, 0F, 0F);
		REARRIGHTLEG.mirror = true;
		RearUpperLegR = new ModelRenderer(this, 37, 25);
		RearUpperLegR.addBox(-1F, 0F, -1F, 2, 5, 2);
		RearUpperLegR.setRotationPoint(0.5F, -0.7F, 0.1F);
		RearUpperLegR.setTextureSize(64, 32);
		RearUpperLegR.mirror = true;
		setRotation(RearUpperLegR, 0.1745329F, 0F, 0F);
		RearLowerLegR = new ModelRenderer(this, 37, 25);
		RearLowerLegR.addBox(-1F, 0F, 0F, 2, 5, 2);
		RearLowerLegR.setRotationPoint(0.5F, 4F, -0.1F);
		RearLowerLegR.setTextureSize(64, 32);
		RearLowerLegR.mirror = true;
		setRotation(RearLowerLegR, 0F, 0F, 0F);
		RearLowerLegR.mirror = false;
		RIGHTLEFTLEG = new ModelRenderer(this, "RIGHTLEFTLEG");
		RIGHTLEFTLEG.setRotationPoint(2F, 15F, 5F);
		setRotation(RIGHTLEFTLEG, 0F, 0F, 0F);
		RIGHTLEFTLEG.mirror = true;
		RearUpperLegL = new ModelRenderer(this, 37, 25);
		RearUpperLegL.addBox(-1F, 0F, -1F, 2, 5, 2);
		RearUpperLegL.setRotationPoint(-0.5F, -0.7F, 0.1F);
		RearUpperLegL.setTextureSize(64, 32);
		RearUpperLegL.mirror = true;
		setRotation(RearUpperLegL, 0.1745329F, 0F, 0F);
		RearLowerLegL = new ModelRenderer(this, 37, 25);
		RearLowerLegL.addBox(-1F, 0F, 0F, 2, 5, 2);
		RearLowerLegL.setRotationPoint(-0.5F, 4F, -0.1F);
		RearLowerLegL.setTextureSize(64, 32);
		RearLowerLegL.mirror = true;
		setRotation(RearLowerLegL, 0F, 0F, 0F);
		HEADBASE.addChild(NoseBridge);
		HEADBASE.addChild(Nose);
		HEADBASE.addChild(EarR);
		HEADBASE.addChild(EarL);
		HEADBASE.addChild(HeadSpike4);
		HEADBASE.addChild(HeadSpike3);
		HEADBASE.addChild(HeadSpike2);
		HEADBASE.addChild(HeadSpike1);
		HEADBASE.addChild(Head);
		FRONTLEFTLEG.addChild(FrontUpperLegL);
		FRONTLEFTLEG.addChild(FrontLowerLegL);
		FRONTRIGHTLEG.addChild(FrontUpperLegR);
		FRONTRIGHTLEG.addChild(FrontLowerLegR);
		REARRIGHTLEG.addChild(RearUpperLegR);
		REARRIGHTLEG.addChild(RearLowerLegR);
		RIGHTLEFTLEG.addChild(RearUpperLegL);
		RIGHTLEFTLEG.addChild(RearLowerLegL);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Neck.render(f5);
		UpperBody.render(f5);
		ManeBase.render(f5);
		ManeM.render(f5);
		ManeRS.render(f5);
		ManeURS.render(f5);
		ManeLS.render(f5);
		ManeULS.render(f5);
		ManeMB.render(f5);
		ManeBBase.render(f5);
		LowerBody.render(f5);
		Booty.render(f5);
		MiddleTailBase.render(f5);
		MiddleTailSeg2.render(f5);
		InnerTailBaseL.render(f5);
		InnerTailSeg2L.render(f5);
		InnerTail2BaseL.render(f5);
		OuterTailBaseL.render(f5);
		OuterTail2BaseL.render(f5);
		InnerTailBaseR.render(f5);
		InnerTailSeg2R.render(f5);
		InnerTail2BaseR.render(f5);
		OuterTailBaseR.render(f5);
		OuterTail2BaseR.render(f5);
		InnerTail2Seg2L.render(f5);
		InnerTail2Seg2R.render(f5);
		OuterTailSeg2L.render(f5);
		OuterTailSeg2R.render(f5);
		OuterTail2Seg2L.render(f5);
		OuterTail2Seg2R.render(f5);
		MiddleTailFlip.render(f5);
		InnerTailFlipL.render(f5);
		InnerTailFlipR.render(f5);
		InnerTail2FlipL.render(f5);
		InnerTail2FlipR.render(f5);
		OuterTailFlipR.render(f5);
		OuterTailFlipL.render(f5);
		OuterTail2FlipR.render(f5);
		OuterTail2FlipL.render(f5);
		HEADBASE.render(f5);
		FRONTLEFTLEG.render(f5);
		FRONTRIGHTLEG.render(f5);
		REARRIGHTLEG.render(f5);
		RIGHTLEFTLEG.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HEADBASE.rotateAngleX = f4 / 57.29578F;
		HEADBASE.rotateAngleY = f3 / 57.29578F;
		FRONTLEFTLEG.rotateAngleX = MathHelper.cos(f * 0.6F) * .7F * f1;
		RIGHTLEFTLEG.rotateAngleX = MathHelper.cos(f * 0.6F + (float) Math.PI) * .7F * f1;
		REARRIGHTLEG.rotateAngleX = MathHelper.cos(f * 0.6F) * .7F * f1;
		FRONTRIGHTLEG.rotateAngleX = MathHelper.cos(f * 0.6F + (float) Math.PI) * .7F * f1;
	}

}
