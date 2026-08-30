package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoriesEngagementType;



/**
 * Trending shopping product category
 **/

@ApiModel(description = "Trending shopping product category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingProductCategory   {
  @JsonProperty("engagement_type")
  private ProductCategoriesEngagementType engagementType;

  @JsonProperty("pct_change_mom")
  private Integer pctChangeMom;

  @JsonProperty("percent_relative_volume")
  private Integer percentRelativeVolume;

  @JsonProperty("pinterest_product_category_id")
  private Integer pinterestProductCategoryId;

  @JsonProperty("product_category")
  private String productCategory;

  @JsonProperty("verticals")
  private List<String> verticals = null;

  /**
   * Engagement type
   **/
  public TrendingProductCategory engagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Engagement type")
  @JsonProperty("engagement_type")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingProductCategory trendingProductCategory = (TrendingProductCategory) o;
    return Objects.equals(engagementType, trendingProductCategory.engagementType) &&
        Objects.equals(pctChangeMom, trendingProductCategory.pctChangeMom) &&
        Objects.equals(percentRelativeVolume, trendingProductCategory.percentRelativeVolume) &&
        Objects.equals(pinterestProductCategoryId, trendingProductCategory.pinterestProductCategoryId) &&
        Objects.equals(productCategory, trendingProductCategory.productCategory) &&
        Objects.equals(verticals, trendingProductCategory.verticals);
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

