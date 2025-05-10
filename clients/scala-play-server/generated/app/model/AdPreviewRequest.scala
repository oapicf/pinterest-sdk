package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewRequest.
  * @param imageUrl Image URL.
  * @param title Title displayed below ad.
  * @param pinId Pin ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdPreviewRequest(
  imageUrl: String,
  title: String,
  pinId: String
)

object AdPreviewRequest {
  implicit lazy val adPreviewRequestJsonFormat: Format[AdPreviewRequest] = Json.format[AdPreviewRequest]
}

