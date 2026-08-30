package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdGroupDeliveryEstimates
import org.openapitools.server.api.model.BudgetDurationType
import org.openapitools.server.api.model.DeliveryEstimateObjectiveType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignDeliveryEstimatesCampaign(
    val adGroups: kotlin.collections.List<AdGroupDeliveryEstimates>,
    /** Duration type of the budget */
    val budgetDurationType: BudgetDurationType,
    val objectiveType: DeliveryEstimateObjectiveType,
    /** Start date of the date range for an ad campaign, pattern YYYY-MM-DD. */
    val startDate: kotlin.String,
    /** Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. */
    val dailySpendCap: kotlin.Int? = null,
    /** End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. */
    val endDate: kotlin.String? = null,
    /** Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. */
    val lifetimeSpendCap: kotlin.Int? = null
)
