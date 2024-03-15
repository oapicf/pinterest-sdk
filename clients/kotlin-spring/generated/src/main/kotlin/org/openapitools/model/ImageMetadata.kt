package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ImageMetadataImages
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
 * 
 * @param itemType 
 * @param title 
 * @param description 
 * @param link 
 * @param images 
 */
data class ImageMetadata(

    @Schema(example = "null", description = "")
    @get:JsonProperty("item_type") val itemType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("images") val images: ImageMetadataImages? = null
) {

}

