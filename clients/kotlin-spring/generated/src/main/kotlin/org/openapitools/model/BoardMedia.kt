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
 * Board media.
 * @param imageCoverUrl Board cover image.
 * @param pinThumbnailUrls Board pin thumbnail urls.
 */
data class BoardMedia(

    @Schema(example = "https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg", description = "Board cover image.")
    @get:JsonProperty("image_cover_url") val imageCoverUrl: kotlin.String? = null,

    @Schema(example = "[\"https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg\",\"https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg\",\"https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg\",\"https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg\"]", description = "Board pin thumbnail urls.")
    @get:JsonProperty("pin_thumbnail_urls") val pinThumbnailUrls: kotlin.collections.List<kotlin.String>? = null
    ) {

}

