package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroupFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelProductGroupFiltersAllOf(
  allOf: List[CatalogsHotelProductGroupFilterKeys]
)

object CatalogsHotelProductGroupFiltersAllOf {
  implicit lazy val catalogsHotelProductGroupFiltersAllOfJsonFormat: Format[CatalogsHotelProductGroupFiltersAllOf] = Json.format[CatalogsHotelProductGroupFiltersAllOf]
}

