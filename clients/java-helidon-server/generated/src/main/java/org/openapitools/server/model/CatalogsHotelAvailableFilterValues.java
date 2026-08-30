package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsHotelFilterValuesMap;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelAvailableFilterValues   {


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
    private CatalogsHotelFilterValuesMap filterValues;

    /**
     * Default constructor.
     */
    public CatalogsHotelAvailableFilterValues() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelAvailableFilterValues.
     *
     * @param catalogType catalogType
     * @param filterValues filterValues
     */
    public CatalogsHotelAvailableFilterValues(
        CatalogTypeEnum catalogType, 
        CatalogsHotelFilterValuesMap filterValues
    ) {
        this.catalogType = catalogType;
        this.filterValues = filterValues;
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
     * Get filterValues
     * @return filterValues
     */
    public CatalogsHotelFilterValuesMap getFilterValues() {
        return filterValues;
    }

    public void setFilterValues(CatalogsHotelFilterValuesMap filterValues) {
        this.filterValues = filterValues;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelAvailableFilterValues {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    filterValues: ").append(toIndentedString(filterValues)).append("\n");
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

