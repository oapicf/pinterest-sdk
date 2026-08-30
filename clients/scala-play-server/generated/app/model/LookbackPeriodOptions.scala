package model

import play.api.libs.json._

/**
  * Days in lookback window in the GET Conversion EQS response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LookbackPeriodOptions(
)

object LookbackPeriodOptions {
  implicit lazy val lookbackPeriodOptionsJsonFormat: Format[LookbackPeriodOptions] = Json.format[LookbackPeriodOptions]
}

