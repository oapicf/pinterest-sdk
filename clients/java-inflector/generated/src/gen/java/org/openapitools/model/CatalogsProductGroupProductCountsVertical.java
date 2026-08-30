package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupProductCounts;
import org.openapitools.model.CatalogsHotelProductGroupProductCounts;
import org.openapitools.model.CatalogsRetailProductGroupProductCounts;



/**
 * Product counts for a CatalogsProductGroup
 **/

@ApiModel(description = "Product counts for a CatalogsProductGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupProductCountsVertical   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

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

  @JsonProperty("app_links")
  private BigDecimal appLinks;

  @JsonProperty("images")
  private BigDecimal images;

  /**
   **/
  public CatalogsProductGroupProductCountsVertical catalogType(CatalogTypeEnum catalogType) {
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
  public CatalogsProductGroupProductCountsVertical inStock(BigDecimal inStock) {
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
  public CatalogsProductGroupProductCountsVertical outOfStock(BigDecimal outOfStock) {
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
  public CatalogsProductGroupProductCountsVertical preorder(BigDecimal preorder) {
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
  public CatalogsProductGroupProductCountsVertical total(BigDecimal total) {
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
  public CatalogsProductGroupProductCountsVertical videos(BigDecimal videos) {
    this.videos = videos;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("videos")
  public BigDecimal getVideos() {
    return videos;
  }
  public void setVideos(BigDecimal videos) {
    this.videos = videos;
  }

  /**
   * minimum: 0
   **/
  public CatalogsProductGroupProductCountsVertical appLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("app_links")
  public BigDecimal getAppLinks() {
    return appLinks;
  }
  public void setAppLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
  }

  /**
   * minimum: 0
   **/
  public CatalogsProductGroupProductCountsVertical images(BigDecimal images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

