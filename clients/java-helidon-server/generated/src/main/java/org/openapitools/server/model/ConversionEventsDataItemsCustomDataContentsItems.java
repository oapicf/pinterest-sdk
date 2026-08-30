package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionEventsDataItemsCustomDataContentsItems   {

    private String id;
    private String itemBrand;
    private String itemBrandId;
    private String itemCategory;
    private String itemName;
    private String itemPrice;
    private Long quantity;

    /**
     * Default constructor.
     */
    public ConversionEventsDataItemsCustomDataContentsItems() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventsDataItemsCustomDataContentsItems.
     *
     * @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @param itemBrand The brand of a product.
     * @param itemBrandId The brand ID of a product.
     * @param itemCategory The category of a product.
     * @param itemName The name of a product.
     * @param itemPrice The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     */
    public ConversionEventsDataItemsCustomDataContentsItems(
        String id, 
        String itemBrand, 
        String itemBrandId, 
        String itemCategory, 
        String itemName, 
        String itemPrice, 
        Long quantity
    ) {
        this.id = id;
        this.itemBrand = itemBrand;
        this.itemBrandId = itemBrandId;
        this.itemCategory = itemCategory;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }



    /**
     * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The brand of a product.
     * @return itemBrand
     */
    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    /**
     * The brand ID of a product.
     * @return itemBrandId
     */
    public String getItemBrandId() {
        return itemBrandId;
    }

    public void setItemBrandId(String itemBrandId) {
        this.itemBrandId = itemBrandId;
    }

    /**
     * The category of a product.
     * @return itemCategory
     */
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    /**
     * The name of a product.
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @return itemPrice
     */
    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
     * @return quantity
     */
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionEventsDataItemsCustomDataContentsItems {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    itemBrand: ").append(toIndentedString(itemBrand)).append("\n");
        sb.append("    itemBrandId: ").append(toIndentedString(itemBrandId)).append("\n");
        sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
        sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
        sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

