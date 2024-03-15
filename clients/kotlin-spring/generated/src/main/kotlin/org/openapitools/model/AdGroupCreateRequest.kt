package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ActionType
import org.openapitools.model.AdGroupCommonOptimizationGoalMetadata
import org.openapitools.model.AdGroupCommonTrackingUrls
import org.openapitools.model.BudgetType
import org.openapitools.model.EntityStatus
import org.openapitools.model.PacingDeliveryType
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.TargetingSpec
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
 * @param name Ad group name.
 * @param campaignId Campaign ID of the ad group.
 * @param billableEvent 
 * @param status Ad group/entity status.
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param optimizationGoalMetadata 
 * @param budgetType 
 * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @param endTime Ad group end time. Unix timestamp in seconds.
 * @param targetingSpec 
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param trackingUrls 
 * @param autoTargetingEnabled Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementGroup <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param pacingDeliveryType 
 * @param bidStrategyType Bid strategy type
 */
data class AdGroupCreateRequest(

    @Schema(example = "Ad Group For Pin: 687195905986", required = true, description = "Ad group name.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(example = "626736533506", required = true, description = "Campaign ID of the ad group.")
    @get:JsonProperty("campaign_id", required = true) val campaignId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("billable_event", required = true) val billableEvent: ActionType,

    @field:Valid
    @Schema(example = "null", description = "Ad group/entity status.")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @Schema(example = "5000000", description = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
    @get:JsonProperty("budget_in_micro_currency") val budgetInMicroCurrency: kotlin.Int? = null,

    @Schema(example = "5000000", description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("optimization_goal_metadata") val optimizationGoalMetadata: AdGroupCommonOptimizationGoalMetadata? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("budget_type") val budgetType: BudgetType? = "DAILY",

    @Schema(example = "5686848000", description = "Ad group start time. Unix timestamp in seconds. Defaults to current time.")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @Schema(example = "5705424000", description = "Ad group end time. Unix timestamp in seconds.")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpec? = null,

    @Schema(example = "100", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
    @get:JsonProperty("lifetime_frequency_cap") val lifetimeFrequencyCap: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tracking_urls") val trackingUrls: AdGroupCommonTrackingUrls? = null,

    @Schema(example = "true", description = "Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "<a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pacing_delivery_type") val pacingDeliveryType: PacingDeliveryType? = "STANDARD",

    @Schema(example = "MAX_BID", description = "Bid strategy type")
    @get:JsonProperty("bid_strategy_type") val bidStrategyType: AdGroupCreateRequest.BidStrategyType? = null
) {

    /**
    * Bid strategy type
    * Values: AUTOMATIC_BID,MAX_BID,TARGET_AVG,`null`
    */
    enum class BidStrategyType(val value: kotlin.String) {

        @JsonProperty("AUTOMATIC_BID") AUTOMATIC_BID("AUTOMATIC_BID"),
        @JsonProperty("MAX_BID") MAX_BID("MAX_BID"),
        @JsonProperty("TARGET_AVG") TARGET_AVG("TARGET_AVG"),
        @JsonProperty("null") `null`("null")
    }

}

