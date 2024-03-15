package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedIngestionInfo  {
  
  @ApiModelProperty(value = "The number of ingested products that are in stock.")
 /**
   * The number of ingested products that are in stock.
  **/
  private Integer IN_STOCK;

  @ApiModelProperty(value = "The number of ingested products that are in out of stock.")
 /**
   * The number of ingested products that are in out of stock.
  **/
  private Integer OUT_OF_STOCK;

  @ApiModelProperty(value = "The number of ingested products that are in preorder.")
 /**
   * The number of ingested products that are in preorder.
  **/
  private Integer PREORDER;
 /**
   * The number of ingested products that are in stock.
   * @return IN_STOCK
  **/
  @JsonProperty("IN_STOCK")
  public Integer getINSTOCK() {
    return IN_STOCK;
  }

  public void setINSTOCK(Integer IN_STOCK) {
    this.IN_STOCK = IN_STOCK;
  }

  public CatalogsFeedIngestionInfo IN_STOCK(Integer IN_STOCK) {
    this.IN_STOCK = IN_STOCK;
    return this;
  }

 /**
   * The number of ingested products that are in out of stock.
   * @return OUT_OF_STOCK
  **/
  @JsonProperty("OUT_OF_STOCK")
  public Integer getOUTOFSTOCK() {
    return OUT_OF_STOCK;
  }

  public void setOUTOFSTOCK(Integer OUT_OF_STOCK) {
    this.OUT_OF_STOCK = OUT_OF_STOCK;
  }

  public CatalogsFeedIngestionInfo OUT_OF_STOCK(Integer OUT_OF_STOCK) {
    this.OUT_OF_STOCK = OUT_OF_STOCK;
    return this;
  }

 /**
   * The number of ingested products that are in preorder.
   * @return PREORDER
  **/
  @JsonProperty("PREORDER")
  public Integer getPREORDER() {
    return PREORDER;
  }

  public void setPREORDER(Integer PREORDER) {
    this.PREORDER = PREORDER;
  }

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

