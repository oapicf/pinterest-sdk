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
 * Video ID-based media source
 * @param sourceType 
 * @param coverImageUrl 
 * @param mediaId 
 */
data class PinMediaSourceVideoID(

    @field:JsonProperty("source_type", required = true) val sourceType: PinMediaSourceVideoID.SourceType,

    @field:JsonProperty("cover_image_url", required = true) val coverImageUrl: kotlin.String,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("media_id", required = true) val mediaId: kotlin.String
) {

    /**
    * 
    * Values: videoId
    */
    enum class SourceType(val value: kotlin.String) {
    
        @JsonProperty("video_id") videoId("video_id");
    
    }

}

