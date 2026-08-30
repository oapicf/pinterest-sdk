package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ImageSize
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
 * 
 * @param itemType Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
 * @param description 
 * @param images 
 * @param link 
 * @param title 
 */
data class ImageMetadata(

    @Schema(required = true, description = "Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.")
    @param:JsonProperty("item_type")
    @get:JsonProperty("item_type", required = true) override val itemType: ImageMetadata.ItemType = kotlin.String.image,

    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("images")
    @get:JsonProperty("images") val images: ImageSize? = null,

    @Schema(description = "")
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(description = "")
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null
) : PinMediaMetadata {

    /**
    * Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
    * Values: image
    */
    enum class ItemType(@get:JsonValue val value: kotlin.String) {

        image("image");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ItemType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ItemType'")
            }
        }
    }

}

