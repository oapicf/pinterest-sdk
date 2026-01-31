package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewRequest.
  * @param imageUrl Image URL.
  * @param title Title displayed below ad.
  * @param pinId Pin ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdPreviewRequest(
  imageUrl: String,
  title: String,
  pinId: String
)

object AdPreviewRequest {
  implicit lazy val adPreviewRequestJsonFormat: Format[AdPreviewRequest] = Json.format[AdPreviewRequest]
}

