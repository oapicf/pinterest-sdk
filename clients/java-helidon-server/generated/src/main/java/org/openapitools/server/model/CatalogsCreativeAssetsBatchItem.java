package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsCreateCreativeAssetsItem;
import org.openapitools.server.model.CatalogsDeleteCreativeAssetsItem;
import org.openapitools.server.model.CatalogsUpdatableCreativeAssetsAttributes;
import org.openapitools.server.model.CatalogsUpdateCreativeAssetsItem;
import org.openapitools.server.model.CatalogsUpsertCreativeAssetsItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Creative assets batch item
 */
public class CatalogsCreativeAssetsBatchItem   {

    private CatalogsUpdatableCreativeAssetsAttributes attributes;
    private String creativeAssetsId;

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
    public CatalogsCreativeAssetsBatchItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsBatchItem.
     *
     * @param attributes attributes
     * @param creativeAssetsId The catalog creative assets id in the merchant namespace
     * @param operation operation
     */
    public CatalogsCreativeAssetsBatchItem(
        CatalogsUpdatableCreativeAssetsAttributes attributes, 
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
    public CatalogsUpdatableCreativeAssetsAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
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
        sb.append("class CatalogsCreativeAssetsBatchItem {\n");
        
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

