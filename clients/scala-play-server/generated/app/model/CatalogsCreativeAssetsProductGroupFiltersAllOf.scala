package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsProductGroupFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsCreativeAssetsProductGroupFiltersAllOf(
  allOf: List[CatalogsCreativeAssetsProductGroupFilterKeys]
)

object CatalogsCreativeAssetsProductGroupFiltersAllOf {
  implicit lazy val catalogsCreativeAssetsProductGroupFiltersAllOfJsonFormat: Format[CatalogsCreativeAssetsProductGroupFiltersAllOf] = Json.format[CatalogsCreativeAssetsProductGroupFiltersAllOf]
}

