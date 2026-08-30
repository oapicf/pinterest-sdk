package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationLogClientError(
    /** Original cause of the error. */
    val cause: kotlin.String? = null,
    /** Column number in the line of the file that raised the error. */
    val columnNumber: kotlin.Int? = null,
    /** Filename where the error happened. */
    val fileName: kotlin.String? = null,
    /** Line number where the error happened. */
    val lineNumber: kotlin.Int? = null,
    /** Human-readable description of the error. */
    val message: kotlin.String? = null,
    /** More detail about the message. */
    val messageDetail: kotlin.String? = null,
    /** Filename where the error happened. */
    val name: kotlin.String? = null,
    /** Integer that specifies the error code. */
    val number: kotlin.Int? = null,
    /** Stack trace of where the error happened. */
    val stackTrace: kotlin.String? = null
)
