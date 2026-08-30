package org.openapitools.model;

import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.Country;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object to list products for a given retail catalog_id and product group filter.
 */
public class CatalogsRetailListProductsByCatalogBasedFilterRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog ID pertaining to the product group.
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  /**
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
   */
  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  @JsonProperty("locale")
  private CatalogsLocale locale;

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
   * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
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
   * @return filters
   */
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
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
    CatalogsRetailListProductsByCatalogBasedFilterRequest catalogsRetailListProductsByCatalogBasedFilterRequest = (CatalogsRetailListProductsByCatalogBasedFilterRequest) o;
    return Objects.equals(this.catalogId, catalogsRetailListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsRetailListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(this.country, catalogsRetailListProductsByCatalogBasedFilterRequest.country) &&
        Objects.equals(this.filters, catalogsRetailListProductsByCatalogBasedFilterRequest.filters) &&
        Objects.equals(this.locale, catalogsRetailListProductsByCatalogBasedFilterRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, filters, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailListProductsByCatalogBasedFilterRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
