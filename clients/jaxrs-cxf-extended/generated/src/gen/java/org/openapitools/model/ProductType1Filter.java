package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductType1Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1;
 /**
  * Get PRODUCT_TYPE_1
  * @return PRODUCT_TYPE_1
  */
  @JsonProperty("PRODUCT_TYPE_1")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_1</code> property.
   */
 public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_1</code> property.
   */
  public ProductType1Filter PRODUCT_TYPE_1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
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
    ProductType1Filter productType1Filter = (ProductType1Filter) o;
    return Objects.equals(this.PRODUCT_TYPE_1, productType1Filter.PRODUCT_TYPE_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_TYPE_1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType1Filter {\n");
    
    sb.append("    PRODUCT_TYPE_1: ").append(toIndentedString(PRODUCT_TYPE_1)).append("\n");
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

