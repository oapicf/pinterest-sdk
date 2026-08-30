package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AuthRespondInviteAction
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
data class AuthRespondInvitesBodyItem(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("action")
    @get:JsonProperty("action", required = true) val action: AuthRespondInviteAction,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(min=1,max=25)
    @Schema(required = true, description = "Unique identifier of an invite.")
    @param:JsonProperty("invite_id")
    @get:JsonProperty("invite_id", required = true) val inviteId: kotlin.String
) {

}

