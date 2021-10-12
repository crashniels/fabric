/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
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

package net.fabricmc.fabric.impl.client.rendering;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;

import net.fabricmc.fabric.api.client.rendering.v1.item.ItemCooldownOverlayInfo;
import net.fabricmc.fabric.api.client.rendering.v1.item.ItemDamageBarInfo;
import net.fabricmc.fabric.api.client.rendering.v1.item.ItemLabelInfo;
import net.fabricmc.fabric.api.client.rendering.v1.item.ItemOverlayRenderer;
import net.minecraft.item.Item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class ItemOverlayMaps {
	private ItemOverlayMaps() { }

	// The FabricMC Group is not responsible for any damages caused by directly mutating the following maps.
	// (use ItemOverlayRendererRegistry)

	public static final Reference2ObjectOpenHashMap<Item, ItemLabelInfo> LABEL_INFO_MAP
			= new Reference2ObjectOpenHashMap<>();
	public static final Reference2ObjectOpenHashMap<Item, ItemDamageBarInfo> DAMAGE_BAR_INFO_MAP
			= new Reference2ObjectOpenHashMap<>();
	public static final Reference2ObjectOpenHashMap<Item, ItemCooldownOverlayInfo> COOLDOWN_OVERLAY_INFO_MAP
			= new Reference2ObjectOpenHashMap<>();
	public static final Reference2ObjectOpenHashMap<Item, ItemOverlayRenderer.Pre> PRE_RENDERER_MAP
			= new Reference2ObjectOpenHashMap<>();
	public static final Reference2ObjectOpenHashMap<Item, ItemOverlayRenderer.Post> POST_RENDERER_MAP
			= new Reference2ObjectOpenHashMap<>();
}
