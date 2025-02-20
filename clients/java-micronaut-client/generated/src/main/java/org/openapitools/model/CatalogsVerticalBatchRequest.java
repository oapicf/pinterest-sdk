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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsBatchItem;
import org.openapitools.model.CatalogsCreativeAssetsBatchRequest;
import org.openapitools.model.CatalogsHotelBatchRequest;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.CatalogsRetailBatchRequest;
import org.openapitools.model.Country;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * A request object that can have multiple operations on a single batch
 */
@JsonPropertyOrder({
  CatalogsVerticalBatchRequest.JSON_PROPERTY_CATALOG_TYPE,
  CatalogsVerticalBatchRequest.JSON_PROPERTY_COUNTRY,
  CatalogsVerticalBatchRequest.JSON_PROPERTY_LANGUAGE,
  CatalogsVerticalBatchRequest.JSON_PROPERTY_ITEMS,
  CatalogsVerticalBatchRequest.JSON_PROPERTY_CATALOG_ID
})
@JsonTypeName("CatalogsVerticalBatchRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@JsonIgnoreProperties(
  value = "catalog_type", // ignore manually set catalog_type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the catalog_type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsBatchRequest.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelBatchRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailBatchRequest.class, name = "RETAIL"),
})

@Introspected
public class CatalogsVerticalBatchRequest {
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
    protected CatalogTypeEnum catalogType;

    public static final String JSON_PROPERTY_COUNTRY = "country";
    private Country country;

    public static final String JSON_PROPERTY_LANGUAGE = "language";
    private CatalogsItemsRequestLanguage language;

    public static final String JSON_PROPERTY_ITEMS = "items";
    private List<@Valid CatalogsCreativeAssetsBatchItem> items = new ArrayList<>();

    public static final String JSON_PROPERTY_CATALOG_ID = "catalog_id";
    private String catalogId;

    public CatalogsVerticalBatchRequest(CatalogTypeEnum catalogType, Country country, CatalogsItemsRequestLanguage language, List<@Valid CatalogsCreativeAssetsBatchItem> items) {
        this.catalogType = catalogType;
        this.country = country;
        this.language = language;
        this.items = items;
    }

    public CatalogsVerticalBatchRequest catalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    /**
     * Get catalogType
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

    public CatalogsVerticalBatchRequest country(Country country) {
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

    public CatalogsVerticalBatchRequest language(CatalogsItemsRequestLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsItemsRequestLanguage getLanguage() {
        return language;
    }

    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLanguage(CatalogsItemsRequestLanguage language) {
        this.language = language;
    }

    public CatalogsVerticalBatchRequest items(List<@Valid CatalogsCreativeAssetsBatchItem> items) {
        this.items = items;
        return this;
    }

    public CatalogsVerticalBatchRequest addItemsItem(CatalogsCreativeAssetsBatchItem itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Array with creative assets item operations
     * @return items
     */
    @NotNull
    @Size(min=1, max=1000)
    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid CatalogsCreativeAssetsBatchItem> getItems() {
        return items;
    }

    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setItems(List<@Valid CatalogsCreativeAssetsBatchItem> items) {
        this.items = items;
    }

    public CatalogsVerticalBatchRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
     * @return catalogId
     */
    @Nullable
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_CATALOG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCatalogId() {
        return catalogId;
    }

    @JsonProperty(JSON_PROPERTY_CATALOG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsVerticalBatchRequest catalogsVerticalBatchRequest = (CatalogsVerticalBatchRequest) o;
        return Objects.equals(this.catalogType, catalogsVerticalBatchRequest.catalogType) &&
            Objects.equals(this.country, catalogsVerticalBatchRequest.country) &&
            Objects.equals(this.language, catalogsVerticalBatchRequest.language) &&
            Objects.equals(this.items, catalogsVerticalBatchRequest.items) &&
            Objects.equals(this.catalogId, catalogsVerticalBatchRequest.catalogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogType, country, language, items, catalogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsVerticalBatchRequest {\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

