package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PinMediaSourceImagesURLItemsInner
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
 * Multiple images urls-based media source
 * @param items Array with image objects.
 * @param sourceType 
 * @param index 
 */
data class PinMediaSourceImagesURL(

    @field:Valid
    @get:Size(min=2,max=5) 
    @Schema(example = "null", required = true, description = "Array with image objects.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<PinMediaSourceImagesURLItemsInner>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("source_type") val sourceType: PinMediaSourceImagesURL.SourceType? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("index") val index: kotlin.Int? = null
    ) {

    /**
    * 
    * Values: multiple_image_urls
    */
    enum class SourceType(@get:JsonValue val value: kotlin.String) {

        multiple_image_urls("multiple_image_urls");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SourceType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

