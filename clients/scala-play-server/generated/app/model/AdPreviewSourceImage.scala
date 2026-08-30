package model

import play.api.libs.json._

/**
  * Ad preview source from an image URL.
  * @param imageUrl Image URL.
  * @param promotionId Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  * @param title Title displayed below ad.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdPreviewSourceImage(
  imageUrl: String,
  promotionId: Option[String],
  title: String
)

object AdPreviewSourceImage {
  implicit lazy val adPreviewSourceImageJsonFormat: Format[AdPreviewSourceImage] = Json.format[AdPreviewSourceImage]
}

