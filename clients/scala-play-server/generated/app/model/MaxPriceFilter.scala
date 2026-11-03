package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MaxPriceFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MaxPriceFilter(
  MAX_PRICE: CatalogsProductGroupPricingCriteria
)

object MaxPriceFilter {
  implicit lazy val maxPriceFilterJsonFormat: Format[MaxPriceFilter] = Json.format[MaxPriceFilter]
}

