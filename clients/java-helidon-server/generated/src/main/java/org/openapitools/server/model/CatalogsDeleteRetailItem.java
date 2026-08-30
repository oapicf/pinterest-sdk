package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An item to be deleted
 */
public class CatalogsDeleteRetailItem   {

    private String itemId;
    private Long lastUpdatedTime;

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

    /**
     * Default constructor.
     */
    public CatalogsDeleteRetailItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsDeleteRetailItem.
     *
     * @param itemId The catalog item id in the merchant namespace
     * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
     * @param operation operation
     */
    public CatalogsDeleteRetailItem(
        String itemId, 
        Long lastUpdatedTime, 
        OperationEnum operation
    ) {
        this.itemId = itemId;
        this.lastUpdatedTime = lastUpdatedTime;
        this.operation = operation;
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
     * The millisecond timestamp when the item was lastly modified by the merchant.
     * @return lastUpdatedTime
     */
    public Long getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsDeleteRetailItem {\n");
        
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

