package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Product category details
 */

@Schema(name = "ProductCategoryDetails", description = "Product category details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductCategoryDetails {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProductCategoriesDemographic demographics;

  private Boolean hasPrediction;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProductCategoriesMetricsHighlights metricsHighlights;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Map<String, BigDecimal> predictedTimeSeries = new HashMap<>();

  private ProductCategoryEnum productCategory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> relatedSearches = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  public ProductCategoryDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductCategoryDetails(Boolean hasPrediction, ProductCategoryEnum productCategory) {
    this.hasPrediction = hasPrediction;
    this.productCategory = productCategory;
  }

  public ProductCategoryDetails demographics(@Nullable ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
   */
  @Valid 
  @Schema(name = "demographics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demographics")
  public @Nullable ProductCategoriesDemographic getDemographics() {
    return demographics;
  }

  @JsonProperty("demographics")
  public void setDemographics(@Nullable ProductCategoriesDemographic demographics) {
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
  @NotNull 
  @Schema(name = "has_prediction", description = "    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_prediction")
  public Boolean getHasPrediction() {
    return hasPrediction;
  }

  @JsonProperty("has_prediction")
  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  public ProductCategoryDetails metricsHighlights(@Nullable ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
    return this;
  }

  /**
   * Get metricsHighlights
   * @return metricsHighlights
   */
  @Valid 
  @Schema(name = "metrics_highlights", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics_highlights")
  public @Nullable ProductCategoriesMetricsHighlights getMetricsHighlights() {
    return metricsHighlights;
  }

  @JsonProperty("metrics_highlights")
  public void setMetricsHighlights(@Nullable ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
  }

  public ProductCategoryDetails predictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
    return this;
  }

  public ProductCategoryDetails putPredictedTimeSeriesItem(String key, BigDecimal predictedTimeSeriesItem) {
    if (this.predictedTimeSeries == null) {
      this.predictedTimeSeries = new HashMap<>();
    }
    this.predictedTimeSeries.put(key, predictedTimeSeriesItem);
    return this;
  }

  /**
   *     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
   * @return predictedTimeSeries
   */
  @Valid 
  @Schema(name = "predicted_time_series", description = "    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("predicted_time_series")
  public Map<String, BigDecimal> getPredictedTimeSeries() {
    return predictedTimeSeries;
  }

  @JsonProperty("predicted_time_series")
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
  @NotNull @Valid 
  @Schema(name = "product_category", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_category")
  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }

  @JsonProperty("product_category")
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
  
  @Schema(name = "related_searches", description = "Related search terms for this product category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related_searches")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  @JsonProperty("related_searches")
  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  public ProductCategoryDetails timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public ProductCategoryDetails putTimeSeriesItem(String key, BigDecimal timeSeriesItem) {
    if (this.timeSeries == null) {
      this.timeSeries = new HashMap<>();
    }
    this.timeSeries.put(key, timeSeriesItem);
    return this;
  }

  /**
   * Time series data showing trend values over time, indexed between 0 and 100
   * @return timeSeries
   */
  @Valid 
  @Schema(name = "time_series", description = "Time series data showing trend values over time, indexed between 0 and 100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time_series")
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }

  @JsonProperty("time_series")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

