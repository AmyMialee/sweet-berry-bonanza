package amymialee.sweetberrybonanza;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class Intangibility extends StatusEffect {
    protected Intangibility() {
        super(StatusEffectType.BENEFICIAL, 12032241);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
    }
}
