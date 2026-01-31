package org.openapitools.server.model


/**
 * @param imageUrl Image URL. for example: ''https://somewebsite.com/someimage.jpg''
 * @param title Title displayed below ad. for example: ''My Preview Image''
 * @param pinId Pin ID. for example: ''7389479023''
 * @param catalogProductGroupId Catalog Product Group Id. for example: ''123456789''
 * @param creativeType Ad format of the shopping ad preview. for example: ''SHOPPING''
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE` for example: ''null''
 * @param heroImageTitle Title displayed below ad. for example: ''My Preview Image''
 * @param heroImageUrl Hero image URL. for example: ''https://somewebsite.com/someimage.jpg''
 * @param heroPinId Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. for example: ''987654321''
 * @param imageTag Multi image template tag. for example: ''Christmas Sale''
 * @param itemId Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. for example: ''111111111''
 * @param preferredMediaType Preferred media type. for example: ''IMAGE''
 * @param videoTag Multi video template tag, image_tag and video_tag are mutual exclusive. for example: ''Black Friday Sale''
*/
final case class AdPreviewRequest (
  imageUrl: String,
  title: String,
  pinId: String,
  catalogProductGroupId: String,
  creativeType: String,
  customizableCtaType: Option[CustomizableCTAType] = None,
  heroImageTitle: Option[String] = None,
  heroImageUrl: Option[String] = None,
  heroPinId: Option[String] = None,
  imageTag: Option[String] = None,
  itemId: Option[String] = None,
  preferredMediaType: Option[String] = None,
  videoTag: Option[String] = None
)

