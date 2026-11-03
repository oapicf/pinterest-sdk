package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsProductGroupFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreativeAssetsProductGroupFiltersAllOf(
  allOf: List[CatalogsCreativeAssetsProductGroupFilterKeys]
)

object CatalogsCreativeAssetsProductGroupFiltersAllOf {
  implicit lazy val catalogsCreativeAssetsProductGroupFiltersAllOfJsonFormat: Format[CatalogsCreativeAssetsProductGroupFiltersAllOf] = Json.format[CatalogsCreativeAssetsProductGroupFiltersAllOf]
}

