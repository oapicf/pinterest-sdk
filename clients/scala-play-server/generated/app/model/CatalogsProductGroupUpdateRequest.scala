package model

import play.api.libs.json._

/**
  * Request object for updating a product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupUpdateRequest(
  name: Option[String],
  description: Option[String],
  isFeatured: Option[Boolean],
  filters: Option[CatalogsProductGroupFiltersRequest]
)

object CatalogsProductGroupUpdateRequest {
  implicit lazy val catalogsProductGroupUpdateRequestJsonFormat: Format[CatalogsProductGroupUpdateRequest] = Json.format[CatalogsProductGroupUpdateRequest]
}

