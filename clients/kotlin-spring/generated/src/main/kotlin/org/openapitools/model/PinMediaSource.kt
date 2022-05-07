package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PinMediaSourceImageBase64
import org.openapitools.model.PinMediaSourceImageURL
import org.openapitools.model.PinMediaSourceVideoID
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Pin media source.
 * @param sourceType 
 * @param contentType 
 * @param &#x60;data&#x60; 
 * @param url 
 * @param coverImageUrl 
 * @param mediaId 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = PinMediaSourceImageBase64::class, name = "image_base64"),
      JsonSubTypes.Type(value = PinMediaSourceImageURL::class, name = "image_url"),
      JsonSubTypes.Type(value = PinMediaSourceVideoID::class, name = "video_id")
)

interface PinMediaSource{
        
        val sourceType: PinMediaSource.SourceType
        
        val contentType: PinMediaSource.ContentType
        
        val `data`: kotlin.String
        
        val url: kotlin.String
        
        val coverImageUrl: kotlin.String
        
        val mediaId: kotlin.String

    /**
    * 
    * Values: videoId
    */
    enum class SourceType(val value: kotlin.String) {
    
        @JsonProperty("video_id") videoId("video_id");
    
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

