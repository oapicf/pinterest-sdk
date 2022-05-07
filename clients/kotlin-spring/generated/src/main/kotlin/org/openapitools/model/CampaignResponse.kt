package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CampaignCommon
import org.openapitools.model.CampaignResponseAllOf
import org.openapitools.model.CampaignResponseAllOf1
import org.openapitools.model.EntityStatus
import org.openapitools.model.ObjectiveType
import org.openapitools.model.TrackingUrls
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param id Campaign ID.
 * @param adAccountId Campaign's Advertiser ID.
 * @param name Campaign name.
 * @param status 
 * @param lifetimeSpendCap Campaign total spending cap.
 * @param dailySpendCap Campaign daily spending cap.
 * @param orderLineId Order line ID that appears on the invoice.
 * @param trackingUrls 
 * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param objectiveType 
 * @param createdTime Campaign creation time. Unix timestamp in seconds.
 * @param updatedTime UTC timestamp. Last update time.
 * @param type Always \"campaign\".
 */
data class CampaignResponse(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("id", required = true) val id: kotlin.String,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("ad_account_id", required = true) val adAccountId: kotlin.String,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("status") val status: EntityStatus? = "ACTIVE",

    @field:JsonProperty("lifetime_spend_cap") val lifetimeSpendCap: kotlin.Int? = null,

    @field:JsonProperty("daily_spend_cap") val dailySpendCap: kotlin.Int? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("order_line_id") val orderLineId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @field:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("objective_type") val objectiveType: ObjectiveType? = null,

    @field:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @field:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @field:JsonProperty("type") val type: kotlin.String? = null
) {

}

