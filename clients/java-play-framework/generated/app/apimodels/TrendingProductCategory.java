package apimodels;

import apimodels.ProductCategoriesEngagementType;
import apimodels.VerticalProductCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Trending shopping product category
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingProductCategory   {
  @JsonProperty("engagement_type")
  @NotNull
@Valid

  private ProductCategoriesEngagementType engagementType;

  @JsonProperty("pct_change_mom")
  @NotNull

  private Integer pctChangeMom;

  @JsonProperty("percent_relative_volume")
  @NotNull

  private Integer percentRelativeVolume;

  @JsonProperty("product_category")
  @NotNull

  private String productCategory;

  @JsonProperty("verticals")
  @Valid

  private List<VerticalProductCategory> verticals = null;

  public TrendingProductCategory engagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
    return this;
  }

   /**
   * Engagement type
   * @return engagementType
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(engagementType, trendingProductCategory.engagementType) &&
        Objects.equals(pctChangeMom, trendingProductCategory.pctChangeMom) &&
        Objects.equals(percentRelativeVolume, trendingProductCategory.percentRelativeVolume) &&
        Objects.equals(productCategory, trendingProductCategory.productCategory) &&
        Objects.equals(verticals, trendingProductCategory.verticals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engagementType, pctChangeMom, percentRelativeVolume, productCategory, verticals);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

