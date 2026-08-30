package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.UpdatableItemAttributes;
import org.openapitools.server.model.UpdateMaskFieldType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing an item batch record to update items
 */
public class ItemUpdateBatchRecord   {

    private UpdatableItemAttributes attributes;
    private String itemId;
    private List<UpdateMaskFieldType> updateMask;

    /**
     * Default constructor.
     */
    public ItemUpdateBatchRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemUpdateBatchRecord.
     *
     * @param attributes attributes
     * @param itemId The catalog item id in the merchant namespace
     * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     */
    public ItemUpdateBatchRecord(
        UpdatableItemAttributes attributes, 
        String itemId, 
        List<UpdateMaskFieldType> updateMask
    ) {
        this.attributes = attributes;
        this.itemId = itemId;
        this.updateMask = updateMask;
    }



    /**
     * Get attributes
     * @return attributes
     */
    public UpdatableItemAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(UpdatableItemAttributes attributes) {
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
     * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     * @return updateMask
     */
    public List<UpdateMaskFieldType> getUpdateMask() {
        return updateMask;
    }

    public void setUpdateMask(List<UpdateMaskFieldType> updateMask) {
        this.updateMask = updateMask;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemUpdateBatchRecord {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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

