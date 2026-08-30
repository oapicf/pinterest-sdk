package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BusinessRoleForInvite
import org.openapitools.model.InviteType
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
 * Body to be used on path to send Members or Partners Invite or Request
 * @param businessRole 
 * @param inviteType 
 * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
 * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
 */
data class CreateMembershipOrPartnershipInvitesBody(

    @field:Valid
    @Schema(example = "BIZ_ADMIN", required = true, description = "")
    @param:JsonProperty("business_role")
    @get:JsonProperty("business_role", required = true) val businessRole: BusinessRoleForInvite,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("invite_type")
    @get:JsonProperty("invite_type", required = true) val inviteType: InviteType,

    @get:Size(min=1,max=50) 
    @Schema(example = "[\"business0101\",\"user@business.com\"]", description = "A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("members")
    @get:JsonProperty("members") val members: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(min=1,max=50) 
    @Schema(example = "[\"809944451643622187\",\"766456567741825556\"]", description = "A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partners")
    @get:JsonProperty("partners") val partners: kotlin.collections.List<kotlin.String>? = null
) {

}

