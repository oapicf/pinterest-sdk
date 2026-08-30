package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DynamicTitlesProcessCSVError(
    /** The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. */
    val errorType: kotlin.String? = null,
    /** The row number with a validation error. -1 indicates a file-level error. */
    val rowNumber: kotlin.Int? = null
)
