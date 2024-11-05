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
 * Metadata for the invite/request.
 * @param inviteExpiration The date and time when the invite/request will expire. Returned in milliseconds.
 * @param inviteStatus The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
 * @param inviteType The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
 * @param lastUpdatedTime The date and time the invite/request was last updated. Returned in milliseconds.
 * @param sentAt The date and time the invite/request was sent/created. Returned in milliseconds.
 */
data class BaseInviteDataResponseInviteData(

    @Schema(example = "1709748104775", description = "The date and time when the invite/request will expire. Returned in milliseconds.")
    @get:JsonProperty("invite_expiration") val inviteExpiration: kotlin.Int? = null,

    @Schema(example = "PENDING", description = "The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.")
    @get:JsonProperty("invite_status") val inviteStatus: kotlin.String? = null,

    @Schema(example = "MEMBER_INVITE", description = "The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.")
    @get:JsonProperty("invite_type") val inviteType: kotlin.String? = null,

    @Schema(example = "1646767577816", description = "The date and time the invite/request was last updated. Returned in milliseconds.")
    @get:JsonProperty("last_updated_time") val lastUpdatedTime: kotlin.Int? = null,

    @Schema(example = "1646767577816", description = "The date and time the invite/request was sent/created. Returned in milliseconds.")
    @get:JsonProperty("sent_at") val sentAt: kotlin.Int? = null
    ) {

}

