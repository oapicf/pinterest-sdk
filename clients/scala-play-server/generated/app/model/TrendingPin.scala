package model

import play.api.libs.json._

/**
  * Pin image data for trending topics
  * @param color Dominant color of the pin image in hex format
  * @param height Height of the pin image in pixels
  * @param id Unique identifier for the pin
  * @param src URL of the pin image
  * @param verticalOffset The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
  * @param width Width of the pin image in pixels
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendingPin(
  color: String,
  height: Int,
  id: String,
  src: String,
  verticalOffset: Option[Double],
  width: Int
)

object TrendingPin {
  implicit lazy val trendingPinJsonFormat: Format[TrendingPin] = Json.format[TrendingPin]
}

