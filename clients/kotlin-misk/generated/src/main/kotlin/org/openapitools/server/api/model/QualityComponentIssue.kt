package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QualityComponentIssue(
    /** Unique identifier for the issue check. */
    val id: kotlin.String,
    /** Human-readable name of the issue. */
    val name: kotlin.String,
    /** Detailed reason for the issue. */
    val reason: kotlin.String
)
