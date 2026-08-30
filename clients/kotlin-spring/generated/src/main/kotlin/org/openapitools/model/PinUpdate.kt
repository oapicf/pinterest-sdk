package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AiDisclosuresUpdate
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
 * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
 * @param altText 
 * @param boardId The board to which this Pin belongs.
 * @param boardSectionId The board section to which this Pin belongs.
 * @param carouselSlots Carousel Pin slots data.
 * @param description 
 * @param link 
 * @param title 
 */
data class PinUpdate(

    @field:Valid
    @Schema(description = "AI disclosure declarations the creator has made about this Pin.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ai_disclosures")
    @get:JsonProperty("ai_disclosures") val aiDisclosures: AiDisclosuresUpdate? = null,

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

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The board section to which this Pin belongs.")
    @param:JsonProperty("board_section_id")
    @get:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Carousel Pin slots data.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("carousel_slots")
    @get:JsonProperty("carousel_slots") val carouselSlots: kotlin.collections.List<CarouselSlot>? = null,

    @get:Size(max=800)
    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Size(max=2048)
    @Schema(description = "")
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @get:Size(max=100)
    @Schema(description = "")
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

