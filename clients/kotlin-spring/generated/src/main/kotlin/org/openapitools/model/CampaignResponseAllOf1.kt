package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ObjectiveType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param objectiveType 
 * @param createdTime Campaign creation time. Unix timestamp in seconds.
 * @param updatedTime UTC timestamp. Last update time.
 * @param type Always \"campaign\".
 */
data class CampaignResponseAllOf1(

    @field:Valid
    @field:JsonProperty("objective_type") val objectiveType: ObjectiveType? = null,

    @field:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @field:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @field:JsonProperty("type") val type: kotlin.String? = null
) {

}

