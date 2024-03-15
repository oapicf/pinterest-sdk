package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Product counts for a CatalogsProductGroup
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupProductCounts   {
  
  private BigDecimal inStock;
  private BigDecimal outOfStock;
  private BigDecimal preorder;
  private BigDecimal total;

  public CatalogsProductGroupProductCounts () {

  }

  public CatalogsProductGroupProductCounts (BigDecimal inStock, BigDecimal outOfStock, BigDecimal preorder, BigDecimal total) {
    this.inStock = inStock;
    this.outOfStock = outOfStock;
    this.preorder = preorder;
    this.total = total;
  }

    
  @JsonProperty("in_stock")
  public BigDecimal getInStock() {
    return inStock;
  }
  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

    
  @JsonProperty("out_of_stock")
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }
  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

    
  @JsonProperty("preorder")
  public BigDecimal getPreorder() {
    return preorder;
  }
  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

    
  @JsonProperty("total")
  public BigDecimal getTotal() {
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
    return Objects.equals(inStock, catalogsProductGroupProductCounts.inStock) &&
        Objects.equals(outOfStock, catalogsProductGroupProductCounts.outOfStock) &&
        Objects.equals(preorder, catalogsProductGroupProductCounts.preorder) &&
        Objects.equals(total, catalogsProductGroupProductCounts.total);
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
