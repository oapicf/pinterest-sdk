package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewRequest.
  * @param imageUrl Image URL.
  * @param title Title displayed below ad.
  * @param pinId Pin ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdPreviewRequest(
  imageUrl: String,
  title: String,
  pinId: String
)

object AdPreviewRequest {
  implicit lazy val adPreviewRequestJsonFormat: Format[AdPreviewRequest] = Json.format[AdPreviewRequest]
}

