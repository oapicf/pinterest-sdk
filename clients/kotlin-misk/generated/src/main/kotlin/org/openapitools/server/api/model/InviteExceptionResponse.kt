package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteExceptionResponse(
    /** Error code associated with the error in performing the action on the invite/request. */
    val code: kotlin.Int? = null,
    /** Unique identifier of the invite/request. */
    val inviteOrRequestId: kotlin.String? = null,
    /** Error message associated with the error in performing the action on the invite/request. */
    val message: kotlin.String? = null,
    /** A list of users&#39; usernames or emails OR a list of partner ids that caused the error. */
    val usersOrPartnerIds: kotlin.collections.List<kotlin.String>? = null
)
