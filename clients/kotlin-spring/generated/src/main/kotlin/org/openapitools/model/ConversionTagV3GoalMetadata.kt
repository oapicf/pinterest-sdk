package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AttributionWindows
import org.openapitools.model.ConversionEvent
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
 * @param attributionWindows 
 * @param conversionEvent 
 * @param conversionTagId 
 * @param cpaGoalValueInMicroCurrency 
 * @param isRoasOptimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
 * @param reportingEvent Event name for custom or standard events mapped to an oCPM model
 */
data class ConversionTagV3GoalMetadata(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("attribution_windows")
    @get:JsonProperty("attribution_windows") val attributionWindows: AttributionWindows? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_event")
    @get:JsonProperty("conversion_event") val conversionEvent: ConversionEvent? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_tag_id")
    @get:JsonProperty("conversion_tag_id") val conversionTagId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cpa_goal_value_in_micro_currency")
    @get:JsonProperty("cpa_goal_value_in_micro_currency") val cpaGoalValueInMicroCurrency: kotlin.String? = null,

    @Schema(description = "Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).")
    @param:JsonProperty("is_roas_optimized")
    @get:JsonProperty("is_roas_optimized") val isRoasOptimized: kotlin.Boolean? = null,

    @Schema(description = "Event name for custom or standard events mapped to an oCPM model")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("reporting_event")
    @get:JsonProperty("reporting_event") val reportingEvent: kotlin.String? = null
) {

}

