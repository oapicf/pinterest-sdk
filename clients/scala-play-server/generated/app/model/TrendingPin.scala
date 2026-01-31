package model

import play.api.libs.json._

/**
  * Pin image data for trending topics
  * @param height Height of the pin image in pixels
  * @param id Unique identifier for the pin
  * @param src URL of the pin image
  * @param width Width of the pin image in pixels
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TrendingPin(
  height: Int,
  id: String,
  src: String,
  width: Int
)

object TrendingPin {
  implicit lazy val trendingPinJsonFormat: Format[TrendingPin] = Json.format[TrendingPin]
}

