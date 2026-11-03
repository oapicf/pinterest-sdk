package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersRequestAnyOfItems0.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupFiltersRequestAnyOfItems0(
  anyOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersRequestAnyOfItems0 {
  implicit lazy val catalogsProductGroupFiltersRequestAnyOfItems0JsonFormat: Format[CatalogsProductGroupFiltersRequestAnyOfItems0] = Json.format[CatalogsProductGroupFiltersRequestAnyOfItems0]
}

