package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsHotelProductGroupFilters;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object for updating a hotel product group.
 */
public class CatalogsHotelProductGroupUpdateRequest   {


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
    private String description;
    private CatalogsHotelProductGroupFilters filters;
    private String name;

    /**
     * Default constructor.
     */
    public CatalogsHotelProductGroupUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelProductGroupUpdateRequest.
     *
     * @param catalogType catalogType
     * @param description description
     * @param filters filters
     * @param name Name of catalog product group
     */
    public CatalogsHotelProductGroupUpdateRequest(
        CatalogTypeEnum catalogType, 
        String description, 
        CatalogsHotelProductGroupFilters filters, 
        String name
    ) {
        this.catalogType = catalogType;
        this.description = description;
        this.filters = filters;
        this.name = name;
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
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
     * Name of catalog product group
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelProductGroupUpdateRequest {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

