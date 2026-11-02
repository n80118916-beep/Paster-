package revival;

import net.fabricmc.api.ModInitializer;
import revival.modules.ModuleManager;
import revival.ui.clickgui.SearchGui;

public class Revival implements ModInitializer {
    public static Revival INSTANCE;
    public ModuleManager modManager;
    public SearchGui searchBar;
    
    @Override
    public void onInitialize() {
        INSTANCE = this;
        modManager = new ModuleManager();
        searchBar = new SearchGui();
    }
    public ModuleManager getModuleCollection() { return modManager; }
    public SearchGui getSearchBar() { return searchBar; }
}
