package pixelmon.entities.pixelmon.stats;

import net.minecraft.nbt.NBTTagCompound;

public class EVsStore {
	public int HP = 0;
	public int Attack = 0;
	public int Defence = 0;
	public int SpecialAttack = 0;
	public int SpecialDefence = 0;
	public int Speed = 0;

	public void gainEV(EVsStore evGain) {
		HP += evGain.HP;
		if (HP > 255)
			HP = 255;
		Attack += evGain.Attack;
		if (Attack > 255)
			Attack = 255;
		Defence += evGain.Defence;
		if (Defence > 255)
			Defence = 255;
		SpecialAttack += evGain.SpecialAttack;
		if (SpecialAttack > 255)
			SpecialAttack = 255;
		SpecialDefence += evGain.SpecialDefence;
		if (SpecialDefence > 255)
			SpecialDefence = 255;
		Speed += evGain.Speed;
		if (Speed > 255)
			Speed = 255;
	}

	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("EVHP", HP);
		nbt.setInteger("EVAttack", Attack);
		nbt.setInteger("EVDefence", Defence);
		nbt.setInteger("EVSpecialAttack", SpecialAttack);
		nbt.setInteger("EVSpecialDefence", SpecialDefence);
		nbt.setInteger("EVSpeed", Speed);
	}

	public void readFromNBT(NBTTagCompound nbt) {
		HP = nbt.getInteger("EVHP");
		Attack = nbt.getInteger("EVAttack");
		Defence = nbt.getInteger("EVDefence");
		SpecialAttack = nbt.getInteger("EVSpecialAttack");
		SpecialDefence = nbt.getInteger("EVSpecialDefence");
		Speed = nbt.getInteger("EVSpeed");
	}

	public int get(StatsType stat) {
		if (stat == StatsType.Attack)
			return Attack;
		if (stat == StatsType.Defence)
			return Defence;
		if (stat == StatsType.HP)
			return HP;
		if (stat == StatsType.SpecialAttack)
			return SpecialAttack;
		if (stat == StatsType.SpecialDefence)
			return SpecialDefence;
		if (stat == StatsType.Speed)
			return Speed;
		return -1;
	}

}
