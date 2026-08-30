package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */
public class ItemIdStoreCodePair   {

    private String itemId;
    private String storeCode;

    /**
     * Default constructor.
     */
    public ItemIdStoreCodePair() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemIdStoreCodePair.
     *
     * @param itemId Catalog item id in the merchant namespace
     * @param storeCode Store code for the local inventory item
     */
    public ItemIdStoreCodePair(
        String itemId, 
        String storeCode
    ) {
        this.itemId = itemId;
        this.storeCode = storeCode;
    }



    /**
     * Catalog item id in the merchant namespace
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Store code for the local inventory item
     * @return storeCode
     */
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemIdStoreCodePair {\n");
        
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
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

