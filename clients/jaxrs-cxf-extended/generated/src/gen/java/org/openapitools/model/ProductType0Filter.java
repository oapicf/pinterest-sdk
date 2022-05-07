package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductType0Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0;
 /**
  * Get PRODUCT_TYPE_0
  * @return PRODUCT_TYPE_0
  */
  @JsonProperty("PRODUCT_TYPE_0")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_0</code> property.
   */
 public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_0</code> property.
   */
  public ProductType0Filter PRODUCT_TYPE_0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType0Filter {\n");
    
    sb.append("    PRODUCT_TYPE_0: ").append(toIndentedString(PRODUCT_TYPE_0)).append("\n");
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

