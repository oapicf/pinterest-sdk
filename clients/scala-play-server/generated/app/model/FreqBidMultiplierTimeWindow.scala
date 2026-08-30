package model

import play.api.libs.json._

/**
  * The time window for frequency bid multipliers.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class FreqBidMultiplierTimeWindow(
)

object FreqBidMultiplierTimeWindow {
  implicit lazy val freqBidMultiplierTimeWindowJsonFormat: Format[FreqBidMultiplierTimeWindow] = Json.format[FreqBidMultiplierTimeWindow]
}

