@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdPreviewShopping(
    @field:JsonProperty("catalog_product_group_id")
    val catalogProductGroupId: kotlin.String,

    @field:JsonProperty("creative_type")
    val creativeType: AdShoppingPreviewCreativeType,

    @field:JsonProperty("customizable_cta_type")
    val customizableCtaType: CustomizableCTAType? = null,

    @field:JsonProperty("hero_image_title")
    val heroImageTitle: kotlin.String? = null,

    @field:JsonProperty("hero_image_url")
    val heroImageUrl: kotlin.String? = null,

    @field:JsonProperty("hero_pin_id")
    val heroPinId: kotlin.String? = null,

    @field:JsonProperty("image_tag")
    val imageTag: kotlin.String? = null,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String? = null,

    @field:JsonProperty("preferred_media_type")
    val preferredMediaType: BasePreferredMediaType? = null,

    @field:JsonProperty("show_promotion")
    val showPromotion: kotlin.Boolean? = null,

    @field:JsonProperty("video_tag")
    val videoTag: kotlin.String? = null,

)
