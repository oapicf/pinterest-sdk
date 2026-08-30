package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupCreateRequest;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.server.model.CatalogsHotelProductGroupCreateRequest;
import org.openapitools.server.model.CatalogsLocale;
import org.openapitools.server.model.CatalogsRetailProductGroupCreateRequest;
import org.openapitools.server.model.Country;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object for creating a catalog based product group.
 */
public class CatalogsVerticalProductGroupCreateRequest   {

    private String catalogId;

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
    private Country country;
    private String description;
    private CatalogsCreativeAssetsProductGroupFilters filters;
    private CatalogsLocale locale;
    private String name;

    /**
     * Default constructor.
     */
    public CatalogsVerticalProductGroupCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsVerticalProductGroupCreateRequest.
     *
     * @param catalogId Catalog ID pertaining to the product group.
     * @param catalogType catalogType
     * @param country country
     * @param description description
     * @param filters filters
     * @param locale locale
     * @param name name
     */
    public CatalogsVerticalProductGroupCreateRequest(
        String catalogId, 
        CatalogTypeEnum catalogType, 
        Country country, 
        String description, 
        CatalogsCreativeAssetsProductGroupFilters filters, 
        CatalogsLocale locale, 
        String name
    ) {
        this.catalogId = catalogId;
        this.catalogType = catalogType;
        this.country = country;
        this.description = description;
        this.filters = filters;
        this.locale = locale;
        this.name = name;
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
     * Get country
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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
    public CatalogsCreativeAssetsProductGroupFilters getFilters() {
        return filters;
    }

    public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
        this.filters = filters;
    }

    /**
     * Get locale
     * @return locale
     */
    public CatalogsLocale getLocale() {
        return locale;
    }

    public void setLocale(CatalogsLocale locale) {
        this.locale = locale;
    }

    /**
     * Get name
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
        sb.append("class CatalogsVerticalProductGroupCreateRequest {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

