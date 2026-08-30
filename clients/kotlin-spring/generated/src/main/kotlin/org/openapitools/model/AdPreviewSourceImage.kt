package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
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
 * Ad preview source from an image URL.
 * @param imageUrl Image URL.
 * @param title Title displayed below ad.
 * @param promotionId Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
 */
data class AdPreviewSourceImage(

    @Schema(example = "https://somewebsite.com/someimage.jpg", required = true, description = "Image URL.")
    @param:JsonProperty("image_url")
    @get:JsonProperty("image_url", required = true) val imageUrl: kotlin.String,

    @Schema(example = "My Preview Image", required = true, description = "Title displayed below ad.")
    @param:JsonProperty("title")
    @get:JsonProperty("title", required = true) val title: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "7834020404549", description = "Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promotion_id")
    @get:JsonProperty("promotion_id") val promotionId: kotlin.String? = null
) : AdPreviewRequest {

}

