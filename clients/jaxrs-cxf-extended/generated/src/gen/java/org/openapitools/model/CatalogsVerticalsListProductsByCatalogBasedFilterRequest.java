package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsHotelListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsRetailListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelListProductsByCatalogBasedFilterRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailListProductsByCatalogBasedFilterRequest.class, name = "RETAIL"),
})

/**
 * Request object to list products for a given catalog_id and product group filter.
 */
@ApiModel(description="Request object to list products for a given catalog_id and product group filter.")

public class CatalogsVerticalsListProductsByCatalogBasedFilterRequest  {
  
public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));

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

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

 /**
  * Catalog id pertaining to the creative assets product group.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the creative assets product group.")
  private String catalogId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsCreativeAssetsProductGroupFilters filters;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsLocale locale;
 /**
  * Get catalogType
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
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Catalog id pertaining to the creative assets product group.
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
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  @NotNull
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest filters(CatalogsCreativeAssetsProductGroupFilters filters) {
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
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest country(Country country) {
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
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest locale(CatalogsLocale locale) {
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
    CatalogsVerticalsListProductsByCatalogBasedFilterRequest catalogsVerticalsListProductsByCatalogBasedFilterRequest = (CatalogsVerticalsListProductsByCatalogBasedFilterRequest) o;
    return Objects.equals(this.catalogType, catalogsVerticalsListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(this.catalogId, catalogsVerticalsListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(this.filters, catalogsVerticalsListProductsByCatalogBasedFilterRequest.filters) &&
        Objects.equals(this.country, catalogsVerticalsListProductsByCatalogBasedFilterRequest.country) &&
        Objects.equals(this.locale, catalogsVerticalsListProductsByCatalogBasedFilterRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, catalogId, filters, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalsListProductsByCatalogBasedFilterRequest {\n");
    
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

