package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdCommonTrackingUrls
import org.openapitools.model.CampaignSummaryStatus
import org.openapitools.model.EntityStatus
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
 * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @param name Campaign name.
 * @param status 
 * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @param orderLineId Order line ID that appears on the invoice.
 * @param trackingUrls 
 * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param summaryStatus 
 * @param isFlexibleDailyBudgets Determines if a campaign has flexible daily budgets setup.
 * @param defaultAdGroupBudgetInMicroCurrency When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
 * @param isAutomatedCampaign Specifies whether the campaign was created in the automated campaign flow
 * @param id Campaign ID.
 * @param objectiveType 
 * @param createdTime Campaign creation time. Unix timestamp in seconds.
 * @param updatedTime UTC timestamp. Last update time.
 * @param type Always \"campaign\".
 * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 */
data class CampaignCreateResponseData(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "ACME Tools", description = "Campaign name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @Schema(example = "1432744744", description = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.")
    @get:JsonProperty("lifetime_spend_cap") val lifetimeSpendCap: kotlin.Int? = null,

    @Schema(example = "1432744744", description = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.")
    @get:JsonProperty("daily_spend_cap") val dailySpendCap: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Order line ID that appears on the invoice.")
    @get:JsonProperty("order_line_id") val orderLineId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tracking_urls") val trackingUrls: AdCommonTrackingUrls? = null,

    @Schema(example = "1580865126", description = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @Schema(example = "1644023526", description = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("summary_status") val summaryStatus: CampaignSummaryStatus? = null,

    @Schema(example = "true", description = "Determines if a campaign has flexible daily budgets setup.")
    @get:JsonProperty("is_flexible_daily_budgets") val isFlexibleDailyBudgets: kotlin.Boolean? = null,

    @Schema(example = "0", description = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.")
    @get:JsonProperty("default_ad_group_budget_in_micro_currency") val defaultAdGroupBudgetInMicroCurrency: kotlin.Int? = null,

    @Schema(example = "true", description = "Specifies whether the campaign was created in the automated campaign flow")
    @get:JsonProperty("is_automated_campaign") val isAutomatedCampaign: kotlin.Boolean? = false,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Campaign ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("objective_type") val objectiveType: ObjectiveType? = null,

    @Schema(example = "1432744744", description = "Campaign creation time. Unix timestamp in seconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @Schema(example = "1432744744", description = "UTC timestamp. Last update time.")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @Schema(example = "campaign", description = "Always \"campaign\".")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "true", description = "Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.")
    @get:JsonProperty("is_campaign_budget_optimization") val isCampaignBudgetOptimization: kotlin.Boolean? = null
) {

}

