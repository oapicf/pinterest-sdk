package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteDataResponse(
    /** The date and time when the invite/request will expire. Returned in milliseconds. */
    val inviteExpiration: kotlin.Int? = null,
    /** The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. */
    val inviteStatus: kotlin.String? = null,
    /** The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. */
    val inviteType: kotlin.String? = null,
    /** The date and time the invite/request was last updated. Returned in milliseconds. */
    val lastUpdatedTime: kotlin.Int? = null,
    /** The date and time the invite/request was sent/created. Returned in milliseconds. */
    val sentAt: kotlin.Int? = null
)
