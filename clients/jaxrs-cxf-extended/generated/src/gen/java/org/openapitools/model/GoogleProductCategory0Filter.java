package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GoogleProductCategory0Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;
 /**
  * Get GOOGLE_PRODUCT_CATEGORY_0
  * @return GOOGLE_PRODUCT_CATEGORY_0
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_0</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_0</code> property.
   */
  public GoogleProductCategory0Filter GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory0Filter {\n");
    
    sb.append("    GOOGLE_PRODUCT_CATEGORY_0: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_0)).append("\n");
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

