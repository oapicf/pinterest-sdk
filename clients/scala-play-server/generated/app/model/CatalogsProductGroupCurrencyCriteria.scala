package model

import play.api.libs.json._

/**
  * A currency filter. This filter cannot be negated
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupCurrencyCriteria(
  values: NonNullableCatalogsCurrency,
  negated: Option[Boolean]
)

object CatalogsProductGroupCurrencyCriteria {
  implicit lazy val catalogsProductGroupCurrencyCriteriaJsonFormat: Format[CatalogsProductGroupCurrencyCriteria] = Json.format[CatalogsProductGroupCurrencyCriteria]
}

