package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsFeedIngestionInfo
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsFeedIngestionInfo   {
  @JsonProperty("IN_STOCK")
  private Integer IN_STOCK;

  @JsonProperty("OUT_OF_STOCK")
  private Integer OUT_OF_STOCK;

  @JsonProperty("PREORDER")
  private Integer PREORDER;

  public CatalogsFeedIngestionInfo IN_STOCK(Integer IN_STOCK) {
    this.IN_STOCK = IN_STOCK;
    return this;
  }

   /**
   * The number of ingested products that are in stock.
   * @return IN_STOCK
  **/
  @ApiModelProperty(value = "The number of ingested products that are in stock.")
  public Integer getINSTOCK() {
    return IN_STOCK;
  }

  public void setINSTOCK(Integer IN_STOCK) {
    this.IN_STOCK = IN_STOCK;
  }

  public CatalogsFeedIngestionInfo OUT_OF_STOCK(Integer OUT_OF_STOCK) {
    this.OUT_OF_STOCK = OUT_OF_STOCK;
    return this;
  }

   /**
   * The number of ingested products that are in out of stock.
   * @return OUT_OF_STOCK
  **/
  @ApiModelProperty(value = "The number of ingested products that are in out of stock.")
  public Integer getOUTOFSTOCK() {
    return OUT_OF_STOCK;
  }

  public void setOUTOFSTOCK(Integer OUT_OF_STOCK) {
    this.OUT_OF_STOCK = OUT_OF_STOCK;
  }

  public CatalogsFeedIngestionInfo PREORDER(Integer PREORDER) {
    this.PREORDER = PREORDER;
    return this;
  }

   /**
   * The number of ingested products that are in preorder.
   * @return PREORDER
  **/
  @ApiModelProperty(value = "The number of ingested products that are in preorder.")
  public Integer getPREORDER() {
    return PREORDER;
  }

  public void setPREORDER(Integer PREORDER) {
    this.PREORDER = PREORDER;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

