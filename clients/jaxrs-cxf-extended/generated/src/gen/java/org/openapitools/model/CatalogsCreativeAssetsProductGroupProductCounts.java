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
 * Product counts for a Creative Assets CatalogsProductGroup
 */
@ApiModel(description="Product counts for a Creative Assets CatalogsProductGroup")

public class CatalogsCreativeAssetsProductGroupProductCounts  {
  
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
  private BigDecimal total;

  @ApiModelProperty(required = true, value = "")
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
  public CatalogsCreativeAssetsProductGroupProductCounts catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
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
  public CatalogsCreativeAssetsProductGroupProductCounts total(BigDecimal total) {
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
  public CatalogsCreativeAssetsProductGroupProductCounts videos(BigDecimal videos) {
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
    CatalogsCreativeAssetsProductGroupProductCounts catalogsCreativeAssetsProductGroupProductCounts = (CatalogsCreativeAssetsProductGroupProductCounts) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsProductGroupProductCounts.catalogType) &&
        Objects.equals(this.total, catalogsCreativeAssetsProductGroupProductCounts.total) &&
        Objects.equals(this.videos, catalogsCreativeAssetsProductGroupProductCounts.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, total, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupProductCounts {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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

