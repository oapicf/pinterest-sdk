package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
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
import io.swagger.annotations.*;

@ApiModel(description="Request object to list products for a given catalog_id and product group filter.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelListProductsByCatalogBasedFilterRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailListProductsByCatalogBasedFilterRequest.class, name = "RETAIL"),
})

public class CatalogsVerticalsListProductsByCatalogBasedFilterRequest   {
  

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");
    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CatalogTypeEnum catalogType;
  private String catalogId;
  private CatalogsCreativeAssetsProductGroupFilters filters;
  private Country country;
  private CatalogsLocale locale;

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filters")
  @NotNull
  @Valid
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull
  @Valid
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locale")
  @NotNull
  @Valid
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

