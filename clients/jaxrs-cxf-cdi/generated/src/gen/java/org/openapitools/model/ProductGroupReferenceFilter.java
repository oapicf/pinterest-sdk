package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ProductGroupReferenceFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP;

  /**
   **/
  public ProductGroupReferenceFilter PRODUCT_GROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_GROUP")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP() {
    return PRODUCT_GROUP;
  }
  public void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupReferenceFilter productGroupReferenceFilter = (ProductGroupReferenceFilter) o;
    return Objects.equals(this.PRODUCT_GROUP, productGroupReferenceFilter.PRODUCT_GROUP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_GROUP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupReferenceFilter {\n");
    
    sb.append("    PRODUCT_GROUP: ").append(toIndentedString(PRODUCT_GROUP)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

