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
 * @param description Carousel Pin slot description.
 * @param link Carousel Pin slot link.
 * @param title Carousel Pin slot title.
 */
data class CarouselSlot(

    @Schema(description = "Carousel Pin slot description.")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(description = "Carousel Pin slot link.")
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(description = "Carousel Pin slot title.")
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

