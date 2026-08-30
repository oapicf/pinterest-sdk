package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertReason
import org.openapitools.model.CampaignPlanningConfidenceLevelAlertSeverity
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
 * A confidence level alert for the delivery estimates provided in the response.
 * @param description Human-readable context for debugging. Not intended for display to end users.
 * @param reason Reason for the confidence level alert.
 * @param severity Severity of the confidence level alert.
 */
data class CampaignPlanningConfidenceLevelAlert(

    @Schema(description = "Human-readable context for debugging. Not intended for display to end users.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Reason for the confidence level alert.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("reason")
    @get:JsonProperty("reason") val reason: CampaignPlanningConfidenceLevelAlertReason? = null,

    @field:Valid
    @Schema(description = "Severity of the confidence level alert.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("severity")
    @get:JsonProperty("severity") val severity: CampaignPlanningConfidenceLevelAlertSeverity? = null
) {

}

