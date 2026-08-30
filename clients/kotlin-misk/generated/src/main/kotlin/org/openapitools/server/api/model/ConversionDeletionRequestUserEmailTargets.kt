package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionDeletionRequestUserEmailTargets(
    /** Array of plain text user emails. */
    val userEmails: kotlin.collections.List<kotlin.String>
)
