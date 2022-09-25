package io.github.loyodea.loyomod.init;

import io.github.loyodea.loyomod.base.ModArmorMaterial;
import io.github.loyodea.loyomod.base.SuperModArmorMaterial;
import io.github.loyodea.loyomod.loyomod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, loyomod.MODID);


    // TOOLS
    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ToolTiers.EXAMPLE, 2, -2f, props()));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ToolTiers.EXAMPLE, 2, -1.75f, props()));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ToolTiers.EXAMPLE, 1, -1.5f, props()));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ToolTiers.EXAMPLE, 3, -2.75f, props()));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ToolTiers.EXAMPLE, 1, 10f, props()));
    // STICK
    public static final RegistryObject<Item> EMERALD_STICK = ITEMS.register("emerald_stick",
            () -> new Item(props()));
    // SUPER TOOLS
    public static final RegistryObject<SwordItem> SUPER_EMERALD_SWORD = ITEMS.register("super_emerald_sword",
            () -> new SwordItem(ToolTiers.SuperToolTiers.EMERALD, 15, -1.25f, props()));
    public static final RegistryObject<PickaxeItem> SUPER_EMERALD_PICKAXE = ITEMS.register("super_emerald_pickaxe",
            () -> new PickaxeItem(ToolTiers.SuperToolTiers.EMERALD, 8, -1.5f, props()));
    public static final RegistryObject<AxeItem> SUPER_EMERALD_AXE = ITEMS.register("super_emerald_axe",
            () -> new AxeItem(ToolTiers.SuperToolTiers.EMERALD, 20, -3f, props()));
    public static final RegistryObject<ShovelItem> SUPER_EMERALD_SHOVEL = ITEMS.register("super_emerald_shovel",
            () -> new ShovelItem(ToolTiers.SuperToolTiers.EMERALD, 5, -1.25f, props()));
    public static final RegistryObject<HoeItem> SUPER_EMERALD_HOE = ITEMS.register("super_emerald_hoe",
            () -> new HoeItem(ToolTiers.SuperToolTiers.EMERALD, 2, -0.5f, props()));



    // Armour
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ArmorTiers.EMERALD, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ArmorTiers.EMERALD, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ArmorTiers.EMERALD, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ArmorTiers.EMERALD, EquipmentSlot.FEET, props()));
    // SUPER ARMOUR
    public static final RegistryObject<ArmorItem> SUPER_EMERALD_HELMET = ITEMS.register("super_emerald_helmet",
            () -> new ArmorItem(ArmorTiers.SuperArmorTiers.EMERALD, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> SUPER_EMERALD_CHESTPLATE = ITEMS.register("super_emerald_chestplate",
            () -> new ArmorItem(ArmorTiers.SuperArmorTiers.EMERALD, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> SUPER_EMERALD_LEGGINGS = ITEMS.register("super_emerald_leggings",
            () -> new ArmorItem(ArmorTiers.SuperArmorTiers.EMERALD, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> SUPER_EMERALD_BOOTS = ITEMS.register("super_emerald_boots",
            () -> new ArmorItem(ArmorTiers.SuperArmorTiers.EMERALD, EquipmentSlot.FEET, props()));



    // food
    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(props().food(Foods.EMERALD_APPLE)));
    // SUPER FOOD
    public static final RegistryObject<Item> SUPER_EMERALD_APPLE = ITEMS.register("super_emerald_apple",
            () -> new Item(props().food(Super_Foods.SUPER_EMERALD_APPLE)));

    private static Item.Properties props() {
        return new Item.Properties().tab(loyomod.TAB);
    }

    public static class Foods {
        public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder()
                .nutrition(7)
                .saturationMod(0.6f)
                .alwaysEat()
                .meat()
                .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1800, 2), 1f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,100 , 1), 1f)
                .build();
    }
    public static class Super_Foods {
        public static final FoodProperties SUPER_EMERALD_APPLE = new FoodProperties.Builder()
                .nutrition(7)
                .saturationMod(0.7f)
                .alwaysEat()
                .meat()
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,100 , 3), 1f)
                .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1800, 2), 1f)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 150, 2), 1f)
                .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 100, 2), 1f)
                .build();
    }

    public static class ToolTiers {
        public static final Tier EXAMPLE = new ForgeTier(0, 1000, 0.5f, 1, 350, null, () -> Ingredient.of(ItemInit.EMERALD_SWORD.get()));

    public static class SuperToolTiers {
        public static final Tier EMERALD = new ForgeTier(4, 1500, 4, 2, 350, null, () -> Ingredient.of(ItemInit.EMERALD_SWORD.get()));
    }
    }

    public static class ArmorTiers {
        public static final ArmorMaterial EMERALD = new ModArmorMaterial(
                "emerald",
                50,
                new int[]{2, 3, 4, 2},
                300,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ItemInit.EMERALD_SWORD.get()));

        public static class SuperArmorTiers {
            public static final SuperModArmorMaterial EMERALD = new SuperModArmorMaterial(
                    "super_emerald",
                    1500,
                    new int[]{10, 14, 15, 10},
                    300,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    0.0f,
                    1.5f,
                    () -> Ingredient.of(ItemInit.EMERALD_SWORD.get()));
        }


    }
}
