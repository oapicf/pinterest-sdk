package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EntityLabel
import org.openapitools.model.EntityLabelError
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
 * @param entitiesLabels 
 * @param errors Labels that were not successfully applied.
 */
data class LabeledEntities(

    @field:Valid
    @Schema(readOnly = true, description = "")
    @param:JsonProperty("entities_labels")
    @get:JsonProperty("entities_labels") val entitiesLabels: kotlin.collections.List<EntityLabel>? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Labels that were not successfully applied.")
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<EntityLabelError>? = null
) {

}

