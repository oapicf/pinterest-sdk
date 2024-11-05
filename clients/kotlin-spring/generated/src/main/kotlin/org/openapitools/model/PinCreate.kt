package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BoardOwner
import org.openapitools.model.PinMedia
import org.openapitools.model.PinMediaSource
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
 * Pin
 * @param id 
 * @param createdAt 
 * @param link 
 * @param title 
 * @param description 
 * @param dominantColor Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
 * @param altText 
 * @param boardId The board to which this Pin belongs.
 * @param boardSectionId The board section to which this Pin belongs.
 * @param boardOwner 
 * @param media 
 * @param mediaSource 
 * @param parentPinId The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 */
data class PinCreate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "813744226420795884", readOnly = true, description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "2020-01-01T20:10:40Z", readOnly = true, description = "")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @get:Size(max=2048)
    @Schema(example = "https://www.pinterest.com/", description = "")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @get:Size(max=800)
    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "#6E7874", description = "Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".")
    @get:JsonProperty("dominant_color") val dominantColor: kotlin.String? = null,

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
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("board_owner") val boardOwner: BoardOwner? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("media") val media: PinMedia? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media_source") val mediaSource: PinMediaSource? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.")
    @get:JsonProperty("parent_pin_id") val parentPinId: kotlin.String? = null,

    @Schema(example = "null", description = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
    @get:JsonProperty("note") val note: kotlin.String? = null
    ) {

}

