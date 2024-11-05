package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Product counts for a Retail CatalogsProductGroup
 **/

@ApiModel(description = "Product counts for a Retail CatalogsProductGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailProductGroupProductCounts   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

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
   **/
  public CatalogsRetailProductGroupProductCounts catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * minimum: 0
   **/
  public CatalogsRetailProductGroupProductCounts inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("in_stock")
  public BigDecimal getInStock() {
    return inStock;
  }
  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  /**
   * minimum: 0
   **/
  public CatalogsRetailProductGroupProductCounts outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("out_of_stock")
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }
  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  /**
   * minimum: 0
   **/
  public CatalogsRetailProductGroupProductCounts preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("preorder")
  public BigDecimal getPreorder() {
    return preorder;
  }
  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  /**
   * minimum: 0
   **/
  public CatalogsRetailProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  /**
   * minimum: 0
   **/
  public CatalogsRetailProductGroupProductCounts videos(BigDecimal videos) {
    this.videos = videos;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("videos")
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
    return Objects.equals(catalogType, catalogsRetailProductGroupProductCounts.catalogType) &&
        Objects.equals(inStock, catalogsRetailProductGroupProductCounts.inStock) &&
        Objects.equals(outOfStock, catalogsRetailProductGroupProductCounts.outOfStock) &&
        Objects.equals(preorder, catalogsRetailProductGroupProductCounts.preorder) &&
        Objects.equals(total, catalogsRetailProductGroupProductCounts.total) &&
        Objects.equals(videos, catalogsRetailProductGroupProductCounts.videos);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

