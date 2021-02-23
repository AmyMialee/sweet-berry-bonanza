package amymialee.sweetberrybonanza.mixin;

import amymialee.sweetberrybonanza.SweetBerryBonanza;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Shadow public abstract boolean hasStatusEffect(StatusEffect effect);

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (this.hasStatusEffect(SweetBerryBonanza.INTANGIBILITY)) {
            cir.setReturnValue(false);
        }
        if (source.getAttacker() instanceof LivingEntity) {
            if (((LivingEntity) source.getAttacker()).hasStatusEffect(SweetBerryBonanza.INTANGIBILITY)) {
                cir.setReturnValue(false);
            }
        }
    }
}