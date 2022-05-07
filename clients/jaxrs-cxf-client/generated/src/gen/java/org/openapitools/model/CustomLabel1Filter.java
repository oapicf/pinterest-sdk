package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomLabel1Filter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;
 /**
   * Get CUSTOM_LABEL_1
   * @return CUSTOM_LABEL_1
  **/
  @JsonProperty("CUSTOM_LABEL_1")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }

  public void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  public CustomLabel1Filter CUSTOM_LABEL_1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel1Filter {\n");
    
    sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
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

