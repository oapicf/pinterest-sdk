package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 * @param code Error code associated with the error in performing the action on the invite/request.
 * @param inviteOrRequestId Unique identifier of the invite/request.
 * @param message Error message associated with the error in performing the action on the invite/request.
 * @param usersOrPartnerIds A list of users' usernames or emails OR a list of partner ids that caused the error.
 */
data class InviteExceptionResponse(

    @Schema(example = "403", description = "Error code associated with the error in performing the action on the invite/request.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("code")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Unique identifier of the invite/request.")
    @param:JsonProperty("invite_or_request_id")
    @get:JsonProperty("invite_or_request_id") val inviteOrRequestId: kotlin.String? = null,

    @Schema(example = "You hit the maximum number of pending invites allowed.", description = "Error message associated with the error in performing the action on the invite/request.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "[\"businessMember0101\",\"business+member@business.com\"]", description = "A list of users' usernames or emails OR a list of partner ids that caused the error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("users_or_partner_ids")
    @get:JsonProperty("users_or_partner_ids") val usersOrPartnerIds: kotlin.collections.List<kotlin.String>? = null
) {

}

