package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroupFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelProductGroupFiltersAllOf(
  allOf: List[CatalogsHotelProductGroupFilterKeys]
)

object CatalogsHotelProductGroupFiltersAllOf {
  implicit lazy val catalogsHotelProductGroupFiltersAllOfJsonFormat: Format[CatalogsHotelProductGroupFiltersAllOf] = Json.format[CatalogsHotelProductGroupFiltersAllOf]
}

