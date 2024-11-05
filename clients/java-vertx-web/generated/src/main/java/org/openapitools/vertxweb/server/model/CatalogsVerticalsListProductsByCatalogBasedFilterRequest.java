package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.vertxweb.server.model.CatalogsHotelListProductsByCatalogBasedFilterRequest;
import org.openapitools.vertxweb.server.model.CatalogsLocale;
import org.openapitools.vertxweb.server.model.CatalogsRetailListProductsByCatalogBasedFilterRequest;
import org.openapitools.vertxweb.server.model.Country;

/**
 * Request object to list products for a given catalog_id and product group filter.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsVerticalsListProductsByCatalogBasedFilterRequest   {
  


  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private String catalogId;
  private CatalogsCreativeAssetsProductGroupFilters filters;
  private Country country;
  private CatalogsLocale locale;

  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest () {

  }

  public CatalogsVerticalsListProductsByCatalogBasedFilterRequest (CatalogTypeEnum catalogType, String catalogId, CatalogsCreativeAssetsProductGroupFilters filters, Country country, CatalogsLocale locale) {
    this.catalogType = catalogType;
    this.catalogId = catalogId;
    this.filters = filters;
    this.country = country;
    this.locale = locale;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("filters")
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
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
    CatalogsVerticalsListProductsByCatalogBasedFilterRequest catalogsVerticalsListProductsByCatalogBasedFilterRequest = (CatalogsVerticalsListProductsByCatalogBasedFilterRequest) o;
    return Objects.equals(catalogType, catalogsVerticalsListProductsByCatalogBasedFilterRequest.catalogType) &&
        Objects.equals(catalogId, catalogsVerticalsListProductsByCatalogBasedFilterRequest.catalogId) &&
        Objects.equals(filters, catalogsVerticalsListProductsByCatalogBasedFilterRequest.filters) &&
        Objects.equals(country, catalogsVerticalsListProductsByCatalogBasedFilterRequest.country) &&
        Objects.equals(locale, catalogsVerticalsListProductsByCatalogBasedFilterRequest.locale);
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
