package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param isAdsOnly If set to `true`, the board will be ad-only and can store ad-only Pins.
  * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  * @param privacy     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BoardCreate(
  description: Option[String],
  isAdsOnly: Option[Boolean],
  name: String,
  privacy: Option[BoardPrivacy]
)

object BoardCreate {
  implicit lazy val boardCreateJsonFormat: Format[BoardCreate] = Json.format[BoardCreate]
}

