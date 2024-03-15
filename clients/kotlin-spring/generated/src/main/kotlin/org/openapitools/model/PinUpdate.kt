package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PinUpdateCarouselSlotsInner
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
 * Pin fields for updates
 * @param altText Pin's alternative text.
 * @param boardId The id of the board to move the Pin onto.
 * @param boardSectionId <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
 * @param description Pin description - 800 characters maximum.
 * @param link URL viewer is taken to when they click pin.
 * @param title The native pin title that creators explicitly prefer to display.
 * @param carouselSlots Carousel Pin slots data.
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 */
data class PinUpdate(

    @get:Size(max=500)
    @Schema(example = "null", description = "Pin's alternative text.")
    @get:JsonProperty("alt_text") val altText: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The id of the board to move the Pin onto.")
    @get:JsonProperty("board_id") val boardId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "<a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.")
    @get:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null,

    @get:Size(max=800)
    @Schema(example = "null", description = "Pin description - 800 characters maximum.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Size(max=2048)
    @Schema(example = "https://www.pinterest.com/", description = "URL viewer is taken to when they click pin.")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "The native pin title that creators explicitly prefer to display.")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Carousel Pin slots data.")
    @get:JsonProperty("carousel_slots") val carouselSlots: kotlin.collections.List<PinUpdateCarouselSlotsInner>? = null,

    @Schema(example = "null", description = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
    @get:JsonProperty("note") val note: kotlin.String? = null
) {

}

