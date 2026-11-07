package model

import play.api.libs.json._

/**
  * Object holding a group of filters for a catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupFilters(
  anyOf: List[CatalogsProductGroupFilterKeys],
  allOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFilters {
  implicit lazy val catalogsProductGroupFiltersJsonFormat: Format[CatalogsProductGroupFilters] = Json.format[CatalogsProductGroupFilters]
}

