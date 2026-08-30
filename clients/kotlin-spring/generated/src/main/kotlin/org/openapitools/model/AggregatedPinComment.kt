package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AiDisclosures
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
 * 
 * @param id 
 * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
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
 * @param isProduct Whether the Pin is a product Pin.
 * @param isStandard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
 * @param link 
 * @param media 
 * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @param pinMetrics Pin metrics with associated time intervals if any.
 * @param title 
 */
data class AggregatedPinComment(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(description = "AI disclosure declarations the creator has made about this Pin.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ai_disclosures")
    @get:JsonProperty("ai_disclosures") val aiDisclosures: AiDisclosures? = null,

    @get:Size(max=500)
    @Schema(description = "")
    @param:JsonProperty("alt_text")
    @get:JsonProperty("alt_text") val altText: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The board to which this Pin belongs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("board_id")
    @get:JsonProperty("board_id") val boardId: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("board_owner")
    @get:JsonProperty("board_owner") val boardOwner: BoardOwner? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The board section to which this Pin belongs.")
    @param:JsonProperty("board_section_id")
    @get:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null,

    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @param:JsonProperty("creative_type")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null,

    @get:Size(max=800)
    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(description = "Dominant pin color. Hex number, e.g. `#6E7874`.")
    @param:JsonProperty("dominant_color")
    @get:JsonProperty("dominant_color") val dominantColor: kotlin.String? = null,

    @Schema(readOnly = true, description = "Whether the Pin has been promoted or not.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("has_been_promoted")
    @get:JsonProperty("has_been_promoted") val hasBeenPromoted: kotlin.Boolean? = null,

    @Schema(readOnly = true, description = "Whether the \"operation user_account\" is the Pin owner.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_owner")
    @get:JsonProperty("is_owner") val isOwner: kotlin.Boolean? = null,

    @Schema(readOnly = true, description = "Whether the Pin is a product Pin.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_product")
    @get:JsonProperty("is_product") val isProduct: kotlin.Boolean? = null,

    @Schema(readOnly = true, description = "Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_standard")
    @get:JsonProperty("is_standard") val isStandard: kotlin.Boolean? = null,

    @get:Size(max=2048)
    @Schema(description = "")
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("media")
    @get:JsonProperty("media") val media: PinMedia? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
    @param:JsonProperty("parent_pin_id")
    @get:JsonProperty("parent_pin_id") val parentPinId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "{\"90d\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3},\"lifetime_metrics\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3,\"reaction\":10,\"comment\":2}}", readOnly = true, description = "Pin metrics with associated time intervals if any.")
    @param:JsonProperty("pin_metrics")
    @get:JsonProperty("pin_metrics") val pinMetrics: kotlin.Any? = null,

    @get:Size(max=100)
    @Schema(description = "")
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

