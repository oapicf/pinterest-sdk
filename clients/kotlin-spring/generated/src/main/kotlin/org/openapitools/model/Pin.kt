package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BoardOwner
import org.openapitools.model.CreativeType
import org.openapitools.model.PinMedia
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
 * Pin model containing properties related to a Pinterest Pin.
 * @param id 
 * @param altText 
 * @param boardId The board to which this Pin belongs.
 * @param boardOwner 
 * @param boardSectionId The board section to which this Pin belongs.
 * @param createdAt 
 * @param creativeType 
 * @param description 
 * @param dominantColor Dominant pin color. Hex number, e.g. `#6E7874`.
 * @param hasBeenPromoted Whether the Pin has been promoted or not.
 * @param isOwner Whether the \"operation user_account\" is the Pin owner.
 * @param isStandard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
 * @param link 
 * @param media 
 * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @param pinMetrics Pin metrics with associated time intervals if any.
 * @param title 
 */
data class Pin(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Size(max=500)
    @Schema(example = "null", description = "")
    @get:JsonProperty("alt_text") val altText: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The board to which this Pin belongs.")
    @get:JsonProperty("board_id") val boardId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("board_owner") val boardOwner: BoardOwner? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The board section to which this Pin belongs.")
    @get:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null,

    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null,

    @get:Size(max=800)
    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "Dominant pin color. Hex number, e.g. `#6E7874`.")
    @get:JsonProperty("dominant_color") val dominantColor: kotlin.String? = null,

    @Schema(example = "null", readOnly = true, description = "Whether the Pin has been promoted or not.")
    @get:JsonProperty("has_been_promoted") val hasBeenPromoted: kotlin.Boolean? = null,

    @Schema(example = "null", readOnly = true, description = "Whether the \"operation user_account\" is the Pin owner.")
    @get:JsonProperty("is_owner") val isOwner: kotlin.Boolean? = null,

    @Schema(example = "null", readOnly = true, description = "Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.")
    @get:JsonProperty("is_standard") val isStandard: kotlin.Boolean? = null,

    @get:Size(max=2048)
    @Schema(example = "null", description = "")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("media") val media: PinMedia? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
    @get:JsonProperty("parent_pin_id") val parentPinId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "{\"90d\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3},\"lifetime_metrics\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3,\"reaction\":10,\"comment\":2}}", readOnly = true, description = "Pin metrics with associated time intervals if any.")
    @get:JsonProperty("pin_metrics") val pinMetrics: kotlin.Any? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

