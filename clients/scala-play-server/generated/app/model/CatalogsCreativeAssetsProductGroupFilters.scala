package model

import play.api.libs.json._

/**
  * Object holding a group of filters for a creative assets product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreativeAssetsProductGroupFilters(
  anyOf: List[CatalogsCreativeAssetsProductGroupFilterKeys],
  allOf: List[CatalogsCreativeAssetsProductGroupFilterKeys]
)

object CatalogsCreativeAssetsProductGroupFilters {
  implicit lazy val catalogsCreativeAssetsProductGroupFiltersJsonFormat: Format[CatalogsCreativeAssetsProductGroupFilters] = Json.format[CatalogsCreativeAssetsProductGroupFilters]
}

