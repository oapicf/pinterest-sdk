package model

import play.api.libs.json._

/**
  * A currency filter. This filter cannot be negated
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsProductGroupCurrencyCriteria(
  values: NonNullableCatalogsCurrency,
  negated: Option[Boolean]
)

object CatalogsProductGroupCurrencyCriteria {
  implicit lazy val catalogsProductGroupCurrencyCriteriaJsonFormat: Format[CatalogsProductGroupCurrencyCriteria] = Json.format[CatalogsProductGroupCurrencyCriteria]
}

