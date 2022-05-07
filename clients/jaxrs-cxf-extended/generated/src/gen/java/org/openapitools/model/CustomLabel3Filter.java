package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomLabel3Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;
 /**
  * Get CUSTOM_LABEL_3
  * @return CUSTOM_LABEL_3
  */
  @JsonProperty("CUSTOM_LABEL_3")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_3</code> property.
   */
 public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_3</code> property.
   */
  public CustomLabel3Filter CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel3Filter {\n");
    
    sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
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

