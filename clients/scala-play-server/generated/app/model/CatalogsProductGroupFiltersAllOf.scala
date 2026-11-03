package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupFiltersAllOf(
  allOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersAllOf {
  implicit lazy val catalogsProductGroupFiltersAllOfJsonFormat: Format[CatalogsProductGroupFiltersAllOf] = Json.format[CatalogsProductGroupFiltersAllOf]
}

