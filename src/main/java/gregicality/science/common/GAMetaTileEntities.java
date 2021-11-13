package gregicality.science.common;

import gregicality.science.api.GAValues;
import gregicality.science.GregicalityScience;
import gregicality.science.client.ClientHandler;
import gregicality.science.api.machines.MetaTileEntitySteamMixer;
import gregicality.science.api.machines.MetaTileEntitySteamPump;
import gregicality.science.api.machines.multi.*;
import gregicality.science.api.machines.multi.advance.*;
import gregicality.science.api.machines.multi.advance.hyper.*;
import gregicality.science.api.machines.multi.miner.MetaTileEntityVoidMiner;
import gregicality.science.api.machines.multi.multiblockpart.MetaTileEntityQubitHatch;
import gregicality.science.api.machines.multi.qubit.*;
import gregicality.science.api.machines.multi.simple.*;
import gregicality.science.loaders.recipes.GARecipeMaps;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.render.Textures;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gregtech.common.metatileentities.MetaTileEntities.registerSimpleMetaTileEntity;

public class GAMetaTileEntities {

    // TODO Organize
    public static SimpleMachineMetaTileEntity[] DEHYDRATOR = new SimpleMachineMetaTileEntity[14];
    public static SimpleMachineMetaTileEntity[] DECAY_CHAMBER = new SimpleMachineMetaTileEntity[14];
    public static SimpleMachineMetaTileEntity[] GREEN_HOUSE = new SimpleMachineMetaTileEntity[14];
    public static SimpleGeneratorMetaTileEntity[] NAQUADAH_REACTOR = new SimpleGeneratorMetaTileEntity[8]; // todo idk what but something needs to be done about this
    public static SimpleGeneratorMetaTileEntity[] ROCKET_GENERATOR = new SimpleGeneratorMetaTileEntity[8];

    public static TileEntityLargeCircuitAssemblyLine LARGE_CIRCUIT_ASSEMBLY_LINE;
    public static MetaTileEntityVoidMiner[] VOID_MINER = new MetaTileEntityVoidMiner[3];
    public static MetaTileEntityLargeRocketEngine LARGE_ROCKET_ENGINE;
    public static MetaTileEntityLargeNaquadahReactor LARGE_NAQUADAH_REACTOR;
    public static MetaTileEntityHyperReactorI HYPER_REACTOR_I;
    public static MetaTileEntityHyperReactorII HYPER_REACTOR_II;
    public static MetaTileEntityHyperReactorIII HYPER_REACTOR_III;
    public static MetaTileEntityAdvFusionReactor ADVANCED_FUSION_REACTOR;
    public static MetaTileEntityStellarForge STELLAR_FORGE;
    public static MetaTileEntityQubitComputer QUBIT_COMPUTER;
    public static MetaTileEntityBioReactor BIO_REACTOR;
    public static MetaTileEntityCosmicRayDetector COSMIC_RAY_DETECTOR;
    public static MetaTileEntityQubitHatch[] QBIT_INPUT_HATCH = new MetaTileEntityQubitHatch[GAValues.QUBIT.length];
    public static MetaTileEntityQubitHatch[] QBIT_OUTPUT_HATCH = new MetaTileEntityQubitHatch[GAValues.QUBIT.length];
    public static MetaTileEntitySteamPump STEAM_PUMP;
    public static MetaTileEntitySteamMixer STEAM_MIXER;
    public static MetaTileEntityPlasmaCondenser PLASMA_CONDENSER;
    public static TileEntitySteamMiner STEAM_MINER;

    public static void init() {

        // todo REORGANIZE IDs, there will be conflicts, and it is also a total mess right now

        // todo rename everything to start with "MetaTileEntity"

        // todo get rid of all of the dumb overrides for base classes. GAWorkableTieredMetaTileEntity, GATieredMetaTileEntity, etc etc etc

        // todo comment this better for ID range clarity

        // Simple Machines
        registerSimpleMetaTileEntity(DEHYDRATOR, 2000, "dehydrator", GARecipeMaps.CHEMICAL_DEHYDRATOR_RECIPES, Textures.SIFTER_OVERLAY, true, GAMetaTileEntities::location);
        registerSimpleMetaTileEntity(DECAY_CHAMBER, 2015, "decay_chamber", GARecipeMaps.DECAY_CHAMBERS_RECIPES, Textures.REPLICATOR_OVERLAY, true, GAMetaTileEntities::location);
        registerSimpleMetaTileEntity(GREEN_HOUSE, 2030, "green_house", GARecipeMaps.GREEN_HOUSE_RECIPES, Textures.FERMENTER_OVERLAY, true, GAMetaTileEntities::location);

        // Simple Generators
        NAQUADAH_REACTOR[4] = registerMetaTileEntity(2051, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk2"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, ClientHandler.NAQADAH_OVERLAY, 5));
        NAQUADAH_REACTOR[5] = registerMetaTileEntity(2052, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk3"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, ClientHandler.NAQADAH_OVERLAY, 6));
        NAQUADAH_REACTOR[6] = registerMetaTileEntity(2053, new SimpleGeneratorMetaTileEntity(location("naquadah_reactor.mk4"), GARecipeMaps.NAQUADAH_REACTOR_FUELS, ClientHandler.NAQADAH_OVERLAY, 7));

        ROCKET_GENERATOR[3] = registerMetaTileEntity(2065, new SimpleGeneratorMetaTileEntity(location("rocket_generator.mk1"), GARecipeMaps.ROCKET_FUEL_RECIPES, ClientHandler.ROCKET_OVERLAY, 4));
        ROCKET_GENERATOR[4] = registerMetaTileEntity(2066, new SimpleGeneratorMetaTileEntity(location("rocket_generator.mk2"), GARecipeMaps.ROCKET_FUEL_RECIPES, ClientHandler.ROCKET_OVERLAY, 5));
        ROCKET_GENERATOR[5] = registerMetaTileEntity(2067, new SimpleGeneratorMetaTileEntity(location("rocket_generator.mk3"), GARecipeMaps.ROCKET_FUEL_RECIPES, ClientHandler.ROCKET_OVERLAY, 6));

        // Steam Machines
        STEAM_PUMP = registerMetaTileEntity(2075, new MetaTileEntitySteamPump(location("pump.steam")));
        STEAM_MIXER = registerMetaTileEntity(2077, new MetaTileEntitySteamMixer(location("steam_mixer")));
        STEAM_MINER = registerMetaTileEntity(2079, new TileEntitySteamMiner(location("steam_miner")));

        // Multiblocks

        // "Upgraded Versions"
        LARGE_CIRCUIT_ASSEMBLY_LINE = registerMetaTileEntity(3000, new TileEntityLargeCircuitAssemblyLine(location("large_circuit_assembly")));
        LARGE_ROCKET_ENGINE = registerMetaTileEntity(3015, new MetaTileEntityLargeRocketEngine(location("large_rocket_engine")));
        LARGE_NAQUADAH_REACTOR = registerMetaTileEntity(3018, new MetaTileEntityLargeNaquadahReactor(location("large_naquadah_reactor")));

        // Totally new Multis
        VOID_MINER[0] = registerMetaTileEntity(3201, new MetaTileEntityVoidMiner(location("void_miner"), GTValues.UV, GAConfig.multis.voidMiner.maxTemp));
        VOID_MINER[1] = registerMetaTileEntity(3202, new MetaTileEntityVoidMiner(location("void_miner.uhv"), GTValues.UHV, GAConfig.multis.voidMiner.maxTempUHV));
        VOID_MINER[2] = registerMetaTileEntity(3203, new MetaTileEntityVoidMiner(location("void_miner.uev"), GTValues.UEV, GAConfig.multis.voidMiner.maxTempUEV));
        HYPER_REACTOR_I = registerMetaTileEntity(3204, new MetaTileEntityHyperReactorI(location("hyper_reactor.i"), GAConfig.multis.hyperReactors.euGeneration[0]));
        HYPER_REACTOR_II = registerMetaTileEntity(3205, new MetaTileEntityHyperReactorII(location("hyper_reactor.ii"), GAConfig.multis.hyperReactors.euGeneration[1]));
        HYPER_REACTOR_III = registerMetaTileEntity(3206, new MetaTileEntityHyperReactorIII(location("hyper_reactor.iii"), GAConfig.multis.hyperReactors.euGeneration[2]));
        STELLAR_FORGE = registerMetaTileEntity(3207, new MetaTileEntityStellarForge(location("stellar_forge")));
        ADVANCED_FUSION_REACTOR = registerMetaTileEntity(3208, new MetaTileEntityAdvFusionReactor(location("advanced_fusion_reactor")));
        QUBIT_COMPUTER = registerMetaTileEntity(3209, new MetaTileEntityQubitComputer(location("qubit_computer")));
        BIO_REACTOR = registerMetaTileEntity(3210, new MetaTileEntityBioReactor(location("bio_reactor")));
        PLASMA_CONDENSER = registerMetaTileEntity(3211, new MetaTileEntityPlasmaCondenser(location("plasma_condenser")));
        COSMIC_RAY_DETECTOR = registerMetaTileEntity(3212, new MetaTileEntityCosmicRayDetector(location("cosmic_ray_detector")));

        // Misc MTEs
        QBIT_INPUT_HATCH[0] = registerMetaTileEntity(3603, new MetaTileEntityQubitHatch(location("qubit_hatch.input.16"), 0, 16, false));
        QBIT_OUTPUT_HATCH[0] = registerMetaTileEntity(3604, new MetaTileEntityQubitHatch(location("qubit_hatch.output.1"), 0, 1, true));
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(GregicalityScience.MODID, name);
    }
}
