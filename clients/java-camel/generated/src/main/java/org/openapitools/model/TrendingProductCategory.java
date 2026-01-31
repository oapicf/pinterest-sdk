package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoriesEngagementType;
import org.openapitools.model.VerticalProductCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Trending shopping product category
 */

@Schema(name = "TrendingProductCategory", description = "Trending shopping product category")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingProductCategory {

  private ProductCategoriesEngagementType engagementType;

  private Integer pctChangeMom;

  private Integer percentRelativeVolume;

  private String productCategory;

  @Valid
  private List<VerticalProductCategory> verticals = new ArrayList<>();

  public TrendingProductCategory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrendingProductCategory(ProductCategoriesEngagementType engagementType, Integer pctChangeMom, Integer percentRelativeVolume, String productCategory) {
    this.engagementType = engagementType;
    this.pctChangeMom = pctChangeMom;
    this.percentRelativeVolume = percentRelativeVolume;
    this.productCategory = productCategory;
  }

  public TrendingProductCategory engagementType(ProductCategoriesEngagementType engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  /**
   * Engagement type
   * @return engagementType
   */
  @NotNull @Valid 
  @Schema(name = "engagement_type", description = "Engagement type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engagement_type")
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
  @NotNull 
  @Schema(name = "pct_change_mom", description = "Month-over-month change percentage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pct_change_mom")
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
  @NotNull 
  @Schema(name = "percent_relative_volume", description = "Relative volume percentage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("percent_relative_volume")
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
  @NotNull 
  @Schema(name = "product_category", description = "Product Category Name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_category")
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
  @Valid 
  @Schema(name = "verticals", description = "Vertical name associated with the product category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verticals")
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

