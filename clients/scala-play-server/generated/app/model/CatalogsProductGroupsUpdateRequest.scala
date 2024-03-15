package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_update_request.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupsUpdateRequest(
  name: Option[String],
  description: Option[String],
  isFeatured: Option[Boolean],
  filters: Option[CatalogsHotelProductGroupFilters],
  catalogType: Option[CatalogsProductGroupsUpdateRequest.CatalogType.Value]
)

object CatalogsProductGroupsUpdateRequest {
  implicit lazy val catalogsProductGroupsUpdateRequestJsonFormat: Format[CatalogsProductGroupsUpdateRequest] = Json.format[CatalogsProductGroupsUpdateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

