/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.Country;



/**
 * Request object to list products for a given retail catalog_id and product group filter.
 */

@ApiModel(description = "Request object to list products for a given retail catalog_id and product group filter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailListProductsByCatalogBasedFilterRequest   {
  


  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private String catalogId;
  private CatalogsProductGroupFilters filters;
  private Country country;
  private CatalogsLocale locale;

  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Catalog id pertaining to the retail product group.
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the retail product group.")
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest locale(CatalogsLocale locale) {
    this.locale = locale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(catalogType, catalogsRetailListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(catalogId, catalogsRetailListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(filters, catalogsRetailListProductsByCatalogBasedFilterRequest.filters) &&
        Objects.equals(country, catalogsRetailListProductsByCatalogBasedFilterRequest.country) &&
        Objects.equals(locale, catalogsRetailListProductsByCatalogBasedFilterRequest.locale);
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

