package model

import play.api.libs.json._

/**
  * Request object to list products for a given hotel catalog_id and product group filter.
  * @param catalogId Catalog id pertaining to the hotel product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

