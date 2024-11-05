package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.model.Country;



/**
 * Request object for updating a retail product group.
 **/

@ApiModel(description = "Request object for updating a retail product group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailProductGroupUpdateRequest   {
  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsProductGroupFiltersRequest filters;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("locale")
  private CatalogsLocale locale;

  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   **/
  public CatalogsRetailProductGroupUpdateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(value = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsRetailProductGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsRetailProductGroupUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

  
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
  public CatalogsRetailProductGroupUpdateRequest filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  /**
   **/
  public CatalogsRetailProductGroupUpdateRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public CatalogsRetailProductGroupUpdateRequest locale(CatalogsLocale locale) {
    this.locale = locale;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    CatalogsRetailProductGroupUpdateRequest catalogsRetailProductGroupUpdateRequest = (CatalogsRetailProductGroupUpdateRequest) o;
    return Objects.equals(catalogType, catalogsRetailProductGroupUpdateRequest.catalogType) &&
        Objects.equals(name, catalogsRetailProductGroupUpdateRequest.name) &&
        Objects.equals(description, catalogsRetailProductGroupUpdateRequest.description) &&
        Objects.equals(filters, catalogsRetailProductGroupUpdateRequest.filters) &&
        Objects.equals(country, catalogsRetailProductGroupUpdateRequest.country) &&
        Objects.equals(locale, catalogsRetailProductGroupUpdateRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name, description, filters, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroupUpdateRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

