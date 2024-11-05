package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsLocale;
import com.prokarma.pkmst.model.CatalogsProductGroupFiltersRequest;
import com.prokarma.pkmst.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request object for creating a product group.
 */
@ApiModel(description = "Request object for creating a product group.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailProductGroupCreateRequest   {
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

  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("locale")
  private CatalogsLocale locale;

  public CatalogsRetailProductGroupCreateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   * @return catalogType
   */
  @ApiModelProperty(required = true, value = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailProductGroupCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsRetailProductGroupCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsRetailProductGroupCreateRequest filters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  public CatalogsRetailProductGroupCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the retail product group.
   * @return catalogId
   */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the retail product group.")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailProductGroupCreateRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CatalogsRetailProductGroupCreateRequest locale(CatalogsLocale locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  @ApiModelProperty(required = true, value = "")
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
    CatalogsRetailProductGroupCreateRequest catalogsRetailProductGroupCreateRequest = (CatalogsRetailProductGroupCreateRequest) o;
    return Objects.equals(this.catalogType, catalogsRetailProductGroupCreateRequest.catalogType) &&
        Objects.equals(this.name, catalogsRetailProductGroupCreateRequest.name) &&
        Objects.equals(this.description, catalogsRetailProductGroupCreateRequest.description) &&
        Objects.equals(this.filters, catalogsRetailProductGroupCreateRequest.filters) &&
        Objects.equals(this.catalogId, catalogsRetailProductGroupCreateRequest.catalogId) &&
        Objects.equals(this.country, catalogsRetailProductGroupCreateRequest.country) &&
        Objects.equals(this.locale, catalogsRetailProductGroupCreateRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, name, description, filters, catalogId, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroupCreateRequest {\n");
    
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

