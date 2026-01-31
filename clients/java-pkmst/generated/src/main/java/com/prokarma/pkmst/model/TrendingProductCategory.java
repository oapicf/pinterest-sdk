package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ProductCategoriesEngagementType;
import com.prokarma.pkmst.model.VerticalProductCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Trending shopping product category
 */
@ApiModel(description = "Trending shopping product category")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingProductCategory   {
  @JsonProperty("engagement_type")
  private ProductCategoriesEngagementType engagementType;

  @JsonProperty("pct_change_mom")
  private Integer pctChangeMom;

  @JsonProperty("percent_relative_volume")
  private Integer percentRelativeVolume;

  @JsonProperty("product_category")
  private String productCategory;

  @JsonProperty("verticals")
  
  private List<VerticalProductCategory> verticals = null;

  public TrendingProductCategory engagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  /**
   * Engagement type
   * @return engagementType
   */
  @ApiModelProperty(required = true, value = "Engagement type")
  public ProductCategoriesEngagementType getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
  }

  public TrendingProductCategory pctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
    return this;
  }

  /**
   * Month-over-month change percentage
   * @return pctChangeMom
   */
  @ApiModelProperty(required = true, value = "Month-over-month change percentage")
  public Integer getPctChangeMom() {
    return pctChangeMom;
  }

  public void setPctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
  }

  public TrendingProductCategory percentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
    return this;
  }

  /**
   * Relative volume percentage
   * @return percentRelativeVolume
   */
  @ApiModelProperty(required = true, value = "Relative volume percentage")
  public Integer getPercentRelativeVolume() {
    return percentRelativeVolume;
  }

  public void setPercentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
  }

  public TrendingProductCategory productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Product Category Name
   * @return productCategory
   */
  @ApiModelProperty(required = true, value = "Product Category Name")
  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  public TrendingProductCategory verticals(List<VerticalProductCategory> verticals) {
    this.verticals = verticals;
    return this;
  }

  public TrendingProductCategory addVerticalsItem(VerticalProductCategory verticalsItem) {
    if (this.verticals == null) {
      this.verticals = new ArrayList<>();
    }
    this.verticals.add(verticalsItem);
    return this;
  }

  /**
   * Vertical name associated with the product category
   * @return verticals
   */
  @ApiModelProperty(value = "Vertical name associated with the product category")
  public List<VerticalProductCategory> getVerticals() {
    return verticals;
  }

  public void setVerticals(List<VerticalProductCategory> verticals) {
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
    return Objects.equals(this.engagementType, trendingProductCategory.engagementType) &&
        Objects.equals(this.pctChangeMom, trendingProductCategory.pctChangeMom) &&
        Objects.equals(this.percentRelativeVolume, trendingProductCategory.percentRelativeVolume) &&
        Objects.equals(this.productCategory, trendingProductCategory.productCategory) &&
        Objects.equals(this.verticals, trendingProductCategory.verticals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engagementType, pctChangeMom, percentRelativeVolume, productCategory, verticals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingProductCategory {\n");
    
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    pctChangeMom: ").append(toIndentedString(pctChangeMom)).append("\n");
    sb.append("    percentRelativeVolume: ").append(toIndentedString(percentRelativeVolume)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

