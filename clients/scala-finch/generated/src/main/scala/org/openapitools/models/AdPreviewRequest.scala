package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdPreviewCreateFromImage
import org.openapitools.models.AdPreviewCreateFromPin
import org.openapitools.models.AdPreviewShopping
import org.openapitools.models.CustomizableCTAType

/**
 * 
 * @param imageUnderscoreurl Image URL.
 * @param title Title displayed below ad.
 * @param pinUnderscoreid Pin ID.
 * @param catalogUnderscoreproductUnderscoregroupUnderscoreid Catalog Product Group Id.
 * @param creativeUnderscoretype Ad format of the shopping ad preview.
 * @param customizableUnderscorectaUnderscoretype Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
 * @param heroUnderscoreimageUnderscoretitle Title displayed below ad.
 * @param heroUnderscoreimageUnderscoreurl Hero image URL.
 * @param heroUnderscorepinUnderscoreid Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
 * @param imageUnderscoretag Multi image template tag.
 * @param itemUnderscoreid Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
 * @param preferredUnderscoremediaUnderscoretype Preferred media type.
 * @param videoUnderscoretag Multi video template tag, image_tag and video_tag are mutual exclusive.
 */
case class AdPreviewRequest(imageUnderscoreurl: String,
                title: String,
                pinUnderscoreid: String,
                catalogUnderscoreproductUnderscoregroupUnderscoreid: String,
                creativeUnderscoretype: String,
                customizableUnderscorectaUnderscoretype: Option[CustomizableCTAType],
                heroUnderscoreimageUnderscoretitle: Option[String],
                heroUnderscoreimageUnderscoreurl: Option[String],
                heroUnderscorepinUnderscoreid: Option[String],
                imageUnderscoretag: Option[String],
                itemUnderscoreid: Option[String],
                preferredUnderscoremediaUnderscoretype: Option[String],
                videoUnderscoretag: Option[String]
                )

object AdPreviewRequest {
    /**
     * Creates the codec for converting AdPreviewRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdPreviewRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdPreviewRequest] = deriveEncoder
}
