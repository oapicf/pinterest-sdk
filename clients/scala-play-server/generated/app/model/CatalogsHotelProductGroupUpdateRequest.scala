package model

import play.api.libs.json._

/**
  * Request object for updating a hotel product group.
  * @param name Name of catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelProductGroupUpdateRequest(
  catalogType: Option[CatalogsHotelProductGroupUpdateRequest.CatalogType.Value],
  description: Option[String],
  filters: Option[CatalogsHotelProductGroupFilters],
  name: Option[String]
)

object CatalogsHotelProductGroupUpdateRequest {
  implicit lazy val catalogsHotelProductGroupUpdateRequestJsonFormat: Format[CatalogsHotelProductGroupUpdateRequest] = Json.format[CatalogsHotelProductGroupUpdateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

