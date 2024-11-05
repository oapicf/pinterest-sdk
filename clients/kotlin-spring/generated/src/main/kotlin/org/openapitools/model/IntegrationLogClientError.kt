package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * System error details included in the log sent by the client.
 * @param cause Original cause of the error.
 * @param columnNumber Column number in the line of the file that raised the error.
 * @param fileName Filename where the error happened.
 * @param lineNumber Line number where the error happened.
 * @param message Human-readable description of the error.
 * @param messageDetail More detail about the message.
 * @param name Filename where the error happened.
 * @param number Integer that specifies the error code.
 * @param stackTrace Stack trace of where the error happened.
 */
data class IntegrationLogClientError(

    @get:Size(max=512)
    @Schema(example = "null", description = "Original cause of the error.")
    @get:JsonProperty("cause") val cause: kotlin.String? = null,

    @Schema(example = "null", description = "Column number in the line of the file that raised the error.")
    @get:JsonProperty("column_number") val columnNumber: kotlin.Int? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Filename where the error happened.")
    @get:JsonProperty("file_name") val fileName: kotlin.String? = null,

    @Schema(example = "null", description = "Line number where the error happened.")
    @get:JsonProperty("line_number") val lineNumber: kotlin.Int? = null,

    @get:Size(max=512)
    @Schema(example = "null", description = "Human-readable description of the error.")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @get:Size(max=1024)
    @Schema(example = "null", description = "More detail about the message.")
    @get:JsonProperty("message_detail") val messageDetail: kotlin.String? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Filename where the error happened.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Integer that specifies the error code.")
    @get:JsonProperty("number") val number: kotlin.Int? = null,

    @Schema(example = "null", description = "Stack trace of where the error happened.")
    @get:JsonProperty("stack_trace") val stackTrace: kotlin.String? = null
    ) {

}

