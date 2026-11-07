package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MinPriceFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MinPriceFilter(
  MIN_PRICE: CatalogsProductGroupPricingCriteria
)

object MinPriceFilter {
  implicit lazy val minPriceFilterJsonFormat: Format[MinPriceFilter] = Json.format[MinPriceFilter]
}

