package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ActionType
import org.openapitools.model.BidStrategyType
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
 * @param billableEvent 
 * @param campaignId Campaign ID of the ad group.
 * @param name Ad group name.
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
 * @param bidMultiplier <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
 * @param budgetType 
 * @param pacingDeliveryType 
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
 * @param bidStrategyType 
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param endTime Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @param isCreativeOptimization Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param promotionApplicationLevel Specify if the promotion is applied at ad group or item level
 * @param promotionId Promotion ID. To clear this field, set to null.
 * @param promotionIds Promotion IDs list. To clear this field, set to an empty array [].
 * @param startTime Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
 * @param status Ad group/entity status.
 * @param targetingSpec 
 * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 */
data class AdGroupCreateRequest(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("billable_event")
    @get:JsonProperty("billable_event", required = true) val billableEvent: ActionType,

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(example = "626736533506", required = true, description = "Campaign ID of the ad group.")
    @param:JsonProperty("campaign_id")
    @get:JsonProperty("campaign_id", required = true) val campaignId: kotlin.String,

    @Schema(example = "Ad Group For Pin: 687195905986", required = true, description = "Ad group name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(description = "Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auto_targeting_enabled")
    @get:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = null,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="10")
    @Schema(description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bid_multiplier")
    @get:JsonProperty("bid_multiplier") val bidMultiplier: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("budget_type")
    @get:JsonProperty("budget_type") val budgetType: BudgetType? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pacing_delivery_type")
    @get:JsonProperty("pacing_delivery_type") val pacingDeliveryType: PacingDeliveryType? = null,

    @Schema(example = "5000000", description = "Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.")
    @param:JsonProperty("bid_in_micro_currency")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("bid_strategy_type")
    @get:JsonProperty("bid_strategy_type") val bidStrategyType: BidStrategyType? = null,

    @Schema(example = "5000000", description = "Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.")
    @param:JsonProperty("budget_in_micro_currency")
    @get:JsonProperty("budget_in_micro_currency") val budgetInMicroCurrency: kotlin.Int? = null,

    @Schema(example = "5705424000", description = "Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
    @param:JsonProperty("end_time")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @Schema(example = "true", description = "Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.")
    @param:JsonProperty("is_creative_optimization")
    @get:JsonProperty("is_creative_optimization") val isCreativeOptimization: kotlin.Boolean? = null,

    @Schema(example = "100", description = "Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_frequency_cap")
    @get:JsonProperty("lifetime_frequency_cap") val lifetimeFrequencyCap: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")
    @param:JsonProperty("optimization_goal_metadata")
    @get:JsonProperty("optimization_goal_metadata") val optimizationGoalMetadata: kotlin.Any? = null,

    @field:Valid
    @Schema(description = "<a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("placement_group")
    @get:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = null,

    @Schema(example = "ITEM", description = "Specify if the promotion is applied at ad group or item level")
    @param:JsonProperty("promotion_application_level")
    @get:JsonProperty("promotion_application_level") val promotionApplicationLevel: AdGroupCreateRequest.PromotionApplicationLevel? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "7834020347906", description = "Promotion ID. To clear this field, set to null.")
    @param:JsonProperty("promotion_id")
    @get:JsonProperty("promotion_id") val promotionId: kotlin.String? = "0",

    @Schema(example = "[\"7834020347906\",\"7834020347907\"]", description = "Promotion IDs list. To clear this field, set to an empty array [].")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promotion_ids")
    @get:JsonProperty("promotion_ids") val promotionIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "5686848000", description = "Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.")
    @param:JsonProperty("start_time")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Ad group/entity status.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("targeting_spec")
    @get:JsonProperty("targeting_spec") val targetingSpec: TargetingSpec? = null,

    @get:Size(max=1)
    @Schema(description = "Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].")
    @param:JsonProperty("targeting_template_ids")
    @get:JsonProperty("targeting_template_ids") val targetingTemplateIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.")
    @param:JsonProperty("tracking_urls")
    @get:JsonProperty("tracking_urls") val trackingUrls: kotlin.Any? = null
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PromotionApplicationLevel'")
            }
        }
    }

}

