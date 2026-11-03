package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersRequestAnyOfItems1.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupFiltersRequestAnyOfItems1(
  allOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersRequestAnyOfItems1 {
  implicit lazy val catalogsProductGroupFiltersRequestAnyOfItems1JsonFormat: Format[CatalogsProductGroupFiltersRequestAnyOfItems1] = Json.format[CatalogsProductGroupFiltersRequestAnyOfItems1]
}

