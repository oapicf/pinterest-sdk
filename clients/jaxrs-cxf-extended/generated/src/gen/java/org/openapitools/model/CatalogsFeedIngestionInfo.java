package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedIngestionInfo  {
  
  @ApiModelProperty(value = "")
  private Integer inStock;

  @ApiModelProperty(value = "")
  private Integer outOfStock;

  @ApiModelProperty(value = "")
  private Integer preorder;
 /**
  * Get inStock
  * @return inStock
  */
  @JsonProperty("in_stock")
  public Integer getInStock() {
    return inStock;
  }

  /**
   * Sets the <code>inStock</code> property.
   */
 public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  /**
   * Sets the <code>inStock</code> property.
   */
  public CatalogsFeedIngestionInfo inStock(Integer inStock) {
    this.inStock = inStock;
    return this;
  }

 /**
  * Get outOfStock
  * @return outOfStock
  */
  @JsonProperty("out_of_stock")
  public Integer getOutOfStock() {
    return outOfStock;
  }

  /**
   * Sets the <code>outOfStock</code> property.
   */
 public void setOutOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
  }

  /**
   * Sets the <code>outOfStock</code> property.
   */
  public CatalogsFeedIngestionInfo outOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

 /**
  * Get preorder
  * @return preorder
  */
  @JsonProperty("preorder")
  public Integer getPreorder() {
    return preorder;
  }

  /**
   * Sets the <code>preorder</code> property.
   */
 public void setPreorder(Integer preorder) {
    this.preorder = preorder;
  }

  /**
   * Sets the <code>preorder</code> property.
   */
  public CatalogsFeedIngestionInfo preorder(Integer preorder) {
    this.preorder = preorder;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

