/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.AdCommonTrackingUrls
import org.openapitools.client.models.CampaignSummaryStatus
import org.openapitools.client.models.EntityStatus
import org.openapitools.client.models.ObjectiveType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Campaign ID.
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
 * @param objectiveType 
 * @param createdTime Campaign creation time. Unix timestamp in seconds.
 * @param updatedTime UTC timestamp. Last update time.
 * @param type Always \"campaign\".
 * @param isFlexibleDailyBudgets Determines if a campaign has flexible daily budgets setup.
 * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 */


data class CampaignResponse (

    /* Campaign ID. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */
    @Json(name = "ad_account_id")
    val adAccountId: kotlin.String? = null,

    /* Campaign name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "status")
    val status: EntityStatus? = null,

    /* Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. */
    @Json(name = "lifetime_spend_cap")
    val lifetimeSpendCap: kotlin.Int? = null,

    /* Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. */
    @Json(name = "daily_spend_cap")
    val dailySpendCap: kotlin.Int? = null,

    /* Order line ID that appears on the invoice. */
    @Json(name = "order_line_id")
    val orderLineId: kotlin.String? = null,

    @Json(name = "tracking_urls")
    val trackingUrls: AdCommonTrackingUrls? = null,

    /* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    @Json(name = "start_time")
    val startTime: kotlin.Int? = null,

    /* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    @Json(name = "end_time")
    val endTime: kotlin.Int? = null,

    @Json(name = "summary_status")
    val summaryStatus: CampaignSummaryStatus? = null,

    @Json(name = "objective_type")
    val objectiveType: ObjectiveType? = null,

    /* Campaign creation time. Unix timestamp in seconds. */
    @Json(name = "created_time")
    val createdTime: kotlin.Int? = null,

    /* UTC timestamp. Last update time. */
    @Json(name = "updated_time")
    val updatedTime: kotlin.Int? = null,

    /* Always \"campaign\". */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* Determines if a campaign has flexible daily budgets setup. */
    @Json(name = "is_flexible_daily_budgets")
    val isFlexibleDailyBudgets: kotlin.Boolean? = null,

    /* Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. */
    @Json(name = "is_campaign_budget_optimization")
    val isCampaignBudgetOptimization: kotlin.Boolean? = null

)
