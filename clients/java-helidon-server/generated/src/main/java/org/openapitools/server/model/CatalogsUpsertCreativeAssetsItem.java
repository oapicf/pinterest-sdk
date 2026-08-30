package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsCreativeAssetsAttributes;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A creative assets item to be upserted.
 */
public class CatalogsUpsertCreativeAssetsItem   {

    private CatalogsCreativeAssetsAttributes attributes;
    private String creativeAssetsId;

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

    /**
     * Default constructor.
     */
    public CatalogsUpsertCreativeAssetsItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsUpsertCreativeAssetsItem.
     *
     * @param attributes attributes
     * @param creativeAssetsId The catalog creative assets id in the merchant namespace
     * @param operation operation
     */
    public CatalogsUpsertCreativeAssetsItem(
        CatalogsCreativeAssetsAttributes attributes, 
        String creativeAssetsId, 
        OperationEnum operation
    ) {
        this.attributes = attributes;
        this.creativeAssetsId = creativeAssetsId;
        this.operation = operation;
    }



    /**
     * Get attributes
     * @return attributes
     */
    public CatalogsCreativeAssetsAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * The catalog creative assets id in the merchant namespace
     * @return creativeAssetsId
     */
    public String getCreativeAssetsId() {
        return creativeAssetsId;
    }

    public void setCreativeAssetsId(String creativeAssetsId) {
        this.creativeAssetsId = creativeAssetsId;
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
        sb.append("class CatalogsUpsertCreativeAssetsItem {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
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

