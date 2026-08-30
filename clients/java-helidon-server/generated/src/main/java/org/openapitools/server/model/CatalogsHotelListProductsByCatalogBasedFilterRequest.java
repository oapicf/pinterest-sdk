package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsHotelProductGroupFilters;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object to list products for a given hotel catalog_id and product group filter.
 */
public class CatalogsHotelListProductsByCatalogBasedFilterRequest   {

    private String catalogId;

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
    private CatalogsHotelProductGroupFilters filters;

    /**
     * Default constructor.
     */
    public CatalogsHotelListProductsByCatalogBasedFilterRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelListProductsByCatalogBasedFilterRequest.
     *
     * @param catalogId Catalog ID pertaining to the product group.
     * @param catalogType catalogType
     * @param filters filters
     */
    public CatalogsHotelListProductsByCatalogBasedFilterRequest(
        String catalogId, 
        CatalogTypeEnum catalogType, 
        CatalogsHotelProductGroupFilters filters
    ) {
        this.catalogId = catalogId;
        this.catalogType = catalogType;
        this.filters = filters;
    }



    /**
     * Catalog ID pertaining to the product group.
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
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
     * Get filters
     * @return filters
     */
    public CatalogsHotelProductGroupFilters getFilters() {
        return filters;
    }

    public void setFilters(CatalogsHotelProductGroupFilters filters) {
        this.filters = filters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelListProductsByCatalogBasedFilterRequest {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

