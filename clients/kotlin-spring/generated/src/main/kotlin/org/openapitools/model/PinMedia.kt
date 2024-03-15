package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Pin media objects.
 * @param mediaType 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "media_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = PinMediaWithImage::class, name = "image"),
      JsonSubTypes.Type(value = PinMediaWithImages::class, name = "multiple_images"),
      JsonSubTypes.Type(value = PinMediaWithImageAndVideo::class, name = "multiple_mixed"),
      JsonSubTypes.Type(value = PinMediaWithVideos::class, name = "multiple_videos"),
      JsonSubTypes.Type(value = PinMediaWithVideo::class, name = "video")
)

interface PinMedia{
                @get:Schema(example = "null", description = "")
        val mediaType: kotlin.String? 


}

