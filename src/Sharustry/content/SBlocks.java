package Sharustry.content;

import Sharustry.world.blocks.defense.*;
import Sharustry.world.blocks.production.*;
import arc.graphics.Color;
import mindustry.ctype.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.content.*;
import mindustry.world.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.with;

public class SBlocks implements ContentList{
    public static Block balkan, adaptDrill, multiDrill, shieldWall;

    @Override
    public void load(){
        balkan = new SharTurret("balkan"){{
            ammo(Items.titanium, SBullets.accelMissile,
                 Items.pyratite, SBullets.testLaser
                );
            range = 45*8f;
            chargeTime = 40f;
            chargeMaxDelay = 30f;
            chargeEffects = 5;
            recoilAmount = 4f;
            reloadTime = 90f;
            cooldown = 0.05f;
            shootShake = 4f;
            shootEffect = SFx.balkanShoot;
            smokeEffect = Fx.none;
            chargeEffect = SFx.balkanCharge;
            chargeBeginEffect = SFx.balkanChargeBegin;
            heatColor = Color.blue;
            size = 2;
            health = 340 * size * size;
            targetAir = true;
            shootSound = Sounds.missile;

            acceptCoolant = false;
            requirements(Category.turret, with(Items.copper, 250, Items.lead, 80, Items.titanium, 40, Items.silicon, 60));
        }};

        adaptDrill = new AttributeDrill("adapt-drill"){{
            requirements(Category.production, with(Items.copper, 35, Items.graphite, 30, Items.silicon, 30, Items.titanium, 20));
            drillTime = 280;
            size = 3;
            hasPower = true;
            tier = 4;
            updateEffect = Fx.pulverizeMedium;
            drillEffect = Fx.mineBig;
            defaultAttribute = Attribute.light;
            configurable = true;
            maxHeatBoost = 2;
            consumes.power(1.10f);
            consumes.liquid(Liquids.water, 0.08f).boost();
        }};

        multiDrill = new MultipleDrill("multi-drill"){{
            requirements(Category.production, with(Items.copper, 35, Items.graphite, 30, Items.silicon, 30, Items.titanium, 20));
            drillTime = 210;
            size = 3;
            hasPower = true;
            tier = 5;
            updateEffect = Fx.pulverizeMedium;
            drillEffect = Fx.mineBig;
            itemCapacity = 50;
            delay = 2 * 60;
            consumes.power(1.10f);
            consumes.liquid(Liquids.water, 0.08f).boost();
        }};

        shieldWall = new ShieldWall("shield-wall"){{
                requirements(Category.defense, with(Items.titanium, 6));
                health = 150 * 4;
        }};
        /* //fuck
        warehouseBattle = new BattleCoreBlock("warehouse-battle"){{

            size = 5;
            itemCapacity = 7000;
            flags = EnumSet.of(BlockFlag. core);
            requirements(Category.effect, with(Items.titanium, 600, Items.thorium, 500, Items.plastanium, 450, Items.phaseFabric, 150, Items.surgeAlloy, 100));
            turrets.add(
                new ItemBattleCoreBlock("duo-part1"){{
                    requirements(Category.turret, with(Items.copper, 35), true);
                    ammo(
                        Items.copper, Bullets.standardCopper,
                        Items.graphite, Bullets.standardDense,
                        Items.pyratite, Bullets.standardIncendiary,
                        Items.silicon, Bullets.standardHoming
                    );

                    spread = 4f;
                    shots = 2;
                    alternate = true;
                    reloadTime = 20f;
                    restitution = 0.03f;
                    range = 100;
                    shootCone = 15f;
                    ammoUseEffect = Fx.casing1;
                    health = 250;
                    inaccuracy = 2f;
                    rotateSpeed = 10f;
                    offsetx = +5;
                    offsety = +5;
                }},
                new ItemBattleCoreBlock("duo-part2"){{
                    requirements(Category.turret, with(Items.copper, 35), true);
                    ammo(
                        Items.copper, Bullets.standardCopper,
                        Items.graphite, Bullets.standardDense,
                        Items.pyratite, Bullets.standardIncendiary,
                        Items.silicon, Bullets.standardHoming
                    );

                    spread = 4f;
                    shots = 2;
                    alternate = true;
                    reloadTime = 20f;
                    restitution = 0.03f;
                    range = 100;
                    shootCone = 15f;
                    ammoUseEffect = Fx.casing1;
                    health = 250;
                    inaccuracy = 2f;
                    rotateSpeed = 10f;
                    offsetx = -5;
                    offsety = +5;
                }},
                new ItemBattleCoreBlock("duo-part3"){{
                    requirements(Category.turret, with(Items.copper, 35), true);
                    ammo(
                        Items.copper, Bullets.standardCopper,
                        Items.graphite, Bullets.standardDense,
                        Items.pyratite, Bullets.standardIncendiary,
                        Items.silicon, Bullets.standardHoming
                    );

                    spread = 4f;
                    shots = 2;
                    alternate = true;
                    reloadTime = 20f;
                    restitution = 0.03f;
                    range = 100;
                    shootCone = 15f;
                    ammoUseEffect = Fx.casing1;
                    health = 250;
                    inaccuracy = 2f;
                    rotateSpeed = 10f;
                    offsetx = +5;
                    offsety = -5;
                }},
                new ItemBattleCoreBlock("duo-part4"){{
                    requirements(Category.turret, with(Items.copper, 35), true);
                    ammo(
                        Items.copper, Bullets.standardCopper,
                        Items.graphite, Bullets.standardDense,
                        Items.pyratite, Bullets.standardIncendiary,
                        Items.silicon, Bullets.standardHoming
                    );

                    spread = 4f;
                    shots = 2;
                    alternate = true;
                    reloadTime = 20f;
                    restitution = 0.03f;
                    range = 100;
                    shootCone = 15f;
                    ammoUseEffect = Fx.casing1;
                    health = 250;
                    inaccuracy = 2f;
                    rotateSpeed = 10f;
                    offsetx = -5;
                    offsety = -5;
                }}
            );
        }};*/
    }
}
