package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ProductCategoriesEngagementType;

/**
 * Trending shopping product category
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendingProductCategory   {
  
  private ProductCategoriesEngagementType engagementType;
  private Integer pctChangeMom;
  private Integer percentRelativeVolume;
  private Integer pinterestProductCategoryId;
  private String productCategory;
  private List<String> verticals = new ArrayList<>();

  public TrendingProductCategory () {

  }

  public TrendingProductCategory (ProductCategoriesEngagementType engagementType, Integer pctChangeMom, Integer percentRelativeVolume, Integer pinterestProductCategoryId, String productCategory, List<String> verticals) {
    this.engagementType = engagementType;
    this.pctChangeMom = pctChangeMom;
    this.percentRelativeVolume = percentRelativeVolume;
    this.pinterestProductCategoryId = pinterestProductCategoryId;
    this.productCategory = productCategory;
    this.verticals = verticals;
  }

    
  @JsonProperty("engagement_type")
  public ProductCategoriesEngagementType getEngagementType() {
    return engagementType;
  }
  public void setEngagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
  }

    
  @JsonProperty("pct_change_mom")
  public Integer getPctChangeMom() {
    return pctChangeMom;
  }
  public void setPctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
  }

    
  @JsonProperty("percent_relative_volume")
  public Integer getPercentRelativeVolume() {
    return percentRelativeVolume;
  }
  public void setPercentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
  }

    
  @JsonProperty("pinterest_product_category_id")
  public Integer getPinterestProductCategoryId() {
    return pinterestProductCategoryId;
  }
  public void setPinterestProductCategoryId(Integer pinterestProductCategoryId) {
    this.pinterestProductCategoryId = pinterestProductCategoryId;
  }

    
  @JsonProperty("product_category")
  public String getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

    
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
