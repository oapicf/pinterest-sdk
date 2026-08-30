package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AudienceUpdateOperationType
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
 * Resource create or update operation model with required body fields (no OptionalProperties).
 * @param id Customer segment ID.
 * @param operationType 
 * @param audienceIds Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
 */
data class CustomerSegmentUpdateRequestUpdateWithRequiredBody(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "Customer segment ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operation_type")
    @get:JsonProperty("operation_type", required = true) val operationType: AudienceUpdateOperationType,

    @Schema(description = "Audience IDs to update the customer segment to. Only applicable for UPDATE operations.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("audience_ids")
    @get:JsonProperty("audience_ids") val audienceIds: kotlin.collections.List<kotlin.String>? = null
) {

}

