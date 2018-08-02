package tk.dccraft.UnCraftingTable;

import java.io.PrintStream;
import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class UncraftingRecipes {
	public static void initializeRecipes() {
		UncraftRecipe brickBlock = new UncraftRecipe(new ItemStack(Material.BRICK, 1), Material.CLAY_BRICK, Material.CLAY_BRICK, Material.AIR, Material.CLAY_BRICK, Material.CLAY_BRICK, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe clayBlock = new UncraftRecipe(new ItemStack(Material.CLAY, 1), Material.CLAY_BALL, Material.CLAY_BALL, Material.AIR, Material.CLAY_BALL, Material.CLAY_BALL, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe diamondBlock = new UncraftRecipe(new ItemStack(Material.IRON_BLOCK, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe glowstoneBlock = new UncraftRecipe(new ItemStack(Material.GLOWSTONE, 1), Material.GLOWSTONE_DUST, Material.GLOWSTONE_DUST, Material.AIR, Material.GLOWSTONE_DUST, Material.GLOWSTONE_DUST, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe goldBlock = new UncraftRecipe(new ItemStack(Material.GOLD_BLOCK, 1), Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT);
		UncraftRecipe ironBlock = new UncraftRecipe(new ItemStack(Material.IRON_BLOCK, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);

		UncraftRecipe melonBlock = new UncraftRecipe(new ItemStack(Material.MELON_BLOCK, 1), Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON);
		UncraftRecipe sandstoneBlock = new UncraftRecipe(new ItemStack(Material.SANDSTONE, 1), Material.SAND, Material.SAND, Material.AIR, Material.SAND, Material.SAND, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe snowBlock = new UncraftRecipe(new ItemStack(Material.SNOW_BLOCK, 1), Material.SNOW_BALL, Material.SNOW_BALL, Material.AIR, Material.SNOW_BALL, Material.SNOW_BALL, Material.AIR, Material.AIR, Material.AIR, Material.AIR);

		UncraftRecipe tnt = new UncraftRecipe(new ItemStack(Material.TNT, 1), Material.SULPHUR, Material.SAND, Material.SULPHUR, Material.SAND, Material.SULPHUR, Material.SAND, Material.SULPHUR, Material.SAND, Material.SULPHUR);
		UncraftRecipe woodPlank = new UncraftRecipe(new ItemStack(Material.WOOD, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.LOG, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe bed = new UncraftRecipe(new ItemStack(Material.BED, 1), Material.AIR, Material.AIR, Material.AIR, Material.WOOL, Material.WOOL, Material.WOOL, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe bookshelf = new UncraftRecipe(new ItemStack(Material.BOOKSHELF, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.BOOK, Material.BOOK, Material.BOOK, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe ironDoor = new UncraftRecipe(new ItemStack(Material.IRON_DOOR, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR);
		UncraftRecipe woodDoor = new UncraftRecipe(new ItemStack(Material.WOOD_DOOR, 1), Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR);
		UncraftRecipe netherBrickFence = new UncraftRecipe(new ItemStack(Material.NETHER_FENCE, 6), Material.AIR, Material.AIR, Material.AIR, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK);
		UncraftRecipe woodFence = new UncraftRecipe(new ItemStack(Material.FENCE, 2), Material.AIR, Material.AIR, Material.AIR, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.STICK);
		UncraftRecipe fenceGate = new UncraftRecipe(new ItemStack(Material.FENCE_GATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.STICK, Material.WOOD, Material.STICK, Material.STICK, Material.WOOD, Material.STICK);

		UncraftRecipe jackOLantern = new UncraftRecipe(new ItemStack(Material.JACK_O_LANTERN, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.PUMPKIN, Material.AIR, Material.AIR, Material.TORCH, Material.AIR);
		UncraftRecipe jukebox = new UncraftRecipe(new ItemStack(Material.JUKEBOX, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.IRON_INGOT, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe ladder = new UncraftRecipe(new ItemStack(Material.LADDER, 3), Material.STICK, Material.AIR, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.AIR, Material.STICK);
		UncraftRecipe noteBlock = new UncraftRecipe(new ItemStack(Material.NOTE_BLOCK, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.REDSTONE, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe painting = new UncraftRecipe(new ItemStack(Material.PAINTING, 1), Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.WOOL, Material.STICK, Material.STICK, Material.STICK, Material.STICK);
		UncraftRecipe sign = new UncraftRecipe(new ItemStack(Material.SIGN, 3), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.AIR, Material.STICK, Material.AIR);

		UncraftRecipe trapdoor = new UncraftRecipe(new ItemStack(Material.TRAP_DOOR, 2), Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);

		UncraftRecipe bowl = new UncraftRecipe(new ItemStack(Material.BOWL, 4), Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.WOOD, Material.AIR, Material.WOOD, Material.AIR);
		UncraftRecipe bread = new UncraftRecipe(new ItemStack(Material.BREAD, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.WHEAT, Material.WHEAT, Material.WHEAT);
		UncraftRecipe cake = new UncraftRecipe(new ItemStack(Material.CAKE, 1), Material.AIR, Material.AIR, Material.AIR, Material.SUGAR, Material.EGG, Material.SUGAR, Material.WHEAT, Material.WHEAT, Material.WHEAT);

		UncraftRecipe melonSeeds = new UncraftRecipe(new ItemStack(Material.MELON_SEEDS, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.MELON, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe mushroomStew = new UncraftRecipe(new ItemStack(Material.MUSHROOM_SOUP, 1), Material.AIR, Material.RED_MUSHROOM, Material.AIR, Material.AIR, Material.BROWN_MUSHROOM, Material.AIR, Material.AIR, Material.BOWL, Material.AIR);
		UncraftRecipe pumpkinSeeds = new UncraftRecipe(new ItemStack(Material.PUMPKIN_SEEDS, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.PUMPKIN, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe sugar = new UncraftRecipe(new ItemStack(Material.SUGAR, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SUGAR_CANE, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe goldIngot = new UncraftRecipe(new ItemStack(Material.GOLD_INGOT, 1), Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET);
		UncraftRecipe blazePowder = new UncraftRecipe(new ItemStack(Material.BLAZE_POWDER, 2), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.BLAZE_ROD, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe book = new UncraftRecipe(new ItemStack(Material.BOOK, 1), Material.AIR, Material.PAPER, Material.AIR, Material.AIR, Material.PAPER, Material.AIR, Material.AIR, Material.PAPER, Material.LEATHER);
		UncraftRecipe brewingStand = new UncraftRecipe(new ItemStack(Material.BREWING_STAND_ITEM, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.BLAZE_ROD, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
		UncraftRecipe cauldron = new UncraftRecipe(new ItemStack(Material.CAULDRON_ITEM, 1), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe chest = new UncraftRecipe(new ItemStack(Material.CHEST, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe workbench = new UncraftRecipe(new ItemStack(Material.WORKBENCH, 1), Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe dispenser = new UncraftRecipe(new ItemStack(Material.DISPENSER, 1), Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.BOW, Material.COBBLESTONE, Material.COBBLESTONE, Material.REDSTONE, Material.COBBLESTONE);
		UncraftRecipe enchantingTable = new UncraftRecipe(new ItemStack(Material.ENCHANTMENT_TABLE, 1), Material.AIR, Material.BOOK, Material.AIR, Material.IRON_INGOT, Material.OBSIDIAN, Material.IRON_INGOT, Material.OBSIDIAN, Material.OBSIDIAN, Material.OBSIDIAN);
		UncraftRecipe eyeOfEnder = new UncraftRecipe(new ItemStack(Material.EYE_OF_ENDER, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.BLAZE_POWDER, Material.AIR, Material.AIR, Material.ENDER_PEARL, Material.AIR);
		UncraftRecipe fermentedSpiderEye = new UncraftRecipe(new ItemStack(Material.FERMENTED_SPIDER_EYE, 1), Material.SPIDER_EYE, Material.AIR, Material.AIR, Material.BROWN_MUSHROOM, Material.SUGAR, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe furnace = new UncraftRecipe(new ItemStack(Material.FURNACE, 1), Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
		UncraftRecipe glassBottle = new UncraftRecipe(new ItemStack(Material.GLASS_BOTTLE, 3), Material.AIR, Material.AIR, Material.AIR, Material.GLASS, Material.AIR, Material.GLASS, Material.AIR, Material.GLASS, Material.AIR);
		UncraftRecipe magmaCream = new UncraftRecipe(new ItemStack(Material.MAGMA_CREAM, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SLIME_BALL, Material.AIR, Material.AIR, Material.BLAZE_POWDER, Material.AIR);
		UncraftRecipe paper = new UncraftRecipe(new ItemStack(Material.PAPER, 3), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SUGAR_CANE, Material.SUGAR_CANE, Material.SUGAR_CANE);
		UncraftRecipe stick = new UncraftRecipe(new ItemStack(Material.STICK, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.AIR, Material.WOOD, Material.AIR);
		UncraftRecipe torch = new UncraftRecipe(new ItemStack(Material.TORCH, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.COAL, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe piston = new UncraftRecipe(new ItemStack(Material.PISTON_BASE, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.COBBLESTONE, Material.IRON_INGOT, Material.COBBLESTONE, Material.COBBLESTONE, Material.REDSTONE, Material.COBBLESTONE);
		UncraftRecipe lever = new UncraftRecipe(new ItemStack(Material.LEVER, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.COBBLESTONE, Material.AIR);
		UncraftRecipe stonePressurePlate = new UncraftRecipe(new ItemStack(Material.STONE_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.STONE, Material.AIR);
		UncraftRecipe woodPressurePlate = new UncraftRecipe(new ItemStack(Material.WOOD_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR);
		UncraftRecipe redstoneRepeater = new UncraftRecipe(new ItemStack(Material.DIODE, 1), Material.AIR, Material.AIR, Material.AIR, Material.REDSTONE_TORCH_ON, Material.REDSTONE, Material.REDSTONE_TORCH_ON, Material.STONE, Material.STONE, Material.STONE);
		UncraftRecipe stickyPiston = new UncraftRecipe(new ItemStack(Material.PISTON_STICKY_BASE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SLIME_BALL, Material.AIR, Material.AIR, Material.PISTON_BASE, Material.AIR);
		UncraftRecipe stoneButton = new UncraftRecipe(new ItemStack(Material.STONE_BUTTON, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.AIR, Material.AIR, Material.STONE, Material.AIR);
		UncraftRecipe redstoneTorch = new UncraftRecipe(new ItemStack(Material.REDSTONE_TORCH_ON, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.REDSTONE, Material.AIR, Material.AIR, Material.STICK, Material.AIR);

		UncraftRecipe bucket = new UncraftRecipe(new ItemStack(Material.BUCKET, 1), Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR);
		UncraftRecipe clock = new UncraftRecipe(new ItemStack(Material.WATCH, 1), Material.AIR, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.REDSTONE, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.AIR);
		UncraftRecipe compass = new UncraftRecipe(new ItemStack(Material.COMPASS, 1), Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.REDSTONE, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR);

		UncraftRecipe map = new UncraftRecipe(new ItemStack(Material.MAP, 1), Material.PAPER, Material.PAPER, Material.PAPER, Material.PAPER, Material.COMPASS, Material.PAPER, Material.PAPER, Material.PAPER, Material.PAPER);

		UncraftRecipe boat = new UncraftRecipe(new ItemStack(Material.BOAT, 1), Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe detectorRail = new UncraftRecipe(new ItemStack(Material.DETECTOR_RAIL, 6), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.STONE_PLATE, Material.IRON_INGOT, Material.IRON_INGOT, Material.REDSTONE, Material.IRON_INGOT);
		UncraftRecipe poweredRail = new UncraftRecipe(new ItemStack(Material.POWERED_RAIL, 6), Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.STICK, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.REDSTONE, Material.GOLD_INGOT);
		UncraftRecipe rail = new UncraftRecipe(new ItemStack(Material.RAILS, 16), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.STICK, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT);
		UncraftRecipe minecart = new UncraftRecipe(new ItemStack(Material.MINECART, 1), Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe poweredMinecart = new UncraftRecipe(new ItemStack(Material.POWERED_MINECART, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.FURNACE, Material.AIR, Material.AIR, Material.MINECART, Material.AIR);
		UncraftRecipe chestMinecart = new UncraftRecipe(new ItemStack(Material.STORAGE_MINECART, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.CHEST, Material.AIR, Material.AIR, Material.MINECART, Material.AIR);
		UncraftRecipe arrow = new UncraftRecipe(new ItemStack(Material.ARROW, 4), Material.AIR, Material.FLINT, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.FEATHER, Material.AIR);

		UncraftRecipe wool = new UncraftRecipe(new ItemStack(Material.WOOL, 1), Material.STRING, Material.STRING, Material.AIR, Material.STRING, Material.STRING, Material.AIR, Material.AIR, Material.AIR, Material.AIR);

		UncraftRecipe goldPressurePad = new UncraftRecipe(new ItemStack(Material.GOLD_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR);
		UncraftRecipe ironPressurePad = new UncraftRecipe(new ItemStack(Material.IRON_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR);

		UncraftRecipe flowerPot = new UncraftRecipe(new ItemStack(Material.FLOWER_POT_ITEM, 1), Material.AIR, Material.AIR, Material.AIR, Material.CLAY_BRICK, Material.AIR, Material.CLAY_BRICK, Material.AIR, Material.CLAY_BRICK, Material.AIR);
		UncraftRecipe itemFrame = new UncraftRecipe(new ItemStack(Material.ITEM_FRAME, 1), Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.LEATHER, Material.STICK, Material.STICK, Material.STICK, Material.STICK);

		UncraftRecipe cobblestoneWall = new UncraftRecipe(new ItemStack(Material.COBBLE_WALL, 6), Material.AIR, Material.AIR, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
		UncraftRecipe daylightSensor = new UncraftRecipe(new ItemStack(Material.DAYLIGHT_DETECTOR, 1), Material.GLASS, Material.GLASS, Material.GLASS, Material.QUARTZ, Material.QUARTZ, Material.QUARTZ, Material.WOOD_STEP, Material.WOOD_STEP, Material.WOOD_STEP);

		UncraftRecipe woodSlab = new UncraftRecipe(new ItemStack(Material.WOOD_STEP, 6), Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe woodStair = new UncraftRecipe(new ItemStack(Material.WOOD_STAIRS, 4), Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe stoneSlab = new UncraftRecipe(new ItemStack(Material.STONE_SLAB2, 6), Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.STONE, Material.STONE, Material.STONE, Material.STONE, Material.STONE);
		UncraftRecipe cobblestoneStair = new UncraftRecipe(new ItemStack(Material.COBBLESTONE_STAIRS, 4), Material.AIR, Material.AIR, Material.COBBLESTONE, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
		UncraftRecipe stoneBrick = new UncraftRecipe(new ItemStack(Material.SMOOTH_BRICK, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.STONE, Material.AIR, Material.STONE, Material.STONE);
		UncraftRecipe stoneBrickStair = new UncraftRecipe(new ItemStack(Material.SMOOTH_STAIRS, 4), Material.AIR, Material.AIR, Material.SMOOTH_BRICK, Material.AIR, Material.SMOOTH_BRICK, Material.SMOOTH_BRICK, Material.SMOOTH_BRICK, Material.SMOOTH_BRICK, Material.SMOOTH_BRICK);
		UncraftRecipe brickStair = new UncraftRecipe(new ItemStack(Material.BRICK_STAIRS, 4), Material.AIR, Material.AIR, Material.BRICK, Material.AIR, Material.BRICK, Material.BRICK, Material.BRICK, Material.BRICK, Material.BRICK);
		UncraftRecipe quartzStair = new UncraftRecipe(new ItemStack(Material.QUARTZ_STAIRS, 4), Material.AIR, Material.AIR, Material.QUARTZ_BLOCK, Material.AIR, Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK);

		UncraftRecipe magmaBlock = new UncraftRecipe(new ItemStack(Material.MAGMA, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.AIR, Material.MAGMA_CREAM, Material.MAGMA_CREAM);
		UncraftRecipe mossyCobblestone = new UncraftRecipe(new ItemStack(Material.MAGMA, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.AIR, Material.MAGMA_CREAM, Material.MAGMA_CREAM);

		// TOOLS
		UncraftRecipe diamondSword = new UncraftRecipe(new ItemStack(Material.DIAMOND_SWORD, 1), Material.AIR, Material.DIAMOND, Material.AIR, Material.AIR, Material.DIAMOND, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe diamondPickaxe = new UncraftRecipe(new ItemStack(Material.DIAMOND_PICKAXE, 1), Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe diamondSpade = new UncraftRecipe(new ItemStack(Material.DIAMOND_SPADE, 1), Material.AIR, Material.DIAMOND, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe diamondAxe = new UncraftRecipe(new ItemStack(Material.DIAMOND_AXE, 1), Material.DIAMOND, Material.DIAMOND, Material.AIR, Material.DIAMOND, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe diamondHoe = new UncraftRecipe(new ItemStack(Material.DIAMOND_HOE, 1), Material.DIAMOND, Material.DIAMOND, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);

		UncraftRecipe ironSword = new UncraftRecipe(new ItemStack(Material.IRON_SWORD, 1), Material.AIR, Material.IRON_INGOT, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe ironPickaxe = new UncraftRecipe(new ItemStack(Material.IRON_PICKAXE, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe ironSpade = new UncraftRecipe(new ItemStack(Material.IRON_SPADE, 1), Material.AIR, Material.IRON_INGOT, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe ironAxe = new UncraftRecipe(new ItemStack(Material.IRON_AXE, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe ironHoe = new UncraftRecipe(new ItemStack(Material.IRON_HOE, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);

		UncraftRecipe goldSword = new UncraftRecipe(new ItemStack(Material.GOLD_SWORD, 1), Material.AIR, Material.GOLD_INGOT, Material.AIR, Material.AIR, Material.GOLD_INGOT, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe goldPickaxe = new UncraftRecipe(new ItemStack(Material.GOLD_PICKAXE, 1), Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe goldSpade = new UncraftRecipe(new ItemStack(Material.GOLD_SPADE, 1), Material.AIR, Material.GOLD_INGOT, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe goldAxe = new UncraftRecipe(new ItemStack(Material.GOLD_AXE, 1), Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe goldHoe = new UncraftRecipe(new ItemStack(Material.GOLD_HOE, 1), Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);

		UncraftRecipe woodSword = new UncraftRecipe(new ItemStack(Material.WOOD_SWORD, 1), Material.AIR, Material.WOOD, Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe woodPickaxe = new UncraftRecipe(new ItemStack(Material.WOOD_PICKAXE, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe woodSpade = new UncraftRecipe(new ItemStack(Material.WOOD_SPADE, 1), Material.AIR, Material.WOOD, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe woodAxe = new UncraftRecipe(new ItemStack(Material.WOOD_AXE, 1), Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe woodHoe = new UncraftRecipe(new ItemStack(Material.WOOD_HOE, 1), Material.WOOD, Material.WOOD, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.STICK, Material.AIR);

		// Armor
		UncraftRecipe diamondHelm = new UncraftRecipe(new ItemStack(Material.DIAMOND_HELMET, 1), Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.AIR, Material.DIAMOND, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe diamondChest = new UncraftRecipe(new ItemStack(Material.DIAMOND_CHESTPLATE, 1), Material.DIAMOND, Material.AIR, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND);
		UncraftRecipe diamondPants = new UncraftRecipe(new ItemStack(Material.DIAMOND_LEGGINGS, 1), Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.AIR, Material.DIAMOND, Material.DIAMOND, Material.AIR, Material.DIAMOND);
		UncraftRecipe diamondBoots = new UncraftRecipe(new ItemStack(Material.DIAMOND_BOOTS, 1), Material.AIR, Material.AIR, Material.AIR, Material.DIAMOND, Material.AIR, Material.DIAMOND, Material.DIAMOND, Material.AIR, Material.DIAMOND);

		UncraftRecipe ironHelm = new UncraftRecipe(new ItemStack(Material.IRON_HELMET, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe ironChest = new UncraftRecipe(new ItemStack(Material.IRON_CHESTPLATE, 1), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe ironPants = new UncraftRecipe(new ItemStack(Material.IRON_LEGGINGS, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT);
		UncraftRecipe ironBoots = new UncraftRecipe(new ItemStack(Material.IRON_BOOTS, 1), Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT);

		UncraftRecipe goldHelm = new UncraftRecipe(new ItemStack(Material.GOLD_HELMET, 1), Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe goldChest = new UncraftRecipe(new ItemStack(Material.GOLD_CHESTPLATE, 1), Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT);
		UncraftRecipe goldPants = new UncraftRecipe(new ItemStack(Material.GOLD_LEGGINGS, 1), Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT);
		UncraftRecipe goldBoots = new UncraftRecipe(new ItemStack(Material.GOLD_BOOTS, 1), Material.AIR, Material.AIR, Material.AIR, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT);

		UncraftRecipe leatherHelm = new UncraftRecipe(new ItemStack(Material.LEATHER_HELMET, 1), Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.AIR, Material.LEATHER, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe leatherChest = new UncraftRecipe(new ItemStack(Material.LEATHER_CHESTPLATE, 1), Material.LEATHER, Material.AIR, Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.LEATHER);
		UncraftRecipe leatherPants = new UncraftRecipe(new ItemStack(Material.LEATHER_LEGGINGS, 1), Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.LEATHER, Material.AIR, Material.LEATHER, Material.LEATHER, Material.AIR, Material.LEATHER);
		UncraftRecipe leatherBoots = new UncraftRecipe(new ItemStack(Material.LEATHER_BOOTS, 1), Material.AIR, Material.AIR, Material.AIR, Material.LEATHER, Material.AIR, Material.LEATHER, Material.LEATHER, Material.AIR, Material.LEATHER);

		UncraftRecipe chainHelm = new UncraftRecipe(new ItemStack(Material.CHAINMAIL_HELMET, 1), Material.FIRE, Material.FIRE, Material.FIRE, Material.FIRE, Material.AIR, Material.FIRE, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe chainChest = new UncraftRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1), Material.FIRE, Material.AIR, Material.FIRE, Material.FIRE, Material.FIRE, Material.FIRE, Material.FIRE, Material.FIRE, Material.FIRE);
		UncraftRecipe chainPants = new UncraftRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS, 1), Material.FIRE, Material.FIRE, Material.FIRE, Material.FIRE, Material.AIR, Material.FIRE, Material.FIRE, Material.AIR, Material.FIRE);
		UncraftRecipe chainBoots = new UncraftRecipe(new ItemStack(Material.CHAINMAIL_BOOTS, 1), Material.AIR, Material.AIR, Material.AIR, Material.FIRE, Material.AIR, Material.FIRE, Material.FIRE, Material.AIR, Material.FIRE);

		UncraftRecipe hopper = new UncraftRecipe(new ItemStack(Material.HOPPER, 1), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.CHEST, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR);
		UncraftRecipe dropper = new UncraftRecipe(new ItemStack(Material.DROPPER), Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.REDSTONE, Material.COBBLESTONE);
		UncraftRecipe lead = new UncraftRecipe(new ItemStack(Material.LEASH, 2), Material.STRING, Material.STRING, Material.AIR, Material.STRING, Material.SLIME_BALL, Material.AIR, Material.AIR, Material.AIR, Material.STRING);
		UncraftRecipe slimeBlock = new UncraftRecipe(new ItemStack(Material.SLIME_BLOCK, 1), Material.SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL);
		
		
		Main.recipes.add(hopper);
		Main.recipes.add(dropper);
		Main.recipes.add(lead);
		Main.recipes.add(slimeBlock);
		
		Main.recipes.add(stoneSlab);
		Main.recipes.add(cobblestoneStair);
		Main.recipes.add(stoneBrick);
		Main.recipes.add(stoneBrickStair);
		Main.recipes.add(brickStair);
		Main.recipes.add(quartzStair);

		Main.recipes.add(woodStair);
		Main.recipes.add(woodSlab);

		Main.recipes.add(magmaBlock);
		Main.recipes.add(mossyCobblestone);

		Main.recipes.add(diamondHelm);
		Main.recipes.add(diamondChest);
		Main.recipes.add(diamondPants);
		Main.recipes.add(diamondBoots);

		Main.recipes.add(chainHelm);
		Main.recipes.add(chainChest);
		Main.recipes.add(chainPants);
		Main.recipes.add(chainBoots);

		Main.recipes.add(goldHelm);
		Main.recipes.add(goldChest);
		Main.recipes.add(goldPants);
		Main.recipes.add(goldBoots);

		Main.recipes.add(ironHelm);
		Main.recipes.add(ironChest);
		Main.recipes.add(ironPants);
		Main.recipes.add(ironBoots);

		Main.recipes.add(leatherHelm);
		Main.recipes.add(leatherChest);
		Main.recipes.add(leatherPants);
		Main.recipes.add(leatherBoots);

		Main.recipes.add(diamondAxe);
		Main.recipes.add(diamondSword);
		Main.recipes.add(diamondSpade);
		Main.recipes.add(diamondPickaxe);
		Main.recipes.add(diamondHoe);

		Main.recipes.add(ironAxe);
		Main.recipes.add(ironSword);
		Main.recipes.add(ironSpade);
		Main.recipes.add(ironPickaxe);
		Main.recipes.add(ironHoe);

		Main.recipes.add(goldAxe);
		Main.recipes.add(goldSword);
		Main.recipes.add(goldSpade);
		Main.recipes.add(goldPickaxe);
		Main.recipes.add(goldHoe);

		Main.recipes.add(woodAxe);
		Main.recipes.add(woodSword);
		Main.recipes.add(woodSpade);
		Main.recipes.add(woodPickaxe);
		Main.recipes.add(woodHoe);

		Main.recipes.add(cobblestoneWall);
		Main.recipes.add(daylightSensor);

		Main.recipes.add(brickBlock);
		Main.recipes.add(clayBlock);
		Main.recipes.add(diamondBlock);
		Main.recipes.add(glowstoneBlock);
		Main.recipes.add(goldBlock);
		Main.recipes.add(ironBlock);
		Main.recipes.add(melonBlock);
		Main.recipes.add(sandstoneBlock);
		Main.recipes.add(snowBlock);
		Main.recipes.add(tnt);
		Main.recipes.add(woodPlank);
		Main.recipes.add(bed);
		Main.recipes.add(bookshelf);
		Main.recipes.add(ironDoor);
		Main.recipes.add(woodDoor);
		Main.recipes.add(netherBrickFence);
		Main.recipes.add(woodFence);
		Main.recipes.add(fenceGate);
		Main.recipes.add(jackOLantern);
		Main.recipes.add(jukebox);
		Main.recipes.add(ladder);
		Main.recipes.add(noteBlock);
		Main.recipes.add(painting);
		Main.recipes.add(sign);
		Main.recipes.add(trapdoor);
		Main.recipes.add(bowl);
		Main.recipes.add(bread);
		Main.recipes.add(cake);
		Main.recipes.add(melonSeeds);
		Main.recipes.add(mushroomStew);
		Main.recipes.add(pumpkinSeeds);
		Main.recipes.add(sugar);
		Main.recipes.add(goldIngot);
		Main.recipes.add(blazePowder);
		Main.recipes.add(book);
		Main.recipes.add(brewingStand);
		Main.recipes.add(cauldron);
		Main.recipes.add(chest);
		Main.recipes.add(workbench);
		Main.recipes.add(dispenser);
		Main.recipes.add(enchantingTable);
		Main.recipes.add(eyeOfEnder);
		Main.recipes.add(fermentedSpiderEye);
		Main.recipes.add(furnace);
		Main.recipes.add(glassBottle);
		Main.recipes.add(magmaCream);
		Main.recipes.add(paper);
		Main.recipes.add(stick);
		Main.recipes.add(torch);
		Main.recipes.add(piston);
		Main.recipes.add(lever);
		Main.recipes.add(stonePressurePlate);
		Main.recipes.add(woodPressurePlate);
		Main.recipes.add(redstoneRepeater);
		Main.recipes.add(stickyPiston);
		Main.recipes.add(stoneButton);
		Main.recipes.add(redstoneTorch);
		Main.recipes.add(bucket);
		Main.recipes.add(clock);
		Main.recipes.add(compass);
		Main.recipes.add(map);
		Main.recipes.add(boat);
		Main.recipes.add(detectorRail);
		Main.recipes.add(poweredRail);
		Main.recipes.add(rail);
		Main.recipes.add(minecart);
		Main.recipes.add(poweredMinecart);
		Main.recipes.add(chestMinecart);
		Main.recipes.add(wool);
		Main.recipes.add(goldPressurePad);
		Main.recipes.add(ironPressurePad);
		Main.recipes.add(flowerPot);
		Main.recipes.add(itemFrame);

		Main.recipes.add(arrow);
		for (UncraftRecipe u : Main.recipes) {
			System.out.println(Main.prefix + "Loaded recipe for: " + u.getRecipe().getType().toString());
		}
	}
}
