package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoriesEngagementType;
import org.openapitools.model.VerticalProductCategory;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Valid

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
  * Product Category Name
  */
  @ApiModelProperty(required = true, value = "Product Category Name")

  private String productCategory;

 /**
  * Vertical name associated with the product category
  */
  @ApiModelProperty(value = "Vertical name associated with the product category")

  @Valid

  private List<VerticalProductCategory> verticals = new ArrayList<>();
 /**
   * Engagement type
   * @return engagementType
  **/
  @JsonProperty("engagement_type")
  @NotNull
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
  @NotNull
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
  @NotNull
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
   * Product Category Name
   * @return productCategory
  **/
  @JsonProperty("product_category")
  @NotNull
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
  public List<VerticalProductCategory> getVerticals() {
    return verticals;
  }

  public void setVerticals(List<VerticalProductCategory> verticals) {
    this.verticals = verticals;
  }

  public TrendingProductCategory verticals(List<VerticalProductCategory> verticals) {
    this.verticals = verticals;
    return this;
  }

  public TrendingProductCategory addVerticalsItem(VerticalProductCategory verticalsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

