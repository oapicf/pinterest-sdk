package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersRequestAnyOfItems0.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupFiltersRequestAnyOfItems0(
  anyOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersRequestAnyOfItems0 {
  implicit lazy val catalogsProductGroupFiltersRequestAnyOfItems0JsonFormat: Format[CatalogsProductGroupFiltersRequestAnyOfItems0] = Json.format[CatalogsProductGroupFiltersRequestAnyOfItems0]
}

