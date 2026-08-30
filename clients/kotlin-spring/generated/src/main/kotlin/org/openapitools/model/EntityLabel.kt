package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.EntityLabelStatus
import org.openapitools.model.LabelParentType
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
 * @param entityId Entity ID to apply label to.
 * @param labelId Label ID.
 * @param entityType 
 * @param status 
 */
data class EntityLabel(

    @Schema(required = true, description = "Entity ID to apply label to.")
    @param:JsonProperty("entity_id")
    @get:JsonProperty("entity_id", required = true) val entityId: kotlin.String,

    @Schema(required = true, description = "Label ID.")
    @param:JsonProperty("label_id")
    @get:JsonProperty("label_id", required = true) val labelId: kotlin.String,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("entity_type")
    @get:JsonProperty("entity_type") val entityType: LabelParentType? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: EntityLabelStatus? = null
) {

}

