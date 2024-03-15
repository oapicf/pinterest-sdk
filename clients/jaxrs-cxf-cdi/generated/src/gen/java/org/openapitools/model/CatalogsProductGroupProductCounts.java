package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Product counts for a CatalogsProductGroup
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Product counts for a CatalogsProductGroup")
public class CatalogsProductGroupProductCounts   {
  
  private BigDecimal inStock;

  private BigDecimal outOfStock;

  private BigDecimal preorder;

  private BigDecimal total;

  /**
   * minimum: 0
   **/
  public CatalogsProductGroupProductCounts inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("in_stock")
  @NotNull
 @DecimalMin("0")  public BigDecimal getInStock() {
    return inStock;
  }
  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }


  /**
   * minimum: 0
   **/
  public CatalogsProductGroupProductCounts outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("out_of_stock")
  @NotNull
 @DecimalMin("0")  public BigDecimal getOutOfStock() {
    return outOfStock;
  }
  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }


  /**
   * minimum: 0
   **/
  public CatalogsProductGroupProductCounts preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("preorder")
  @NotNull
 @DecimalMin("0")  public BigDecimal getPreorder() {
    return preorder;
  }
  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }


  /**
   * minimum: 0
   **/
  public CatalogsProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("total")
  @NotNull
 @DecimalMin("0")  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupProductCounts catalogsProductGroupProductCounts = (CatalogsProductGroupProductCounts) o;
    return Objects.equals(this.inStock, catalogsProductGroupProductCounts.inStock) &&
        Objects.equals(this.outOfStock, catalogsProductGroupProductCounts.outOfStock) &&
        Objects.equals(this.preorder, catalogsProductGroupProductCounts.preorder) &&
        Objects.equals(this.total, catalogsProductGroupProductCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inStock, outOfStock, preorder, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupProductCounts {\n");
    
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

