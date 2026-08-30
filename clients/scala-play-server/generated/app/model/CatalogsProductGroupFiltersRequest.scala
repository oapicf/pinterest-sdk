package model

import play.api.libs.json._

/**
  * Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupFiltersRequest(
  anyOf: List[CatalogsProductGroupFilterKeys],
  allOf: List[CatalogsProductGroupFilterKeys]
)

object CatalogsProductGroupFiltersRequest {
  implicit lazy val catalogsProductGroupFiltersRequestJsonFormat: Format[CatalogsProductGroupFiltersRequest] = Json.format[CatalogsProductGroupFiltersRequest]
}

