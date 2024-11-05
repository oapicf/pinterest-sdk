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
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 * @param inviteId Unique identifier of an invite.
 * @param message Error message associated with the error in performing the action on the invite/request.
 */
data class DeleteInvitesResultsResponseArrayItemsInnerException(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Unique identifier of an invite.")
    @get:JsonProperty("invite_id") val inviteId: kotlin.String? = null,

    @Schema(example = "Business Invite request cannot be performed on current invitation status.", description = "Error message associated with the error in performing the action on the invite/request.")
    @get:JsonProperty("message") val message: kotlin.String? = null
    ) {

}

