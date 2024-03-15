package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Product counts for a CatalogsProductGroup
 */
@ApiModel(description="Product counts for a CatalogsProductGroup")

public class CatalogsProductGroupProductCounts  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal inStock;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal outOfStock;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal preorder;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal total;
 /**
  * Get inStock
  * minimum: 0
  * @return inStock
  */
  @JsonProperty("in_stock")
  @NotNull
 @DecimalMin("0")  public BigDecimal getInStock() {
    return inStock;
  }

  /**
   * Sets the <code>inStock</code> property.
   */
 public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  /**
   * Sets the <code>inStock</code> property.
   */
  public CatalogsProductGroupProductCounts inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

 /**
  * Get outOfStock
  * minimum: 0
  * @return outOfStock
  */
  @JsonProperty("out_of_stock")
  @NotNull
 @DecimalMin("0")  public BigDecimal getOutOfStock() {
    return outOfStock;
  }

  /**
   * Sets the <code>outOfStock</code> property.
   */
 public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  /**
   * Sets the <code>outOfStock</code> property.
   */
  public CatalogsProductGroupProductCounts outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

 /**
  * Get preorder
  * minimum: 0
  * @return preorder
  */
  @JsonProperty("preorder")
  @NotNull
 @DecimalMin("0")  public BigDecimal getPreorder() {
    return preorder;
  }

  /**
   * Sets the <code>preorder</code> property.
   */
 public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  /**
   * Sets the <code>preorder</code> property.
   */
  public CatalogsProductGroupProductCounts preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

 /**
  * Get total
  * minimum: 0
  * @return total
  */
  @JsonProperty("total")
  @NotNull
 @DecimalMin("0")  public BigDecimal getTotal() {
    return total;
  }

  /**
   * Sets the <code>total</code> property.
   */
 public void setTotal(BigDecimal total) {
    this.total = total;
  }

  /**
   * Sets the <code>total</code> property.
   */
  public CatalogsProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

