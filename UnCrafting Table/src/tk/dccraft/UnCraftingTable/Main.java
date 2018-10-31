package tk.dccraft.UnCraftingTable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("all")
public class Main extends JavaPlugin implements Listener {
	public static final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	public static String prefix = "[UnCft] ";
	public static Inventory inventory;
	public static ItemStack d = new ItemStack(Material.BARRIER, 1);
	public static ArrayList<UncraftRecipe> recipes = new ArrayList();
	public static ArrayList<String> playersInTable = new ArrayList();

	public void onDisable() {
		int r = new Random().nextInt(5);
		switch (r) {
		case 0:
			logger.info(prefix + "Goodbye.");
			break;
		case 1:
			logger.info(prefix + "Shutting down.");
			break;
		case 2:
			logger.info(prefix + "I dont hate you.");
			break;
		case 3:
			logger.info(prefix + "No hard feelings.");
			break;
		case 4:
			logger.info(prefix + "Sleep mode activated.");
			break;
		case 5:
			logger.info(prefix + "Are you still there?");
		}
	}

	public void onEnable() {
		initializeItems();
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new UncraftManager(), this);
		new UncraftingRecipes();
		UncraftingRecipes.initializeRecipes();
		int r = new Random().nextInt(5);
		switch (r) {
		case 0:
			logger.info(prefix + "Hellooo.");
			break;
		case 1:
			logger.info(prefix + "Sentry mode activated.");
			break;
		case 2:
			logger.info(prefix + "There you are.");
			break;
		case 3:
			logger.info(prefix + "I see you.");
			break;
		case 4:
			logger.info(prefix + "Could you come over here?");
			break;
		case 5:
			logger.info(prefix + "Who are you?");
		}
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				Collection<? extends Player> arrayOfPlayer;
				for (Player p : Bukkit.getOnlinePlayers()) {
					Main.this.runEffectChecker(p);
					if (Main.playersInTable.contains(p.getName())) {
						UncraftManager.runUnCraft(Main.inventory);
					}
				}
			}
		}, 1L, 1L);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player p = (Player) sender;
		if (commandLabel.equalsIgnoreCase("uncft")) {
			PluginDescriptionFile pdf = getDescription();
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "UnCft" + ChatColor.GOLD + "]" + ChatColor.DARK_AQUA + " Uncrafting Table V" + pdf.getVersion() + " developed by Drew Chase (A.k.a dcman58).");
		}
		return false;
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent evt) {
		Player p = evt.getPlayer();
		if ((evt.getClickedBlock() != null) && (evt.getClickedBlock().getType() == Material.CRAFTING_TABLE) && (evt.getAction() == Action.RIGHT_CLICK_BLOCK) && (isUncraftingTable(evt.getClickedBlock()))) {
			evt.setCancelled(true);
			openUT(p);
			playersInTable.add(p.getName());
		}
	}

	@EventHandler
	public void onPlayerCloseInventory(InventoryCloseEvent evt) {
		playersInTable.remove(evt.getPlayer().getName());
		if ((evt.getInventory().getTitle() != null) && (evt.getInventory().getTitle().equals(inventory.getName()))) {
			ItemStack[] arrayOfItemStack;
			int j = (arrayOfItemStack = evt.getInventory().getContents()).length;
			for (int i = 0; i < j; i++) {
				ItemStack item = arrayOfItemStack[i];
				if ((item != null) && (!item.isSimilar(d))) {
					Item localItem = evt.getPlayer().getWorld().dropItem(evt.getPlayer().getLocation(), item);
				}
			}
		}
	}

	public void runEffectChecker(Player p) {
		int range = 20;
		Location loc = p.getLocation();
		int x_start = loc.getBlockX() - range / 2;
		int y_start = loc.getBlockY() - range / 2;
		int z_start = loc.getBlockZ() - range / 2;

		int x_length = x_start + range;
		int y_length = y_start + range;
		int z_length = z_start + range;
		for (int x_operate = x_start; x_operate <= x_length; x_operate++) {
			for (int y_operate = y_start; y_operate <= y_length; y_operate++) {
				for (int z_operate = z_start; z_operate <= z_length; z_operate++) {
					Block blockToChange = loc.getWorld().getBlockAt(x_operate, y_operate, z_operate);
					Block b = blockToChange;
					if (isUncraftingTable(b)) {
						int r = new Random().nextInt(8);
						if (r == 2) {
							p.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 2004);
						}
					}
				}
			}
		}
	}

	public static boolean isUncraftingTable(Block b) {
		boolean isUT = false;
		if ((b.getType() == Material.CRAFTING_TABLE) && (b.getLocation().add(0.0D, -1.0D, 0.0D).getBlock().getType() == Material.DIAMOND_BLOCK)) {
			isUT = true;
		}
		if (isUT) {
			return true;
		}
		return false;
	}

	public void initializeItems() {
		inventory = Bukkit.createInventory(null, 45, "Uncrafting");
		ItemMeta mitem = d.getItemMeta();
		mitem.setDisplayName(" ");
		d.setItemMeta(mitem);
	}

	public void openUT(Player p) {
		inventory = Bukkit.createInventory(p, 45, "Uncrafting");
		for (int i = 0; i < 45; i++) {
			if ((i != 19) && (i != 12) && (i != 13) && (i != 14) && (i != 12) && (i != 21) && (i != 22) && (i != 23) && (i != 25) && (i != 30) && (i != 31) && (i != 32)) {
				inventory.setItem(i, d);
			}
		}
		p.openInventory(inventory);
	}
}
