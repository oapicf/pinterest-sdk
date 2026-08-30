package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ItemAttributes;
import org.openapitools.server.model.Pin;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing a retail item record
 */
public class CatalogsRetailItemResponse   {

    private ItemAttributes attributes;

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
    private String itemId;

    /**
    * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    */
    public enum ItemResponseKindEnum {
        RETAIL_ITEM("retail_item");

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
    private List<@Valid Pin> pins;

    /**
     * Default constructor.
     */
    public CatalogsRetailItemResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailItemResponse.
     *
     * @param attributes attributes
     * @param catalogType catalogType
     * @param itemId The catalog retail item id in the merchant namespace
     * @param itemResponseKind Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
     * @param pins The pins mapped to the item
     */
    public CatalogsRetailItemResponse(
        ItemAttributes attributes, 
        CatalogTypeEnum catalogType, 
        String itemId, 
        ItemResponseKindEnum itemResponseKind, 
        List<@Valid Pin> pins
    ) {
        this.attributes = attributes;
        this.catalogType = catalogType;
        this.itemId = itemId;
        this.itemResponseKind = itemResponseKind;
        this.pins = pins;
    }



    /**
     * Get attributes
     * @return attributes
     */
    public ItemAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ItemAttributes attributes) {
        this.attributes = attributes;
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
     * The catalog retail item id in the merchant namespace
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
     * The pins mapped to the item
     * @return pins
     */
    public List<@Valid Pin> getPins() {
        return pins;
    }

    public void setPins(List<@Valid Pin> pins) {
        this.pins = pins;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailItemResponse {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
        sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
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

