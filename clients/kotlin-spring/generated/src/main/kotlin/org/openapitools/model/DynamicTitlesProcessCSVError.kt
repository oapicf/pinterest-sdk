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
 * 
 * @param errorType The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
 * @param rowNumber The row number with a validation error. -1 indicates a file-level error.
 */
data class DynamicTitlesProcessCSVError(

    @Schema(example = "ROW_VALIDATION_FAILED", description = "The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("error_type")
    @get:JsonProperty("error_type") val errorType: kotlin.String? = null,

    @Schema(example = "15", description = "The row number with a validation error. -1 indicates a file-level error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("row_number")
    @get:JsonProperty("row_number") val rowNumber: kotlin.Int? = null
) {

}

