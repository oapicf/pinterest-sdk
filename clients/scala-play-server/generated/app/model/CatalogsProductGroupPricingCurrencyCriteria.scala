package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_group_pricing_currency_criteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupPricingCurrencyCriteria(
  operator: CatalogsProductGroupPricingCurrencyCriteria.Operator.Value,
  value: BigDecimal,
  currency: NonNullableCatalogsCurrency,
  negated: Option[Boolean]
)

object CatalogsProductGroupPricingCurrencyCriteria {
  implicit lazy val catalogsProductGroupPricingCurrencyCriteriaJsonFormat: Format[CatalogsProductGroupPricingCurrencyCriteria] = Json.format[CatalogsProductGroupPricingCurrencyCriteria]

  // noinspection TypeAnnotation
  object Operator extends Enumeration {
    val GREATERTHAN = Value("GREATER_THAN")
    val GREATERTHANOREQUALS = Value("GREATER_THAN_OR_EQUALS")
    val LESSTHAN = Value("LESS_THAN")
    val LESSTHANOREQUALS = Value("LESS_THAN_OR_EQUALS")

    type Operator = Value
    implicit lazy val OperatorJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

