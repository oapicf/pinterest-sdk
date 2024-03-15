package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Exception;
import org.openapitools.model.ProductGroupPromotion;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ProductGroupPromotionResponseItem   {
  
  private ProductGroupPromotion data;

  private List<@Valid Exception> exceptions;

  /**
   **/
  public ProductGroupPromotionResponseItem data(ProductGroupPromotion data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public ProductGroupPromotion getData() {
    return data;
  }
  public void setData(ProductGroupPromotion data) {
    this.data = data;
  }


  /**
   **/
  public ProductGroupPromotionResponseItem exceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptions")
  public List<@Valid Exception> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public ProductGroupPromotionResponseItem addExceptionsItem(Exception exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
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
    ProductGroupPromotionResponseItem productGroupPromotionResponseItem = (ProductGroupPromotionResponseItem) o;
    return Objects.equals(this.data, productGroupPromotionResponseItem.data) &&
        Objects.equals(this.exceptions, productGroupPromotionResponseItem.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionResponseItem {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

