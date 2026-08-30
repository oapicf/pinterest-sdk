package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupProductCounts;
import org.openapitools.model.CatalogsHotelProductGroupProductCounts;
import org.openapitools.model.CatalogsRetailProductGroupProductCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupProductCounts.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelProductGroupProductCounts.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailProductGroupProductCounts.class, name = "RETAIL"),
})

/**
 * Product counts for a CatalogsProductGroup
 */
@ApiModel(description="Product counts for a CatalogsProductGroup")

public class CatalogsProductGroupProductCountsVertical  {
  
public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));

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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal videos;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal appLinks;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal images;
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
  public CatalogsProductGroupProductCountsVertical catalogType(CatalogTypeEnum catalogType) {
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
  public CatalogsProductGroupProductCountsVertical inStock(BigDecimal inStock) {
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
  public CatalogsProductGroupProductCountsVertical outOfStock(BigDecimal outOfStock) {
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
  public CatalogsProductGroupProductCountsVertical preorder(BigDecimal preorder) {
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
  public CatalogsProductGroupProductCountsVertical total(BigDecimal total) {
    this.total = total;
    return this;
  }

 /**
  * Get videos
  * minimum: 0
  * @return videos
  */
  @JsonProperty("videos")
  @NotNull
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
  public CatalogsProductGroupProductCountsVertical videos(BigDecimal videos) {
    this.videos = videos;
    return this;
  }

 /**
  * Get appLinks
  * minimum: 0
  * @return appLinks
  */
  @JsonProperty("app_links")
  @NotNull
 @DecimalMin("0")  public BigDecimal getAppLinks() {
    return appLinks;
  }

  /**
   * Sets the <code>appLinks</code> property.
   */
 public void setAppLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
  }

  /**
   * Sets the <code>appLinks</code> property.
   */
  public CatalogsProductGroupProductCountsVertical appLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
    return this;
  }

 /**
  * Get images
  * minimum: 0
  * @return images
  */
  @JsonProperty("images")
  @NotNull
 @DecimalMin("0")  public BigDecimal getImages() {
    return images;
  }

  /**
   * Sets the <code>images</code> property.
   */
 public void setImages(BigDecimal images) {
    this.images = images;
  }

  /**
   * Sets the <code>images</code> property.
   */
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

