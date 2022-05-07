package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductType2Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;
 /**
   * Get PRODUCT_TYPE_2
   * @return PRODUCT_TYPE_2
  **/
  @JsonProperty("PRODUCT_TYPE_2")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }

  public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }

  public ProductType2Filter PRODUCT_TYPE_2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType2Filter {\n");
    
    sb.append("    PRODUCT_TYPE_2: ").append(toIndentedString(PRODUCT_TYPE_2)).append("\n");
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

