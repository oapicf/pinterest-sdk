/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.model.Country;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Request object for creating a product group.
 */
@JsonPropertyOrder({
  CatalogsRetailProductGroupCreateRequest.JSON_PROPERTY_CATALOG_TYPE,
  CatalogsRetailProductGroupCreateRequest.JSON_PROPERTY_NAME,
  CatalogsRetailProductGroupCreateRequest.JSON_PROPERTY_DESCRIPTION,
  CatalogsRetailProductGroupCreateRequest.JSON_PROPERTY_FILTERS,
  CatalogsRetailProductGroupCreateRequest.JSON_PROPERTY_CATALOG_ID,
  CatalogsRetailProductGroupCreateRequest.JSON_PROPERTY_COUNTRY,
  CatalogsRetailProductGroupCreateRequest.JSON_PROPERTY_LOCALE
})
@JsonTypeName("CatalogsRetailProductGroupCreateRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsRetailProductGroupCreateRequest {
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
        public static CatalogTypeEnum fromValue(String value) {
            for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_CATALOG_TYPE = "catalog_type";
    private CatalogTypeEnum catalogType;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_FILTERS = "filters";
    private CatalogsProductGroupFiltersRequest filters;

    public static final String JSON_PROPERTY_CATALOG_ID = "catalog_id";
    private String catalogId;

    public static final String JSON_PROPERTY_COUNTRY = "country";
    private Country country;

    public static final String JSON_PROPERTY_LOCALE = "locale";
    private CatalogsLocale locale;

    public CatalogsRetailProductGroupCreateRequest(CatalogTypeEnum catalogType, String name, CatalogsProductGroupFiltersRequest filters, String catalogId, Country country, CatalogsLocale locale) {
        this.catalogType = catalogType;
        this.name = name;
        this.filters = filters;
        this.catalogId = catalogId;
        this.country = country;
        this.locale = locale;
    }

    public CatalogsRetailProductGroupCreateRequest catalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @return catalogType
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogTypeEnum getCatalogType() {
        return catalogType;
    }

    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCatalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
    }

    public CatalogsRetailProductGroupCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public CatalogsRetailProductGroupCreateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogsRetailProductGroupCreateRequest filters(CatalogsProductGroupFiltersRequest filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get filters
     * @return filters
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_FILTERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsProductGroupFiltersRequest getFilters() {
        return filters;
    }

    @JsonProperty(JSON_PROPERTY_FILTERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFilters(CatalogsProductGroupFiltersRequest filters) {
        this.filters = filters;
    }

    public CatalogsRetailProductGroupCreateRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Catalog id pertaining to the retail product group.
     * @return catalogId
     */
    @NotNull
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_CATALOG_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCatalogId() {
        return catalogId;
    }

    @JsonProperty(JSON_PROPERTY_CATALOG_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public CatalogsRetailProductGroupCreateRequest country(Country country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     * @return country
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Country getCountry() {
        return country;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCountry(Country country) {
        this.country = country;
    }

    public CatalogsRetailProductGroupCreateRequest locale(CatalogsLocale locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     * @return locale
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_LOCALE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsLocale getLocale() {
        return locale;
    }

    @JsonProperty(JSON_PROPERTY_LOCALE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLocale(CatalogsLocale locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsRetailProductGroupCreateRequest catalogsRetailProductGroupCreateRequest = (CatalogsRetailProductGroupCreateRequest) o;
        return Objects.equals(this.catalogType, catalogsRetailProductGroupCreateRequest.catalogType) &&
            Objects.equals(this.name, catalogsRetailProductGroupCreateRequest.name) &&
            Objects.equals(this.description, catalogsRetailProductGroupCreateRequest.description) &&
            Objects.equals(this.filters, catalogsRetailProductGroupCreateRequest.filters) &&
            Objects.equals(this.catalogId, catalogsRetailProductGroupCreateRequest.catalogId) &&
            Objects.equals(this.country, catalogsRetailProductGroupCreateRequest.country) &&
            Objects.equals(this.locale, catalogsRetailProductGroupCreateRequest.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogType, name, description, filters, catalogId, country, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailProductGroupCreateRequest {\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

