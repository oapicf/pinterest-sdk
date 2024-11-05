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
 * 
 * @param audienceId Unique identifier of an audience
 * @param operationType 
 * @param recipientAccountIds List of ad account IDs to share with or revoke from.
 */
data class SharedAudience(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2542621871096", required = true, description = "Unique identifier of an audience")
    @get:JsonProperty("audience_id", required = true) val audienceId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation_type", required = true) val operationType: OperationType,

    @Schema(example = "null", required = true, description = "List of ad account IDs to share with or revoke from.")
    @get:JsonProperty("recipient_account_ids", required = true) val recipientAccountIds: kotlin.collections.List<kotlin.String>
    ) {

}

