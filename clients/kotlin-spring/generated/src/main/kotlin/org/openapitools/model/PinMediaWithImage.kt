package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ImageSize
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
 * Pin with image.
 * @param mediaType 
 * @param images 
 */
data class PinMediaWithImage(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("media_type", required = true) val mediaType: PinMediaWithImage.MediaType,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("images") val images: ImageSize? = null
) {

    /**
    * 
    * Values: image
    */
    enum class MediaType(@get:JsonValue val value: kotlin.String) {

        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): MediaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PinMediaWithImage'")
            }
        }
    }

}

