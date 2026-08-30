package org.openapitools.server.api.model

import org.openapitools.server.api.model.CancelInviteException
import org.openapitools.server.api.model.CancelInviteResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CancelInviteResultItem(
    val exception: CancelInviteException? = null,
    val invite: CancelInviteResult? = null
)
