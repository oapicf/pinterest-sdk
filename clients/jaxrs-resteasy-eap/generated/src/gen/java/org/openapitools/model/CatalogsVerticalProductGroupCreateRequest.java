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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupCreateRequest;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsHotelProductGroupCreateRequest;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsRetailProductGroupCreateRequest;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Request object for creating a catalog based product group.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupCreateRequest.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelProductGroupCreateRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailProductGroupCreateRequest.class, name = "RETAIL"),
})

public class CatalogsVerticalProductGroupCreateRequest   {
  

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
  private String name;
  private String description;
  private CatalogsCreativeAssetsProductGroupFilters filters;
  private String catalogId;
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
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
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
    CatalogsVerticalProductGroupCreateRequest catalogsVerticalProductGroupCreateRequest = (CatalogsVerticalProductGroupCreateRequest) o;
    return Objects.equals(this.catalogType, catalogsVerticalProductGroupCreateRequest.catalogType) &&
        Objects.equals(this.name, catalogsVerticalProductGroupCreateRequest.name) &&
        Objects.equals(this.description, catalogsVerticalProductGroupCreateRequest.description) &&
        Objects.equals(this.filters, catalogsVerticalProductGroupCreateRequest.filters) &&
        Objects.equals(this.catalogId, catalogsVerticalProductGroupCreateRequest.catalogId) &&
        Objects.equals(this.country, catalogsVerticalProductGroupCreateRequest.country) &&
        Objects.equals(this.locale, catalogsVerticalProductGroupCreateRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name, description, filters, catalogId, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalProductGroupCreateRequest {\n");
    
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

