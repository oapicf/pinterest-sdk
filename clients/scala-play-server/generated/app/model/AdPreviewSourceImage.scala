package model

import play.api.libs.json._

/**
  * Ad preview source from an image URL.
  * @param imageUrl Image URL.
  * @param promotionId Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  * @param title Title displayed below ad.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdPreviewSourceImage(
  imageUrl: String,
  promotionId: Option[String],
  title: String
)

object AdPreviewSourceImage {
  implicit lazy val adPreviewSourceImageJsonFormat: Format[AdPreviewSourceImage] = Json.format[AdPreviewSourceImage]
}

