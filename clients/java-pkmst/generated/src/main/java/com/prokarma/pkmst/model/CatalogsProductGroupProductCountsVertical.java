package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsCreativeAssetsProductGroupProductCounts;
import com.prokarma.pkmst.model.CatalogsHotelProductGroupProductCounts;
import com.prokarma.pkmst.model.CatalogsRetailProductGroupProductCounts;
import com.prokarma.pkmst.model.CatalogsType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Product counts for a CatalogsProductGroup
 */
@ApiModel(description = "Product counts for a CatalogsProductGroup")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupProductCounts.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelProductGroupProductCounts.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailProductGroupProductCounts.class, name = "RETAIL"),
})

public class CatalogsProductGroupProductCountsVertical   {
  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

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

  public CatalogsProductGroupProductCountsVertical catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
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
   */
  @ApiModelProperty(required = true, value = "")
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
   */
  @ApiModelProperty(required = true, value = "")
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
   */
  @ApiModelProperty(required = true, value = "")
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
   */
  @ApiModelProperty(required = true, value = "")
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
   */
  @ApiModelProperty(required = true, value = "")
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
    CatalogsProductGroupProductCountsVertical catalogsProductGroupProductCountsVertical = (CatalogsProductGroupProductCountsVertical) o;
    return Objects.equals(this.catalogType, catalogsProductGroupProductCountsVertical.catalogType) &&
        Objects.equals(this.inStock, catalogsProductGroupProductCountsVertical.inStock) &&
        Objects.equals(this.outOfStock, catalogsProductGroupProductCountsVertical.outOfStock) &&
        Objects.equals(this.preorder, catalogsProductGroupProductCountsVertical.preorder) &&
        Objects.equals(this.total, catalogsProductGroupProductCountsVertical.total) &&
        Objects.equals(this.videos, catalogsProductGroupProductCountsVertical.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, inStock, outOfStock, preorder, total, videos);
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

