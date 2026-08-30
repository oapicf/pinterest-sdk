package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoriesEngagementType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trending shopping product category
 */
@ApiModel(description="Trending shopping product category")

public class TrendingProductCategory  {
  
 /**
  * Engagement type
  */
  @ApiModelProperty(required = true, value = "Engagement type")

  private ProductCategoriesEngagementType engagementType;

 /**
  * Month-over-month change percentage
  */
  @ApiModelProperty(required = true, value = "Month-over-month change percentage")

  private Integer pctChangeMom;

 /**
  * Relative volume percentage
  */
  @ApiModelProperty(required = true, value = "Relative volume percentage")

  private Integer percentRelativeVolume;

 /**
  * Pinterest Product Category Id
  */
  @ApiModelProperty(required = true, value = "Pinterest Product Category Id")

  private Integer pinterestProductCategoryId;

 /**
  * Product Category Name
  */
  @ApiModelProperty(required = true, value = "Product Category Name")

  private String productCategory;

 /**
  * Vertical name associated with the product category
  */
  @ApiModelProperty(value = "Vertical name associated with the product category")

  private List<String> verticals = new ArrayList<>();
 /**
   * Engagement type
   * @return engagementType
  **/
  @JsonProperty("engagement_type")
  public ProductCategoriesEngagementType getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
  }

  public TrendingProductCategory engagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
    return this;
  }

 /**
   * Month-over-month change percentage
   * @return pctChangeMom
  **/
  @JsonProperty("pct_change_mom")
  public Integer getPctChangeMom() {
    return pctChangeMom;
  }

  public void setPctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
  }

  public TrendingProductCategory pctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
    return this;
  }

 /**
   * Relative volume percentage
   * @return percentRelativeVolume
  **/
  @JsonProperty("percent_relative_volume")
  public Integer getPercentRelativeVolume() {
    return percentRelativeVolume;
  }

  public void setPercentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
  }

  public TrendingProductCategory percentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
    return this;
  }

 /**
   * Pinterest Product Category Id
   * @return pinterestProductCategoryId
  **/
  @JsonProperty("pinterest_product_category_id")
  public Integer getPinterestProductCategoryId() {
    return pinterestProductCategoryId;
  }

  public void setPinterestProductCategoryId(Integer pinterestProductCategoryId) {
    this.pinterestProductCategoryId = pinterestProductCategoryId;
  }

  public TrendingProductCategory pinterestProductCategoryId(Integer pinterestProductCategoryId) {
    this.pinterestProductCategoryId = pinterestProductCategoryId;
    return this;
  }

 /**
   * Product Category Name
   * @return productCategory
  **/
  @JsonProperty("product_category")
  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  public TrendingProductCategory productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

 /**
   * Vertical name associated with the product category
   * @return verticals
  **/
  @JsonProperty("verticals")
  public List<String> getVerticals() {
    return verticals;
  }

  public void setVerticals(List<String> verticals) {
    this.verticals = verticals;
  }

  public TrendingProductCategory verticals(List<String> verticals) {
    this.verticals = verticals;
    return this;
  }

  public TrendingProductCategory addVerticalsItem(String verticalsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

