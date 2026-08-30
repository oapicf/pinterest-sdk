package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing an item batch record to discontinue items
 */
public class ItemDeleteDiscontinuedBatchRecord   {

    private String itemId;

    /**
     * Default constructor.
     */
    public ItemDeleteDiscontinuedBatchRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemDeleteDiscontinuedBatchRecord.
     *
     * @param itemId The catalog item id in the merchant namespace
     */
    public ItemDeleteDiscontinuedBatchRecord(
        String itemId
    ) {
        this.itemId = itemId;
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
        sb.append("class ItemDeleteDiscontinuedBatchRecord {\n");
        
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

