package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CatalogsRetailBatchRequestItemsInner;
import org.openapitools.server.api.model.CatalogsType;
import org.openapitools.server.api.model.Country;
import org.openapitools.server.api.model.Language;

/**
 * A request object that can have multiple operations on a single retail batch
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailBatchRequest   {
  
  private CatalogsType catalogType;
  private Country country;
  private Language language;
  private List<CatalogsRetailBatchRequestItemsInner> items = new ArrayList<>();

  public CatalogsRetailBatchRequest () {

  }

  public CatalogsRetailBatchRequest (CatalogsType catalogType, Country country, Language language, List<CatalogsRetailBatchRequestItemsInner> items) {
    this.catalogType = catalogType;
    this.country = country;
    this.language = language;
    this.items = items;
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
  public List<CatalogsRetailBatchRequestItemsInner> getItems() {
    return items;
  }
  public void setItems(List<CatalogsRetailBatchRequestItemsInner> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailBatchRequest catalogsRetailBatchRequest = (CatalogsRetailBatchRequest) o;
    return Objects.equals(catalogType, catalogsRetailBatchRequest.catalogType) &&
        Objects.equals(country, catalogsRetailBatchRequest.country) &&
        Objects.equals(language, catalogsRetailBatchRequest.language) &&
        Objects.equals(items, catalogsRetailBatchRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, country, language, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailBatchRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
