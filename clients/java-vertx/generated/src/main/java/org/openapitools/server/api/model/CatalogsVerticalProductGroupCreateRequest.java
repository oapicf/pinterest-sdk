package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupCreateRequest;
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.server.api.model.CatalogsHotelProductGroupCreateRequest;
import org.openapitools.server.api.model.CatalogsLocale;
import org.openapitools.server.api.model.CatalogsRetailProductGroupCreateRequest;
import org.openapitools.server.api.model.Country;

/**
 * Request object for creating a catalog based product group.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsVerticalProductGroupCreateRequest   {
  


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
  private String name;
  private String description;
  private CatalogsCreativeAssetsProductGroupFilters filters;
  private String catalogId;
  private Country country;
  private CatalogsLocale locale;

  public CatalogsVerticalProductGroupCreateRequest () {

  }

  public CatalogsVerticalProductGroupCreateRequest (CatalogTypeEnum catalogType, String name, String description, CatalogsCreativeAssetsProductGroupFilters filters, String catalogId, Country country, CatalogsLocale locale) {
    this.catalogType = catalogType;
    this.name = name;
    this.description = description;
    this.filters = filters;
    this.catalogId = catalogId;
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

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("filters")
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
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
    CatalogsVerticalProductGroupCreateRequest catalogsVerticalProductGroupCreateRequest = (CatalogsVerticalProductGroupCreateRequest) o;
    return Objects.equals(catalogType, catalogsVerticalProductGroupCreateRequest.catalogType) &&
        Objects.equals(name, catalogsVerticalProductGroupCreateRequest.name) &&
        Objects.equals(description, catalogsVerticalProductGroupCreateRequest.description) &&
        Objects.equals(filters, catalogsVerticalProductGroupCreateRequest.filters) &&
        Objects.equals(catalogId, catalogsVerticalProductGroupCreateRequest.catalogId) &&
        Objects.equals(country, catalogsVerticalProductGroupCreateRequest.country) &&
        Objects.equals(locale, catalogsVerticalProductGroupCreateRequest.locale);
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
