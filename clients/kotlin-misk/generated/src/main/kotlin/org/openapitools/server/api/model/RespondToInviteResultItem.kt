package org.openapitools.server.api.model

import org.openapitools.server.api.model.BaseInviteDataResponse
import org.openapitools.server.api.model.InviteExceptionResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RespondToInviteResultItem(
    val exception: InviteExceptionResponse? = null,
    /** An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. */
    val invite: BaseInviteDataResponse? = null
)
