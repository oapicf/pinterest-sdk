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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object to list products for a given retail catalog_id and product group filter.
 */
@ApiModel(description="Request object to list products for a given retail catalog_id and product group filter.")

public class CatalogsRetailListProductsByCatalogBasedFilterRequest  {
  
public enum CatalogTypeEnum {

    @JsonProperty("RETAIL") RETAIL(String.valueOf("RETAIL"));

    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  */
  @ApiModelProperty(required = true, value = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
  private CatalogTypeEnum catalogType;

 /**
  * Catalog id pertaining to the retail product group.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the retail product group.")
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
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Catalog id pertaining to the retail product group.
  * @return catalogId
  */
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  @NotNull
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public CatalogsRetailListProductsByCatalogBasedFilterRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get locale
  * @return locale
  */
  @JsonProperty("locale")
  @NotNull
  public CatalogsLocale getLocale() {
    return locale;
  }

  /**
   * Sets the <code>locale</code> property.
   */
 public void setLocale(CatalogsLocale locale) {
    this.locale = locale;
  }

  /**
   * Sets the <code>locale</code> property.
   */
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

