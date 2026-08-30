package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ContentType
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
 * Image Base64-based media source.
 * @param contentType 
 * @param &#x60;data&#x60; 
 * @param sourceType The source type of the media.
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 */
data class PinMediaSourceImageBase64(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("content_type")
    @get:JsonProperty("content_type", required = true) val contentType: ContentType,

    @get:Pattern(regexp="^[a-zA-Z0-9+/=]+$")
    @Schema(required = true, description = "")
    @param:JsonProperty("data")
    @get:JsonProperty("data", required = true) val `data`: kotlin.String,

    @Schema(required = true, description = "The source type of the media.")
    @param:JsonProperty("source_type")
    @get:JsonProperty("source_type", required = true) override val sourceType: PinMediaSourceImageBase64.SourceType = kotlin.String.image_base64,

    @Schema(description = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_standard")
    @get:JsonProperty("is_standard") val isStandard: kotlin.Boolean? = true
) : PinMediaSource {

    /**
    * The source type of the media.
    * Values: image_base64
    */
    enum class SourceType(@get:JsonValue val value: kotlin.String) {

        image_base64("image_base64");

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

