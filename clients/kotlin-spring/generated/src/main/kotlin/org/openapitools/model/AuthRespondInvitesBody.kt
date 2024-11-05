package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AuthRespondInvitesBodyInvitesInner
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
 * An object with a list of all the invites the user would like to respond to and the action to take.
 * @param invites 
 */
data class AuthRespondInvitesBody(

    @field:Valid
    @get:Size(min=1,max=100) 
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("invites", required = true) val invites: kotlin.collections.List<AuthRespondInvitesBodyInvitesInner>
    ) {

}

