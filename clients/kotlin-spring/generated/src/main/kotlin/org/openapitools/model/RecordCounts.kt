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
 * Record processing counts
 * @param invalid Number of invalid records processed
 * @param processed Number of records processed
 * @param valid Number of valid records processed
 */
data class RecordCounts(

    @Schema(example = "50", required = true, description = "Number of invalid records processed")
    @get:JsonProperty("invalid", required = true) val invalid: kotlin.Int,

    @Schema(example = "1000", required = true, description = "Number of records processed")
    @get:JsonProperty("processed", required = true) val processed: kotlin.Int,

    @Schema(example = "950", required = true, description = "Number of valid records processed")
    @get:JsonProperty("valid", required = true) val valid: kotlin.Int
) {

}

