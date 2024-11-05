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
 * @param title The name of the creative assets.
 * @param description Brief description of the creative assets.
 * @param link Link to the creative assets page.
 * @param iosDeepLink IOS deep link to the creative assets page.
 * @param androidDeepLink Link to the creative assets page.
 * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param customLabel0 Custom grouping of creative assets.
 * @param customLabel1 Custom grouping of creative assets.
 * @param customLabel2 Custom grouping of creative assets.
 * @param customLabel3 Custom grouping of creative assets.
 * @param customLabel4 Custom grouping of creative assets.
 * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
 * @param imageLink The creative assets image.
 * @param videoLink The creative assets video.
 */
data class CatalogsCreativeAssetsAttributes(

    @Schema(example = "null", description = "The name of the creative assets.")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "Brief description of the creative assets.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "Link to the creative assets page.")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(example = "null", description = "IOS deep link to the creative assets page.")
    @get:JsonProperty("ios_deep_link") val iosDeepLink: kotlin.String? = null,

    @Schema(example = "null", description = "Link to the creative assets page.")
    @get:JsonProperty("android_deep_link") val androidDeepLink: kotlin.String? = null,

    @Schema(example = "null", description = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
    @get:JsonProperty("google_product_category") val googleProductCategory: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of creative assets.")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of creative assets.")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of creative assets.")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of creative assets.")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of creative assets.")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.String? = null,

    @Schema(example = "null", description = "Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.")
    @get:JsonProperty("visibility") val visibility: kotlin.String? = null,

    @Schema(example = "https://scene.example.com/image/image_v2.jpg", description = "The creative assets image.")
    @get:JsonProperty("image_link") val imageLink: kotlin.String? = null,

    @Schema(example = "https://scene.example.com/image/image_v2.mp4", description = "The creative assets video.")
    @get:JsonProperty("video_link") val videoLink: kotlin.String? = null
    ) {

}

