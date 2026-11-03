package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionObjectiveType
import org.openapitools.model.SummaryStatus
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
 * @param campaignStatus 
 * @param endTime Unix UTC timestamp.
 * @param name Campaign name
 * @param objectiveType 
 * @param startTime Unix UTC timestamp.
 */
data class BulkDownloadCampaignFilter(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("campaign_status")
    @get:JsonProperty("campaign_status") val campaignStatus: kotlin.collections.List<SummaryStatus>? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1622848072", description = "Unix UTC timestamp.")
    @param:JsonProperty("end_time")
    @get:JsonProperty("end_time") val endTime: kotlin.String? = null,

    @Schema(example = "campaign name", description = "Campaign name")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("objective_type")
    @get:JsonProperty("objective_type") val objectiveType: kotlin.collections.List<ConversionObjectiveType>? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1622848072", description = "Unix UTC timestamp.")
    @param:JsonProperty("start_time")
    @get:JsonProperty("start_time") val startTime: kotlin.String? = null
) {

}

