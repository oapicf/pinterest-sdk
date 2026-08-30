package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.ProductCategoriesDemographic;
import org.openapitools.vertxweb.server.model.ProductCategoriesMetricsHighlights;
import org.openapitools.vertxweb.server.model.ProductCategoryEnum;

/**
 * Product category details
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductCategoryDetails   {
  
  private ProductCategoriesDemographic demographics;
  private Boolean hasPrediction;
  private ProductCategoriesMetricsHighlights metricsHighlights;
  private Map<String, BigDecimal> predictedTimeSeries = new HashMap<>();
  private ProductCategoryEnum productCategory;
  private List<String> relatedSearches = new ArrayList<>();
  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  public ProductCategoryDetails () {

  }

  public ProductCategoryDetails (ProductCategoriesDemographic demographics, Boolean hasPrediction, ProductCategoriesMetricsHighlights metricsHighlights, Map<String, BigDecimal> predictedTimeSeries, ProductCategoryEnum productCategory, List<String> relatedSearches, Map<String, BigDecimal> timeSeries) {
    this.demographics = demographics;
    this.hasPrediction = hasPrediction;
    this.metricsHighlights = metricsHighlights;
    this.predictedTimeSeries = predictedTimeSeries;
    this.productCategory = productCategory;
    this.relatedSearches = relatedSearches;
    this.timeSeries = timeSeries;
  }

    
  @JsonProperty("demographics")
  public ProductCategoriesDemographic getDemographics() {
    return demographics;
  }
  public void setDemographics(ProductCategoriesDemographic demographics) {
    this.demographics = demographics;
  }

    
  @JsonProperty("has_prediction")
  public Boolean getHasPrediction() {
    return hasPrediction;
  }
  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

    
  @JsonProperty("metrics_highlights")
  public ProductCategoriesMetricsHighlights getMetricsHighlights() {
    return metricsHighlights;
  }
  public void setMetricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
    this.metricsHighlights = metricsHighlights;
  }

    
  @JsonProperty("predicted_time_series")
  public Map<String, BigDecimal> getPredictedTimeSeries() {
    return predictedTimeSeries;
  }
  public void setPredictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

    
  @JsonProperty("product_category")
  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
  }

    
  @JsonProperty("related_searches")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }
  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

    
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
