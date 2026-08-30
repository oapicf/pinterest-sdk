package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Product counts for a Retail CatalogsProductGroup
 */
public class CatalogsRetailProductGroupProductCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("in_stock")
  private BigDecimal inStock;

  @JsonProperty("out_of_stock")
  private BigDecimal outOfStock;

  @JsonProperty("preorder")
  private BigDecimal preorder;

  @JsonProperty("total")
  private BigDecimal total;

  @JsonProperty("videos")
  private BigDecimal videos;

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * 
   * @return inStock
   */
  public BigDecimal getInStock() {
    return inStock;
  }

  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  /**
   * 
   * @return outOfStock
   */
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  /**
   * 
   * @return preorder
   */
  public BigDecimal getPreorder() {
    return preorder;
  }

  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  /**
   * 
   * @return total
   */
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  /**
   * 
   * @return videos
   */
  public BigDecimal getVideos() {
    return videos;
  }

  public void setVideos(BigDecimal videos) {
    this.videos = videos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailProductGroupProductCounts catalogsRetailProductGroupProductCounts = (CatalogsRetailProductGroupProductCounts) o;
    return Objects.equals(this.catalogType, catalogsRetailProductGroupProductCounts.catalogType) &&
        Objects.equals(this.inStock, catalogsRetailProductGroupProductCounts.inStock) &&
        Objects.equals(this.outOfStock, catalogsRetailProductGroupProductCounts.outOfStock) &&
        Objects.equals(this.preorder, catalogsRetailProductGroupProductCounts.preorder) &&
        Objects.equals(this.total, catalogsRetailProductGroupProductCounts.total) &&
        Objects.equals(this.videos, catalogsRetailProductGroupProductCounts.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, inStock, outOfStock, preorder, total, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroupProductCounts {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
