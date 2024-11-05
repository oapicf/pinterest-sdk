package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Product counts for a Retail CatalogsProductGroup
 */
@ApiModel(description="Product counts for a Retail CatalogsProductGroup")

public class CatalogsRetailProductGroupProductCounts  {
  
public enum CatalogTypeEnum {

    @JsonProperty("RETAIL") RETAIL(String.valueOf("RETAIL"));

    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

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

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal videos;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsRetailProductGroupProductCounts catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

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
  public CatalogsRetailProductGroupProductCounts inStock(BigDecimal inStock) {
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
  public CatalogsRetailProductGroupProductCounts outOfStock(BigDecimal outOfStock) {
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
  public CatalogsRetailProductGroupProductCounts preorder(BigDecimal preorder) {
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
  public CatalogsRetailProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

 /**
  * Get videos
  * minimum: 0
  * @return videos
  */
  @JsonProperty("videos")
 @DecimalMin("0")  public BigDecimal getVideos() {
    return videos;
  }

  /**
   * Sets the <code>videos</code> property.
   */
 public void setVideos(BigDecimal videos) {
    this.videos = videos;
  }

  /**
   * Sets the <code>videos</code> property.
   */
  public CatalogsRetailProductGroupProductCounts videos(BigDecimal videos) {
    this.videos = videos;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

