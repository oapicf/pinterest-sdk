package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Request body used to cancel invites
 * @param inviteIds List of invite/request ids to be cancelled
 */
data class CancelInvitesBody(

    @get:Size(min=1,max=50) 
    @Schema(example = "[\"1234567890123456789\",\"1122334455667788991\"]", required = true, description = "List of invite/request ids to be cancelled")
    @get:JsonProperty("invite_ids", required = true) val inviteIds: kotlin.collections.List<kotlin.String>
    ) {

}

