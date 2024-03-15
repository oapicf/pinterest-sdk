package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MaxPriceFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MaxPriceFilter(
  MAX_PRICE: CatalogsProductGroupPricingCriteria
)

object MaxPriceFilter {
  implicit lazy val maxPriceFilterJsonFormat: Format[MaxPriceFilter] = Json.format[MaxPriceFilter]
}

