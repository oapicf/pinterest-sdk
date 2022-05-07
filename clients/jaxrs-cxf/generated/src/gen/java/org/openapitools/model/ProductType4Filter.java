package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductType4Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;
 /**
   * Get PRODUCT_TYPE_4
   * @return PRODUCT_TYPE_4
  **/
  @JsonProperty("PRODUCT_TYPE_4")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }

  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }

  public ProductType4Filter PRODUCT_TYPE_4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType4Filter {\n");
    
    sb.append("    PRODUCT_TYPE_4: ").append(toIndentedString(PRODUCT_TYPE_4)).append("\n");
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

