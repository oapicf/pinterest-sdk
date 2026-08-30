package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemValidationEvent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing a retail item error
 */
public class CatalogsRetailItemErrorResponse   {


    /**
    * Gets or Sets catalogType
    */
    public enum CatalogTypeEnum {
        RETAIL("RETAIL");

        private String value;

        CatalogTypeEnum(String value) {
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
        public static CatalogTypeEnum fromValue(String text) {
            for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private CatalogTypeEnum catalogType;
    private List<@Valid ItemValidationEvent> errors = new ArrayList<>();
    private String itemId;

    /**
    * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    */
    public enum ItemResponseKindEnum {
        RETAIL_ITEM_ERROR("retail_item_error");

        private String value;

        ItemResponseKindEnum(String value) {
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
        public static ItemResponseKindEnum fromValue(String text) {
            for (ItemResponseKindEnum b : ItemResponseKindEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ItemResponseKindEnum itemResponseKind;

    /**
     * Default constructor.
     */
    public CatalogsRetailItemErrorResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailItemErrorResponse.
     *
     * @param catalogType catalogType
     * @param errors Array with the errors for the item id requested
     * @param itemId The catalog item id in the merchant namespace
     * @param itemResponseKind Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
     */
    public CatalogsRetailItemErrorResponse(
        CatalogTypeEnum catalogType, 
        List<@Valid ItemValidationEvent> errors, 
        String itemId, 
        ItemResponseKindEnum itemResponseKind
    ) {
        this.catalogType = catalogType;
        this.errors = errors;
        this.itemId = itemId;
        this.itemResponseKind = itemResponseKind;
    }



    /**
     * Get catalogType
     * @return catalogType
     */
    public CatalogTypeEnum getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * Array with the errors for the item id requested
     * @return errors
     */
    public List<@Valid ItemValidationEvent> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid ItemValidationEvent> errors) {
        this.errors = errors;
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
     * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
     * @return itemResponseKind
     */
    public ItemResponseKindEnum getItemResponseKind() {
        return itemResponseKind;
    }

    public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
        this.itemResponseKind = itemResponseKind;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailItemErrorResponse {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
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

