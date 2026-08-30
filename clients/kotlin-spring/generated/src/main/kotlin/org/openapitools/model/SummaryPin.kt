package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param id 
 * @param altText 
 * @param description 
 * @param link 
 * @param media 
 * @param title 
 */
data class SummaryPin(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Size(max=500)
    @Schema(description = "")
    @param:JsonProperty("alt_text")
    @get:JsonProperty("alt_text") val altText: kotlin.String? = null,

    @get:Size(max=800)
    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

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

    @get:Size(max=100)
    @Schema(description = "")
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

