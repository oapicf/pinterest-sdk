package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param name     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BoardWithUpdatePrivacyUpdate(
  description: Option[String],
  name: Option[String],
  privacy: Option[BoardUpdatePrivacy]
)

object BoardWithUpdatePrivacyUpdate {
  implicit lazy val boardWithUpdatePrivacyUpdateJsonFormat: Format[BoardWithUpdatePrivacyUpdate] = Json.format[BoardWithUpdatePrivacyUpdate]
}

