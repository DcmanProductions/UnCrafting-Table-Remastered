package tk.dccraft.UnCraftingTable;

import java.util.ArrayList;
import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_13_R2.inventory.CraftShapedRecipe;
import org.bukkit.craftbukkit.v1_13_R2.inventory.CraftShapelessRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

@SuppressWarnings("all")
public class UncraftingRecipes {

	public static ArrayList<ItemStack> getItemsFromRecipe(Recipe sr) {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		if (sr instanceof CraftShapedRecipe) {
			for (ItemStack is : ((CraftShapedRecipe) sr).getIngredientMap().values()) {
				items.add(is);
			}
		} else if (sr instanceof CraftShapelessRecipe) {
			for (ItemStack is : ((CraftShapelessRecipe) sr).getIngredientList()) {
				items.add(is);
			}
		}
		return items;
	}

	public static void initializeRecipes() {
		Iterator<Recipe> recipeIterator = Bukkit.recipeIterator();
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();

		while (recipeIterator.hasNext()) {
			Recipe recipe = recipeIterator.next();
			recipes.add(recipe);
			items.add(recipe.getResult());
		}

		ArrayList<Material> m = new ArrayList<Material>();

		for (int i = 0; i < recipes.size(); i++) {

			for (int j = 0; j < getItemsFromRecipe(recipes.get(i)).size(); j++) {
				try {
					m.add(j, getItemsFromRecipe(recipes.get(i)).get(j).getType());
				} catch (Exception e) {
					m.add(Material.AIR);
				}
			}

			while (m.size() < 9) {
				m.add(Material.AIR);
			}

			UncraftRecipe itemUnRecipe = new UncraftRecipe(items.get(i), m.get(0), m.get(1), m.get(2), m.get(3), m.get(4), m.get(5), m.get(6), m.get(7), m.get(8));
			Main.recipes.add(itemUnRecipe);
			m.clear();
		}

//		for (UncraftRecipe u : Main.recipes) {
//			System.out.println(Main.prefix + "Loaded recipe for: " + u.getRecipe().getType().toString());
//		}
	}

}
