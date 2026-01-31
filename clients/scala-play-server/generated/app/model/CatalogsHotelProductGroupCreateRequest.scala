package model

import play.api.libs.json._

/**
  * Request object for creating a hotel product group.
  * @param catalogId Catalog id pertaining to the hotel product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

