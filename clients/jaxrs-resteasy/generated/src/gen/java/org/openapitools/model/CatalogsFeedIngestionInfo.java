package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public class CatalogsFeedIngestionInfo   {
  
  private Integer inStock;
  private Integer outOfStock;
  private Integer preorder;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("in_stock")
  public Integer getInStock() {
    return inStock;
  }
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("out_of_stock")
  public Integer getOutOfStock() {
    return outOfStock;
  }
  public void setOutOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preorder")
  public Integer getPreorder() {
    return preorder;
  }
  public void setPreorder(Integer preorder) {
    this.preorder = preorder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestionInfo catalogsFeedIngestionInfo = (CatalogsFeedIngestionInfo) o;
    return Objects.equals(inStock, catalogsFeedIngestionInfo.inStock) &&
        Objects.equals(outOfStock, catalogsFeedIngestionInfo.outOfStock) &&
        Objects.equals(preorder, catalogsFeedIngestionInfo.preorder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inStock, outOfStock, preorder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionInfo {\n");
    
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
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

