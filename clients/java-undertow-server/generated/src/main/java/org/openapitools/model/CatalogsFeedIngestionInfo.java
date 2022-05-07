/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-07T06:40:09.212272Z[Etc/UTC]")
public class CatalogsFeedIngestionInfo   {
  
  private Integer inStock;
  private Integer outOfStock;
  private Integer preorder;

  /**
   */
  public CatalogsFeedIngestionInfo inStock(Integer inStock) {
    this.inStock = inStock;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("in_stock")
  public Integer getInStock() {
    return inStock;
  }
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  /**
   */
  public CatalogsFeedIngestionInfo outOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("out_of_stock")
  public Integer getOutOfStock() {
    return outOfStock;
  }
  public void setOutOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
  }

  /**
   */
  public CatalogsFeedIngestionInfo preorder(Integer preorder) {
    this.preorder = preorder;
    return this;
  }

  
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

