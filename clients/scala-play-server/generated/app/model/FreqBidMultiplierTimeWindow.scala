package model

import play.api.libs.json._

/**
  * The time window for frequency bid multipliers.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FreqBidMultiplierTimeWindow(
)

object FreqBidMultiplierTimeWindow {
  implicit lazy val freqBidMultiplierTimeWindowJsonFormat: Format[FreqBidMultiplierTimeWindow] = Json.format[FreqBidMultiplierTimeWindow]
}

