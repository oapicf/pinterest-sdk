package model

import play.api.libs.json._

/**
  * This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BidOptionsGenderMultipliers(
  female: Option[BigDecimal],
  male: Option[BigDecimal]
)

object BidOptionsGenderMultipliers {
  implicit lazy val bidOptionsGenderMultipliersJsonFormat: Format[BidOptionsGenderMultipliers] = Json.format[BidOptionsGenderMultipliers]
}

