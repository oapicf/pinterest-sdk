package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.model.CatalogsVerticalProductGroupUpdateRequest;
import org.openapitools.model.Country;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BulkUpsertRequestUpdateCatalogProductGroupsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsCreativeAssetsProductGroupFilters filters;

  /**
   * boolean indicator of whether the product group is being featured or not
   */
  @JsonProperty("is_featured")
  private Boolean isFeatured;

  /**
   * Name of catalog product group
   */
  @JsonProperty("name")
  private String name;

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
   * Name of catalog product group
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    BulkUpsertRequestUpdateCatalogProductGroupsItems bulkUpsertRequestUpdateCatalogProductGroupsItems = (BulkUpsertRequestUpdateCatalogProductGroupsItems) o;
    return Objects.equals(this.description, bulkUpsertRequestUpdateCatalogProductGroupsItems.description) &&
        Objects.equals(this.filters, bulkUpsertRequestUpdateCatalogProductGroupsItems.filters) &&
        Objects.equals(this.isFeatured, bulkUpsertRequestUpdateCatalogProductGroupsItems.isFeatured) &&
        Objects.equals(this.name, bulkUpsertRequestUpdateCatalogProductGroupsItems.name) &&
        Objects.equals(this.catalogType, bulkUpsertRequestUpdateCatalogProductGroupsItems.catalogType) &&
        Objects.equals(this.country, bulkUpsertRequestUpdateCatalogProductGroupsItems.country) &&
        Objects.equals(this.locale, bulkUpsertRequestUpdateCatalogProductGroupsItems.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, filters, isFeatured, name, catalogType, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertRequestUpdateCatalogProductGroupsItems {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
