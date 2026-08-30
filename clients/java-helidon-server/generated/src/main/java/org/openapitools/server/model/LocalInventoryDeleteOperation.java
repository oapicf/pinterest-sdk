package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Delete operation for local inventory item
 */
public class LocalInventoryDeleteOperation   {

    private String itemId;

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        DELETE("DELETE");

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
    public LocalInventoryDeleteOperation() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalInventoryDeleteOperation.
     *
     * @param itemId Catalog item id in the merchant namespace
     * @param operation operation
     * @param storeCode Store code for the local inventory item
     */
    public LocalInventoryDeleteOperation(
        String itemId, 
        OperationEnum operation, 
        String storeCode
    ) {
        this.itemId = itemId;
        this.operation = operation;
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
        sb.append("class LocalInventoryDeleteOperation {\n");
        
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

