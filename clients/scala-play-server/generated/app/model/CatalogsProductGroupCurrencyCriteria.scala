package model

import play.api.libs.json._

/**
  * A currency filter. This filter cannot be negated
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupCurrencyCriteria(
  negated: Option[Boolean],
  values: NonNullableCatalogsCurrency
)

object CatalogsProductGroupCurrencyCriteria {
  implicit lazy val catalogsProductGroupCurrencyCriteriaJsonFormat: Format[CatalogsProductGroupCurrencyCriteria] = Json.format[CatalogsProductGroupCurrencyCriteria]
}

