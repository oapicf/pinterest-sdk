/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import org.openapitools.model.CatalogsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Product counts for a CatalogsProductGroup
 */
@ApiModel(description = "Product counts for a CatalogsProductGroup")
@JsonPropertyOrder({
  CatalogsProductGroupProductCountsVertical.JSON_PROPERTY_CATALOG_TYPE,
  CatalogsProductGroupProductCountsVertical.JSON_PROPERTY_IN_STOCK,
  CatalogsProductGroupProductCountsVertical.JSON_PROPERTY_OUT_OF_STOCK,
  CatalogsProductGroupProductCountsVertical.JSON_PROPERTY_PREORDER,
  CatalogsProductGroupProductCountsVertical.JSON_PROPERTY_TOTAL,
  CatalogsProductGroupProductCountsVertical.JSON_PROPERTY_VIDEOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupProductCounts.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelProductGroupProductCounts.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailProductGroupProductCounts.class, name = "RETAIL"),
})

public class CatalogsProductGroupProductCountsVertical   {
  public static final String JSON_PROPERTY_CATALOG_TYPE = "catalog_type";
  @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
  private CatalogsType catalogType;

  public static final String JSON_PROPERTY_IN_STOCK = "in_stock";
  @JsonProperty(JSON_PROPERTY_IN_STOCK)
  private BigDecimal inStock;

  public static final String JSON_PROPERTY_OUT_OF_STOCK = "out_of_stock";
  @JsonProperty(JSON_PROPERTY_OUT_OF_STOCK)
  private BigDecimal outOfStock;

  public static final String JSON_PROPERTY_PREORDER = "preorder";
  @JsonProperty(JSON_PROPERTY_PREORDER)
  private BigDecimal preorder;

  public static final String JSON_PROPERTY_TOTAL = "total";
  @JsonProperty(JSON_PROPERTY_TOTAL)
  private BigDecimal total;

  public static final String JSON_PROPERTY_VIDEOS = "videos";
  @JsonProperty(JSON_PROPERTY_VIDEOS)
  private BigDecimal videos;

  public CatalogsProductGroupProductCountsVertical catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   **/
  @JsonProperty(value = "catalog_type")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
   **/
  @JsonProperty(value = "in_stock")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid  @DecimalMin("0")
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
  @JsonProperty(value = "out_of_stock")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid  @DecimalMin("0")
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
  @JsonProperty(value = "preorder")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid  @DecimalMin("0")
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
  @JsonProperty(value = "total")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid  @DecimalMin("0")
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
  @JsonProperty(value = "videos")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid  @DecimalMin("0")
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

