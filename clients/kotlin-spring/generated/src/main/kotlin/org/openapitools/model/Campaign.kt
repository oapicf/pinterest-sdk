package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignBidOptions
import org.openapitools.model.CampaignObjectiveType
import org.openapitools.model.EntityStatus
import org.openapitools.model.IntendedPromotionType
import org.openapitools.model.PerformancePlusCampaignSettings
import org.openapitools.model.SummaryStatus
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
 * @param id Campaign ID, must be associated with the ad account ID provided in the path.
 * @param objectiveType 
 * @param adAccountId Campaign's Advertiser ID.
 * @param bidOptions [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
 * @param createdTime Campaign creation time. Unix timestamp in seconds.
 * @param dailySpendCap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
 * @param defaultAdGroupBudgetInMicroCurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
 * @param endTime Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
 * @param intendedPromotionType 
 * @param isAutomatedCampaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
 * @param isCampaignBudgetOptimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
 * @param isCarting Whether the campaign contains a carting(where-to-buy link) ad.
 * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
 * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
 * @param isPerformancePlus Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
 * @param isTopOfSearch Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
 * @param lifetimeSpendCap Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
 * @param name Campaign name - 255 chars max.
 * @param orderLineId Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
 * @param performancePlusCampaignSettings Pinterest Performance+ campaign settings.
 * @param startTime Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
 * @param status 
 * @param summaryStatus 
 * @param trackingUrls 
 * @param type Always \"campaign\".
 * @param updatedTime UTC timestamp. Last update time.
 */
data class Campaign(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(example = "549755885175", required = true, description = "Campaign ID, must be associated with the ad account ID provided in the path.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("objective_type")
    @get:JsonProperty("objective_type", required = true) val objectiveType: CampaignObjectiveType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Campaign's Advertiser ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.")
    @param:JsonProperty("bid_options")
    @get:JsonProperty("bid_options") val bidOptions: CampaignBidOptions? = null,

    @Schema(example = "1432744744", readOnly = true, description = "Campaign creation time. Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @Schema(example = "1432744744", description = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")
    @param:JsonProperty("daily_spend_cap")
    @get:JsonProperty("daily_spend_cap") val dailySpendCap: kotlin.Int? = null,

    @Schema(example = "0", description = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
    @param:JsonProperty("default_ad_group_budget_in_micro_currency")
    @get:JsonProperty("default_ad_group_budget_in_micro_currency") val defaultAdGroupBudgetInMicroCurrency: kotlin.Int? = null,

    @Schema(example = "1644023526", description = "Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
    @param:JsonProperty("end_time")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("intended_promotion_type")
    @get:JsonProperty("intended_promotion_type") val intendedPromotionType: IntendedPromotionType? = null,

    @Schema(example = "true", description = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES")
    @param:JsonProperty("is_automated_campaign")
    @get:JsonProperty("is_automated_campaign") val isAutomatedCampaign: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.")
    @param:JsonProperty("is_campaign_budget_optimization")
    @get:JsonProperty("is_campaign_budget_optimization") val isCampaignBudgetOptimization: kotlin.Boolean? = null,

    @Schema(example = "true", readOnly = true, description = "Whether the campaign contains a carting(where-to-buy link) ad.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_carting")
    @get:JsonProperty("is_carting") val isCarting: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.")
    @param:JsonProperty("is_flexible_daily_budgets")
    @get:JsonProperty("is_flexible_daily_budgets") val isFlexibleDailyBudgets: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_ltv_optimized")
    @get:JsonProperty("is_ltv_optimized") val isLtvOptimized: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_performance_plus")
    @get:JsonProperty("is_performance_plus") val isPerformancePlus: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_top_of_search")
    @get:JsonProperty("is_top_of_search") val isTopOfSearch: kotlin.Boolean? = null,

    @Schema(example = "1432744744", description = "Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.")
    @param:JsonProperty("lifetime_spend_cap")
    @get:JsonProperty("lifetime_spend_cap") val lifetimeSpendCap: kotlin.Int? = null,

    @Schema(example = "ACME Tools", description = "Campaign name - 255 chars max.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.")
    @param:JsonProperty("order_line_id")
    @get:JsonProperty("order_line_id") val orderLineId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Pinterest Performance+ campaign settings.")
    @param:JsonProperty("performance_plus_campaign_settings")
    @get:JsonProperty("performance_plus_campaign_settings") val performancePlusCampaignSettings: PerformancePlusCampaignSettings? = null,

    @Schema(example = "1580865126", description = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.")
    @param:JsonProperty("start_time")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("summary_status")
    @get:JsonProperty("summary_status") val summaryStatus: SummaryStatus? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("tracking_urls")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @Schema(example = "campaign", readOnly = true, description = "Always \"campaign\".")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "1432744744", readOnly = true, description = "UTC timestamp. Last update time.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null
) {

}

