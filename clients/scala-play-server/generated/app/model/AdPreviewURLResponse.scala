package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewURLResponse.
  * @param url 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdPreviewURLResponse(
  url: Option[String]
)

object AdPreviewURLResponse {
  implicit lazy val adPreviewURLResponseJsonFormat: Format[AdPreviewURLResponse] = Json.format[AdPreviewURLResponse]
}

