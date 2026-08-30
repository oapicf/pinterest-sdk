package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdPreviewShopping
import org.openapitools.server.api.model.AdPreviewSourceImage
import org.openapitools.server.api.model.AdPreviewSourcePinId
import org.openapitools.server.api.model.AdShoppingPreviewCreativeType
import org.openapitools.server.api.model.BasePreferredMediaType
import org.openapitools.server.api.model.CustomizableCTAType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdPreviewRequest(
    /** Image URL. */
    val imageUrl: kotlin.String,
    /** Title displayed below ad. */
    val title: kotlin.String,
    /** Ad format of the shopping ad preview. */
    val creativeType: AdShoppingPreviewCreativeType,
    /** Pin ID. */
    val pinId: kotlin.String,
    /** Catalog Product Group Id. */
    val catalogProductGroupId: kotlin.String,
    /** Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
    val promotionId: kotlin.String? = null,
    /** Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; */
    val customizableCtaType: CustomizableCTAType? = null,
    /** Title displayed below ad. */
    val heroImageTitle: kotlin.String? = null,
    /** Hero image URL. */
    val heroImageUrl: kotlin.String? = null,
    /** Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. */
    val heroPinId: kotlin.String? = null,
    /** Multi image template tag. */
    val imageTag: kotlin.String? = null,
    /** Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. */
    val itemId: kotlin.String? = null,
    /** Preferred media type. */
    val preferredMediaType: BasePreferredMediaType? = null,
    /** Include promotion data in preview when available on catalog item. Defaults to false. */
    val showPromotion: kotlin.Boolean? = null,
    /** Multi video template tag, image_tag and video_tag are mutual exclusive. */
    val videoTag: kotlin.String? = null
)
