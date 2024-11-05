package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CampaignSummaryStatus
import org.openapitools.model.ObjectiveType
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
 * @param startTime Unix UTC timestamp.
 * @param endTime Unix UTC timestamp.
 * @param name Campaign name
 * @param campaignStatus 
 * @param objectiveType 
 */
data class BulkDownloadRequestCampaignFilter(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1622848072", description = "Unix UTC timestamp.")
    @get:JsonProperty("start_time") val startTime: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1622848072", description = "Unix UTC timestamp.")
    @get:JsonProperty("end_time") val endTime: kotlin.String? = null,

    @Schema(example = "campaign name", description = "Campaign name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("campaign_status") val campaignStatus: kotlin.collections.List<CampaignSummaryStatus>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("objective_type") val objectiveType: kotlin.collections.List<ObjectiveType>? = null
    ) {

}

