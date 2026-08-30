package org.openapitools.server.model;

import org.openapitools.server.model.ItemAttributesRequest;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing an item batch record to create items
 */
public class ItemCreateBatchRecord   {

    private ItemAttributesRequest attributes;
    private String itemId;

    /**
     * Default constructor.
     */
    public ItemCreateBatchRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemCreateBatchRecord.
     *
     * @param attributes attributes
     * @param itemId The catalog item id in the merchant namespace
     */
    public ItemCreateBatchRecord(
        ItemAttributesRequest attributes, 
        String itemId
    ) {
        this.attributes = attributes;
        this.itemId = itemId;
    }



    /**
     * Get attributes
     * @return attributes
     */
    public ItemAttributesRequest getAttributes() {
        return attributes;
    }

    public void setAttributes(ItemAttributesRequest attributes) {
        this.attributes = attributes;
    }

    /**
     * The catalog item id in the merchant namespace
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemCreateBatchRecord {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

