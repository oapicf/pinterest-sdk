package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Product counts for a CatalogsProductGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupProductCounts   {
  @JsonProperty("in_stock")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal inStock;

  @JsonProperty("out_of_stock")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal outOfStock;

  @JsonProperty("preorder")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal preorder;

  @JsonProperty("total")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal total;

  public CatalogsProductGroupProductCounts inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

   /**
   * Get inStock
   * minimum: 0
   * @return inStock
  **/
  public BigDecimal getInStock() {
    return inStock;
  }

  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  public CatalogsProductGroupProductCounts outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

   /**
   * Get outOfStock
   * minimum: 0
   * @return outOfStock
  **/
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  public CatalogsProductGroupProductCounts preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

   /**
   * Get preorder
   * minimum: 0
   * @return preorder
  **/
  public BigDecimal getPreorder() {
    return preorder;
  }

  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  public CatalogsProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * minimum: 0
   * @return total
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

