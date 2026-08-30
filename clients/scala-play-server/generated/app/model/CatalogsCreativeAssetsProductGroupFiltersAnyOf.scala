package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsProductGroupFiltersAnyOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsProductGroupFiltersAnyOf(
  anyOf: List[CatalogsCreativeAssetsProductGroupFilterKeys]
)

object CatalogsCreativeAssetsProductGroupFiltersAnyOf {
  implicit lazy val catalogsCreativeAssetsProductGroupFiltersAnyOfJsonFormat: Format[CatalogsCreativeAssetsProductGroupFiltersAnyOf] = Json.format[CatalogsCreativeAssetsProductGroupFiltersAnyOf]
}

