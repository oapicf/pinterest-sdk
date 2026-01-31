package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
 */
data class CampaignObjectivesFilter(

    @field:Valid
    @get:Size(min=1,max=7) 
    @Schema(example = "[\"AWARENESS\"]", description = "List of values for filtering. [\"WEB_SESSIONS\"] in BETA.")
    @get:JsonProperty("campaign_objective_types") val campaignObjectiveTypes: kotlin.collections.List<ObjectiveType>? = null
) {

}

