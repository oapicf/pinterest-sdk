package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdShoppingPreviewCreativeType
import org.openapitools.model.BasePreferredMediaType
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
 * Ad preview from a catalog product group (shopping).
 * @param catalogProductGroupId Catalog Product Group Id.
 * @param creativeType Ad format of the shopping ad preview.
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
 * @param heroImageTitle Title displayed below ad.
 * @param heroImageUrl Hero image URL.
 * @param heroPinId Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
 * @param imageTag Multi image template tag.
 * @param itemId Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
 * @param preferredMediaType Preferred media type.
 * @param showPromotion Include promotion data in preview when available on catalog item. Defaults to false.
 * @param videoTag Multi video template tag, image_tag and video_tag are mutual exclusive.
 */
data class AdPreviewShopping(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "123456789", required = true, description = "Catalog Product Group Id.")
    @param:JsonProperty("catalog_product_group_id")
    @get:JsonProperty("catalog_product_group_id", required = true) val catalogProductGroupId: kotlin.String,

    @field:Valid
    @Schema(example = "SHOPPING", required = true, description = "Ad format of the shopping ad preview.")
    @param:JsonProperty("creative_type")
    @get:JsonProperty("creative_type", required = true) val creativeType: AdShoppingPreviewCreativeType,

    @field:Valid
    @Schema(description = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`")
    @param:JsonProperty("customizable_cta_type")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: CustomizableCTAType? = null,

    @Schema(example = "My Preview Image", description = "Title displayed below ad.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hero_image_title")
    @get:JsonProperty("hero_image_title") val heroImageTitle: kotlin.String? = null,

    @Schema(example = "https://somewebsite.com/someimage.jpg", description = "Hero image URL.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hero_image_url")
    @get:JsonProperty("hero_image_url") val heroImageUrl: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "987654321", description = "Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hero_pin_id")
    @get:JsonProperty("hero_pin_id") val heroPinId: kotlin.String? = null,

    @Schema(example = "Christmas Sale", description = "Multi image template tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("image_tag")
    @get:JsonProperty("image_tag") val imageTag: kotlin.String? = null,

    @Schema(example = "111111111", description = "Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id") val itemId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "IMAGE", description = "Preferred media type.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("preferred_media_type")
    @get:JsonProperty("preferred_media_type") val preferredMediaType: BasePreferredMediaType? = null,

    @Schema(description = "Include promotion data in preview when available on catalog item. Defaults to false.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("show_promotion")
    @get:JsonProperty("show_promotion") val showPromotion: kotlin.Boolean? = null,

    @Schema(example = "Black Friday Sale", description = "Multi video template tag, image_tag and video_tag are mutual exclusive.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("video_tag")
    @get:JsonProperty("video_tag") val videoTag: kotlin.String? = null
) : AdPreviewRequest {

}

