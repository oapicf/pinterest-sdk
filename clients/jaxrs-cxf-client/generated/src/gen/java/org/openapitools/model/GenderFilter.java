package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GenderFilter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupMultipleStringCriteria GENDER;
 /**
   * Get GENDER
   * @return GENDER
  **/
  @JsonProperty("GENDER")
  public CatalogsProductGroupMultipleStringCriteria getGENDER() {
    return GENDER;
  }

  public void setGENDER(CatalogsProductGroupMultipleStringCriteria GENDER) {
    this.GENDER = GENDER;
  }

  public GenderFilter GENDER(CatalogsProductGroupMultipleStringCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
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

