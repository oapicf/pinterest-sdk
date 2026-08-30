@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignDeliveryEstimatesCampaign(
    @field:JsonProperty("ad_groups")
    val adGroups: kotlin.collections.List<AdGroupDeliveryEstimates>,

    @field:JsonProperty("budget_duration_type")
    val budgetDurationType: BudgetDurationType,

    @field:JsonProperty("objective_type")
    val objectiveType: DeliveryEstimateObjectiveType,

    @field:JsonProperty("start_date")
    val startDate: kotlin.String,

    @field:JsonProperty("daily_spend_cap")
    val dailySpendCap: kotlin.Int? = null,

    @field:JsonProperty("end_date")
    val endDate: kotlin.String? = null,

    @field:JsonProperty("lifetime_spend_cap")
    val lifetimeSpendCap: kotlin.Int? = null,

)
