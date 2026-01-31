package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersRequest_anyOf_1.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupFiltersRequestAnyOf1(
  allOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersRequestAnyOf1 {
  implicit lazy val catalogsProductGroupFiltersRequestAnyOf1JsonFormat: Format[CatalogsProductGroupFiltersRequestAnyOf1] = Json.format[CatalogsProductGroupFiltersRequestAnyOf1]
}

