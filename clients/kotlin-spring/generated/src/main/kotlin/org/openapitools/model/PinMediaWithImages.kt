package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ImageMetadata
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * Pin with multiple images.
 * @param mediaType 
 * @param items 
 */
data class PinMediaWithImages(

    @Schema(required = true, description = "")
    @param:JsonProperty("media_type")
    @get:JsonProperty("media_type", required = true) override val mediaType: PinMediaWithImages.MediaType = kotlin.String.multiple_images,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("items")
    @get:JsonProperty("items") val items: kotlin.collections.List<ImageMetadata>? = null
) : PinMedia {

    /**
    * 
    * Values: multiple_images
    */
    enum class MediaType(@get:JsonValue val value: kotlin.String) {

        multiple_images("multiple_images");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): MediaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MediaType'")
            }
        }
    }

}

