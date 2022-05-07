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
 * Image URL-based media source
 * @param sourceType 
 * @param url 
 */
data class PinMediaSourceImageURL(

    @field:JsonProperty("source_type", required = true) val sourceType: PinMediaSourceImageURL.SourceType,

    @field:JsonProperty("url", required = true) val url: kotlin.String
) {

    /**
    * 
    * Values: imageUrl
    */
    enum class SourceType(val value: kotlin.String) {
    
        @JsonProperty("image_url") imageUrl("image_url");
    
    }

}

