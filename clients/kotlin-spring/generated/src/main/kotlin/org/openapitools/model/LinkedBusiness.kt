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
 * 
 * @param username Username
 * @param imageSmallUrl image_small_url
 * @param imageMediumUrl image_medium_url
 * @param imageLargeUrl image_large_url
 * @param imageXlargeUrl image_xlarge_url
 */
data class LinkedBusiness(

    @Schema(example = "username", description = "Username")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_small_url")
    @get:JsonProperty("image_small_url") val imageSmallUrl: kotlin.String? = null,

    @Schema(example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_medium_url")
    @get:JsonProperty("image_medium_url") val imageMediumUrl: kotlin.String? = null,

    @Schema(example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_large_url")
    @get:JsonProperty("image_large_url") val imageLargeUrl: kotlin.String? = null,

    @Schema(example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_xlarge_url")
    @get:JsonProperty("image_xlarge_url") val imageXlargeUrl: kotlin.String? = null
    ) {

}

