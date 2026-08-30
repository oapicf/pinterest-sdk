package org.openapitools.server.api.model

import org.openapitools.server.api.model.InviteBusinessRoleBinding
import org.openapitools.server.api.model.InviteExceptionResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteActionResultItem(
    val exception: InviteExceptionResponse? = null,
    val invite: InviteBusinessRoleBinding? = null
)
