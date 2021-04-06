package fr.twitmund.ui;

import com.cryptomorin.xseries.XMaterial;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vortexcraft.net.menuapi.menu.Menu;

public class MenuP extends Menu implements Listener {

    @Override
    public String getMenuName() {
        return "§9Papy Shop";
    }

    @Override
    public int getSlots() {
        return 5*9;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getCurrentItem() == null)return;


        // Here u handle the click events, this is why its important to register the MenuListener in the main class
        if (e.getCurrentItem().getType().equals(Material.GLASS) && e.getCurrentItem().getItemMeta().getDisplayName().contentEquals("Menu 1")) {
            e.getWhoClicked().sendMessage("Hey there, this works!");
            e.setCancelled(true);
            //new AnotherMenu().open(p); // Replace AnotherMenu with any other menu name :)
        }
    }

    @Override
    public void setMenuItems() {

        setFillerGlass(); // Will set all empty slots with black stained glass! NOTE: It works on 1.8.8 - 1.16.5 and its not require to put it in here
        ItemStack tutorial = new ItemStack(Material.GLASS);// If you know how to use XMaterial, you can also use that
        ItemMeta tutom = tutorial.getItemMeta();
        tutom.setDisplayName("Menu 1");

        inventory.setItem(0, tutorial); // the inventory is very important, this will allow u to set an item in the gui

    }
}
