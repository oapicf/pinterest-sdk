package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TrendingPin
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
 * Individual trending topic within an interest category
 * @param description Description of the trending topic
 * @param percentGrowthMom Month-over-month growth percentage
 * @param pins Array of pin images related to this trend (up to 6)
 * @param relatedInterests List of related interest categories
 * @param relatedSearches List of related search terms
 * @param timeSeries Time series data showing trend values over time, with dates as keys and values as numeric
 * @param title Title of the trending topic
 */
data class TrendingTopic(

    @Schema(example = "null", required = true, description = "Description of the trending topic")
    @get:JsonProperty("description", required = true) val description: kotlin.String,

    @Schema(example = "null", required = true, description = "Month-over-month growth percentage")
    @get:JsonProperty("percent_growth_mom", required = true) val percentGrowthMom: kotlin.Int,

    @field:Valid
    @get:Size(max=6)
    @Schema(example = "null", required = true, description = "Array of pin images related to this trend (up to 6)")
    @get:JsonProperty("pins", required = true) val pins: kotlin.collections.List<TrendingPin>,

    @Schema(example = "null", required = true, description = "List of related interest categories")
    @get:JsonProperty("related_interests", required = true) val relatedInterests: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", required = true, description = "List of related search terms")
    @get:JsonProperty("related_searches", required = true) val relatedSearches: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(example = "null", required = true, description = "Time series data showing trend values over time, with dates as keys and values as numeric")
    @get:JsonProperty("time_series", required = true) val timeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,

    @Schema(example = "null", required = true, description = "Title of the trending topic")
    @get:JsonProperty("title", required = true) val title: kotlin.String
) {

}

