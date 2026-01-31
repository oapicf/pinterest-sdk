package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PredictedTimeSeries
import org.openapitools.model.TimeSeries
import org.openapitools.model.TrendingKeywordDemographics
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
 * 
 * @param demographics 
 * @param hasPrediction Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
 * @param keyword The keyword that is trending.
 * @param pctGrowthMom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
 * @param pctGrowthWow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
 * @param pctGrowthYoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
 * @param predictedTimeSeries 
 * @param timeSeries 
 */
data class TrendingKeyword(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("demographics") val demographics: TrendingKeywordDemographics? = null,

    @Schema(example = "false", description = "Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.")
    @get:JsonProperty("has_prediction") val hasPrediction: kotlin.Boolean? = null,

    @get:Size(min=1)
    @Schema(example = "couples halloween costumes", description = "The keyword that is trending.")
    @get:JsonProperty("keyword") val keyword: kotlin.String? = null,

    @Schema(example = "400", description = "The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.")
    @get:JsonProperty("pct_growth_mom") val pctGrowthMom: kotlin.Int? = null,

    @Schema(example = "50", description = "The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.")
    @get:JsonProperty("pct_growth_wow") val pctGrowthWow: kotlin.Int? = null,

    @Schema(example = "-5", description = "The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.")
    @get:JsonProperty("pct_growth_yoy") val pctGrowthYoy: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("predicted_time_series") val predictedTimeSeries: PredictedTimeSeries? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("time_series") val timeSeries: TimeSeries? = null
) {

}

