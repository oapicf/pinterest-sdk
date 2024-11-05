package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Product counts for a CatalogsProductGroup")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupProductCounts.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelProductGroupProductCounts.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailProductGroupProductCounts.class, name = "RETAIL"),
})

public class CatalogsProductGroupProductCountsVertical   {
  
  private CatalogsType catalogType;
  private BigDecimal inStock;
  private BigDecimal outOfStock;
  private BigDecimal preorder;
  private BigDecimal total;
  private BigDecimal videos;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("in_stock")
  @NotNull
 @DecimalMin("0")  public BigDecimal getInStock() {
    return inStock;
  }
  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("out_of_stock")
  @NotNull
 @DecimalMin("0")  public BigDecimal getOutOfStock() {
    return outOfStock;
  }
  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("preorder")
  @NotNull
 @DecimalMin("0")  public BigDecimal getPreorder() {
    return preorder;
  }
  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("total")
  @NotNull
 @DecimalMin("0")  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("videos")
  @NotNull
 @DecimalMin("0")  public BigDecimal getVideos() {
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

