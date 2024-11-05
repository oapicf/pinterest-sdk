package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object for updating a retail product group.
 */
@ApiModel(description="Request object for updating a retail product group.")

public class CatalogsRetailProductGroupUpdateRequest  {
  
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
  @ApiModelProperty(value = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsProductGroupFiltersRequest filters;

  @ApiModelProperty(value = "")
  @Valid
  private Country country;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsLocale locale;
 /**
  * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  * @return catalogType
  */
  @JsonProperty("catalog_type")
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
  public CatalogsRetailProductGroupUpdateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CatalogsRetailProductGroupUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public CatalogsRetailProductGroupUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get filters
  * @return filters
  */
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
 public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  /**
   * Sets the <code>filters</code> property.
   */
  public CatalogsRetailProductGroupUpdateRequest filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
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
  public CatalogsRetailProductGroupUpdateRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get locale
  * @return locale
  */
  @JsonProperty("locale")
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
  public CatalogsRetailProductGroupUpdateRequest locale(CatalogsLocale locale) {
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
    CatalogsRetailProductGroupUpdateRequest catalogsRetailProductGroupUpdateRequest = (CatalogsRetailProductGroupUpdateRequest) o;
    return Objects.equals(this.catalogType, catalogsRetailProductGroupUpdateRequest.catalogType) &&
        Objects.equals(this.name, catalogsRetailProductGroupUpdateRequest.name) &&
        Objects.equals(this.description, catalogsRetailProductGroupUpdateRequest.description) &&
        Objects.equals(this.filters, catalogsRetailProductGroupUpdateRequest.filters) &&
        Objects.equals(this.country, catalogsRetailProductGroupUpdateRequest.country) &&
        Objects.equals(this.locale, catalogsRetailProductGroupUpdateRequest.locale);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

