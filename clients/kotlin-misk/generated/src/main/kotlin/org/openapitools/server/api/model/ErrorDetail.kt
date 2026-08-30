package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorDetail(
    /** Number of records with this error */
    val count: kotlin.Int,
    /** Numeric error code */
    val errorCode: kotlin.Int,
    /** Error message description */
    val message: kotlin.String
)
