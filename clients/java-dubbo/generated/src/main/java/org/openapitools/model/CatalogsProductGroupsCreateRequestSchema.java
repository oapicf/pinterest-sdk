package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupCreateRequest;
import org.openapitools.model.CatalogsVerticalProductGroupCreateRequest;
import org.openapitools.model.Country;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsProductGroupsCreateRequestSchema implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("description")
  private String description;

  /**
   * Catalog Feed id pertaining to the catalog product group.
   */
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsCreativeAssetsProductGroupFilters filters;

  /**
   * boolean indicator of whether the product group is being featured or not
   */
  @JsonProperty("is_featured")
  private Boolean isFeatured;

  @JsonProperty("name")
  private String name;

  /**
   * Catalog ID pertaining to the product group.
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("locale")
  private CatalogsLocale locale;

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Catalog Feed id pertaining to the catalog product group.
   * @return feedId
   */
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * 
   * @return filters
   */
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
   */
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Catalog ID pertaining to the product group.
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * 
   * @return country
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * 
   * @return locale
   */
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
    CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema = (CatalogsProductGroupsCreateRequestSchema) o;
    return Objects.equals(this.description, catalogsProductGroupsCreateRequestSchema.description) &&
        Objects.equals(this.feedId, catalogsProductGroupsCreateRequestSchema.feedId) &&
        Objects.equals(this.filters, catalogsProductGroupsCreateRequestSchema.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupsCreateRequestSchema.isFeatured) &&
        Objects.equals(this.name, catalogsProductGroupsCreateRequestSchema.name) &&
        Objects.equals(this.catalogId, catalogsProductGroupsCreateRequestSchema.catalogId) &&
        Objects.equals(this.catalogType, catalogsProductGroupsCreateRequestSchema.catalogType) &&
        Objects.equals(this.country, catalogsProductGroupsCreateRequestSchema.country) &&
        Objects.equals(this.locale, catalogsProductGroupsCreateRequestSchema.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feedId, filters, isFeatured, name, catalogId, catalogType, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsCreateRequestSchema {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
