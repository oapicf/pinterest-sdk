package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersRequest_anyOf_1.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupFiltersRequestAnyOf1(
  allOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersRequestAnyOf1 {
  implicit lazy val catalogsProductGroupFiltersRequestAnyOf1JsonFormat: Format[CatalogsProductGroupFiltersRequestAnyOf1] = Json.format[CatalogsProductGroupFiltersRequestAnyOf1]
}

