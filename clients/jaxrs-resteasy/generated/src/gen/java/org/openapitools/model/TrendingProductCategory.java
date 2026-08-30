package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoriesEngagementType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Trending shopping product category")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
  
  @ApiModelProperty(required = true, value = "Engagement type")
  @JsonProperty("engagement_type")
  @NotNull
  @Valid
  public ProductCategoriesEngagementType getEngagementType() {
    return engagementType;
  }
  public void setEngagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * Month-over-month change percentage
   **/
  
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

