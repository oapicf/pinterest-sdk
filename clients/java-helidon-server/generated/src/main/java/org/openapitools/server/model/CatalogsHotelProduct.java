package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsHotelProductMetadata;
import org.openapitools.server.model.Pin;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelProduct   {


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
    private CatalogsHotelProductMetadata metadata;
    private Pin pin;

    /**
     * Default constructor.
     */
    public CatalogsHotelProduct() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelProduct.
     *
     * @param catalogType catalogType
     * @param metadata metadata
     * @param pin pin
     */
    public CatalogsHotelProduct(
        CatalogTypeEnum catalogType, 
        CatalogsHotelProductMetadata metadata, 
        Pin pin
    ) {
        this.catalogType = catalogType;
        this.metadata = metadata;
        this.pin = pin;
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
     * Get metadata
     * @return metadata
     */
    public CatalogsHotelProductMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CatalogsHotelProductMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Get pin
     * @return pin
     */
    public Pin getPin() {
        return pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelProduct {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

