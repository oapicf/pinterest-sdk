package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param businessRole The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 * @param inviteType 
 * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
 * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
 */
data class CreateMembershipOrPartnershipInvitesBody(

    @Schema(example = "BIZ_ADMIN", required = true, description = "The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.")
    @get:JsonProperty("business_role", required = true) val businessRole: CreateMembershipOrPartnershipInvitesBody.BusinessRole,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("invite_type", required = true) val inviteType: InviteType,

    @get:Size(min=1,max=50) 
    @Schema(example = "[\"business0101\",\"user@business.com\"]", description = "A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE")
    @get:JsonProperty("members") val members: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(min=1,max=50) 
    @Schema(example = "[\"809944451643622187\",\"766456567741825556\"]", description = "A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST")
    @get:JsonProperty("partners") val partners: kotlin.collections.List<kotlin.String>? = null
    ) {

    /**
    * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
    * Values: EMPLOYEE,BIZ_ADMIN,PARTNER
    */
    enum class BusinessRole(@get:JsonValue val value: kotlin.String) {

        EMPLOYEE("EMPLOYEE"),
        BIZ_ADMIN("BIZ_ADMIN"),
        PARTNER("PARTNER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): BusinessRole {
                return values().first{it -> it.value == value}
            }
        }
    }

}

