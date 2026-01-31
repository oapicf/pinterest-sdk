package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Summarized pin information
 * @param altText 
 * @param description 
 * @param id 
 * @param link 
 * @param media 
 * @param title 
 */
data class SummaryPin(

    @get:Size(max=500)
    @Schema(example = "null", description = "")
    @get:JsonProperty("alt_text") val altText: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @get:Size(max=2048)
    @Schema(example = "https://www.pinterest.com/", description = "")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("media") val media: PinMedia? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

