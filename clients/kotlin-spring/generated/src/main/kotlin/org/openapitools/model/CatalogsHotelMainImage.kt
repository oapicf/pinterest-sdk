package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * The main hotel image
 * @param link <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
 * @param tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
 */
data class CatalogsHotelMainImage(

    @Schema(description = "<= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.")
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(description = "Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image")
    @param:JsonProperty("tag")
    @get:JsonProperty("tag") val tag: kotlin.collections.List<kotlin.String>? = null
) {

}

