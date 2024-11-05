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
 * 
 * @param boardId Unique identifier of the board to which the pin will be saved.
 * @param boardSectionId Unique identifier of the board section to which the pin will be saved.
 */
data class PinsSaveRequest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Unique identifier of the board to which the pin will be saved.")
    @get:JsonProperty("board_id") val boardId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Unique identifier of the board section to which the pin will be saved.")
    @get:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null
    ) {

}

