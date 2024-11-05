package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ImageDetails
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
 * @param &#x60;150x150&#x60; 
 * @param &#x60;400x300&#x60; 
 * @param &#x60;600x&#x60; 
 * @param &#x60;1200x&#x60; 
 */
data class ImageMetadataImages(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("150x150") val `150x150`: ImageDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("400x300") val `400x300`: ImageDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("600x") val `600x`: ImageDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("1200x") val `1200x`: ImageDetails? = null
    ) {

}

