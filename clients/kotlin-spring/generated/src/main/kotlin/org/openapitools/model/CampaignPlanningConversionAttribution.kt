package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignPlanningConversionAttributionWindowDays
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
 * Attribution windows for a conversion event.
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action.
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action.
 */
data class CampaignPlanningConversionAttribution(

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for a pin click action.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("click_window_days")
    @get:JsonProperty("click_window_days") val clickWindowDays: CampaignPlanningConversionAttributionWindowDays? = null,

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("engagement_window_days")
    @get:JsonProperty("engagement_window_days") val engagementWindowDays: CampaignPlanningConversionAttributionWindowDays? = null,

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for a view action.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("view_window_days")
    @get:JsonProperty("view_window_days") val viewWindowDays: CampaignPlanningConversionAttributionWindowDays? = null
) {

}

