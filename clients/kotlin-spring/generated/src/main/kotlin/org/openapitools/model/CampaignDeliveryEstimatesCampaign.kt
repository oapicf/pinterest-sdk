package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdGroupDeliveryEstimates
import org.openapitools.model.BudgetDurationType
import org.openapitools.model.DeliveryEstimateObjectiveType
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
 * Campaign configuration for delivery estimates.
 * @param adGroups 
 * @param budgetDurationType Duration type of the budget
 * @param objectiveType 
 * @param startDate Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
 * @param dailySpendCap Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
 * @param endDate End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
 * @param lifetimeSpendCap Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
 */
data class CampaignDeliveryEstimatesCampaign(

    @field:Valid
    @get:Size(min=1,max=10) 
    @Schema(required = true, description = "")
    @param:JsonProperty("ad_groups")
    @get:JsonProperty("ad_groups", required = true) val adGroups: kotlin.collections.List<AdGroupDeliveryEstimates>,

    @field:Valid
    @Schema(example = "FIXED_DAILY", required = true, description = "Duration type of the budget")
    @param:JsonProperty("budget_duration_type")
    @get:JsonProperty("budget_duration_type", required = true) val budgetDurationType: BudgetDurationType,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("objective_type")
    @get:JsonProperty("objective_type", required = true) val objectiveType: DeliveryEstimateObjectiveType,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(required = true, description = "Start date of the date range for an ad campaign, pattern YYYY-MM-DD.")
    @param:JsonProperty("start_date")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @Schema(example = "50000000", description = "Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("daily_spend_cap")
    @get:JsonProperty("daily_spend_cap") val dailySpendCap: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(description = "End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("end_date")
    @get:JsonProperty("end_date") val endDate: kotlin.String? = null,

    @Schema(example = "500000000", description = "Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_spend_cap")
    @get:JsonProperty("lifetime_spend_cap") val lifetimeSpendCap: kotlin.Int? = null
) {

}

