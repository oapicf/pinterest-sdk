package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * @param contentType 
 * @param &#x60;data&#x60; 
 */
data class BrandAccountProfileImageUpdate(

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("content_type")
    @get:JsonProperty("content_type") val contentType: BrandAccountProfileImageUpdate.ContentType? = null,

    @get:Pattern(regexp="[a-zA-Z0-9+/=]+")
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("data")
    @get:JsonProperty("data") val `data`: kotlin.String? = null
) {

    /**
    * 
    * Values: imageSlashJpeg,imageSlashPng
    */
    enum class ContentType(@get:JsonValue val value: kotlin.String) {

        imageSlashJpeg("image/jpeg"),
        imageSlashPng("image/png");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ContentType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ContentType'")
            }
        }
    }

}

