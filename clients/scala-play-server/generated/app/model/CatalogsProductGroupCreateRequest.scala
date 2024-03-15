package model

import play.api.libs.json._

/**
  * Request object for creating a product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

