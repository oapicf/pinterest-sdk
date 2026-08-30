package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoriesEngagementType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Trending shopping product category
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Trending shopping product category")
public class TrendingProductCategory   {
  
  private ProductCategoriesEngagementType engagementType;

  private Integer pctChangeMom;

  private Integer percentRelativeVolume;

  private Integer pinterestProductCategoryId;

  private String productCategory;

  private List<String> verticals = new ArrayList<>();

  /**
   * Engagement type
   **/
  public TrendingProductCategory engagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Engagement type")
  @JsonProperty("engagement_type")
  @NotNull
  public ProductCategoriesEngagementType getEngagementType() {
    return engagementType;
  }
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
  @JsonProperty("pct_change_mom")
  @NotNull
  public Integer getPctChangeMom() {
    return pctChangeMom;
  }
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
  @JsonProperty("percent_relative_volume")
  @NotNull
  public Integer getPercentRelativeVolume() {
    return percentRelativeVolume;
  }
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
  @JsonProperty("pinterest_product_category_id")
  @NotNull
  public Integer getPinterestProductCategoryId() {
    return pinterestProductCategoryId;
  }
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
  @JsonProperty("product_category")
  @NotNull
  public String getProductCategory() {
    return productCategory;
  }
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

