package model

import play.api.libs.json._

/**
  * Request object for updating a product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupUpdateRequest(
  description: Option[String],
  filters: Option[CatalogsProductGroupFiltersRequest],
  isFeatured: Option[Boolean],
  name: Option[String]
)

object CatalogsProductGroupUpdateRequest {
  implicit lazy val catalogsProductGroupUpdateRequestJsonFormat: Format[CatalogsProductGroupUpdateRequest] = Json.format[CatalogsProductGroupUpdateRequest]
}

