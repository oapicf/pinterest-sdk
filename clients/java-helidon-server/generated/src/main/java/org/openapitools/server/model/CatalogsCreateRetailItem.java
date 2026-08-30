package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ItemAttributesRequest;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An item to be created
 */
public class CatalogsCreateRetailItem   {

    private ItemAttributesRequest attributes;
    private String itemId;

    /**
    * Gets or Sets operation
    */
    public enum OperationEnum {
        CREATE("CREATE");

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
    public CatalogsCreateRetailItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreateRetailItem.
     *
     * @param attributes attributes
     * @param itemId The catalog item id in the merchant namespace
     * @param operation operation
     */
    public CatalogsCreateRetailItem(
        ItemAttributesRequest attributes, 
        String itemId, 
        OperationEnum operation
    ) {
        this.attributes = attributes;
        this.itemId = itemId;
        this.operation = operation;
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
        sb.append("class CatalogsCreateRetailItem {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

