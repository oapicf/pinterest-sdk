package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CarouselSlot
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
 * Resource create or update operation model.
 * @param altText 
 * @param boardId The board to which this Pin belongs.
 * @param boardSectionId The board section to which this Pin belongs.
 * @param carouselSlots Carousel Pin slots data.
 * @param description 
 * @param link 
 * @param title 
 */
data class PinUpdate(

    @get:Size(max=500)
    @Schema(example = "null", description = "")
    @get:JsonProperty("alt_text") val altText: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The board to which this Pin belongs.")
    @get:JsonProperty("board_id") val boardId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The board section to which this Pin belongs.")
    @get:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Carousel Pin slots data.")
    @get:JsonProperty("carousel_slots") val carouselSlots: kotlin.collections.List<CarouselSlot>? = null,

    @get:Size(max=800)
    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Size(max=2048)
    @Schema(example = "null", description = "")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

