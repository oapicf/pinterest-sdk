package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsBaseFiltersAllOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsBaseFiltersAllOf(
  allOf: List[CatalogsBaseFilterKeys]
)

object CatalogsBaseFiltersAllOf {
  implicit lazy val catalogsBaseFiltersAllOfJsonFormat: Format[CatalogsBaseFiltersAllOf] = Json.format[CatalogsBaseFiltersAllOf]
}

