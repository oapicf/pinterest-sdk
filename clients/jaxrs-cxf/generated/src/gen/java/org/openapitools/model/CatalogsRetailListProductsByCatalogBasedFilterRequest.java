package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request object to list products for a given retail catalog_id and product group filter.
 **/
@ApiModel(description="Request object to list products for a given retail catalog_id and product group filter.")

public class CatalogsRetailListProductsByCatalogBasedFilterRequest  {
  
public enum CatalogTypeEnum {

RETAIL(String.valueOf("RETAIL"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(required = true, value = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
 /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  **/
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the retail product group.")
 /**
   * Catalog id pertaining to the retail product group.
  **/
  private String catalogId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupFilters filters;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsLocale locale;
 /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Catalog id pertaining to the retail product group.
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Get locale
   * @return locale
  **/
  @JsonProperty("locale")
  @NotNull
  public CatalogsLocale getLocale() {
    return locale;
  }

  public void setLocale(CatalogsLocale locale) {
    this.locale = locale;
  }

  public CatalogsRetailListProductsByCatalogBasedFilterRequest locale(CatalogsLocale locale) {
    this.locale = locale;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

