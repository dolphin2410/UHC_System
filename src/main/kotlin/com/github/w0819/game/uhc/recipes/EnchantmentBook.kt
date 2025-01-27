package com.github.w0819.game.uhc.recipes

import com.github.w0819.game.util.Item
import com.github.w0819.game.util.uhc.UHCRecipe
import org.bukkit.Material
import org.bukkit.NamespacedKey

class EnchantmentBook : UHCRecipe(
    NamespacedKey.minecraft("enchantment_book"),
    Item.Enchantment_Book
){
    init {
        shape(
            "111",
            "232",
            "444"
        )
        setIngredient('1',Material.EXPERIENCE_BOTTLE)
        setIngredient('2',Material.IRON_AXE)
        setIngredient('3',Material.ENCHANTING_TABLE)
        setIngredient('4',Material.BOOKSHELF)
    }
}