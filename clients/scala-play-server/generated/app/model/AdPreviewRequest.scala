package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewRequest.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdPreviewRequest(
  imageUrl: String,
  title: String,
  pinId: String,
  catalogProductGroupId: String,
  creativeType: AdPreviewRequest.CreativeType.Value,
  customizableCtaType: Option[CustomizableCTAType],
  heroImageTitle: Option[String],
  heroImageUrl: Option[String],
  heroPinId: Option[String],
  imageTag: Option[String],
  itemId: Option[String],
  preferredMediaType: Option[AdPreviewRequest.PreferredMediaType.Value],
  videoTag: Option[String]
)

object AdPreviewRequest {
  implicit lazy val adPreviewRequestJsonFormat: Format[AdPreviewRequest] = Json.format[AdPreviewRequest]

  // noinspection TypeAnnotation
  object CreativeType extends Enumeration {
    val SHOPPING = Value("SHOPPING")
    val CAROUSEL = Value("CAROUSEL")
    val COLLECTION = Value("COLLECTION")
    val REGULAR = Value("REGULAR")

    type CreativeType = Value
    implicit lazy val CreativeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object PreferredMediaType extends Enumeration {
    val VIDEO = Value("VIDEO")
    val IMAGE = Value("IMAGE")

    type PreferredMediaType = Value
    implicit lazy val PreferredMediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

