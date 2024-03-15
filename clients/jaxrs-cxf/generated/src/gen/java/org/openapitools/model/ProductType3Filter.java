package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductType3Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;
 /**
   * Get PRODUCT_TYPE_3
   * @return PRODUCT_TYPE_3
  **/
  @JsonProperty("PRODUCT_TYPE_3")
  @NotNull
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType3Filter productType3Filter = (ProductType3Filter) o;
    return Objects.equals(this.PRODUCT_TYPE_3, productType3Filter.PRODUCT_TYPE_3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_TYPE_3);
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

