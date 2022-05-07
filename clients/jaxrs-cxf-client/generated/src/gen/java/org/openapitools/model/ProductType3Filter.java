package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductType3Filter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;
 /**
   * Get PRODUCT_TYPE_3
   * @return PRODUCT_TYPE_3
  **/
  @JsonProperty("PRODUCT_TYPE_3")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }

  public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
  }

  public ProductType3Filter PRODUCT_TYPE_3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType3Filter {\n");
    
    sb.append("    PRODUCT_TYPE_3: ").append(toIndentedString(PRODUCT_TYPE_3)).append("\n");
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

