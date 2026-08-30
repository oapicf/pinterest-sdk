package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ProductCategoriesDemographic;
import com.prokarma.pkmst.model.ProductCategoriesMetricsHighlights;
import com.prokarma.pkmst.model.ProductCategoryEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Product category details
 */
@ApiModel(description = "Product category details")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductCategoryDetails   {
  @JsonProperty("demographics")
  private ProductCategoriesDemographic demographics;

  @JsonProperty("has_prediction")
  private Boolean hasPrediction;

  @JsonProperty("metrics_highlights")
  private ProductCategoriesMetricsHighlights metricsHighlights;

  @JsonProperty("predicted_time_series")
  
  private Map<String, BigDecimal> predictedTimeSeries = null;

  @JsonProperty("product_category")
  private ProductCategoryEnum productCategory;

  @JsonProperty("related_searches")
  
  private List<String> relatedSearches = null;

  @JsonProperty("time_series")
  
  private Map<String, BigDecimal> timeSeries = null;

  public ProductCategoryDetails demographics(ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
   */
  @ApiModelProperty(value = "")
  public ProductCategoriesDemographic getDemographics() {
    return demographics;
  }

  public void setDemographics(ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
  }

  public ProductCategoryDetails hasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
    return this;
  }

  /**
   *     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
   * @return hasPrediction
   */
  @ApiModelProperty(required = true, value = "    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.")
  public Boolean getHasPrediction() {
    return hasPrediction;
  }

  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  public ProductCategoryDetails metricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
    return this;
  }

  /**
   * Get metricsHighlights
   * @return metricsHighlights
   */
  @ApiModelProperty(value = "")
  public ProductCategoriesMetricsHighlights getMetricsHighlights() {
    return metricsHighlights;
  }

  public void setMetricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
  }

  public ProductCategoryDetails predictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
    return this;
  }

  public ProductCategoryDetails putPredictedTimeSeriesItem(String key, BigDecimal predictedTimeSeriesItem) {
    if (this.predictedTimeSeries == null) {
      this.predictedTimeSeries = new HashMap<>());
    }
    this.predictedTimeSeries.put(key, predictedTimeSeriesItem);
    return this;
  }

  /**
   *     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
   * @return predictedTimeSeries
   */
  @ApiModelProperty(value = "    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.")
  public Map<String, BigDecimal> getPredictedTimeSeries() {
    return predictedTimeSeries;
  }

  public void setPredictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  public ProductCategoryDetails productCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
   */
  @ApiModelProperty(required = true, value = "")
  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
  }

  public ProductCategoryDetails relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  public ProductCategoryDetails addRelatedSearchesItem(String relatedSearchesItem) {
    if (this.relatedSearches == null) {
      this.relatedSearches = new ArrayList<>();
    }
    this.relatedSearches.add(relatedSearchesItem);
    return this;
  }

  /**
   * Related search terms for this product category
   * @return relatedSearches
   */
  @ApiModelProperty(value = "Related search terms for this product category")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  public ProductCategoryDetails timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public ProductCategoryDetails putTimeSeriesItem(String key, BigDecimal timeSeriesItem) {
    if (this.timeSeries == null) {
      this.timeSeries = new HashMap<>());
    }
    this.timeSeries.put(key, timeSeriesItem);
    return this;
  }

  /**
   * Time series data showing trend values over time, indexed between 0 and 100
   * @return timeSeries
   */
  @ApiModelProperty(value = "Time series data showing trend values over time, indexed between 0 and 100")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

