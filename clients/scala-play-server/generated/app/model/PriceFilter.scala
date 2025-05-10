package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PriceFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class PriceFilter(
  PRICE: CatalogsProductGroupPricingCurrencyCriteria
)

object PriceFilter {
  implicit lazy val priceFilterJsonFormat: Format[PriceFilter] = Json.format[PriceFilter]
}

