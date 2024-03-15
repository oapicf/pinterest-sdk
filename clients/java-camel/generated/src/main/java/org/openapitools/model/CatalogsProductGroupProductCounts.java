package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Product counts for a CatalogsProductGroup
 */

@Schema(name = "CatalogsProductGroupProductCounts", description = "Product counts for a CatalogsProductGroup")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductGroupProductCounts {

  private BigDecimal inStock;

  private BigDecimal outOfStock;

  private BigDecimal preorder;

  private BigDecimal total;

  public CatalogsProductGroupProductCounts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupProductCounts(BigDecimal inStock, BigDecimal outOfStock, BigDecimal preorder, BigDecimal total) {
    this.inStock = inStock;
    this.outOfStock = outOfStock;
    this.preorder = preorder;
    this.total = total;
  }

  public CatalogsProductGroupProductCounts inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

  /**
   * Get inStock
   * minimum: 0
   * @return inStock
  */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "in_stock", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("in_stock")
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
  */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "out_of_stock", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("out_of_stock")
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
  */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "preorder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preorder")
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
  */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.REQUIRED)
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

