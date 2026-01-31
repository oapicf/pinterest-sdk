package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdPreviewCreateFromImage
import org.openapitools.model.AdPreviewCreateFromPin
import org.openapitools.model.AdPreviewShopping
import org.openapitools.model.CustomizableCTAType
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
 * @param imageUrl Image URL.
 * @param title Title displayed below ad.
 * @param pinId Pin ID.
 * @param catalogProductGroupId Catalog Product Group Id.
 * @param creativeType Ad format of the shopping ad preview.
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
 * @param heroImageTitle Title displayed below ad.
 * @param heroImageUrl Hero image URL.
 * @param heroPinId Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
 * @param imageTag Multi image template tag.
 * @param itemId Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
 * @param preferredMediaType Preferred media type.
 * @param videoTag Multi video template tag, image_tag and video_tag are mutual exclusive.
 */
data class AdPreviewRequest(

    @Schema(example = "https://somewebsite.com/someimage.jpg", required = true, description = "Image URL.")
    @get:JsonProperty("image_url", required = true) val imageUrl: kotlin.String,

    @Schema(example = "My Preview Image", required = true, description = "Title displayed below ad.")
    @get:JsonProperty("title", required = true) val title: kotlin.String,

    @Schema(example = "7389479023", required = true, description = "Pin ID.")
    @get:JsonProperty("pin_id", required = true) val pinId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "123456789", required = true, description = "Catalog Product Group Id.")
    @get:JsonProperty("catalog_product_group_id", required = true) val catalogProductGroupId: kotlin.String,

    @Schema(example = "SHOPPING", required = true, description = "Ad format of the shopping ad preview.")
    @get:JsonProperty("creative_type", required = true) val creativeType: AdPreviewRequest.CreativeType,

    @field:Valid
    @Schema(example = "null", description = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: CustomizableCTAType? = null,

    @Schema(example = "My Preview Image", description = "Title displayed below ad.")
    @get:JsonProperty("hero_image_title") val heroImageTitle: kotlin.String? = null,

    @Schema(example = "https://somewebsite.com/someimage.jpg", description = "Hero image URL.")
    @get:JsonProperty("hero_image_url") val heroImageUrl: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "987654321", description = "Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.")
    @get:JsonProperty("hero_pin_id") val heroPinId: kotlin.String? = null,

    @Schema(example = "Christmas Sale", description = "Multi image template tag.")
    @get:JsonProperty("image_tag") val imageTag: kotlin.String? = null,

    @Schema(example = "111111111", description = "Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.")
    @get:JsonProperty("item_id") val itemId: kotlin.String? = null,

    @Schema(example = "IMAGE", description = "Preferred media type.")
    @get:JsonProperty("preferred_media_type") val preferredMediaType: AdPreviewRequest.PreferredMediaType? = null,

    @Schema(example = "Black Friday Sale", description = "Multi video template tag, image_tag and video_tag are mutual exclusive.")
    @get:JsonProperty("video_tag") val videoTag: kotlin.String? = null
) {

    /**
    * Ad format of the shopping ad preview.
    * Values: SHOPPING,CAROUSEL,COLLECTION,REGULAR
    */
    enum class CreativeType(@get:JsonValue val value: kotlin.String) {

        SHOPPING("SHOPPING"),
        CAROUSEL("CAROUSEL"),
        COLLECTION("COLLECTION"),
        REGULAR("REGULAR");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CreativeType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdPreviewRequest'")
            }
        }
    }

    /**
    * Preferred media type.
    * Values: VIDEO,IMAGE
    */
    enum class PreferredMediaType(@get:JsonValue val value: kotlin.String) {

        VIDEO("VIDEO"),
        IMAGE("IMAGE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PreferredMediaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdPreviewRequest'")
            }
        }
    }

}

