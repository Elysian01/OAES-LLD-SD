package org.assessment.itemHandler;

public class ItemFactory extends Item{
    public static Item getItem(String itemName) {
        if (itemName.equalsIgnoreCase("MCQ")) {
            return new MCQItem();
        } else if (itemName.equalsIgnoreCase("DESCRIPTIVE")) {
            return new DescriptiveItem();
        }
        throw new IllegalArgumentException("Invalid item type: " + itemName);
    }
}
