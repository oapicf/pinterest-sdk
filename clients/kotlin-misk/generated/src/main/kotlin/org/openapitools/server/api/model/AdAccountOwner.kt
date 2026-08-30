package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountOwner(
    /** The owning account&#39;s user ID. */
    val id: kotlin.String? = null,
    /** Public username for the user account */
    val username: kotlin.String? = null
)
