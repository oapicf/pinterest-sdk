package model

import play.api.libs.json._

/**
  * Request object for creating a product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsProductGroupCreateRequest(
  name: String,
  description: Option[String],
  isFeatured: Option[Boolean],
  filters: CatalogsProductGroupFiltersRequest,
  feedId: String
)

object CatalogsProductGroupCreateRequest {
  implicit lazy val catalogsProductGroupCreateRequestJsonFormat: Format[CatalogsProductGroupCreateRequest] = Json.format[CatalogsProductGroupCreateRequest]
}

