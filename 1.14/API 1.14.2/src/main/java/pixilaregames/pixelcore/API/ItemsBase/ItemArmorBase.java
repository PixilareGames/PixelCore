package pixilaregames.pixelcore.API.ItemsBase;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;

public class ItemArmorBase extends ArmorItem
{

	public ItemArmorBase(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}
}
