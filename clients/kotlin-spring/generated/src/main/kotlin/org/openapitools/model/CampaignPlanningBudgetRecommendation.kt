package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint
import org.openapitools.model.CampaignPlanningExperimentBudgetRecommendation
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
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 * @param budgetRecommendation The recommended budget amount.
 * @param experimentCampaignBudgetRecommendation List of experimental budget recommendations.
 * @param lifetimeDaysRecommendation Recommended number of days for the campaign lifetime.
 * @param pointEstimations List of point estimations for different budget scenarios.
 */
data class CampaignPlanningBudgetRecommendation(

    @Schema(example = "5000000", description = "The recommended budget amount.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("budget_recommendation")
    @get:JsonProperty("budget_recommendation") val budgetRecommendation: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "List of experimental budget recommendations.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("experiment_campaign_budget_recommendation")
    @get:JsonProperty("experiment_campaign_budget_recommendation") val experimentCampaignBudgetRecommendation: kotlin.collections.List<CampaignPlanningExperimentBudgetRecommendation>? = null,

    @Schema(example = "30", description = "Recommended number of days for the campaign lifetime.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_days_recommendation")
    @get:JsonProperty("lifetime_days_recommendation") val lifetimeDaysRecommendation: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "List of point estimations for different budget scenarios.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("point_estimations")
    @get:JsonProperty("point_estimations") val pointEstimations: kotlin.collections.List<CampaignPlanningBudgetRecommendationPoint>? = null
) {

}

