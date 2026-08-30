package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionDeletionRequestTargets
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionDeletionRequestCreate(
    /** Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. */
    val deletionTargets: ConversionDeletionRequestTargets
)
