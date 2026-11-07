package model

import play.api.libs.json._

/**
  * Request object for creating a hotel product group.
  * @param catalogId Catalog ID pertaining to the product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsHotelProductGroupCreateRequest(
  catalogId: String,
  catalogType: CatalogsHotelProductGroupCreateRequest.CatalogType.Value,
  description: Option[String],
  filters: CatalogsHotelProductGroupFilters,
  name: String
)

object CatalogsHotelProductGroupCreateRequest {
  implicit lazy val catalogsHotelProductGroupCreateRequestJsonFormat: Format[CatalogsHotelProductGroupCreateRequest] = Json.format[CatalogsHotelProductGroupCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

