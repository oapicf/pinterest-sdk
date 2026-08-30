package org.openapitools.server.api.model

import org.openapitools.server.api.model.InviteActionResultItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateInvitesResultsResponseArray(
    /** List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. */
    val items: kotlin.collections.List<InviteActionResultItem>? = null
)
