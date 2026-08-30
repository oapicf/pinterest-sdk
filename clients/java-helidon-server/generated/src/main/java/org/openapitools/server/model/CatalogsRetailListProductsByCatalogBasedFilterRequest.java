package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsLocale;
import org.openapitools.server.model.CatalogsProductGroupFilters;
import org.openapitools.server.model.Country;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object to list products for a given retail catalog_id and product group filter.
 */
public class CatalogsRetailListProductsByCatalogBasedFilterRequest   {

    private String catalogId;

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
    private CatalogsProductGroupFilters filters;
    private CatalogsLocale locale;

    /**
     * Default constructor.
     */
    public CatalogsRetailListProductsByCatalogBasedFilterRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailListProductsByCatalogBasedFilterRequest.
     *
     * @param catalogId Catalog ID pertaining to the product group.
     * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @param country country
     * @param filters filters
     * @param locale locale
     */
    public CatalogsRetailListProductsByCatalogBasedFilterRequest(
        String catalogId, 
        CatalogTypeEnum catalogType, 
        Country country, 
        CatalogsProductGroupFilters filters, 
        CatalogsLocale locale
    ) {
        this.catalogId = catalogId;
        this.catalogType = catalogType;
        this.country = country;
        this.filters = filters;
        this.locale = locale;
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
     * Get filters
     * @return filters
     */
    public CatalogsProductGroupFilters getFilters() {
        return filters;
    }

    public void setFilters(CatalogsProductGroupFilters filters) {
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailListProductsByCatalogBasedFilterRequest {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

