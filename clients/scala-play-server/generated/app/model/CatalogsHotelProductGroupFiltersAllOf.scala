package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroupFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsHotelProductGroupFiltersAllOf(
  allOf: List[CatalogsHotelProductGroupFilterKeys]
)

object CatalogsHotelProductGroupFiltersAllOf {
  implicit lazy val catalogsHotelProductGroupFiltersAllOfJsonFormat: Format[CatalogsHotelProductGroupFiltersAllOf] = Json.format[CatalogsHotelProductGroupFiltersAllOf]
}

