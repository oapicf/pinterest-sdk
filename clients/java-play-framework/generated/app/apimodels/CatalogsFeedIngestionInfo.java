package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CatalogsFeedIngestionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(inStock, catalogsFeedIngestionInfo.inStock) &&
        Objects.equals(outOfStock, catalogsFeedIngestionInfo.outOfStock) &&
        Objects.equals(preorder, catalogsFeedIngestionInfo.preorder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inStock, outOfStock, preorder);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

