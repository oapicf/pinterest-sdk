package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedIngestionInfo   {
  
  private Integer inStock;
  private Integer outOfStock;
  private Integer preorder;

  public CatalogsFeedIngestionInfo () {

  }

  public CatalogsFeedIngestionInfo (Integer inStock, Integer outOfStock, Integer preorder) {
    this.inStock = inStock;
    this.outOfStock = outOfStock;
    this.preorder = preorder;
  }

    
  @JsonProperty("in_stock")
  public Integer getInStock() {
    return inStock;
  }
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

    
  @JsonProperty("out_of_stock")
  public Integer getOutOfStock() {
    return outOfStock;
  }
  public void setOutOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
  }

    
  @JsonProperty("preorder")
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
