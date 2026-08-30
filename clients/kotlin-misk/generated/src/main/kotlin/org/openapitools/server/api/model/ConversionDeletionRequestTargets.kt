package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionDeletionRequestEPIKTargets
import org.openapitools.server.api.model.ConversionDeletionRequestUserEmailTargets
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionDeletionRequestTargets(
    /** Array of plain text user emails. */
    val userEmails: kotlin.collections.List<kotlin.String>,
    /** Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). */
    val epiks: kotlin.collections.List<kotlin.String>
)
