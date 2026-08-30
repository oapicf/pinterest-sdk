package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsLocale;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupFiltersRequest;
import org.openapitools.vertxweb.server.model.Country;

/**
 * Request object for creating a product group.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailProductGroupCreateRequest   {
  
  private String catalogId;


  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

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
  private Country country;
  private String description;
  private CatalogsProductGroupFiltersRequest filters;
  private CatalogsLocale locale;
  private String name;

  public CatalogsRetailProductGroupCreateRequest () {

  }

  public CatalogsRetailProductGroupCreateRequest (String catalogId, CatalogTypeEnum catalogType, Country country, String description, CatalogsProductGroupFiltersRequest filters, CatalogsLocale locale, String name) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.country = country;
    this.description = description;
    this.filters = filters;
    this.locale = locale;
    this.name = name;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("filters")
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

    
  @JsonProperty("locale")
  public CatalogsLocale getLocale() {
    return locale;
  }
  public void setLocale(CatalogsLocale locale) {
    this.locale = locale;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
    return Objects.equals(catalogId, catalogsRetailProductGroupCreateRequest.catalogId) &&
        Objects.equals(catalogType, catalogsRetailProductGroupCreateRequest.catalogType) &&
        Objects.equals(country, catalogsRetailProductGroupCreateRequest.country) &&
        Objects.equals(description, catalogsRetailProductGroupCreateRequest.description) &&
        Objects.equals(filters, catalogsRetailProductGroupCreateRequest.filters) &&
        Objects.equals(locale, catalogsRetailProductGroupCreateRequest.locale) &&
        Objects.equals(name, catalogsRetailProductGroupCreateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, description, filters, locale, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroupCreateRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
