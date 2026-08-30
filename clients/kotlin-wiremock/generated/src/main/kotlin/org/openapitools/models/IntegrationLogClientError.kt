@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IntegrationLogClientError(
    @field:JsonProperty("cause")
    val cause: kotlin.String? = null,

    @field:JsonProperty("column_number")
    val columnNumber: kotlin.Int? = null,

    @field:JsonProperty("file_name")
    val fileName: kotlin.String? = null,

    @field:JsonProperty("line_number")
    val lineNumber: kotlin.Int? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("message_detail")
    val messageDetail: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("number")
    val number: kotlin.Int? = null,

    @field:JsonProperty("stack_trace")
    val stackTrace: kotlin.String? = null,

)
