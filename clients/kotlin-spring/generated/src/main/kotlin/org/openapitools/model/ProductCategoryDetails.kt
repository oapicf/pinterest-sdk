package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ProductCategoriesDemographic
import org.openapitools.model.ProductCategoriesMetricsHighlights
import org.openapitools.model.ProductCategoryEnum
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Product category details
 * @param hasPrediction      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
 * @param productCategory 
 * @param demographics 
 * @param metricsHighlights 
 * @param predictedTimeSeries      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
 * @param relatedSearches Related search terms for this product category
 * @param timeSeries Time series data showing trend values over time, indexed between 0 and 100
 */
data class ProductCategoryDetails(

    @Schema(example = "null", required = true, description = "     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.")
    @get:JsonProperty("has_prediction", required = true) val hasPrediction: kotlin.Boolean,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("product_category", required = true) val productCategory: ProductCategoryEnum,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("demographics") val demographics: ProductCategoriesDemographic? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("metrics_highlights") val metricsHighlights: ProductCategoriesMetricsHighlights? = null,

    @field:Valid
    @Schema(example = "null", description = "     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.")
    @get:JsonProperty("predicted_time_series") val predictedTimeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @Schema(example = "null", description = "Related search terms for this product category")
    @get:JsonProperty("related_searches") val relatedSearches: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Time series data showing trend values over time, indexed between 0 and 100")
    @get:JsonProperty("time_series") val timeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
) {

}

