package org.openapitools.server.model


/**
 * = AdPreviewCreateFromImage =
 *
 * Ad preview source from an image URL.
 *
 * @param imageUrl Image URL. for example: ''https://somewebsite.com/someimage.jpg''
 * @param promotionId Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. for example: ''7834020404549''
 * @param title Title displayed below ad. for example: ''My Preview Image''
*/
final case class AdPreviewSourceImage (
  imageUrl: String,
  promotionId: Option[String] = None,
  title: String
)

