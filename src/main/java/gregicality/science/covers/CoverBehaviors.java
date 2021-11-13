package gregicality.science.covers;

import gregicality.science.GregicalityScience;
import gregicality.science.item.GAMetaItems;
import gregtech.common.covers.CoverConveyor;
import gregtech.common.covers.CoverPump;
import gregtech.common.covers.CoverRoboticArm;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.covers.CoverBehaviors.registerBehavior;

public class CoverBehaviors {

    public static void init() {

        // UHV+ Conveyors
        registerBehavior(100, new ResourceLocation(GregicalityScience.MODID, "conveyor.uhv"), GAMetaItems.CONVEYOR_MODULE_UHV, (tile, side) -> new CoverConveyor(tile, side, 9, 16 * 64));
        registerBehavior(101, new ResourceLocation(GregicalityScience.MODID, "conveyor.uev"), GAMetaItems.CONVEYOR_MODULE_UEV, (tile, side) -> new CoverConveyor(tile, side, 9, 16 * 64));
        registerBehavior(102, new ResourceLocation(GregicalityScience.MODID, "conveyor.uiv"), GAMetaItems.CONVEYOR_MODULE_UIV, (tile, side) -> new CoverConveyor(tile, side, 9, 16 * 64));
        registerBehavior(103, new ResourceLocation(GregicalityScience.MODID, "conveyor.umv"), GAMetaItems.CONVEYOR_MODULE_UMV, (tile, side) -> new CoverConveyor(tile, side, 9, 16 * 64));
        registerBehavior(104, new ResourceLocation(GregicalityScience.MODID, "conveyor.uxv"), GAMetaItems.CONVEYOR_MODULE_UXV, (tile, side) -> new CoverConveyor(tile, side, 9, 16 * 64));
        registerBehavior(105, new ResourceLocation(GregicalityScience.MODID, "conveyor.max"), GAMetaItems.CONVEYOR_MODULE_MAX, (tile, side) -> new CoverConveyor(tile, side, 9, 16 * 64));

        // UHV+ Robot Arms
        registerBehavior(106, new ResourceLocation(GregicalityScience.MODID, "robotic_arm.uhv"), GAMetaItems.ROBOT_ARM_UHV, (tile, side) -> new CoverRoboticArm(tile, side, 9, 16 * 64));
        registerBehavior(107, new ResourceLocation(GregicalityScience.MODID, "robotic_arm.uev"), GAMetaItems.ROBOT_ARM_UEV, (tile, side) -> new CoverRoboticArm(tile, side, 9, 16 * 64));
        registerBehavior(108, new ResourceLocation(GregicalityScience.MODID, "robotic_arm.uiv"), GAMetaItems.ROBOT_ARM_UIV, (tile, side) -> new CoverRoboticArm(tile, side, 9, 16 * 64));
        registerBehavior(109, new ResourceLocation(GregicalityScience.MODID, "robotic_arm.umv"), GAMetaItems.ROBOT_ARM_UMV, (tile, side) -> new CoverRoboticArm(tile, side, 9, 16 * 64));
        registerBehavior(110, new ResourceLocation(GregicalityScience.MODID, "robotic_arm.uxv"), GAMetaItems.ROBOT_ARM_UXV, (tile, side) -> new CoverRoboticArm(tile, side, 9, 16 * 64));
        registerBehavior(111, new ResourceLocation(GregicalityScience.MODID, "robotic_arm.max"), GAMetaItems.ROBOT_ARM_MAX, (tile, side) -> new CoverRoboticArm(tile, side, 9, 16 * 64));

        // UHV+ Pumps
        registerBehavior(112, new ResourceLocation(GregicalityScience.MODID, "pump.uhv"), GAMetaItems.ELECTRIC_PUMP_UHV, (tile, side) -> new CoverPump(tile, side, 9, 20971520 * 4));
        registerBehavior(113, new ResourceLocation(GregicalityScience.MODID, "pump.uev"), GAMetaItems.ELECTRIC_PUMP_UEV, (tile, side) -> new CoverPump(tile, side, 9, 20971520 * 16));
        registerBehavior(114, new ResourceLocation(GregicalityScience.MODID, "pump.uiv"), GAMetaItems.ELECTRIC_PUMP_UIV, (tile, side) -> new CoverPump(tile, side, 9, 20971520 * 64));
        registerBehavior(115, new ResourceLocation(GregicalityScience.MODID, "pump.umv"), GAMetaItems.ELECTRIC_PUMP_UMV, (tile, side) -> new CoverPump(tile, side, 9, Integer.MAX_VALUE));
        registerBehavior(116, new ResourceLocation(GregicalityScience.MODID, "pump.uxv"), GAMetaItems.ELECTRIC_PUMP_UXV, (tile, side) -> new CoverPump(tile, side, 9, Integer.MAX_VALUE));
        registerBehavior(117, new ResourceLocation(GregicalityScience.MODID, "pump.max"), GAMetaItems.ELECTRIC_PUMP_MAX, (tile, side) -> new CoverPump(tile, side, 9, Integer.MAX_VALUE));
    }
}
