package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OperationType
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
 * @param audienceId Unique identifier of an audience
 * @param operationType 
 * @param recipientBusinessIds Business IDs to share with or revoke from (request) / that received the audience (response).
 */
data class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2542621871096", required = true, description = "Unique identifier of an audience")
    @param:JsonProperty("audience_id")
    @get:JsonProperty("audience_id", required = true) val audienceId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operation_type")
    @get:JsonProperty("operation_type", required = true) val operationType: OperationType,

    @Schema(required = true, description = "Business IDs to share with or revoke from (request) / that received the audience (response).")
    @param:JsonProperty("recipient_business_ids")
    @get:JsonProperty("recipient_business_ids", required = true) val recipientBusinessIds: kotlin.collections.List<kotlin.String>
) {

}

