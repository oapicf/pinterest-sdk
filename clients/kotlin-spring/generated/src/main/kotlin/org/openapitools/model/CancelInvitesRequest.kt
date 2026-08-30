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
 * An object with the list of invite/request ids to cancel.
 * @param inviteIds A list of invite/request ids to cancel.
 */
data class CancelInvitesRequest(

    @get:Size(min=1,max=50) 
    @Schema(required = true, description = "A list of invite/request ids to cancel.")
    @param:JsonProperty("invite_ids")
    @get:JsonProperty("invite_ids", required = true) val inviteIds: kotlin.collections.List<kotlin.String>
) {

}

