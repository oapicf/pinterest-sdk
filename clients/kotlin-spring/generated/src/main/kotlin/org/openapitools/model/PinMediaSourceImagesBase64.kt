package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.PinMediaSourceImagesBase64Item
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
 * Multiple Base64-based images media source
 * @param items Array with image objects.
 * @param sourceType The source type of the media.
 * @param index 
 */
data class PinMediaSourceImagesBase64(

    @field:Valid
    @get:Size(min=2,max=5) 
    @Schema(required = true, description = "Array with image objects.")
    @param:JsonProperty("items")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<PinMediaSourceImagesBase64Item>,

    @Schema(required = true, description = "The source type of the media.")
    @param:JsonProperty("source_type")
    @get:JsonProperty("source_type", required = true) override val sourceType: PinMediaSourceImagesBase64.SourceType = kotlin.String.multiple_image_base64,

    @get:Min(value=0)
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("index")
    @get:JsonProperty("index") val index: kotlin.Int? = null
) : PinMediaSource {

    /**
    * The source type of the media.
    * Values: multiple_image_base64
    */
    enum class SourceType(@get:JsonValue val value: kotlin.String) {

        multiple_image_base64("multiple_image_base64");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SourceType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SourceType'")
            }
        }
    }

}

