package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupProductCounts;
import org.openapitools.model.CatalogsHotelProductGroupProductCounts;
import org.openapitools.model.CatalogsRetailProductGroupProductCounts;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Product counts for a CatalogsProductGroup
 */
@ApiModel(description="Product counts for a CatalogsProductGroup")

public class CatalogsProductGroupProductCountsVertical  {
  
public enum CatalogTypeEnum {

CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


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

  private BigDecimal inStock;

  @ApiModelProperty(required = true, value = "")

  private BigDecimal outOfStock;

  @ApiModelProperty(required = true, value = "")

  private BigDecimal preorder;

  @ApiModelProperty(required = true, value = "")

  private BigDecimal total;

  @ApiModelProperty(required = true, value = "")

  private BigDecimal videos;

  @ApiModelProperty(required = true, value = "")

  private BigDecimal appLinks;

  @ApiModelProperty(required = true, value = "")

  private BigDecimal images;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsProductGroupProductCountsVertical catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Get inStock
   * minimum: 0
   * @return inStock
  **/
  @JsonProperty("in_stock")
  public BigDecimal getInStock() {
    return inStock;
  }

  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  public CatalogsProductGroupProductCountsVertical inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

 /**
   * Get outOfStock
   * minimum: 0
   * @return outOfStock
  **/
  @JsonProperty("out_of_stock")
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  public CatalogsProductGroupProductCountsVertical outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

 /**
   * Get preorder
   * minimum: 0
   * @return preorder
  **/
  @JsonProperty("preorder")
  public BigDecimal getPreorder() {
    return preorder;
  }

  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  public CatalogsProductGroupProductCountsVertical preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

 /**
   * Get total
   * minimum: 0
   * @return total
  **/
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public CatalogsProductGroupProductCountsVertical total(BigDecimal total) {
    this.total = total;
    return this;
  }

 /**
   * Get videos
   * minimum: 0
   * @return videos
  **/
  @JsonProperty("videos")
  public BigDecimal getVideos() {
    return videos;
  }

  public void setVideos(BigDecimal videos) {
    this.videos = videos;
  }

  public CatalogsProductGroupProductCountsVertical videos(BigDecimal videos) {
    this.videos = videos;
    return this;
  }

 /**
   * Get appLinks
   * minimum: 0
   * @return appLinks
  **/
  @JsonProperty("app_links")
  public BigDecimal getAppLinks() {
    return appLinks;
  }

  public void setAppLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
  }

  public CatalogsProductGroupProductCountsVertical appLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
    return this;
  }

 /**
   * Get images
   * minimum: 0
   * @return images
  **/
  @JsonProperty("images")
  public BigDecimal getImages() {
    return images;
  }

  public void setImages(BigDecimal images) {
    this.images = images;
  }

  public CatalogsProductGroupProductCountsVertical images(BigDecimal images) {
    this.images = images;
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
    CatalogsProductGroupProductCountsVertical catalogsProductGroupProductCountsVertical = (CatalogsProductGroupProductCountsVertical) o;
    return Objects.equals(this.catalogType, catalogsProductGroupProductCountsVertical.catalogType) &&
        Objects.equals(this.inStock, catalogsProductGroupProductCountsVertical.inStock) &&
        Objects.equals(this.outOfStock, catalogsProductGroupProductCountsVertical.outOfStock) &&
        Objects.equals(this.preorder, catalogsProductGroupProductCountsVertical.preorder) &&
        Objects.equals(this.total, catalogsProductGroupProductCountsVertical.total) &&
        Objects.equals(this.videos, catalogsProductGroupProductCountsVertical.videos) &&
        Objects.equals(this.appLinks, catalogsProductGroupProductCountsVertical.appLinks) &&
        Objects.equals(this.images, catalogsProductGroupProductCountsVertical.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, inStock, outOfStock, preorder, total, videos, appLinks, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupProductCountsVertical {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    appLinks: ").append(toIndentedString(appLinks)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

