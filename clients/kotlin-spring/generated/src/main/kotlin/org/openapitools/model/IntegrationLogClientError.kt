package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
    @Schema(description = "Original cause of the error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cause")
    @get:JsonProperty("cause") val cause: kotlin.String? = null,

    @Schema(description = "Column number in the line of the file that raised the error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("column_number")
    @get:JsonProperty("column_number") val columnNumber: kotlin.Int? = null,

    @get:Size(max=256)
    @Schema(description = "Filename where the error happened.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("file_name")
    @get:JsonProperty("file_name") val fileName: kotlin.String? = null,

    @Schema(description = "Line number where the error happened.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("line_number")
    @get:JsonProperty("line_number") val lineNumber: kotlin.Int? = null,

    @get:Size(max=8192)
    @Schema(description = "Human-readable description of the error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @get:Size(max=1024)
    @Schema(description = "More detail about the message.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message_detail")
    @get:JsonProperty("message_detail") val messageDetail: kotlin.String? = null,

    @get:Size(max=256)
    @Schema(description = "Filename where the error happened.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "Integer that specifies the error code.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("number")
    @get:JsonProperty("number") val number: kotlin.Int? = null,

    @Schema(description = "Stack trace of where the error happened.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("stack_trace")
    @get:JsonProperty("stack_trace") val stackTrace: kotlin.String? = null
) {

}

