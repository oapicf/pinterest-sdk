package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedIngestionInfo  {
  
 /**
  * The number of ingested products that are in stock.
  */
  @ApiModelProperty(value = "The number of ingested products that are in stock.")
  private Integer IN_STOCK;

 /**
  * The number of ingested products that are in out of stock.
  */
  @ApiModelProperty(value = "The number of ingested products that are in out of stock.")
  private Integer OUT_OF_STOCK;

 /**
  * The number of ingested products that are in preorder.
  */
  @ApiModelProperty(value = "The number of ingested products that are in preorder.")
  private Integer PREORDER;
 /**
  * The number of ingested products that are in stock.
  * @return IN_STOCK
  */
  @JsonProperty("IN_STOCK")
  public Integer getINSTOCK() {
    return IN_STOCK;
  }

  /**
   * Sets the <code>IN_STOCK</code> property.
   */
 public void setINSTOCK(Integer IN_STOCK) {
    this.IN_STOCK = IN_STOCK;
  }

  /**
   * Sets the <code>IN_STOCK</code> property.
   */
  public CatalogsFeedIngestionInfo IN_STOCK(Integer IN_STOCK) {
    this.IN_STOCK = IN_STOCK;
    return this;
  }

 /**
  * The number of ingested products that are in out of stock.
  * @return OUT_OF_STOCK
  */
  @JsonProperty("OUT_OF_STOCK")
  public Integer getOUTOFSTOCK() {
    return OUT_OF_STOCK;
  }

  /**
   * Sets the <code>OUT_OF_STOCK</code> property.
   */
 public void setOUTOFSTOCK(Integer OUT_OF_STOCK) {
    this.OUT_OF_STOCK = OUT_OF_STOCK;
  }

  /**
   * Sets the <code>OUT_OF_STOCK</code> property.
   */
  public CatalogsFeedIngestionInfo OUT_OF_STOCK(Integer OUT_OF_STOCK) {
    this.OUT_OF_STOCK = OUT_OF_STOCK;
    return this;
  }

 /**
  * The number of ingested products that are in preorder.
  * @return PREORDER
  */
  @JsonProperty("PREORDER")
  public Integer getPREORDER() {
    return PREORDER;
  }

  /**
   * Sets the <code>PREORDER</code> property.
   */
 public void setPREORDER(Integer PREORDER) {
    this.PREORDER = PREORDER;
  }

  /**
   * Sets the <code>PREORDER</code> property.
   */
  public CatalogsFeedIngestionInfo PREORDER(Integer PREORDER) {
    this.PREORDER = PREORDER;
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
    CatalogsFeedIngestionInfo catalogsFeedIngestionInfo = (CatalogsFeedIngestionInfo) o;
    return Objects.equals(this.IN_STOCK, catalogsFeedIngestionInfo.IN_STOCK) &&
        Objects.equals(this.OUT_OF_STOCK, catalogsFeedIngestionInfo.OUT_OF_STOCK) &&
        Objects.equals(this.PREORDER, catalogsFeedIngestionInfo.PREORDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IN_STOCK, OUT_OF_STOCK, PREORDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionInfo {\n");
    
    sb.append("    IN_STOCK: ").append(toIndentedString(IN_STOCK)).append("\n");
    sb.append("    OUT_OF_STOCK: ").append(toIndentedString(OUT_OF_STOCK)).append("\n");
    sb.append("    PREORDER: ").append(toIndentedString(PREORDER)).append("\n");
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

