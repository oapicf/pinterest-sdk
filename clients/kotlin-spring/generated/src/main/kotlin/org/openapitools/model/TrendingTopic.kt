package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param id Unique identifier for the trending topic
 * @param pins Array of pin images related to this trend (up to 6)
 * @param relatedInterests List of related interest categories
 * @param relatedSearches List of related search terms
 * @param timeSeries Time series data showing trend values over time, with dates as keys and values as numeric
 * @param title Title of the trending topic
 * @param percentGrowthMom Month-over-month growth percentage
 */
data class TrendingTopic(

    @Schema(required = true, description = "Description of the trending topic")
    @param:JsonProperty("description")
    @get:JsonProperty("description", required = true) val description: kotlin.String,

    @Schema(required = true, description = "Unique identifier for the trending topic")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @get:Size(max=6)
    @Schema(required = true, description = "Array of pin images related to this trend (up to 6)")
    @param:JsonProperty("pins")
    @get:JsonProperty("pins", required = true) val pins: kotlin.collections.List<TrendingPin>,

    @Schema(required = true, description = "List of related interest categories")
    @param:JsonProperty("related_interests")
    @get:JsonProperty("related_interests", required = true) val relatedInterests: kotlin.collections.List<kotlin.String>,

    @Schema(required = true, description = "List of related search terms")
    @param:JsonProperty("related_searches")
    @get:JsonProperty("related_searches", required = true) val relatedSearches: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(required = true, description = "Time series data showing trend values over time, with dates as keys and values as numeric")
    @param:JsonProperty("time_series")
    @get:JsonProperty("time_series", required = true) val timeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,

    @Schema(required = true, description = "Title of the trending topic")
    @param:JsonProperty("title")
    @get:JsonProperty("title", required = true) val title: kotlin.String,

    @Schema(description = "Month-over-month growth percentage")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("percent_growth_mom")
    @get:JsonProperty("percent_growth_mom") val percentGrowthMom: kotlin.Int? = null
) {

}

