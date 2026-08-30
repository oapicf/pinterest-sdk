package model

import play.api.libs.json._

/**
  * Request object for updating a product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupUpdateRequest(
  description: Option[String],
  filters: Option[CatalogsProductGroupFiltersRequest],
  isFeatured: Option[Boolean],
  name: Option[String]
)

object CatalogsProductGroupUpdateRequest {
  implicit lazy val catalogsProductGroupUpdateRequestJsonFormat: Format[CatalogsProductGroupUpdateRequest] = Json.format[CatalogsProductGroupUpdateRequest]
}

