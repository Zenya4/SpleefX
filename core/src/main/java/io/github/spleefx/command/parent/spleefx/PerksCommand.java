/*
 * * Copyright 2019-2020 github.com/ReflxctionDev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.spleefx.command.parent.spleefx;

import io.github.spleefx.SpleefX;
import io.github.spleefx.command.core.CommandCallback;
import io.github.spleefx.command.core.CommandContext;
import io.github.spleefx.command.core.PluginSubcommand;
import io.github.spleefx.perk.PerkShop.ShopMenu;
import org.bukkit.permissions.PermissionDefault;

@PluginSubcommand(
        name = "perks",
        permission = "spleefx.perks.shop",
        permissionAccess = PermissionDefault.TRUE,
        description = "Opens the perks GUI",
        requirePlayer = true
)
public class PerksCommand implements CommandCallback {

    /**
     * Invoked when the command is processed
     *
     * @param context Context of the command (data)
     */
    @Override
    public void onProcess(CommandContext context) {
        context.player().openInventory(new ShopMenu(SpleefX.getPerkShop()).createInventory());
    }
}
