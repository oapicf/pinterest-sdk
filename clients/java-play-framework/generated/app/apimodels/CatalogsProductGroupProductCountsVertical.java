package apimodels;

import apimodels.CatalogsCreativeAssetsProductGroupProductCounts;
import apimodels.CatalogsHotelProductGroupProductCounts;
import apimodels.CatalogsRetailProductGroupProductCounts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Product counts for a CatalogsProductGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupProductCountsVertical   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("catalog_type")
  @NotNull

  private CatalogTypeEnum catalogType;

  @JsonProperty("in_stock")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal inStock;

  @JsonProperty("out_of_stock")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal outOfStock;

  @JsonProperty("preorder")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal preorder;

  @JsonProperty("total")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal total;

  @JsonProperty("videos")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal videos;

  @JsonProperty("app_links")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal appLinks;

  @JsonProperty("images")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal images;

  public CatalogsProductGroupProductCountsVertical catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsProductGroupProductCountsVertical inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

   /**
   * Get inStock
   * minimum: 0
   * @return inStock
  **/
  public BigDecimal getInStock() {
    return inStock;
  }

  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  public CatalogsProductGroupProductCountsVertical outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

   /**
   * Get outOfStock
   * minimum: 0
   * @return outOfStock
  **/
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  public CatalogsProductGroupProductCountsVertical preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

   /**
   * Get preorder
   * minimum: 0
   * @return preorder
  **/
  public BigDecimal getPreorder() {
    return preorder;
  }

  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  public CatalogsProductGroupProductCountsVertical total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * minimum: 0
   * @return total
  **/
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public CatalogsProductGroupProductCountsVertical videos(BigDecimal videos) {
    this.videos = videos;
    return this;
  }

   /**
   * Get videos
   * minimum: 0
   * @return videos
  **/
  public BigDecimal getVideos() {
    return videos;
  }

  public void setVideos(BigDecimal videos) {
    this.videos = videos;
  }

  public CatalogsProductGroupProductCountsVertical appLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
    return this;
  }

   /**
   * Get appLinks
   * minimum: 0
   * @return appLinks
  **/
  public BigDecimal getAppLinks() {
    return appLinks;
  }

  public void setAppLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
  }

  public CatalogsProductGroupProductCountsVertical images(BigDecimal images) {
    this.images = images;
    return this;
  }

   /**
   * Get images
   * minimum: 0
   * @return images
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

