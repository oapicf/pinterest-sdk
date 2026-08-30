package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CancelInviteException(
    val inviteId: kotlin.String? = null,
    val message: kotlin.String? = null
)
