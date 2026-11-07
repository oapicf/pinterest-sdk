package model

import play.api.libs.json._

/**
  * A currency filter. This filter cannot be negated
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupCurrencyCriteria(
  negated: Option[Boolean],
  values: NonNullableCatalogsCurrency
)

object CatalogsProductGroupCurrencyCriteria {
  implicit lazy val catalogsProductGroupCurrencyCriteriaJsonFormat: Format[CatalogsProductGroupCurrencyCriteria] = Json.format[CatalogsProductGroupCurrencyCriteria]
}

