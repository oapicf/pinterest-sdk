package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PriceFilterPrice.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PriceFilterPrice(
  currency: NonNullableCatalogsCurrency,
  negated: Option[Boolean],
  operator: NumericFilterOperatorType,
  value: BigDecimal
)

object PriceFilterPrice {
  implicit lazy val priceFilterPriceJsonFormat: Format[PriceFilterPrice] = Json.format[PriceFilterPrice]
}

