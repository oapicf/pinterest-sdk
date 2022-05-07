package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GoogleProductCategory1Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;
 /**
  * Get GOOGLE_PRODUCT_CATEGORY_1
  * @return GOOGLE_PRODUCT_CATEGORY_1
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_1</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_1</code> property.
   */
  public GoogleProductCategory1Filter GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory1Filter {\n");
    
    sb.append("    GOOGLE_PRODUCT_CATEGORY_1: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_1)).append("\n");
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

