package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param contentType 
 * @param &#x60;data&#x60; Image to upload as base64 string.
 * @param title 
 * @param description 
 * @param link Destination link for the image.
 */
data class PinMediaSourceImagesBase64ItemsInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("content_type", required = true) val contentType: PinMediaSourceImagesBase64ItemsInner.ContentType,

    @get:Pattern(regexp="[a-zA-Z0-9+/=]+")
    @Schema(example = "null", required = true, description = "Image to upload as base64 string.")
    @get:JsonProperty("data", required = true) val `data`: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "Destination link for the image.")
    @get:JsonProperty("link") val link: kotlin.String? = null
) {

    /**
    * 
    * Values: jpeg,png
    */
    enum class ContentType(val value: kotlin.String) {

        @JsonProperty("image/jpeg") jpeg("image/jpeg"),
        @JsonProperty("image/png") png("image/png")
    }

}

