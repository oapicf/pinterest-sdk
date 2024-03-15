package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CatalogsHotelBatchItem;
import org.openapitools.server.api.model.CatalogsType;
import org.openapitools.server.api.model.Country;
import org.openapitools.server.api.model.Language;

/**
 * Request object to update catalogs hotel items
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelBatchRequest   {
  
  private CatalogsType catalogType;
  private Country country;
  private Language language;
  private List<CatalogsHotelBatchItem> items = new ArrayList<>();
  private String catalogId;

  public CatalogsHotelBatchRequest () {

  }

  public CatalogsHotelBatchRequest (CatalogsType catalogType, Country country, Language language, List<CatalogsHotelBatchItem> items, String catalogId) {
    this.catalogType = catalogType;
    this.country = country;
    this.language = language;
    this.items = items;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

    
  @JsonProperty("items")
  public List<CatalogsHotelBatchItem> getItems() {
    return items;
  }
  public void setItems(List<CatalogsHotelBatchItem> items) {
    this.items = items;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelBatchRequest catalogsHotelBatchRequest = (CatalogsHotelBatchRequest) o;
    return Objects.equals(catalogType, catalogsHotelBatchRequest.catalogType) &&
        Objects.equals(country, catalogsHotelBatchRequest.country) &&
        Objects.equals(language, catalogsHotelBatchRequest.language) &&
        Objects.equals(items, catalogsHotelBatchRequest.items) &&
        Objects.equals(catalogId, catalogsHotelBatchRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelBatchRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
