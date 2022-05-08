package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedIngestionInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-08T00:42:02.037116Z[Etc/UTC]")
public class CatalogsFeedIngestionInfo   {

  @JsonProperty("in_stock")
  private Integer inStock;

  @JsonProperty("out_of_stock")
  private Integer outOfStock;

  @JsonProperty("preorder")
  private Integer preorder;

  public CatalogsFeedIngestionInfo inStock(Integer inStock) {
    this.inStock = inStock;
    return this;
  }

  /**
   * Get inStock
   * @return inStock
  */
  
  @Schema(name = "in_stock", required = false)
  public Integer getInStock() {
    return inStock;
  }

  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  public CatalogsFeedIngestionInfo outOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

  /**
   * Get outOfStock
   * @return outOfStock
  */
  
  @Schema(name = "out_of_stock", required = false)
  public Integer getOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
  }

  public CatalogsFeedIngestionInfo preorder(Integer preorder) {
    this.preorder = preorder;
    return this;
  }

  /**
   * Get preorder
   * @return preorder
  */
  
  @Schema(name = "preorder", required = false)
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
    return Objects.equals(this.inStock, catalogsFeedIngestionInfo.inStock) &&
        Objects.equals(this.outOfStock, catalogsFeedIngestionInfo.outOfStock) &&
        Objects.equals(this.preorder, catalogsFeedIngestionInfo.preorder);
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

