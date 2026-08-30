package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsProductGroupProductCounts;
import org.openapitools.vertxweb.server.model.CatalogsHotelProductGroupProductCounts;
import org.openapitools.vertxweb.server.model.CatalogsRetailProductGroupProductCounts;

/**
 * Product counts for a CatalogsProductGroup
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupProductCountsVertical   {
  


  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private BigDecimal inStock;
  private BigDecimal outOfStock;
  private BigDecimal preorder;
  private BigDecimal total;
  private BigDecimal videos;
  private BigDecimal appLinks;
  private BigDecimal images;

  public CatalogsProductGroupProductCountsVertical () {

  }

  public CatalogsProductGroupProductCountsVertical (CatalogTypeEnum catalogType, BigDecimal inStock, BigDecimal outOfStock, BigDecimal preorder, BigDecimal total, BigDecimal videos, BigDecimal appLinks, BigDecimal images) {
    this.catalogType = catalogType;
    this.inStock = inStock;
    this.outOfStock = outOfStock;
    this.preorder = preorder;
    this.total = total;
    this.videos = videos;
    this.appLinks = appLinks;
    this.images = images;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
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

    
  @JsonProperty("videos")
  public BigDecimal getVideos() {
    return videos;
  }
  public void setVideos(BigDecimal videos) {
    this.videos = videos;
  }

    
  @JsonProperty("app_links")
  public BigDecimal getAppLinks() {
    return appLinks;
  }
  public void setAppLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
  }

    
  @JsonProperty("images")
  public BigDecimal getImages() {
    return images;
  }
  public void setImages(BigDecimal images) {
    this.images = images;
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
    return Objects.equals(catalogType, catalogsProductGroupProductCountsVertical.catalogType) &&
        Objects.equals(inStock, catalogsProductGroupProductCountsVertical.inStock) &&
        Objects.equals(outOfStock, catalogsProductGroupProductCountsVertical.outOfStock) &&
        Objects.equals(preorder, catalogsProductGroupProductCountsVertical.preorder) &&
        Objects.equals(total, catalogsProductGroupProductCountsVertical.total) &&
        Objects.equals(videos, catalogsProductGroupProductCountsVertical.videos) &&
        Objects.equals(appLinks, catalogsProductGroupProductCountsVertical.appLinks) &&
        Objects.equals(images, catalogsProductGroupProductCountsVertical.images);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
