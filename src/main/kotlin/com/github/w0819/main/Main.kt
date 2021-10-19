package com.github.w0819.main

import com.github.w0819.Item
import com.github.w0819.event.Event
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(){
    override fun onEnable() {
        server.pluginManager.registerEvents(Event(),this)
        recipe()
        server.logger.info("Recipe is onEnable")
    }
    override fun onDisable() {
        server.logger.info("Recipe is onDisable")
    }
    private fun recipe() {
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("notch_apple"),
                Item.notchApple
            ).apply {
                shape("111","121","111")
                setIngredient('1', Material.GOLD_BLOCK)
                setIngredient('2', Material.APPLE)
            }
        )
        server.addRecipe(
        ShapedRecipe (
        NamespacedKey.minecraft("dragon_sword"),
        Item.dragon_sword
        ).apply {
            shape(
                " 1 ",
                " 2 ",
                "313"
            )
            setIngredient('1',Material.OBSIDIAN)
            setIngredient('2',Material.DIAMOND_SWORD)
            setIngredient('3',Material.BLAZE_POWDER)
            }
        )
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("golden_head"),
                Item.golden_head
            ).apply {
                shape(
                    "111",
                    "121",
                    "111"
                )
                setIngredient('1', ItemStack(Material.GOLD_INGOT,2))
                setIngredient('2', Material.PLAYER_HEAD)
            }
        )
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("iron_bundle"),
                ItemStack(Material.IRON_INGOT,8)
            ).apply {
                shape(
                    "111",
                    "121",
                    "111"
                )
                setIngredient('1', Material.IRON_ORE)
                setIngredient('2', Material.COAL)
            }
        )
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("gold_bundle"),
                ItemStack(Material.GOLD_INGOT,8)
            ).apply {
                shape(
                    "111",
                    "121",
                    "111"
                )
                setIngredient('1',Material.GOLD_ORE)
                setIngredient('2',Material.COAL)
            }
        )
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("apprentice_helmet"),
                Item.apprentice_Helmet
            ).apply {
                shape(
                    "111",
                    "121"
                )
                setIngredient('1',Material.IRON_INGOT)
                setIngredient('2',Material.IRON_HELMET)
            }
        )
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("apprentice_bow"),
                Item.apprentice_Bow
            ).apply {
                shape(
                    " 12",
                    "1 2",
                    " 12"
                )
                setIngredient('1',Material.REDSTONE_TORCH)
                setIngredient('2',Material.STRING)
            }
        )
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("new_apple"),
                ItemStack(Material.GOLDEN_APPLE)
            ).apply {
                shape(
                    " 1 ",
                    "121",
                    " 1 "
                )
                setIngredient('1',Material.GOLD_INGOT)
                setIngredient('2',Material.APPLE)
            }
        )
        server.addRecipe(
            ShapedRecipe(
            NamespacedKey.minecraft("eve_is_temptation"),
            ItemStack(Material.APPLE,2)
            ).apply {
                shape(
                    "   ",
                    " 1 ",
                    " 2 "
                )
                setIngredient('1',Material.BONE_MEAL)
                setIngredient('2',Material.APPLE)
            }
        )
        server.addRecipe(
            ShapedRecipe(
                NamespacedKey.minecraft("tarnhelm"),
                Item.tarnhelm
            ).apply {
                shape(
                    "121",
                    "131",
                    "   "
                )
                setIngredient('1',Material.DIAMOND)
                setIngredient('2',Material.IRON_INGOT)
                setIngredient('3',Material.REDSTONE_BLOCK)
            }
        )
    }
}