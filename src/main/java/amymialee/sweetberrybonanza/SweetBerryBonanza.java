package amymialee.sweetberrybonanza;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class SweetBerryBonanza implements ModInitializer {
    public static final StatusEffect INTANGIBILITY = new Intangibility();
    public static final Item SWEET_BERRY_JAM = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(BerryFoodComponents.SWEET_BERRY_JAM));
    public static final Item BERRY_TART = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(BerryFoodComponents.BERRY_TART));
    public static final Item BEJEWELLED_BERRY = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(BerryFoodComponents.BEJEWELLED_BERRY).rarity(Rarity.RARE));
    @Override
    public void onInitialize() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("sweetberrybonanza", "intangibility"), INTANGIBILITY);
        Registry.register(Registry.ITEM, new Identifier("sweetberrybonanza", "sweet_berry_jam"), SWEET_BERRY_JAM);
        Registry.register(Registry.ITEM, new Identifier("sweetberrybonanza", "berry_tart"), BERRY_TART);
        Registry.register(Registry.ITEM, new Identifier("sweetberrybonanza", "bejewelled_berry"), BEJEWELLED_BERRY);
    }
}
