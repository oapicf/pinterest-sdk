package model

import play.api.libs.json._

/**
  * Request object to list products for a given hotel catalog_id and product group filter.
  * @param catalogId Catalog id pertaining to the hotel product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelListProductsByCatalogBasedFilterRequest(
  catalogType: CatalogsHotelListProductsByCatalogBasedFilterRequest.CatalogType.Value,
  catalogId: String,
  filters: CatalogsHotelProductGroupFilters
)

object CatalogsHotelListProductsByCatalogBasedFilterRequest {
  implicit lazy val catalogsHotelListProductsByCatalogBasedFilterRequestJsonFormat: Format[CatalogsHotelListProductsByCatalogBasedFilterRequest] = Json.format[CatalogsHotelListProductsByCatalogBasedFilterRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

