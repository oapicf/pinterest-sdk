package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.Country;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request object to list products for a given retail catalog_id and product group filter.
 */

@Schema(name = "CatalogsRetailListProductsByCatalogBasedFilterRequest", description = "Request object to list products for a given retail catalog_id and product group filter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailListProductsByCatalogBasedFilterRequest implements CatalogsVerticalsListProductsByCatalogBasedFilterRequest {

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

  private CatalogTypeEnum catalogType;

  private String catalogId;

  private CatalogsProductGroupFilters filters;

  private Country country;

  private CatalogsLocale locale;

  public CatalogsRetailListProductsByCatalogBasedFilterRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest(CatalogTypeEnum catalogType, String catalogId, CatalogsProductGroupFilters filters, Country country, CatalogsLocale locale) {
    this.catalogType = catalogType;
    this.catalogId = catalogId;
    this.filters = filters;
    this.country = country;
    this.locale = locale;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", description = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the retail product group.
   * @return catalogId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", example = "2680059592705", description = "Catalog id pertaining to the retail product group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @NotNull @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filters")
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @NotNull @Valid 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest locale(CatalogsLocale locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  @NotNull @Valid 
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locale")
  public CatalogsLocale getLocale() {
    return locale;
  }

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
    CatalogsRetailListProductsByCatalogBasedFilterRequest catalogsRetailListProductsByCatalogBasedFilterRequest = (CatalogsRetailListProductsByCatalogBasedFilterRequest) o;
    return Objects.equals(this.catalogType, catalogsRetailListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(this.catalogId, catalogsRetailListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(this.filters, catalogsRetailListProductsByCatalogBasedFilterRequest.filters) &&
        Objects.equals(this.country, catalogsRetailListProductsByCatalogBasedFilterRequest.country) &&
        Objects.equals(this.locale, catalogsRetailListProductsByCatalogBasedFilterRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, catalogId, filters, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailListProductsByCatalogBasedFilterRequest {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

