package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsHotelListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsRetailListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object to list products for a given catalog_id and product group filter.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Request object to list products for a given catalog_id and product group filter.")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelListProductsByCatalogBasedFilterRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailListProductsByCatalogBasedFilterRequest.class, name = "RETAIL"),
})

public class CatalogsVerticalsListProductsByCatalogBasedFilterRequest   {
  

public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


    private String value;

    CatalogTypeEnum(String v) {
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

  private CatalogTypeEnum catalogType;

  private String catalogId;

  private CatalogsCreativeAssetsProductGroupFilters filters;

  private Country country;

  private CatalogsLocale locale;

  /**
   **/
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }


  /**
   * Catalog id pertaining to the creative assets product group.
   **/
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the creative assets product group.")
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  /**
   **/
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest filters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  @NotNull
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }


  /**
   **/
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }


  /**
   **/
  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest locale(CatalogsLocale locale) {
    this.locale = locale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locale")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

