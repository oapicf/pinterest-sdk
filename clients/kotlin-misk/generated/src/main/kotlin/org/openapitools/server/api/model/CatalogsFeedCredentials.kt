package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedCredentials(
    /** The required password for downloading a feed. */
    val password: kotlin.String,
    /** The required username for downloading a feed. */
    val username: kotlin.String
)
