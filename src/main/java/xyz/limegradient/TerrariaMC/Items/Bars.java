package xyz.limegradient.TerrariaMC.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.List;

import static xyz.limegradient.TerrariaMC.TerrariaMC.ITEM_GROUP;

public class Bars {
    public static final Item AdamantiteBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item ChlorophyteBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item CobaltBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item CopperBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item CrimtaneBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item DemoniteBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item GoldBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item HallowedBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item HellstoneBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item IronBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item LeadBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item LuminiteBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item MeteoriteBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item OrichalcumBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item PalladiumBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item ShroomiteBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item SilverBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item SpectreBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item TinBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item TitaniumBar = new Item(new FabricItemSettings().maxCount(9999));
    public static final Item TungstenBar = new Item(new FabricItemSettings().maxCount(9999));

    public static void RegisterItems() {
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "adamantite"), AdamantiteBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "chlorophyte"), ChlorophyteBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "cobalt"), CobaltBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "copper"), CopperBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "crimtane"), CrimtaneBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "demonite"), DemoniteBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "gold"), GoldBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "hallowed"), HallowedBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "hellstone"), HellstoneBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "iron"), IronBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "lead"), LeadBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "luminite"), LuminiteBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "meteorite"), MeteoriteBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "orichalcum"), OrichalcumBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "palladium"), PalladiumBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "shroomite"), ShroomiteBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "silver"), SilverBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "spectre"), SpectreBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "tin"), TinBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "titanium"), TitaniumBar);
        Registry.register(Registries.ITEM, new Identifier("terrariamc", "tungsten"), TungstenBar);

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.add(AdamantiteBar);
            content.add(ChlorophyteBar);
            content.add(CobaltBar);
            content.add(CopperBar);
            content.add(CrimtaneBar);
            content.add(DemoniteBar);
            content.add(GoldBar);
            content.add(HallowedBar);
            content.add(HellstoneBar);
            content.add(IronBar);
            content.add(LeadBar);
            content.add(LuminiteBar);
            content.add(MeteoriteBar);
            content.add(OrichalcumBar);
            content.add(PalladiumBar);
            content.add(ShroomiteBar);
            content.add(SilverBar);
            content.add(SpectreBar);
            content.add(TinBar);
            content.add(TitaniumBar);
            content.add(TungstenBar);
        });
    }
}
