package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Product counts for a Creative Assets CatalogsProductGroup
 **/
@ApiModel(description = "Product counts for a Creative Assets CatalogsProductGroup")
@JsonTypeName("CatalogsCreativeAssetsProductGroupProductCounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsCreativeAssetsProductGroupProductCounts   {
  private BigDecimal appLinks;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CatalogTypeEnum fromString(String s) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private CatalogTypeEnum catalogType;
  private BigDecimal images;
  private BigDecimal total;
  private BigDecimal videos;

  public CatalogsCreativeAssetsProductGroupProductCounts() {
  }

  @JsonCreator
  public CatalogsCreativeAssetsProductGroupProductCounts(
    @JsonProperty(required = true, value = "app_links") BigDecimal appLinks,
    @JsonProperty(required = true, value = "catalog_type") CatalogTypeEnum catalogType,
    @JsonProperty(required = true, value = "images") BigDecimal images,
    @JsonProperty(required = true, value = "total") BigDecimal total,
    @JsonProperty(required = true, value = "videos") BigDecimal videos
  ) {
    this.appLinks = appLinks;
    this.catalogType = catalogType;
    this.images = images;
    this.total = total;
    this.videos = videos;
  }

  /**
   * minimum: 0
   **/
  public CatalogsCreativeAssetsProductGroupProductCounts appLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "app_links")
  @NotNull @Valid  @DecimalMin("0")public BigDecimal getAppLinks() {
    return appLinks;
  }

  @JsonProperty(required = true, value = "app_links")
  public void setAppLinks(BigDecimal appLinks) {
    this.appLinks = appLinks;
  }

  /**
   **/
  public CatalogsCreativeAssetsProductGroupProductCounts catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "catalog_type")
  @NotNull public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  @JsonProperty(required = true, value = "catalog_type")
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * minimum: 0
   **/
  public CatalogsCreativeAssetsProductGroupProductCounts images(BigDecimal images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "images")
  @NotNull @Valid  @DecimalMin("0")public BigDecimal getImages() {
    return images;
  }

  @JsonProperty(required = true, value = "images")
  public void setImages(BigDecimal images) {
    this.images = images;
  }

  /**
   * minimum: 0
   **/
  public CatalogsCreativeAssetsProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "total")
  @NotNull @Valid  @DecimalMin("0")public BigDecimal getTotal() {
    return total;
  }

  @JsonProperty(required = true, value = "total")
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  /**
   * minimum: 0
   **/
  public CatalogsCreativeAssetsProductGroupProductCounts videos(BigDecimal videos) {
    this.videos = videos;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "videos")
  @NotNull @Valid  @DecimalMin("0")public BigDecimal getVideos() {
    return videos;
  }

  @JsonProperty(required = true, value = "videos")
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
