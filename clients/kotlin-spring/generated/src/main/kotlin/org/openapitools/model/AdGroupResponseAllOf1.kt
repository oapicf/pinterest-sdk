package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ActionType
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
 * @param campaignId Campaign ID of the ad group.
 * @param billableEvent 
 * @param id Ad group ID.
 * @param type Always \"adgroup\".
 * @param adAccountId Advertiser ID.
 * @param createdTime Ad group creation time. Unix timestamp in seconds.
 * @param updatedTime Ad group last update time. Unix timestamp in seconds.
 */
data class AdGroupResponseAllOf1(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("campaign_id") val campaignId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("billable_event") val billableEvent: ActionType? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("type") val type: kotlin.String? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @field:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @field:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null
) {

}

