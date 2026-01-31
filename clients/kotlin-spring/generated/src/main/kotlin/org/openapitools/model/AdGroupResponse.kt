package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ActionType
import org.openapitools.model.AdGroupSummaryStatus
import org.openapitools.model.BudgetType
import org.openapitools.model.EntityStatus
import org.openapitools.model.OptimizationGoalMetadata
import org.openapitools.model.PacingDeliveryType
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.TargetingSpec
import org.openapitools.model.TrackingUrls
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
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
 * @param bidStrategyType Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
 * @param billableEvent 
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param budgetType 
 * @param campaignId Campaign ID of the ad group.
 * @param endTime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @param isCreativeOptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param name Ad group name.
 * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @param pacingDeliveryType 
 * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param promotionApplicationLevel Specify if the promotion is applied at ad group or item level
 * @param promotionId Promotion ID. To clear this field, set to null.
 * @param startTime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @param status Ad group/entity status.
 * @param targetingSpec 
 * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param adAccountId Advertiser ID.
 * @param bidMultiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
 * @param conversionLearningModeType oCPM learn mode
 * @param createdTime Ad group creation time. Unix timestamp in seconds.
 * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
 * @param feedProfileId Feed Profile ID associated to the adgroup.
 * @param id Ad group ID.
 * @param summaryStatus Ad group summary status.
 * @param type Always \"adgroup\".
 * @param updatedTime Ad group last update time. Unix timestamp in seconds.
 */
data class AdGroupResponse(

    @Schema(example = "true", description = "Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = null,

    @Schema(example = "5000000", description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @Schema(example = "MAX_BID", description = "Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".")
    @get:JsonProperty("bid_strategy_type") val bidStrategyType: AdGroupResponse.BidStrategyType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billable_event") val billableEvent: ActionType? = null,

    @Schema(example = "5000000", description = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
    @get:JsonProperty("budget_in_micro_currency") val budgetInMicroCurrency: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("budget_type") val budgetType: BudgetType? = null,

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(example = "626736533506", description = "Campaign ID of the ad group.")
    @get:JsonProperty("campaign_id") val campaignId: kotlin.String? = null,

    @Schema(example = "5705424000", description = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @Schema(example = "true", description = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")
    @get:JsonProperty("is_creative_optimization") val isCreativeOptimization: kotlin.Boolean? = null,

    @Schema(example = "100", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
    @get:JsonProperty("lifetime_frequency_cap") val lifetimeFrequencyCap: kotlin.Int? = null,

    @Schema(example = "Ad Group For Pin: 687195905986", description = "Ad group name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
    @get:JsonProperty("optimization_goal_metadata") val optimizationGoalMetadata: OptimizationGoalMetadata? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pacing_delivery_type") val pacingDeliveryType: PacingDeliveryType? = null,

    @field:Valid
    @Schema(example = "null", description = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = null,

    @Schema(example = "ITEM", description = "Specify if the promotion is applied at ad group or item level")
    @get:JsonProperty("promotion_application_level") val promotionApplicationLevel: AdGroupResponse.PromotionApplicationLevel? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "7834020347906", description = "Promotion ID. To clear this field, set to null.")
    @get:JsonProperty("promotion_id") val promotionId: kotlin.String? = "0",

    @Schema(example = "5686848000", description = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "Ad group/entity status.")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpec? = null,

    @get:Size(max=1)
    @Schema(example = "null", description = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
    @get:JsonProperty("targeting_template_ids") val targetingTemplateIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Advertiser ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="10")
    @Schema(example = "1", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.")
    @get:JsonProperty("bid_multiplier") val bidMultiplier: java.math.BigDecimal? = null,

    @Schema(example = "ACTIVE", description = "oCPM learn mode")
    @get:JsonProperty("conversion_learning_mode_type") val conversionLearningModeType: AdGroupResponse.ConversionLearningModeType? = null,

    @Schema(example = "1476477189", description = "Ad group creation time. Unix timestamp in seconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.")
    @get:JsonProperty("dca_assets") val dcaAssets: kotlin.Any? = null,

    @Schema(example = "626736533506", description = "Feed Profile ID associated to the adgroup.")
    @get:JsonProperty("feed_profile_id") val feedProfileId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680060704746", description = "Ad group ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Ad group summary status.")
    @get:JsonProperty("summary_status") val summaryStatus: AdGroupSummaryStatus? = null,

    @Schema(example = "null", description = "Always \"adgroup\".")
    @get:JsonProperty("type") val type: kotlin.String? = "adgroup",

    @Schema(example = "1476477189", description = "Ad group last update time. Unix timestamp in seconds.")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null
) {

    /**
    * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
    * Values: AUTOMATIC_BID,MAX_BID,TARGET_AVG
    */
    enum class BidStrategyType(@get:JsonValue val value: kotlin.String) {

        AUTOMATIC_BID("AUTOMATIC_BID"),
        MAX_BID("MAX_BID"),
        TARGET_AVG("TARGET_AVG");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): BidStrategyType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdGroupResponse'")
            }
        }
    }

    /**
    * Specify if the promotion is applied at ad group or item level
    * Values: NONE,ITEM,AD_GROUP
    */
    enum class PromotionApplicationLevel(@get:JsonValue val value: kotlin.String) {

        NONE("NONE"),
        ITEM("ITEM"),
        AD_GROUP("AD_GROUP");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PromotionApplicationLevel {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdGroupResponse'")
            }
        }
    }

    /**
    * oCPM learn mode
    * Values: NOT_ACTIVE,ACTIVE
    */
    enum class ConversionLearningModeType(@get:JsonValue val value: kotlin.String) {

        NOT_ACTIVE("NOT_ACTIVE"),
        ACTIVE("ACTIVE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ConversionLearningModeType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdGroupResponse'")
            }
        }
    }

}

