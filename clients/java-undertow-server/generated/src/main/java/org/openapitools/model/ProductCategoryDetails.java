/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.ProductCategoriesDemographic;
import org.openapitools.model.ProductCategoriesMetricsHighlights;
import org.openapitools.model.ProductCategoryEnum;



/**
 * Product category details
 */

@ApiModel(description = "Product category details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductCategoryDetails   {
  
  private ProductCategoriesDemographic demographics;
  private Boolean hasPrediction;
  private ProductCategoriesMetricsHighlights metricsHighlights;
  private Map<String, BigDecimal> predictedTimeSeries = new HashMap<>();
  private ProductCategoryEnum productCategory;
  private List<String> relatedSearches = new ArrayList<>();
  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  /**
   */
  public ProductCategoryDetails demographics(ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("demographics")
  public ProductCategoriesDemographic getDemographics() {
    return demographics;
  }
  public void setDemographics(ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
  }

  /**
   *     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
   */
  public ProductCategoryDetails hasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.")
  @JsonProperty("has_prediction")
  public Boolean getHasPrediction() {
    return hasPrediction;
  }
  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  /**
   */
  public ProductCategoryDetails metricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("metrics_highlights")
  public ProductCategoriesMetricsHighlights getMetricsHighlights() {
    return metricsHighlights;
  }
  public void setMetricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
  }

  /**
   *     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
   */
  public ProductCategoryDetails predictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
    return this;
  }

  
  @ApiModelProperty(value = "    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.")
  @JsonProperty("predicted_time_series")
  public Map<String, BigDecimal> getPredictedTimeSeries() {
    return predictedTimeSeries;
  }
  public void setPredictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  /**
   */
  public ProductCategoryDetails productCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("product_category")
  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * Related search terms for this product category
   */
  public ProductCategoryDetails relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  
  @ApiModelProperty(value = "Related search terms for this product category")
  @JsonProperty("related_searches")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }
  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  /**
   * Time series data showing trend values over time, indexed between 0 and 100
   */
  public ProductCategoryDetails timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  
  @ApiModelProperty(value = "Time series data showing trend values over time, indexed between 0 and 100")
  @JsonProperty("time_series")
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }
  public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCategoryDetails productCategoryDetails = (ProductCategoryDetails) o;
    return Objects.equals(demographics, productCategoryDetails.demographics) &&
        Objects.equals(hasPrediction, productCategoryDetails.hasPrediction) &&
        Objects.equals(metricsHighlights, productCategoryDetails.metricsHighlights) &&
        Objects.equals(predictedTimeSeries, productCategoryDetails.predictedTimeSeries) &&
        Objects.equals(productCategory, productCategoryDetails.productCategory) &&
        Objects.equals(relatedSearches, productCategoryDetails.relatedSearches) &&
        Objects.equals(timeSeries, productCategoryDetails.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demographics, hasPrediction, metricsHighlights, predictedTimeSeries, productCategory, relatedSearches, timeSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCategoryDetails {\n");
    
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    hasPrediction: ").append(toIndentedString(hasPrediction)).append("\n");
    sb.append("    metricsHighlights: ").append(toIndentedString(metricsHighlights)).append("\n");
    sb.append("    predictedTimeSeries: ").append(toIndentedString(predictedTimeSeries)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    relatedSearches: ").append(toIndentedString(relatedSearches)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
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

