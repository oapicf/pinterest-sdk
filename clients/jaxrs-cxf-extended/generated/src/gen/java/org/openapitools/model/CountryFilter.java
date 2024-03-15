package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleCountriesCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CountryFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleCountriesCriteria COUNTRY;
 /**
  * Get COUNTRY
  * @return COUNTRY
  */
  @JsonProperty("COUNTRY")
  @NotNull
  public CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY() {
    return COUNTRY;
  }

  /**
   * Sets the <code>COUNTRY</code> property.
   */
 public void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
    this.COUNTRY = COUNTRY;
  }

  /**
   * Sets the <code>COUNTRY</code> property.
   */
  public CountryFilter COUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
    this.COUNTRY = COUNTRY;
    return this;
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
    return Objects.equals(this.COUNTRY, countryFilter.COUNTRY);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

