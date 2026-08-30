package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint
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
 * Experimental budget recommendation for a single experiment version.
 * @param budgetRecommendation Recommended budget for this experiment version.
 * @param lifetimeDaysRecommendation Recommended lifetime days for this experiment.
 * @param pointEstimations Point estimations for this experiment version.
 * @param versionId Version identifier for the experiment.
 */
data class CampaignPlanningExperimentBudgetRecommendation(

    @Schema(example = "5500000", description = "Recommended budget for this experiment version.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("budget_recommendation")
    @get:JsonProperty("budget_recommendation") val budgetRecommendation: kotlin.Int? = null,

    @Schema(example = "35", description = "Recommended lifetime days for this experiment.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_days_recommendation")
    @get:JsonProperty("lifetime_days_recommendation") val lifetimeDaysRecommendation: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Point estimations for this experiment version.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("point_estimations")
    @get:JsonProperty("point_estimations") val pointEstimations: kotlin.collections.List<CampaignPlanningBudgetRecommendationPoint>? = null,

    @Schema(description = "Version identifier for the experiment.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("version_id")
    @get:JsonProperty("version_id") val versionId: kotlin.String? = null
) {

}

