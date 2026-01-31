package model

import play.api.libs.json._

/**
  * Request object for updating a product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupUpdateRequest(
  description: Option[String],
  filters: Option[CatalogsProductGroupFiltersRequest],
  isFeatured: Option[Boolean],
  name: Option[String]
)

object CatalogsProductGroupUpdateRequest {
  implicit lazy val catalogsProductGroupUpdateRequestJsonFormat: Format[CatalogsProductGroupUpdateRequest] = Json.format[CatalogsProductGroupUpdateRequest]
}

