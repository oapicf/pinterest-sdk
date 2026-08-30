package org.openapitools.model;

import org.openapitools.model.ProductCategoriesEngagementType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Trending shopping product category
 */
public class TrendingProductCategory implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Engagement type
   */
  @JsonProperty("engagement_type")
  private ProductCategoriesEngagementType engagementType;

  /**
   * Month-over-month change percentage
   */
  @JsonProperty("pct_change_mom")
  private Integer pctChangeMom;

  /**
   * Relative volume percentage
   */
  @JsonProperty("percent_relative_volume")
  private Integer percentRelativeVolume;

  /**
   * Pinterest Product Category Id
   */
  @JsonProperty("pinterest_product_category_id")
  private Integer pinterestProductCategoryId;

  /**
   * Product Category Name
   */
  @JsonProperty("product_category")
  private String productCategory;

  /**
   * Vertical name associated with the product category
   */
  @JsonProperty("verticals")
  private List<String> verticals = new ArrayList<>();

  /**
   * Engagement type
   * @return engagementType
   */
  public ProductCategoriesEngagementType getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
  }

  /**
   * Month-over-month change percentage
   * @return pctChangeMom
   */
  public Integer getPctChangeMom() {
    return pctChangeMom;
  }

  public void setPctChangeMom(Integer pctChangeMom) {
    this.pctChangeMom = pctChangeMom;
  }

  /**
   * Relative volume percentage
   * @return percentRelativeVolume
   */
  public Integer getPercentRelativeVolume() {
    return percentRelativeVolume;
  }

  public void setPercentRelativeVolume(Integer percentRelativeVolume) {
    this.percentRelativeVolume = percentRelativeVolume;
  }

  /**
   * Pinterest Product Category Id
   * @return pinterestProductCategoryId
   */
  public Integer getPinterestProductCategoryId() {
    return pinterestProductCategoryId;
  }

  public void setPinterestProductCategoryId(Integer pinterestProductCategoryId) {
    this.pinterestProductCategoryId = pinterestProductCategoryId;
  }

  /**
   * Product Category Name
   * @return productCategory
   */
  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * Vertical name associated with the product category
   * @return verticals
   */
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
