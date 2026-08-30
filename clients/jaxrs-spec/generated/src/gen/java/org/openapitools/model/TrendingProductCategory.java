package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoriesEngagementType;
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
 * Trending shopping product category
 **/
@ApiModel(description = "Trending shopping product category")
@JsonTypeName("TrendingProductCategory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingProductCategory   {
  private ProductCategoriesEngagementType engagementType;
  private Integer pctChangeMom;
  private Integer percentRelativeVolume;
  private Integer pinterestProductCategoryId;
  private String productCategory;
  private @Valid List<String> verticals = new ArrayList<>();

  public TrendingProductCategory() {
  }

  @JsonCreator
  public TrendingProductCategory(
    @JsonProperty(required = true, value = "engagement_type") ProductCategoriesEngagementType engagementType,
    @JsonProperty(required = true, value = "pct_change_mom") Integer pctChangeMom,
    @JsonProperty(required = true, value = "percent_relative_volume") Integer percentRelativeVolume,
    @JsonProperty(required = true, value = "pinterest_product_category_id") Integer pinterestProductCategoryId,
    @JsonProperty(required = true, value = "product_category") String productCategory
  ) {
    this.engagementType = engagementType;
    this.pctChangeMom = pctChangeMom;
    this.percentRelativeVolume = percentRelativeVolume;
    this.pinterestProductCategoryId = pinterestProductCategoryId;
    this.productCategory = productCategory;
  }

  /**
   * Engagement type
   **/
  public TrendingProductCategory engagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Engagement type")
  @JsonProperty(required = true, value = "engagement_type")
  @NotNull public ProductCategoriesEngagementType getEngagementType() {
    return engagementType;
  }

  @JsonProperty(required = true, value = "engagement_type")
  public void setEngagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * Month-over-month change percentage
   **/
  public TrendingProductCategory pctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Month-over-month change percentage")
  @JsonProperty(required = true, value = "pct_change_mom")
  @NotNull public Integer getPctChangeMom() {
    return pctChangeMom;
  }

  @JsonProperty(required = true, value = "pct_change_mom")
  public void setPctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
  }

  /**
   * Relative volume percentage
   **/
  public TrendingProductCategory percentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Relative volume percentage")
  @JsonProperty(required = true, value = "percent_relative_volume")
  @NotNull public Integer getPercentRelativeVolume() {
    return percentRelativeVolume;
  }

  @JsonProperty(required = true, value = "percent_relative_volume")
  public void setPercentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
  }

  /**
   * Pinterest Product Category Id
   **/
  public TrendingProductCategory pinterestProductCategoryId(Integer pinterestProductCategoryId) {
    this.pinterestProductCategoryId = pinterestProductCategoryId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pinterest Product Category Id")
  @JsonProperty(required = true, value = "pinterest_product_category_id")
  @NotNull public Integer getPinterestProductCategoryId() {
    return pinterestProductCategoryId;
  }

  @JsonProperty(required = true, value = "pinterest_product_category_id")
  public void setPinterestProductCategoryId(Integer pinterestProductCategoryId) {
    this.pinterestProductCategoryId = pinterestProductCategoryId;
  }

  /**
   * Product Category Name
   **/
  public TrendingProductCategory productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Product Category Name")
  @JsonProperty(required = true, value = "product_category")
  @NotNull public String getProductCategory() {
    return productCategory;
  }

  @JsonProperty(required = true, value = "product_category")
  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * Vertical name associated with the product category
   **/
  public TrendingProductCategory verticals(List<String> verticals) {
    this.verticals = verticals;
    return this;
  }

  
  @ApiModelProperty(value = "Vertical name associated with the product category")
  @JsonProperty("verticals")
  public List<String> getVerticals() {
    return verticals;
  }

  @JsonProperty("verticals")
  public void setVerticals(List<String> verticals) {
    this.verticals = verticals;
  }

  public TrendingProductCategory addVerticalsItem(String verticalsItem) {
    if (this.verticals == null) {
      this.verticals = new ArrayList<>();
    }

    this.verticals.add(verticalsItem);
    return this;
  }

  public TrendingProductCategory removeVerticalsItem(String verticalsItem) {
    if (verticalsItem != null && this.verticals != null) {
      this.verticals.remove(verticalsItem);
    }

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
    TrendingProductCategory trendingProductCategory = (TrendingProductCategory) o;
    return Objects.equals(this.engagementType, trendingProductCategory.engagementType) &&
        Objects.equals(this.pctChangeMom, trendingProductCategory.pctChangeMom) &&
        Objects.equals(this.percentRelativeVolume, trendingProductCategory.percentRelativeVolume) &&
        Objects.equals(this.pinterestProductCategoryId, trendingProductCategory.pinterestProductCategoryId) &&
        Objects.equals(this.productCategory, trendingProductCategory.productCategory) &&
        Objects.equals(this.verticals, trendingProductCategory.verticals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engagementType, pctChangeMom, percentRelativeVolume, pinterestProductCategoryId, productCategory, verticals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingProductCategory {\n");
    
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    pctChangeMom: ").append(toIndentedString(pctChangeMom)).append("\n");
    sb.append("    percentRelativeVolume: ").append(toIndentedString(percentRelativeVolume)).append("\n");
    sb.append("    pinterestProductCategoryId: ").append(toIndentedString(pinterestProductCategoryId)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    verticals: ").append(toIndentedString(verticals)).append("\n");
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
