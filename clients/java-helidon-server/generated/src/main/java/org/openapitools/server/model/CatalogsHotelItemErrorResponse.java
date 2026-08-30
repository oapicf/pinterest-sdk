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
 * Object describing a hotel item error
 */
public class CatalogsHotelItemErrorResponse   {


    /**
    * Gets or Sets catalogType
    */
    public enum CatalogTypeEnum {
        HOTEL("HOTEL");

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
    private String hotelId;

    /**
    * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    */
    public enum ItemResponseKindEnum {
        HOTEL_ITEM_ERROR("hotel_item_error");

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
    public CatalogsHotelItemErrorResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelItemErrorResponse.
     *
     * @param catalogType catalogType
     * @param errors Array with the errors for the item id requested
     * @param hotelId The catalog hotel id in the merchant namespace
     * @param itemResponseKind Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
     */
    public CatalogsHotelItemErrorResponse(
        CatalogTypeEnum catalogType, 
        List<@Valid ItemValidationEvent> errors, 
        String hotelId, 
        ItemResponseKindEnum itemResponseKind
    ) {
        this.catalogType = catalogType;
        this.errors = errors;
        this.hotelId = hotelId;
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
     * The catalog hotel id in the merchant namespace
     * @return hotelId
     */
    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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
        sb.append("class CatalogsHotelItemErrorResponse {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

