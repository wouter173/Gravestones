package net.pneumono.gravestones.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;

public class SoulBoundEnchantment extends Enchantment {
    public SoulBoundEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.BREAKABLE, new EquipmentSlot[] {});
    }



    @Override
    protected boolean canAccept(Enchantment other) {
        return !(other instanceof MendingEnchantment);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }
}
