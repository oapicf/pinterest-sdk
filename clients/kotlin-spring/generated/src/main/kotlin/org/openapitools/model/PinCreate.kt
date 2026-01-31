package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Resource create operation model.
 * @param altText 
 * @param boardId The board to which this Pin belongs.
 * @param boardSectionId The board section to which this Pin belongs.
 * @param description 
 * @param dominantColor Dominant pin color. Hex number, e.g. `#6E7874`.
 * @param link 
 * @param mediaSource 
 * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @param sponsorId The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
 * @param title 
 */
data class PinCreate(

    @get:Size(max=500)
    @Schema(example = "null", description = "")
    @get:JsonProperty("alt_text") val altText: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The board to which this Pin belongs.")
    @get:JsonProperty("board_id") val boardId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The board section to which this Pin belongs.")
    @get:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null,

    @get:Size(max=800)
    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "Dominant pin color. Hex number, e.g. `#6E7874`.")
    @get:JsonProperty("dominant_color") val dominantColor: kotlin.String? = null,

    @get:Size(max=2048)
    @Schema(example = "null", description = "")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media_source") val mediaSource: PinMediaSource? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
    @get:JsonProperty("parent_pin_id") val parentPinId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.")
    @get:JsonProperty("sponsor_id") val sponsorId: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

