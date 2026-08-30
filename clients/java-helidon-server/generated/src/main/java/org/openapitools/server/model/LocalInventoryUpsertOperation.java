package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RetailLocalInventoryItemAttributes;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Upsert operation for local inventory item
 */
public class LocalInventoryUpsertOperation   {

    private RetailLocalInventoryItemAttributes attributes;
    private String itemId;

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        UPSERT("UPSERT");

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
    private String storeCode;

    /**
     * Default constructor.
     */
    public LocalInventoryUpsertOperation() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalInventoryUpsertOperation.
     *
     * @param attributes attributes
     * @param itemId Catalog item id in the merchant namespace
     * @param operation operation
     * @param storeCode Store code for the local inventory item
     */
    public LocalInventoryUpsertOperation(
        RetailLocalInventoryItemAttributes attributes, 
        String itemId, 
        OperationEnum operation, 
        String storeCode
    ) {
        this.attributes = attributes;
        this.itemId = itemId;
        this.operation = operation;
        this.storeCode = storeCode;
    }



    /**
     * Get attributes
     * @return attributes
     */
    public RetailLocalInventoryItemAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(RetailLocalInventoryItemAttributes attributes) {
        this.attributes = attributes;
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
        sb.append("class LocalInventoryUpsertOperation {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

