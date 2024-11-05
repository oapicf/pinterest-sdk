package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AuthRespondInvitesBodyInvitesInnerAction
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
 * @param action 
 * @param inviteId Unique identifier of an invite.
 */
data class AuthRespondInvitesBodyInvitesInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("action", required = true) val action: AuthRespondInvitesBodyInvitesInnerAction,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(min=1,max=25)
    @Schema(example = "null", required = true, description = "Unique identifier of an invite.")
    @get:JsonProperty("invite_id", required = true) val inviteId: kotlin.String
    ) {

}

