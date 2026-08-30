package org.openapitools.server.api.model

import org.openapitools.server.api.model.Role
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountToBusinessSharedAudience(
    /** Unique identifier of an audience */
    val audienceId: kotlin.String,
    /** Business IDs to share with or revoke from (request) / that received the audience (response). */
    val recipientBusinessIds: kotlin.collections.List<kotlin.String>,
    /** Permissions granted to the recipients. */
    val permissions: kotlin.collections.List<Role>? = null
)
