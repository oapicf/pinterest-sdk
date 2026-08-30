package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.server.model.Pin;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing a creative assets item record
 */
public class CatalogsCreativeAssetsItemResponse   {

    private CatalogsCreativeAssetsAttributes attributes;

    /**
    * Gets or Sets catalogType
    */
    public enum CatalogTypeEnum {
        CREATIVE_ASSETS("CREATIVE_ASSETS");

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
    private String creativeAssetsId;

    /**
    * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    */
    public enum ItemResponseKindEnum {
        CREATIVE_ASSETS_ITEM("creative_assets_item");

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
    public CatalogsCreativeAssetsItemResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsItemResponse.
     *
     * @param attributes attributes
     * @param catalogType catalogType
     * @param creativeAssetsId The catalog creative assets id in the merchant namespace
     * @param itemResponseKind Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
     * @param pins The pins mapped to the item
     */
    public CatalogsCreativeAssetsItemResponse(
        CatalogsCreativeAssetsAttributes attributes, 
        CatalogTypeEnum catalogType, 
        String creativeAssetsId, 
        ItemResponseKindEnum itemResponseKind, 
        List<@Valid Pin> pins
    ) {
        this.attributes = attributes;
        this.catalogType = catalogType;
        this.creativeAssetsId = creativeAssetsId;
        this.itemResponseKind = itemResponseKind;
        this.pins = pins;
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
        sb.append("class CatalogsCreativeAssetsItemResponse {\n");
        
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
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

