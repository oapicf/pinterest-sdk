package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RecordCounts(
    /** Number of invalid records processed */
    val invalid: kotlin.Int,
    /** Number of records processed */
    val processed: kotlin.Int,
    /** Number of valid records processed */
    val valid: kotlin.Int
)
