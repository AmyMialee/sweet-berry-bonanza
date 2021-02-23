package amymialee.sweetberrybonanza;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class BerryFoodComponents {
    public static final FoodComponent SWEET_BERRY_JAM;
    public static final FoodComponent BERRY_TART;
    public static final FoodComponent BEJEWELLED_BERRY;
    static {
        SWEET_BERRY_JAM = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.25F).snack().build();
        BERRY_TART = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.4F).build();
        BEJEWELLED_BERRY = (new FoodComponent.Builder()).hunger(2).saturationModifier(1F).alwaysEdible().snack()
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 400, 1), 1.0F)
                .statusEffect(new StatusEffectInstance(SweetBerryBonanza.INTANGIBILITY, 600, 0), 1.0F).build();
    }
}