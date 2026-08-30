package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AudienceUpdateOperationType
import org.openapitools.model.TargetingSpecOptimal
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
 * @param id Targeting template ID
 * @param operationType 
 * @param targetingAttributes targeting profile attributes
 */
data class TargetingTemplateUpdateRequestReadOrUpdate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "643", required = true, description = "Targeting template ID")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operation_type")
    @get:JsonProperty("operation_type", required = true) val operationType: AudienceUpdateOperationType,

    @field:Valid
    @Schema(description = "targeting profile attributes")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("targeting_attributes")
    @get:JsonProperty("targeting_attributes") val targetingAttributes: TargetingSpecOptimal? = null
) {

}

