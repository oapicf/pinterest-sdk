package org.openapitools.model;

import org.openapitools.model.CatalogsItemsPostFilters;
import org.openapitools.model.Country;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object of catalogs items
 */
public class CatalogsItemsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("filters")
  private CatalogsItemsPostFilters filters;

  /**
   * We recommend using the CatalogsLocale values.
   */
  @JsonProperty("language")
  private String language;

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
  public CatalogsItemsPostFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsItemsPostFilters filters) {
    this.filters = filters;
  }

  /**
   * We recommend using the CatalogsLocale values.
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
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
    return Objects.equals(this.country, catalogsItemsRequest.country) &&
        Objects.equals(this.filters, catalogsItemsRequest.filters) &&
        Objects.equals(this.language, catalogsItemsRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, filters, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
