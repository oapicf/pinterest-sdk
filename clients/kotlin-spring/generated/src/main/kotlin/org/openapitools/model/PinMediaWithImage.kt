package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ImageMetadataImages
import org.openapitools.model.PinMedia
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
 * Pin with image.
 * @param images 
 */
data class PinMediaWithImage(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("images") val images: ImageMetadataImages? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("media_type") override val mediaType: kotlin.String? = null
) : PinMedia{

}

