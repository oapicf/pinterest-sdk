package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public class ProductType3Filter   {
  
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_3")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }
  public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
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
    return Objects.equals(PRODUCT_TYPE_3, productType3Filter.PRODUCT_TYPE_3);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

