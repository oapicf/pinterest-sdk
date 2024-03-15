package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_create_request.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param catalogId Catalog id pertaining to the hotel product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupsCreateRequest(
  name: String,
  description: Option[String],
  isFeatured: Option[Boolean],
  filters: CatalogsHotelProductGroupFilters,
  feedId: String,
  catalogType: CatalogsProductGroupsCreateRequest.CatalogType.Value,
  catalogId: String
)

object CatalogsProductGroupsCreateRequest {
  implicit lazy val catalogsProductGroupsCreateRequestJsonFormat: Format[CatalogsProductGroupsCreateRequest] = Json.format[CatalogsProductGroupsCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

