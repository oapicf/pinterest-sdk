package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CatalogsProductGroupMultipleCountriesCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryFilter   {
  
  private CatalogsProductGroupMultipleCountriesCriteria COUNTRY;

  public CountryFilter () {

  }

  public CountryFilter (CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
    this.COUNTRY = COUNTRY;
  }

    
  @JsonProperty("COUNTRY")
  public CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY() {
    return COUNTRY;
  }
  public void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
    this.COUNTRY = COUNTRY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryFilter countryFilter = (CountryFilter) o;
    return Objects.equals(COUNTRY, countryFilter.COUNTRY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(COUNTRY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryFilter {\n");
    
    sb.append("    COUNTRY: ").append(toIndentedString(COUNTRY)).append("\n");
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
