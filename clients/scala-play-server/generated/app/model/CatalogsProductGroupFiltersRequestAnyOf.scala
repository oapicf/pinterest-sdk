package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersRequest_anyOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupFiltersRequestAnyOf(
  anyOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersRequestAnyOf {
  implicit lazy val catalogsProductGroupFiltersRequestAnyOfJsonFormat: Format[CatalogsProductGroupFiltersRequestAnyOf] = Json.format[CatalogsProductGroupFiltersRequestAnyOf]
}

