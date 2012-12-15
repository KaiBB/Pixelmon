package pixelmon.client.models.pokemon;

import pixelmon.entities.pixelmon.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelVileplume extends ModelBase {
	// fields
	ModelRenderer leftleg1;
	ModelRenderer leftleg2;
	ModelRenderer leftleg4;
	ModelRenderer rightleg1;
	ModelRenderer rightleg2;
	ModelRenderer rightleg3;
	ModelRenderer flower11;
	ModelRenderer flower12;
	ModelRenderer flower13;
	ModelRenderer flower14;
	ModelRenderer flower15;
	ModelRenderer flower16;
	ModelRenderer flower17;
	ModelRenderer flower18;
	ModelRenderer flower19;
	ModelRenderer flower1;
	ModelRenderer flower2;
	ModelRenderer flower3;
	ModelRenderer flower4;
	ModelRenderer flower5;
	ModelRenderer flower6;
	ModelRenderer flower7;
	ModelRenderer flower8;
	ModelRenderer flower9;
	ModelRenderer flower47;
	ModelRenderer flower48;
	ModelRenderer flower49;
	ModelRenderer flower50;
	ModelRenderer flower51;
	ModelRenderer flower52;
	ModelRenderer flower53;
	ModelRenderer flower54;
	ModelRenderer flower55;
	ModelRenderer flower20;
	ModelRenderer flower21;
	ModelRenderer flower22;
	ModelRenderer flower23;
	ModelRenderer flower24;
	ModelRenderer flower25;
	ModelRenderer flower26;
	ModelRenderer flower27;
	ModelRenderer flower28;
	ModelRenderer flower29;
	ModelRenderer flower30;
	ModelRenderer flower31;
	ModelRenderer flower32;
	ModelRenderer flower33;
	ModelRenderer flower34;
	ModelRenderer flower35;
	ModelRenderer flower36;
	ModelRenderer flower37;
	ModelRenderer flower38;
	ModelRenderer flower39;
	ModelRenderer flower40;
	ModelRenderer flower41;
	ModelRenderer flower42;
	ModelRenderer flower43;
	ModelRenderer flower44;
	ModelRenderer flower45;
	ModelRenderer flower46;
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;
	ModelRenderer body10;
	ModelRenderer body11;
	ModelRenderer body12;
	ModelRenderer body13;
	ModelRenderer body14;
	ModelRenderer body15;
	ModelRenderer body16;
	ModelRenderer body17;
	ModelRenderer body18;
	ModelRenderer body19;
	ModelRenderer body20;
	ModelRenderer body21;
	ModelRenderer body22;
	ModelRenderer body23;
	ModelRenderer body24;
	ModelRenderer body25;
	ModelRenderer body26;
	ModelRenderer body27;
	ModelRenderer body28;
	ModelRenderer body29;
	ModelRenderer body30;
	ModelRenderer LEFTLEGPIECE;
	ModelRenderer RIGHTLEGPIECE;
	ModelRenderer BODYPIECE;
	ModelRenderer FLOWER1PIECE;
	ModelRenderer FLOWER2PIECE;
	ModelRenderer FLOWER3PIECE;
	ModelRenderer FLOWER4PIECE;
	ModelRenderer FLOWER5PIECE;
	ModelRenderer FLOWER6PIECE;

	public ModelVileplume() {
		textureWidth = 64;
		textureHeight = 32;

		BODYPIECE = new ModelRenderer(this, "BODYPIECE");
		BODYPIECE.setRotationPoint(0F, 19F, -2F);
		setRotation(BODYPIECE, 0F, 0F, 0F);
		BODYPIECE.mirror = true;
		body1 = new ModelRenderer(this, 54, 0);
		body1.addBox(2.1F, -3.1F, -0.5F, 3, 1, 1);
		body1.setRotationPoint(0F, 0F, 0F);
		body1.setTextureSize(64, 32);
		body1.mirror = true;
		setRotation(body1, 0F, 0F, 0.4363323F);
		body2 = new ModelRenderer(this, 50, 0);
		body2.addBox(3.7F, -1.6F, -0.5F, 2, 1, 1);
		body2.setRotationPoint(0F, 0F, 0F);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0F, 0F, 0.1745329F);
		body3 = new ModelRenderer(this, 55, 0);
		body3.addBox(-5.1F, -3.1F, -0.5F, 3, 1, 1);
		body3.setRotationPoint(0F, 0F, 0F);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 0F, 0F, -0.4363323F);
		body4 = new ModelRenderer(this, 51, 0);
		body4.addBox(-5.7F, -1.7F, -0.5F, 2, 1, 1);
		body4.setRotationPoint(0F, 0F, 0F);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 0F, 0F, -0.1745329F);
		body5 = new ModelRenderer(this, 42, 0);
		body5.addBox(-4.6F, -4F, -1.1F, 9, 6, 2);
		body5.setRotationPoint(0F, 0F, 0F);
		body5.setTextureSize(64, 32);
		body5.mirror = true;
		setRotation(body5, 0F, -0.7853982F, 0F);
		body6 = new ModelRenderer(this, 38, 0);
		body6.addBox(-2.5F, -4F, 2.8F, 5, 6, 1);
		body6.setRotationPoint(0F, 0F, 0F);
		body6.setTextureSize(64, 32);
		body6.mirror = true;
		setRotation(body6, 0F, 0F, 0F);
		body7 = new ModelRenderer(this, 42, 0);
		body7.addBox(-4.4F, -4F, -1F, 9, 6, 2);
		body7.setRotationPoint(0F, 0F, 0F);
		body7.setTextureSize(64, 32);
		body7.mirror = true;
		setRotation(body7, 0F, 0.7853982F, 0F);
		body8 = new ModelRenderer(this, 38, 8);
		body8.addBox(-4F, -4F, -2.6F, 8, 6, 5);
		body8.setRotationPoint(0F, 0F, 0F);
		body8.setTextureSize(64, 32);
		body8.mirror = true;
		setRotation(body8, 0F, 0F, 0F);
		body9 = new ModelRenderer(this, 0, 27);
		body9.addBox(-2.5F, -4.5F, -4.2F, 5, 4, 1);
		body9.setRotationPoint(0F, 0F, 0F);
		body9.setTextureSize(64, 32);
		body9.mirror = true;
		setRotation(body9, 0F, 0F, 0F);
		body10 = new ModelRenderer(this, 48, 0);
		body10.addBox(-2.5F, 1F, -4.2F, 5, 1, 2);
		body10.setRotationPoint(0F, 0F, 0F);
		body10.setTextureSize(64, 32);
		body10.mirror = true;
		setRotation(body10, 0F, 0F, 0F);
		body11 = new ModelRenderer(this, 48, 0);
		body11.addBox(-2.5F, -1F, -4.2F, 1, 2, 1);
		body11.setRotationPoint(0F, 0F, 0F);
		body11.setTextureSize(64, 32);
		body11.mirror = true;
		setRotation(body11, 0F, 0F, 0F);
		body12 = new ModelRenderer(this, 48, 0);
		body12.addBox(1.5F, -1F, -4.2F, 1, 2, 1);
		body12.setRotationPoint(0F, 0F, 0F);
		body12.setTextureSize(64, 32);
		body12.mirror = true;
		setRotation(body12, 0F, 0F, 0F);
		body13 = new ModelRenderer(this, 36, 28);
		body13.addBox(0.5F, -1.2F, -4.2F, 1, 2, 2);
		body13.setRotationPoint(0F, 0F, 0F);
		body13.setTextureSize(64, 32);
		body13.mirror = true;
		setRotation(body13, 0F, 0F, 0.5235988F);
		body14 = new ModelRenderer(this, 36, 28);
		body14.addBox(-1.5F, -1.2F, -4.2F, 1, 2, 2);
		body14.setRotationPoint(0F, 0F, 0F);
		body14.setTextureSize(64, 32);
		body14.mirror = true;
		setRotation(body14, 0F, 0F, -0.5235988F);
		body15 = new ModelRenderer(this, 32, 25);
		body15.addBox(-2.5F, 0.4F, -4.2F, 5, 1, 2);
		body15.setRotationPoint(0F, 0F, 0F);
		body15.setTextureSize(64, 32);
		body15.mirror = true;
		setRotation(body15, 0F, 0F, 0F);
		body16 = new ModelRenderer(this, 58, 28);
		body16.addBox(-1F, -8F, 2F, 2, 2, 1);
		body16.setRotationPoint(0F, 0F, 0F);
		body16.setTextureSize(64, 32);
		body16.mirror = true;
		setRotation(body16, 0F, 0F, 0F);
		body17 = new ModelRenderer(this, 58, 28);
		body17.addBox(-0.6F, -8F, 2.1F, 2, 2, 1);
		body17.setRotationPoint(0F, 0F, 0F);
		body17.setTextureSize(64, 32);
		body17.mirror = true;
		setRotation(body17, 0F, 0.5235988F, 0F);
		body18 = new ModelRenderer(this, 58, 28);
		body18.addBox(-0.3F, -8F, 2.4F, 2, 2, 1);
		body18.setRotationPoint(0F, 0F, 0F);
		body18.setTextureSize(64, 32);
		body18.mirror = true;
		setRotation(body18, 0F, 1.047198F, 0F);
		body19 = new ModelRenderer(this, 58, 28);
		body19.addBox(2.8F, -8F, -1.7F, 1, 2, 2);
		body19.setRotationPoint(0F, 0F, 0F);
		body19.setTextureSize(64, 32);
		body19.mirror = true;
		setRotation(body19, 0F, 0F, 0F);
		body20 = new ModelRenderer(this, 58, 28);
		body20.addBox(-1.3F, -8F, 2.1F, 2, 2, 1);
		body20.setRotationPoint(0F, 0F, 0F);
		body20.setTextureSize(64, 32);
		body20.mirror = true;
		setRotation(body20, 0F, -0.5235988F, 0F);
		body21 = new ModelRenderer(this, 58, 28);
		body21.addBox(3.1F, -8F, -1.6F, 1, 2, 2);
		body21.setRotationPoint(0F, 0F, 0F);
		body21.setTextureSize(64, 32);
		body21.mirror = true;
		setRotation(body21, 0F, 0.5235988F, 0F);
		body22 = new ModelRenderer(this, 58, 28);
		body22.addBox(3.3F, -8F, -1.3F, 1, 2, 2);
		body22.setRotationPoint(0F, 0F, 0F);
		body22.setTextureSize(64, 32);
		body22.mirror = true;
		setRotation(body22, 0F, 1.047198F, 0F);
		body23 = new ModelRenderer(this, 58, 29);
		body23.addBox(-0.9F, -8F, -4.4F, 2, 2, 1);
		body23.setRotationPoint(0F, 0F, 0F);
		body23.setTextureSize(64, 32);
		body23.mirror = true;
		setRotation(body23, 0F, 0F, 0F);
		body24 = new ModelRenderer(this, 58, 28);
		body24.addBox(-1.6F, -8F, 2.3F, 2, 2, 1);
		body24.setRotationPoint(0F, 0F, 0F);
		body24.setTextureSize(64, 32);
		body24.mirror = true;
		setRotation(body24, 0F, -1.047198F, 0F);
		body25 = new ModelRenderer(this, 58, 28);
		body25.addBox(-3.7F, -8F, -1.7F, 1, 2, 2);
		body25.setRotationPoint(0F, 0F, 0F);
		body25.setTextureSize(64, 32);
		body25.mirror = true;
		setRotation(body25, 0F, 0F, 0F);
		body26 = new ModelRenderer(this, 58, 28);
		body26.addBox(-4F, -8F, -1.7F, 1, 2, 2);
		body26.setRotationPoint(0F, 0F, 0F);
		body26.setTextureSize(64, 32);
		body26.mirror = true;
		setRotation(body26, 0F, -0.5235988F, 0F);
		body27 = new ModelRenderer(this, 58, 28);
		body27.addBox(-4.3F, -8F, -1.4F, 1, 2, 2);
		body27.setRotationPoint(0F, 0F, 0F);
		body27.setTextureSize(64, 32);
		body27.mirror = true;
		setRotation(body27, 0F, -1.047198F, 0F);
		body28 = new ModelRenderer(this, 46, 26);
		body28.addBox(-2.7F, -7.1F, -3F, 5, 1, 5);
		body28.setRotationPoint(0F, 0F, 0F);
		body28.setTextureSize(64, 32);
		body28.mirror = true;
		setRotation(body28, 0F, 0F, 0F);
		body29 = new ModelRenderer(this, 46, 26);
		body29.addBox(1F, -7.1F, -3F, 2, 1, 4);
		body29.setRotationPoint(0F, 0F, 0F);
		body29.setTextureSize(64, 32);
		body29.mirror = true;
		setRotation(body29, 0F, 0F, 0F);
		body30 = new ModelRenderer(this, 46, 26);
		body30.addBox(-1.5F, -7.1F, -4F, 3, 1, 2);
		body30.setRotationPoint(0F, 0F, 0F);
		body30.setTextureSize(64, 32);
		body30.mirror = true;
		setRotation(body30, 0F, 0F, 0F);

		BODYPIECE.addChild(body1);
		BODYPIECE.addChild(body2);
		BODYPIECE.addChild(body3);
		BODYPIECE.addChild(body4);
		BODYPIECE.addChild(body5);
		BODYPIECE.addChild(body6);
		BODYPIECE.addChild(body7);
		BODYPIECE.addChild(body8);
		BODYPIECE.addChild(body9);
		BODYPIECE.addChild(body10);
		BODYPIECE.addChild(body11);
		BODYPIECE.addChild(body12);
		BODYPIECE.addChild(body13);
		BODYPIECE.addChild(body14);
		BODYPIECE.addChild(body15);
		BODYPIECE.addChild(body16);
		BODYPIECE.addChild(body17);
		BODYPIECE.addChild(body18);
		BODYPIECE.addChild(body19);
		BODYPIECE.addChild(body20);
		BODYPIECE.addChild(body21);
		BODYPIECE.addChild(body22);
		BODYPIECE.addChild(body23);
		BODYPIECE.addChild(body24);
		BODYPIECE.addChild(body25);
		BODYPIECE.addChild(body26);
		BODYPIECE.addChild(body27);
		BODYPIECE.addChild(body28);
		BODYPIECE.addChild(body29);
		BODYPIECE.addChild(body30);

		FLOWER1PIECE = new ModelRenderer(this, "FLOWER1PIECE");
		FLOWER1PIECE.setRotationPoint(0F, -6F, -9F);
		setRotation(FLOWER1PIECE, 0F, 0F, 0F);
		FLOWER1PIECE.mirror = true;
		flower11 = new ModelRenderer(this, 0, 0);
		flower11.addBox(-2F, -1F, -3.3F, 4, 3, 6);
		flower11.setRotationPoint(0F, 0F, 0F);
		flower11.setTextureSize(64, 32);
		flower11.mirror = true;
		setRotation(flower11, 0.1745329F, 0F, 0F);
		flower12 = new ModelRenderer(this, 2, 0);
		flower12.addBox(-3.8F, -0.6F, -3.5F, 3, 2, 5);
		flower12.setRotationPoint(0F, 0F, 0F);
		flower12.setTextureSize(64, 32);
		flower12.mirror = true;
		setRotation(flower12, 0.1745329F, 0.3490659F, 0F);
		flower13 = new ModelRenderer(this, 0, 0);
		flower13.addBox(-2F, 1.8F, -2.7F, 4, 1, 9);
		flower13.setRotationPoint(0F, 0F, 0F);
		flower13.setTextureSize(64, 32);
		flower13.mirror = true;
		setRotation(flower13, -0.0872665F, 0F, 0F);
		flower14 = new ModelRenderer(this, 0, 0);
		flower14.addBox(0.8F, -0.6F, -3.5F, 3, 2, 5);
		flower14.setRotationPoint(0F, 0F, 0F);
		flower14.setTextureSize(64, 32);
		flower14.mirror = true;
		setRotation(flower14, 0.1745329F, -0.3490659F, 0F);
		flower15 = new ModelRenderer(this, 2, 0);
		flower15.addBox(-3.8F, 0.8F, -3F, 3, 2, 8);
		flower15.setRotationPoint(0F, 0F, 0F);
		flower15.setTextureSize(64, 32);
		flower15.mirror = true;
		setRotation(flower15, -0.0872665F, 0.3490659F, 0F);
		flower16 = new ModelRenderer(this, 0, 0);
		flower16.addBox(0.9F, 0.8F, -3F, 3, 2, 8);
		flower16.setRotationPoint(0F, 0F, 0F);
		flower16.setTextureSize(64, 32);
		flower16.mirror = true;
		setRotation(flower16, -0.0872665F, -0.3490659F, 0F);
		flower17 = new ModelRenderer(this, 0, 0);
		flower17.addBox(-2F, -1.8F, 2.2F, 4, 3, 4);
		flower17.setRotationPoint(0F, 0F, 0F);
		flower17.setTextureSize(64, 32);
		flower17.mirror = true;
		setRotation(flower17, -0.1745329F, 0F, 0F);
		flower18 = new ModelRenderer(this, 0, 0);
		flower18.addBox(0.8F, -1.1F, 1.1F, 3, 2, 4);
		flower18.setRotationPoint(0F, 0F, 0F);
		flower18.setTextureSize(64, 32);
		flower18.mirror = true;
		setRotation(flower18, -0.1745329F, -0.3490659F, 0F);
		flower19 = new ModelRenderer(this, 2, 0);
		flower19.addBox(-3.8F, 0.9F, 1.6F, 3, 2, 4);
		flower19.setRotationPoint(0F, 0F, 0F);
		flower19.setTextureSize(64, 32);
		flower19.mirror = true;
		setRotation(flower19, -0.1745329F, 0.3490659F, 0F);

		FLOWER1PIECE.addChild(flower11);
		FLOWER1PIECE.addChild(flower12);
		FLOWER1PIECE.addChild(flower13);
		FLOWER1PIECE.addChild(flower14);
		FLOWER1PIECE.addChild(flower15);
		FLOWER1PIECE.addChild(flower16);
		FLOWER1PIECE.addChild(flower17);
		FLOWER1PIECE.addChild(flower18);
		FLOWER1PIECE.addChild(flower19);
		BODYPIECE.addChild(FLOWER1PIECE);

		FLOWER2PIECE = new ModelRenderer(this, "FLOWER2PIECE");
		FLOWER2PIECE.setRotationPoint(-3F, -7F, -1F);
		setRotation(FLOWER2PIECE, 0F, 0F, 0F);
		FLOWER2PIECE.mirror = true;
		flower1 = new ModelRenderer(this, 1, 0);
		flower1.addBox(-8.8F, -1F, -3F, 6, 3, 4);
		flower1.setRotationPoint(0F, 0F, 0F);
		flower1.setTextureSize(64, 32);
		flower1.mirror = true;
		setRotation(flower1, 0F, -0.5235988F, -0.1745329F);
		flower2 = new ModelRenderer(this, 1, 0);
		flower2.addBox(-9.1F, -0.5F, -2.8F, 5, 2, 3);
		flower2.setRotationPoint(0F, 0F, 0F);
		flower2.setTextureSize(64, 32);
		flower2.mirror = true;
		setRotation(flower2, 0F, -0.8726646F, 10.1745329F);
		flower3 = new ModelRenderer(this, 2, 0);
		flower3.addBox(-8.4F, -0.5F, -2.2F, 5, 2, 3);
		flower3.setRotationPoint(0F, 0F, 0F);
		flower3.setTextureSize(64, 32);
		flower3.mirror = true;
		setRotation(flower3, 0F, -0.1745329F, -0.1745329F);
		flower4 = new ModelRenderer(this, 0, 0);
		flower4.addBox(-8F, 3.3F, -3F, 9, 1, 4);
		flower4.setRotationPoint(0F, 0F, 0F);
		flower4.setTextureSize(64, 32);
		flower4.mirror = true;
		setRotation(flower4, 0F, -0.5235988F, 0.0872665F);
		flower5 = new ModelRenderer(this, 1, 0);
		flower5.addBox(-8.4F, 2.4F, -2.8F, 8, 2, 3);
		flower5.setRotationPoint(0F, 0F, 0F);
		flower5.setTextureSize(64, 32);
		flower5.mirror = true;
		setRotation(flower5, 0F, -0.8726646F, 0.0872665F);
		flower6 = new ModelRenderer(this, 2, 0);
		flower6.addBox(-7.7F, 2.3F, -2.2F, 8, 2, 3);
		flower6.setRotationPoint(0F, 0F, 0F);
		flower6.setTextureSize(64, 32);
		flower6.mirror = true;
		setRotation(flower6, 0F, -0.1745329F, 0.0872665F);
		flower7 = new ModelRenderer(this, 1, 0);
		flower7.addBox(-3F, 0F, -3F, 4, 3, 4);
		flower7.setRotationPoint(0F, 0F, 0F);
		flower7.setTextureSize(64, 32);
		flower7.mirror = true;
		setRotation(flower7, 0F, -0.5235988F, 0.1745329F);
		flower8 = new ModelRenderer(this, 1, 0);
		flower8.addBox(-8.1F, 1.7F, -2.4F, 3, 2, 3);
		flower8.setRotationPoint(0F, 0F, 0F);
		flower8.setTextureSize(64, 32);
		flower8.mirror = true;
		setRotation(flower8, 0F, -0.8726646F, 0.1745329F);
		flower9 = new ModelRenderer(this, 2, 0);
		flower9.addBox(-3.4F, 0.7F, -2.2F, 3, 2, 3);
		flower9.setRotationPoint(0F, 0F, 0F);
		flower9.setTextureSize(64, 32);
		flower9.mirror = true;
		setRotation(flower9, 0F, -0.1745329F, 0.1745329F);

		FLOWER2PIECE.addChild(flower1);
		FLOWER2PIECE.addChild(flower2);
		FLOWER2PIECE.addChild(flower3);
		FLOWER2PIECE.addChild(flower4);
		FLOWER2PIECE.addChild(flower5);
		FLOWER2PIECE.addChild(flower6);
		FLOWER2PIECE.addChild(flower7);
		FLOWER2PIECE.addChild(flower8);
		FLOWER2PIECE.addChild(flower9);
		BODYPIECE.addChild(FLOWER2PIECE);

		FLOWER3PIECE = new ModelRenderer(this, "FLOWER3PIECE");
		FLOWER3PIECE.setRotationPoint(3F, -7F, -2F);
		setRotation(FLOWER3PIECE, 0F, 0F, 0F);
		FLOWER3PIECE.mirror = true;
		flower47 = new ModelRenderer(this, 0, 0);
		flower47.addBox(2.3F, -1F, -2F, 6, 3, 4);
		flower47.setRotationPoint(0F, 0F, 0F);
		flower47.setTextureSize(64, 32);
		flower47.mirror = true;
		setRotation(flower47, 0F, 0.5235988F, 0.1745329F);
		flower48 = new ModelRenderer(this, 0, 0);
		flower48.addBox(3.3F, -0.4F, -2.4F, 5, 2, 3);
		flower48.setRotationPoint(0F, 0F, 0F);
		flower48.setTextureSize(64, 32);
		flower48.mirror = true;
		setRotation(flower48, 0F, 0.8726646F, 0.1745329F);
		flower49 = new ModelRenderer(this, 0, 0);
		flower49.addBox(3.3F, -0.4F, -1F, 5, 2, 3);
		flower49.setRotationPoint(0F, 0F, 0F);
		flower49.setTextureSize(64, 32);
		flower49.mirror = true;
		setRotation(flower49, 0F, 0.1745329F, 0.1745329F);
		flower50 = new ModelRenderer(this, 0, 0);
		flower50.addBox(-1.5F, 3.1F, -2F, 9, 1, 4);
		flower50.setRotationPoint(0F, 0F, 0F);
		flower50.setTextureSize(64, 32);
		flower50.mirror = true;
		setRotation(flower50, 0F, 0.5235988F, -0.0872665F);
		flower51 = new ModelRenderer(this, 0, 0);
		flower51.addBox(-1.4F, 2.2F, -2.4F, 9, 2, 3);
		flower51.setRotationPoint(0F, 0F, 0F);
		flower51.setTextureSize(64, 32);
		flower51.mirror = true;
		setRotation(flower51, 0F, 0.8726646F, -0.0872665F);
		flower52 = new ModelRenderer(this, 0, 0);
		flower52.addBox(-1.4F, 2.2F, -1F, 9, 2, 3);
		flower52.setRotationPoint(0F, 0F, 0F);
		flower52.setTextureSize(64, 32);
		flower52.mirror = true;
		setRotation(flower52, 0F, 0.1745329F, -0.0872665F);
		flower53 = new ModelRenderer(this, 0, 0);
		flower53.addBox(-0.5F, -0.1F, -2F, 3, 3, 4);
		flower53.setRotationPoint(0F, 0F, 0F);
		flower53.setTextureSize(64, 32);
		flower53.mirror = true;
		setRotation(flower53, 0F, 0.5235988F, -0.1745329F);
		flower54 = new ModelRenderer(this, 0, 0);
		flower54.addBox(0.3F, 0.8F, -2.4F, 3, 2, 3);
		flower54.setRotationPoint(0F, 0F, 0F);
		flower54.setTextureSize(64, 32);
		flower54.mirror = true;
		setRotation(flower54, 0F, 0.8726646F, -0.1745329F);
		flower55 = new ModelRenderer(this, 0, 0);
		flower55.addBox(0.3F, 0.8F, -1F, 3, 2, 3);
		flower55.setRotationPoint(0F, 0F, 0F);
		flower55.setTextureSize(64, 32);
		flower55.mirror = true;
		setRotation(flower55, 0F, 0.1745329F, -0.1745329F);

		FLOWER3PIECE.addChild(flower47);
		FLOWER3PIECE.addChild(flower48);
		FLOWER3PIECE.addChild(flower49);
		FLOWER3PIECE.addChild(flower50);
		FLOWER3PIECE.addChild(flower51);
		FLOWER3PIECE.addChild(flower52);
		FLOWER3PIECE.addChild(flower53);
		FLOWER3PIECE.addChild(flower54);
		FLOWER3PIECE.addChild(flower55);
		BODYPIECE.addChild(FLOWER3PIECE);

		FLOWER4PIECE = new ModelRenderer(this, "FLOWER4PIECE");
		FLOWER4PIECE.setRotationPoint(2F, -7F, 2F);
		setRotation(FLOWER4PIECE, 0F, 0F, 0F);
		FLOWER4PIECE.mirror = true;
		flower20 = new ModelRenderer(this, 0, 0);
		flower20.addBox(-1F, -1F, 3.3F, 4, 3, 6);
		flower20.setRotationPoint(0F, 0F, 0F);
		flower20.setTextureSize(64, 32);
		flower20.mirror = true;
		setRotation(flower20, -0.1745329F, 1.047198F, 0F);
		flower21 = new ModelRenderer(this, 0, 0);
		flower21.addBox(-0.4F, -0.5F, 4.3F, 3, 2, 5);
		flower21.setRotationPoint(0F, 0F, 0F);
		flower21.setTextureSize(64, 32);
		flower21.mirror = true;
		setRotation(flower21, -0.1745329F, 1.396263F, 0F);
		flower22 = new ModelRenderer(this, 0, 0);
		flower22.addBox(-1F, -0.5F, 3.9F, 3, 2, 5);
		flower22.setRotationPoint(0F, 0F, 0F);
		flower22.setTextureSize(64, 32);
		flower22.mirror = true;
		setRotation(flower22, -0.1745329F, 0.6981317F, 0F);
		flower23 = new ModelRenderer(this, 0, 0);
		flower23.addBox(-1F, 3.3F, -0.5F, 4, 1, 9);
		flower23.setRotationPoint(0F, 0F, 0F);
		flower23.setTextureSize(64, 32);
		flower23.mirror = true;
		setRotation(flower23, 0.0872665F, 1.047198F, 0F);
		flower24 = new ModelRenderer(this, 0, 0);
		flower24.addBox(-0.4F, 2.4F, 0.6F, 3, 2, 8);
		flower24.setRotationPoint(0F, 0F, 0F);
		flower24.setTextureSize(64, 32);
		flower24.mirror = true;
		setRotation(flower24, 0.0872665F, 1.396263F, 0F);
		flower25 = new ModelRenderer(this, 0, 0);
		flower25.addBox(-1F, 2F, 0.4F, 3, 2, 8);
		flower25.setRotationPoint(0F, 0F, 0F);
		flower25.setTextureSize(64, 32);
		flower25.mirror = true;
		setRotation(flower25, 0.0872665F, 0.6981317F, 0F);
		flower26 = new ModelRenderer(this, 0, 0);
		flower26.addBox(-1F, 0.2F, -0.6F, 4, 3, 4);
		flower26.setRotationPoint(0F, 0F, 0F);
		flower26.setTextureSize(64, 32);
		flower26.mirror = true;
		setRotation(flower26, 0.1745329F, 1.047198F, 0F);
		flower27 = new ModelRenderer(this, 0, 0);
		flower27.addBox(-0.4F, 1F, 1.3F, 3, 2, 3);
		flower27.setRotationPoint(0F, 0F, 0F);
		flower27.setTextureSize(64, 32);
		flower27.mirror = true;
		setRotation(flower27, 0.1745329F, 1.396263F, 0F);
		flower28 = new ModelRenderer(this, 0, 0);
		flower28.addBox(-1F, 0.8F, -0.1F, 3, 2, 4);
		flower28.setRotationPoint(0F, 0F, 0F);
		flower28.setTextureSize(64, 32);
		flower28.mirror = true;
		setRotation(flower28, 0.1745329F, 0.6981317F, 0F);

		FLOWER4PIECE.addChild(flower21);
		FLOWER4PIECE.addChild(flower22);
		FLOWER4PIECE.addChild(flower23);
		FLOWER4PIECE.addChild(flower24);
		FLOWER4PIECE.addChild(flower25);
		FLOWER4PIECE.addChild(flower26);
		FLOWER4PIECE.addChild(flower27);
		FLOWER4PIECE.addChild(flower28);
		FLOWER4PIECE.addChild(flower20);
		BODYPIECE.addChild(FLOWER4PIECE);

		FLOWER5PIECE = new ModelRenderer(this, "FLOWER5PIECE");
		FLOWER5PIECE.setRotationPoint(-2F, -7F, 2F);
		setRotation(FLOWER5PIECE, 0F, 0F, 0F);
		FLOWER5PIECE.mirror = true;
		flower29 = new ModelRenderer(this, 0, 0);
		flower29.addBox(-3F, -1F, 2.7F, 4, 3, 6);
		flower29.setRotationPoint(0F, 0F, 0F);
		flower29.setTextureSize(64, 32);
		flower29.mirror = true;
		setRotation(flower29, -0.1745329F, -1.047198F, 0F);
		flower30 = new ModelRenderer(this, 1, 0);
		flower30.addBox(-3.1F, -0.5F, 4F, 3, 2, 5);
		flower30.setRotationPoint(0F, 0F, 0F);
		flower30.setTextureSize(64, 32);
		flower30.mirror = true;
		setRotation(flower30, -0.1745329F, -1.396263F, 0F);
		flower31 = new ModelRenderer(this, 0, 0);
		flower31.addBox(-1.9F, -0.5F, 3.3F, 3, 2, 5);
		flower31.setRotationPoint(0F, 0F, 0F);
		flower31.setTextureSize(64, 32);
		flower31.mirror = true;
		setRotation(flower31, -0.1745329F, -0.6981317F, 0F);
		flower32 = new ModelRenderer(this, 0, 0);
		flower32.addBox(-3F, 3.2F, -1.2F, 4, 1, 9);
		flower32.setRotationPoint(0F, 0F, 0F);
		flower32.setTextureSize(64, 32);
		flower32.mirror = true;
		setRotation(flower32, 0.0872665F, -1.047198F, 0F);
		flower33 = new ModelRenderer(this, 1, 0);
		flower33.addBox(-3.1F, 2.1F, 0.4F, 3, 2, 8);
		flower33.setRotationPoint(0F, 0F, 0F);
		flower33.setTextureSize(64, 32);
		flower33.mirror = true;
		setRotation(flower33, 0.0872665F, -1.396263F, 0F);
		flower34 = new ModelRenderer(this, 0, 0);
		flower34.addBox(-1.9F, 2.1F, -0.3F, 3, 2, 8);
		flower34.setRotationPoint(0F, 0F, 0F);
		flower34.setTextureSize(64, 32);
		flower34.mirror = true;
		setRotation(flower34, 0.0872665F, -0.6981317F, 0F);
		flower35 = new ModelRenderer(this, 0, 0);
		flower35.addBox(-3F, 0F, -1.1F, 4, 3, 4);
		flower35.setRotationPoint(0F, 0F, 0F);
		flower35.setTextureSize(64, 32);
		flower35.mirror = true;
		setRotation(flower35, 0.1745329F, -1.047198F, 0F);
		flower36 = new ModelRenderer(this, 1, 0);
		flower36.addBox(-3.1F, 0.9F, 1F, 3, 2, 3);
		flower36.setRotationPoint(0F, 0F, 0F);
		flower36.setTextureSize(64, 32);
		flower36.mirror = true;
		setRotation(flower36, 0.1745329F, -1.396263F, 0F);
		flower37 = new ModelRenderer(this, 0, 0);
		flower37.addBox(-1.9F, 0.7F, 0.3F, 3, 2, 3);
		flower37.setRotationPoint(0F, 0F, 0F);
		flower37.setTextureSize(64, 32);
		flower37.mirror = true;
		setRotation(flower37, 0.1745329F, -0.6981317F, 0F);

		FLOWER5PIECE.addChild(flower29);
		FLOWER5PIECE.addChild(flower32);
		FLOWER5PIECE.addChild(flower33);
		FLOWER5PIECE.addChild(flower34);
		FLOWER5PIECE.addChild(flower35);
		FLOWER5PIECE.addChild(flower36);
		FLOWER5PIECE.addChild(flower37);
		FLOWER5PIECE.addChild(flower31);
		FLOWER5PIECE.addChild(flower30);
		BODYPIECE.addChild(FLOWER5PIECE);

		FLOWER6PIECE = new ModelRenderer(this, "FLOWER6PIECE");
		FLOWER6PIECE.setRotationPoint(0F, -7F, 3F);
		setRotation(FLOWER6PIECE, 0F, 0F, 0F);
		FLOWER6PIECE.mirror = true;
		flower38 = new ModelRenderer(this, 0, 0);
		flower38.addBox(-2F, -1F, 2.6F, 4, 3, 6);
		flower38.setRotationPoint(0F, 0F, 0F);
		flower38.setTextureSize(64, 32);
		flower38.mirror = true;
		setRotation(flower38, -0.1745329F, 0F, 0F);
		flower39 = new ModelRenderer(this, 0, 0);
		flower39.addBox(-0.9F, -0.5F, 3.6F, 3, 2, 5);
		flower39.setRotationPoint(0F, 0F, 0F);
		flower39.setTextureSize(64, 32);
		flower39.mirror = true;
		setRotation(flower39, -0.1745329F, 0.3490659F, 0F);
		flower40 = new ModelRenderer(this, 0, 0);
		flower40.addBox(-2.1F, -0.5F, 3.5F, 3, 2, 5);
		flower40.setRotationPoint(0F, 0F, 0F);
		flower40.setTextureSize(64, 32);
		flower40.mirror = true;
		setRotation(flower40, -0.1745329F, -0.3490659F, 0F);
		flower41 = new ModelRenderer(this, 0, 0);
		flower41.addBox(-2F, 3.1F, -1.3F, 4, 1, 9);
		flower41.setRotationPoint(0F, 0F, 0F);
		flower41.setTextureSize(64, 32);
		flower41.mirror = true;
		setRotation(flower41, 0.0872665F, 0F, 0F);
		flower42 = new ModelRenderer(this, 0, 0);
		flower42.addBox(-0.9F, 2.1F, 0F, 3, 2, 8);
		flower42.setRotationPoint(0F, 0F, 0F);
		flower42.setTextureSize(64, 32);
		flower42.mirror = true;
		setRotation(flower42, 0.0872665F, 0.3490659F, 0F);
		flower43 = new ModelRenderer(this, 0, 0);
		flower43.addBox(-2.1F, 2.1F, -0.1F, 3, 2, 8);
		flower43.setRotationPoint(0F, 0F, 0F);
		flower43.setTextureSize(64, 32);
		flower43.mirror = true;
		setRotation(flower43, 0.0872665F, -0.3490659F, 0F);
		flower44 = new ModelRenderer(this, 0, 0);
		flower44.addBox(-2F, 0.1F, -1.4F, 4, 3, 4);
		flower44.setRotationPoint(0F, 0F, 0F);
		flower44.setTextureSize(64, 32);
		flower44.mirror = true;
		setRotation(flower44, 0.1745329F, 0F, 0F);
		flower45 = new ModelRenderer(this, 0, 0);
		flower45.addBox(-0.9F, 0.7F, 0.6F, 3, 2, 3);
		flower45.setRotationPoint(0F, 0F, 0F);
		flower45.setTextureSize(64, 32);
		flower45.mirror = true;
		setRotation(flower45, 0.1745329F, 0.3490659F, 0F);
		flower46 = new ModelRenderer(this, 0, 0);
		flower46.addBox(-2.1F, 0.7F, 0.5F, 3, 2, 3);
		flower46.setRotationPoint(0F, 0F, 0F);
		flower46.setTextureSize(64, 32);
		flower46.mirror = true;
		setRotation(flower46, 0.1745329F, -0.3490659F, 0F);

		FLOWER6PIECE.addChild(flower46);
		FLOWER6PIECE.addChild(flower38);
		FLOWER6PIECE.addChild(flower39);
		FLOWER6PIECE.addChild(flower40);
		FLOWER6PIECE.addChild(flower41);
		FLOWER6PIECE.addChild(flower42);
		FLOWER6PIECE.addChild(flower43);
		FLOWER6PIECE.addChild(flower44);
		FLOWER6PIECE.addChild(flower45);
		BODYPIECE.addChild(FLOWER6PIECE);

		LEFTLEGPIECE = new ModelRenderer(this, "LEFTLEGPIECE");
		LEFTLEGPIECE.setRotationPoint(2F, 21F, -2F);
		setRotation(LEFTLEGPIECE, 0F, 0F, 0F);
		LEFTLEGPIECE.mirror = true;
		leftleg1 = new ModelRenderer(this, 55, 0);
		leftleg1.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		leftleg1.setRotationPoint(0F, 0F, 0F);
		leftleg1.setTextureSize(64, 32);
		leftleg1.mirror = true;
		setRotation(leftleg1, 0F, 0F, 0F);
		leftleg2 = new ModelRenderer(this, 50, 0);
		leftleg2.addBox(-0.8F, 2F, -3.5F, 1, 1, 4);
		leftleg2.setRotationPoint(0F, 0F, 0F);
		leftleg2.setTextureSize(64, 32);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0F, -0.2617994F, 0F);
		leftleg4 = new ModelRenderer(this, 50, 0);
		leftleg4.addBox(-0.3F, 2F, -3.5F, 1, 1, 4);
		leftleg4.setRotationPoint(0F, 0F, 0F);
		leftleg4.setTextureSize(64, 32);
		leftleg4.mirror = true;
		setRotation(leftleg4, 0F, -0.2617994F, 0F);

		LEFTLEGPIECE.addChild(leftleg1);
		LEFTLEGPIECE.addChild(leftleg2);
		LEFTLEGPIECE.addChild(leftleg4);

		RIGHTLEGPIECE = new ModelRenderer(this, "RIGHTLEGPIECE");
		RIGHTLEGPIECE.setRotationPoint(-2F, 21F, -2F);
		setRotation(RIGHTLEGPIECE, 0F, 0F, 0F);
		RIGHTLEGPIECE.mirror = true;
		rightleg1 = new ModelRenderer(this, 59, 0);
		rightleg1.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
		rightleg1.setRotationPoint(0F, 0F, 0F);
		rightleg1.setTextureSize(64, 32);
		rightleg1.mirror = true;
		setRotation(rightleg1, 0F, 0F, 0F);
		rightleg2 = new ModelRenderer(this, 53, 0);
		rightleg2.addBox(-0.8F, 2F, -3.5F, 1, 1, 4);
		rightleg2.setRotationPoint(0F, 0F, 0F);
		rightleg2.setTextureSize(64, 32);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0F, 0.2617994F, 0F);
		rightleg3 = new ModelRenderer(this, 53, 0);
		rightleg3.addBox(-0.3F, 2F, -3.5F, 1, 1, 4);
		rightleg3.setRotationPoint(0F, 0F, 0F);
		rightleg3.setTextureSize(64, 32);
		rightleg3.mirror = true;
		setRotation(rightleg3, 0F, 0.2617994F, 0F);

		RIGHTLEGPIECE.addChild(rightleg1);
		RIGHTLEGPIECE.addChild(rightleg2);
		RIGHTLEGPIECE.addChild(rightleg3);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BODYPIECE.render(f5);
		RIGHTLEGPIECE.render(f5);
		LEFTLEGPIECE.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		BODYPIECE.rotateAngleY = f3 / (270F / (float) Math.PI);
		BODYPIECE.rotateAngleX = f4 / (270F / (float) Math.PI);
		RIGHTLEGPIECE.rotateAngleX = MathHelper.cos(f * 0.7F) * 1F * f1;
		LEFTLEGPIECE.rotateAngleX = MathHelper.cos(f * 0.7F + (float) Math.PI) * 1F * f1;
	}

}
