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
 * Base64-encoded image media source
 * @param sourceType 
 * @param contentType 
 * @param &#x60;data&#x60; 
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 */
data class PinMediaSourceImageBase64(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source_type", required = true) val sourceType: PinMediaSourceImageBase64.SourceType,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("content_type", required = true) val contentType: PinMediaSourceImageBase64.ContentType,

    @get:Pattern(regexp="[a-zA-Z0-9+/=]+")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.String,

    @Schema(example = "null", description = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
    @get:JsonProperty("is_standard") val isStandard: kotlin.Boolean? = true
) {

    /**
    * 
    * Values: image_base64
    */
    enum class SourceType(val value: kotlin.String) {

        @JsonProperty("image_base64") image_base64("image_base64")
    }

    /**
    * 
    * Values: jpeg,png
    */
    enum class ContentType(val value: kotlin.String) {

        @JsonProperty("image/jpeg") jpeg("image/jpeg"),
        @JsonProperty("image/png") png("image/png")
    }

}

