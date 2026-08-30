package org.openapitools.server.api.model

import org.openapitools.server.api.model.DynamicTitlesProcessCSVError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DynamicTitlesProcessCSV(
    /** List of validation errors. Empty on success. */
    val errors: kotlin.collections.List<DynamicTitlesProcessCSVError>? = null,
    /** Processing status. Present on success. */
    val status: kotlin.String? = null
)
