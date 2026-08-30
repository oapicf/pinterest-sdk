package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.ProductCategoriesDemographic;
import org.openapitools.model.ProductCategoriesMetricsHighlights;
import org.openapitools.model.ProductCategoryEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Product category details
 */
@ApiModel(description="Product category details")

public class ProductCategoryDetails  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ProductCategoriesDemographic demographics;

 /**
  *     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
  */
  @ApiModelProperty(required = true, value = "    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.")
  private Boolean hasPrediction;

  @ApiModelProperty(value = "")
  @Valid
  private ProductCategoriesMetricsHighlights metricsHighlights;

 /**
  *     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
  */
  @ApiModelProperty(value = "    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.")
  @Valid
  private Map<String, BigDecimal> predictedTimeSeries = new HashMap<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductCategoryEnum productCategory;

 /**
  * Related search terms for this product category
  */
  @ApiModelProperty(value = "Related search terms for this product category")
  private List<String> relatedSearches = new ArrayList<>();

 /**
  * Time series data showing trend values over time, indexed between 0 and 100
  */
  @ApiModelProperty(value = "Time series data showing trend values over time, indexed between 0 and 100")
  @Valid
  private Map<String, BigDecimal> timeSeries = new HashMap<>();
 /**
  * Get demographics
  * @return demographics
  */
  @JsonProperty("demographics")
  public ProductCategoriesDemographic getDemographics() {
    return demographics;
  }

  /**
   * Sets the <code>demographics</code> property.
   */
 public void setDemographics(ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
  }

  /**
   * Sets the <code>demographics</code> property.
   */
  public ProductCategoryDetails demographics(ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
    return this;
  }

 /**
  *     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
  * @return hasPrediction
  */
  @JsonProperty("has_prediction")
  @NotNull
  public Boolean getHasPrediction() {
    return hasPrediction;
  }

  /**
   * Sets the <code>hasPrediction</code> property.
   */
 public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  /**
   * Sets the <code>hasPrediction</code> property.
   */
  public ProductCategoryDetails hasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
    return this;
  }

 /**
  * Get metricsHighlights
  * @return metricsHighlights
  */
  @JsonProperty("metrics_highlights")
  public ProductCategoriesMetricsHighlights getMetricsHighlights() {
    return metricsHighlights;
  }

  /**
   * Sets the <code>metricsHighlights</code> property.
   */
 public void setMetricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
  }

  /**
   * Sets the <code>metricsHighlights</code> property.
   */
  public ProductCategoryDetails metricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
    return this;
  }

 /**
  *     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
  * @return predictedTimeSeries
  */
  @JsonProperty("predicted_time_series")
  public Map<String, BigDecimal> getPredictedTimeSeries() {
    return predictedTimeSeries;
  }

  /**
   * Sets the <code>predictedTimeSeries</code> property.
   */
 public void setPredictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  /**
   * Sets the <code>predictedTimeSeries</code> property.
   */
  public ProductCategoryDetails predictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
    return this;
  }

  /**
   * Puts a new item into the <code>predictedTimeSeries</code> map.
   */
  public ProductCategoryDetails putPredictedTimeSeriesItem(String key, BigDecimal predictedTimeSeriesItem) {
    this.predictedTimeSeries.put(key, predictedTimeSeriesItem);
    return this;
  }

 /**
  * Get productCategory
  * @return productCategory
  */
  @JsonProperty("product_category")
  @NotNull
  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }

  /**
   * Sets the <code>productCategory</code> property.
   */
 public void setProductCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * Sets the <code>productCategory</code> property.
   */
  public ProductCategoryDetails productCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
    return this;
  }

 /**
  * Related search terms for this product category
  * @return relatedSearches
  */
  @JsonProperty("related_searches")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  /**
   * Sets the <code>relatedSearches</code> property.
   */
 public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  /**
   * Sets the <code>relatedSearches</code> property.
   */
  public ProductCategoryDetails relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  /**
   * Adds a new item to the <code>relatedSearches</code> list.
   */
  public ProductCategoryDetails addRelatedSearchesItem(String relatedSearchesItem) {
    this.relatedSearches.add(relatedSearchesItem);
    return this;
  }

 /**
  * Time series data showing trend values over time, indexed between 0 and 100
  * @return timeSeries
  */
  @JsonProperty("time_series")
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }

  /**
   * Sets the <code>timeSeries</code> property.
   */
 public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }

  /**
   * Sets the <code>timeSeries</code> property.
   */
  public ProductCategoryDetails timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  /**
   * Puts a new item into the <code>timeSeries</code> map.
   */
  public ProductCategoryDetails putTimeSeriesItem(String key, BigDecimal timeSeriesItem) {
    this.timeSeries.put(key, timeSeriesItem);
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
    ProductCategoryDetails productCategoryDetails = (ProductCategoryDetails) o;
    return Objects.equals(this.demographics, productCategoryDetails.demographics) &&
        Objects.equals(this.hasPrediction, productCategoryDetails.hasPrediction) &&
        Objects.equals(this.metricsHighlights, productCategoryDetails.metricsHighlights) &&
        Objects.equals(this.predictedTimeSeries, productCategoryDetails.predictedTimeSeries) &&
        Objects.equals(this.productCategory, productCategoryDetails.productCategory) &&
        Objects.equals(this.relatedSearches, productCategoryDetails.relatedSearches) &&
        Objects.equals(this.timeSeries, productCategoryDetails.timeSeries);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

