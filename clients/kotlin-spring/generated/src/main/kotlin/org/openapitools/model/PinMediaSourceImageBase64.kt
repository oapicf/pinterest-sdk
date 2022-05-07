package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Base64-encoded image media source
 * @param sourceType 
 * @param contentType 
 * @param &#x60;data&#x60; 
 */
data class PinMediaSourceImageBase64(

    @field:JsonProperty("source_type", required = true) val sourceType: PinMediaSourceImageBase64.SourceType,

    @field:JsonProperty("content_type", required = true) val contentType: PinMediaSourceImageBase64.ContentType,
    @get:Pattern(regexp="[a-zA-Z0-9+/=]+")
    @field:JsonProperty("data", required = true) val `data`: kotlin.String
) {

    /**
    * 
    * Values: imageBase64
    */
    enum class SourceType(val value: kotlin.String) {
    
        @JsonProperty("image_base64") imageBase64("image_base64");
    
    }

    /**
    * 
    * Values: jpeg,png
    */
    enum class ContentType(val value: kotlin.String) {
    
        @JsonProperty("image/jpeg") jpeg("image/jpeg"),
    
        @JsonProperty("image/png") png("image/png");
    
    }

}

