package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsItemsPostFilters;
import org.openapitools.vertxweb.server.model.CatalogsItemsRequestLanguage;
import org.openapitools.vertxweb.server.model.Country;

/**
 * Request object of catalogs items
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsRequest   {
  
  private Country country;
  private CatalogsItemsRequestLanguage language;
  private CatalogsItemsPostFilters filters;

  public CatalogsItemsRequest () {

  }

  public CatalogsItemsRequest (Country country, CatalogsItemsRequestLanguage language, CatalogsItemsPostFilters filters) {
    this.country = country;
    this.language = language;
    this.filters = filters;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("language")
  public CatalogsItemsRequestLanguage getLanguage() {
    return language;
  }
  public void setLanguage(CatalogsItemsRequestLanguage language) {
    this.language = language;
  }

    
  @JsonProperty("filters")
  public CatalogsItemsPostFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsItemsPostFilters filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsRequest catalogsItemsRequest = (CatalogsItemsRequest) o;
    return Objects.equals(country, catalogsItemsRequest.country) &&
        Objects.equals(language, catalogsItemsRequest.language) &&
        Objects.equals(filters, catalogsItemsRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
