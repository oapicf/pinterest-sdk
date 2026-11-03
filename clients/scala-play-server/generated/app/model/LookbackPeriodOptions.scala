package model

import play.api.libs.json._

/**
  * Days in lookback window in the GET Conversion EQS response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LookbackPeriodOptions(
)

object LookbackPeriodOptions {
  implicit lazy val lookbackPeriodOptionsJsonFormat: Format[LookbackPeriodOptions] = Json.format[LookbackPeriodOptions]
}

