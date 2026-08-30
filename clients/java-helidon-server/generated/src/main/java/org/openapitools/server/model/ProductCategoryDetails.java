package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.ProductCategoriesDemographic;
import org.openapitools.server.model.ProductCategoriesMetricsHighlights;
import org.openapitools.server.model.ProductCategoryEnum;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Product category details
 */
public class ProductCategoryDetails   {

    private ProductCategoriesDemographic demographics;
    private Boolean hasPrediction;
    private ProductCategoriesMetricsHighlights metricsHighlights;
    private Map<String, BigDecimal> predictedTimeSeries = new HashMap<>();
    private ProductCategoryEnum productCategory;
    private List<String> relatedSearches = new ArrayList<>();
    private Map<String, BigDecimal> timeSeries = new HashMap<>();

    /**
     * Default constructor.
     */
    public ProductCategoryDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductCategoryDetails.
     *
     * @param demographics demographics
     * @param hasPrediction     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
     * @param metricsHighlights metricsHighlights
     * @param predictedTimeSeries     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
     * @param productCategory productCategory
     * @param relatedSearches Related search terms for this product category
     * @param timeSeries Time series data showing trend values over time, indexed between 0 and 100
     */
    public ProductCategoryDetails(
        ProductCategoriesDemographic demographics, 
        Boolean hasPrediction, 
        ProductCategoriesMetricsHighlights metricsHighlights, 
        Map<String, BigDecimal> predictedTimeSeries, 
        ProductCategoryEnum productCategory, 
        List<String> relatedSearches, 
        Map<String, BigDecimal> timeSeries
    ) {
        this.demographics = demographics;
        this.hasPrediction = hasPrediction;
        this.metricsHighlights = metricsHighlights;
        this.predictedTimeSeries = predictedTimeSeries;
        this.productCategory = productCategory;
        this.relatedSearches = relatedSearches;
        this.timeSeries = timeSeries;
    }



    /**
     * Get demographics
     * @return demographics
     */
    public ProductCategoriesDemographic getDemographics() {
        return demographics;
    }

    public void setDemographics(ProductCategoriesDemographic demographics) {
        this.demographics = demographics;
    }

    /**
     *     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
     * @return hasPrediction
     */
    public Boolean getHasPrediction() {
        return hasPrediction;
    }

    public void setHasPrediction(Boolean hasPrediction) {
        this.hasPrediction = hasPrediction;
    }

    /**
     * Get metricsHighlights
     * @return metricsHighlights
     */
    public ProductCategoriesMetricsHighlights getMetricsHighlights() {
        return metricsHighlights;
    }

    public void setMetricsHighlights(ProductCategoriesMetricsHighlights metricsHighlights) {
        this.metricsHighlights = metricsHighlights;
    }

    /**
     *     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
     * @return predictedTimeSeries
     */
    public Map<String, BigDecimal> getPredictedTimeSeries() {
        return predictedTimeSeries;
    }

    public void setPredictedTimeSeries(Map<String, BigDecimal> predictedTimeSeries) {
        this.predictedTimeSeries = predictedTimeSeries;
    }

    /**
     * Get productCategory
     * @return productCategory
     */
    public ProductCategoryEnum getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategoryEnum productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Related search terms for this product category
     * @return relatedSearches
     */
    public List<String> getRelatedSearches() {
        return relatedSearches;
    }

    public void setRelatedSearches(List<String> relatedSearches) {
        this.relatedSearches = relatedSearches;
    }

    /**
     * Time series data showing trend values over time, indexed between 0 and 100
     * @return timeSeries
     */
    public Map<String, BigDecimal> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
        this.timeSeries = timeSeries;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

