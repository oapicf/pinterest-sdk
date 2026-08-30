package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsLocale;
import org.openapitools.server.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.server.model.Country;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object for updating a retail product group.
 */
public class CatalogsRetailProductGroupUpdateRequest   {


    /**
    * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
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
    private Country country;
    private String description;
    private CatalogsProductGroupFiltersRequest filters;
    private CatalogsLocale locale;
    private String name;

    /**
     * Default constructor.
     */
    public CatalogsRetailProductGroupUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailProductGroupUpdateRequest.
     *
     * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @param country country
     * @param description description
     * @param filters filters
     * @param locale locale
     * @param name Name of catalog product group
     */
    public CatalogsRetailProductGroupUpdateRequest(
        CatalogTypeEnum catalogType, 
        Country country, 
        String description, 
        CatalogsProductGroupFiltersRequest filters, 
        CatalogsLocale locale, 
        String name
    ) {
        this.catalogType = catalogType;
        this.country = country;
        this.description = description;
        this.filters = filters;
        this.locale = locale;
        this.name = name;
    }



    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
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
    public CatalogsProductGroupFiltersRequest getFilters() {
        return filters;
    }

    public void setFilters(CatalogsProductGroupFiltersRequest filters) {
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
        sb.append("class CatalogsRetailProductGroupUpdateRequest {\n");
        
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

