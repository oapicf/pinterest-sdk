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
 * Product counts for a Creative Assets CatalogsProductGroup
 */
public class CatalogsCreativeAssetsProductGroupProductCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("app_links")
  private BigDecimal appLinks;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("images")
  private BigDecimal images;

  @JsonProperty("total")
  private BigDecimal total;

  @JsonProperty("videos")
  private BigDecimal videos;

  /**
   * 
   * @return appLinks
   */
  public BigDecimal getAppLinks() {
    return appLinks;
  }

  public void setAppLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
  }

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
   * @return images
   */
  public BigDecimal getImages() {
    return images;
  }

  public void setImages(BigDecimal images) {
    this.images = images;
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
    CatalogsCreativeAssetsProductGroupProductCounts catalogsCreativeAssetsProductGroupProductCounts = (CatalogsCreativeAssetsProductGroupProductCounts) o;
    return Objects.equals(this.appLinks, catalogsCreativeAssetsProductGroupProductCounts.appLinks) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsProductGroupProductCounts.catalogType) &&
        Objects.equals(this.images, catalogsCreativeAssetsProductGroupProductCounts.images) &&
        Objects.equals(this.total, catalogsCreativeAssetsProductGroupProductCounts.total) &&
        Objects.equals(this.videos, catalogsCreativeAssetsProductGroupProductCounts.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLinks, catalogType, images, total, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupProductCounts {\n");
    
    sb.append("    appLinks: ").append(toIndentedString(appLinks)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
