package model

import play.api.libs.json._

/**
  * Request object for creating a product group.
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupCreateRequest(
  description: Option[String],
  feedId: String,
  filters: CatalogsProductGroupFiltersRequest,
  isFeatured: Option[Boolean],
  name: String
)

object CatalogsProductGroupCreateRequest {
  implicit lazy val catalogsProductGroupCreateRequestJsonFormat: Format[CatalogsProductGroupCreateRequest] = Json.format[CatalogsProductGroupCreateRequest]
}

