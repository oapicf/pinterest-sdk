package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenderFilter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupMultipleGenderCriteria GENDER;
 /**
   * Get GENDER
   * @return GENDER
  **/
  @JsonProperty("GENDER")
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }

  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }

  public GenderFilter GENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
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
    GenderFilter genderFilter = (GenderFilter) o;
    return Objects.equals(this.GENDER, genderFilter.GENDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GENDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderFilter {\n");
    
    sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
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

