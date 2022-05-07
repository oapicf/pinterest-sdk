package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BoardOwner
import org.openapitools.model.PinMedia
import org.openapitools.model.PinMediaSource
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Pin
 * @param id 
 * @param createdAt 
 * @param link 
 * @param title 
 * @param description 
 * @param altText 
 * @param boardId The board to which this Pin belongs.
 * @param boardSectionId The board section to which this Pin belongs.
 * @param boardOwner 
 * @param media 
 * @param mediaSource 
 */
data class Pin(

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("link") val link: kotlin.String? = null,

    @field:JsonProperty("title") val title: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("alt_text") val altText: kotlin.String? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("board_id") val boardId: kotlin.String? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("board_section_id") val boardSectionId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("board_owner") val boardOwner: BoardOwner? = null,

    @field:Valid
    @field:JsonProperty("media") val media: PinMedia? = null,

    @field:Valid
    @field:JsonProperty("media_source") val mediaSource: PinMediaSource? = null
) {

}

