package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.UpdatableItemAttributes;
import org.openapitools.server.model.UpdateMaskFieldType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An item to be updated
 */
public class CatalogsUpdateRetailItem   {

    private UpdatableItemAttributes attributes;
    private String itemId;

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        UPDATE("UPDATE");

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static OperationEnum fromValue(String text) {
            for (OperationEnum b : OperationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private OperationEnum operation;
    private List<UpdateMaskFieldType> updateMask;

    /**
     * Default constructor.
     */
    public CatalogsUpdateRetailItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsUpdateRetailItem.
     *
     * @param attributes attributes
     * @param itemId The catalog item id in the merchant namespace
     * @param operation operation
     * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     */
    public CatalogsUpdateRetailItem(
        UpdatableItemAttributes attributes, 
        String itemId, 
        OperationEnum operation, 
        List<UpdateMaskFieldType> updateMask
    ) {
        this.attributes = attributes;
        this.itemId = itemId;
        this.operation = operation;
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
     * Get operation
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
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
        sb.append("class CatalogsUpdateRetailItem {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

