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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-08T00:33:44.584572Z[Etc/UTC]")
public class ProductType4Filter   {
  

  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_4")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }
  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType4Filter productType4Filter = (ProductType4Filter) o;
    return Objects.equals(PRODUCT_TYPE_4, productType4Filter.PRODUCT_TYPE_4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_TYPE_4);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

