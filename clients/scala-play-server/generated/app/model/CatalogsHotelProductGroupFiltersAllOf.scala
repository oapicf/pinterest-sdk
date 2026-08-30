package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroupFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelProductGroupFiltersAllOf(
  allOf: List[CatalogsHotelProductGroupFilterKeys]
)

object CatalogsHotelProductGroupFiltersAllOf {
  implicit lazy val catalogsHotelProductGroupFiltersAllOfJsonFormat: Format[CatalogsHotelProductGroupFiltersAllOf] = Json.format[CatalogsHotelProductGroupFiltersAllOf]
}

