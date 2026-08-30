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
 * Metadata for the invite/request.
 * @param inviteExpiration The date and time when the invite/request will expire. Returned in milliseconds.
 * @param inviteStatus The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
 * @param inviteType The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
 * @param lastUpdatedTime The date and time the invite/request was last updated. Returned in milliseconds.
 * @param sentAt The date and time the invite/request was sent/created. Returned in milliseconds.
 */
data class InviteDataResponse(

    @Schema(description = "The date and time when the invite/request will expire. Returned in milliseconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invite_expiration")
    @get:JsonProperty("invite_expiration") val inviteExpiration: kotlin.Int? = null,

    @Schema(description = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invite_status")
    @get:JsonProperty("invite_status") val inviteStatus: kotlin.String? = null,

    @Schema(description = "The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invite_type")
    @get:JsonProperty("invite_type") val inviteType: kotlin.String? = null,

    @Schema(description = "The date and time the invite/request was last updated. Returned in milliseconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("last_updated_time")
    @get:JsonProperty("last_updated_time") val lastUpdatedTime: kotlin.Int? = null,

    @Schema(description = "The date and time the invite/request was sent/created. Returned in milliseconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sent_at")
    @get:JsonProperty("sent_at") val sentAt: kotlin.Int? = null
) {

}

