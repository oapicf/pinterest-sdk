package model

import play.api.libs.json._

/**
  * L1 interest categories for filtering trends.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TrendsL1Interest(
)

object TrendsL1Interest {
  implicit lazy val trendsL1InterestJsonFormat: Format[TrendsL1Interest] = Json.format[TrendsL1Interest]
}

