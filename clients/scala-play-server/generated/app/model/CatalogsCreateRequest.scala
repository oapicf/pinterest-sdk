package model

import play.api.libs.json._

/**
  * Request object for creating a catalog.
  * @param catalogType Type of the catalog entity.
  * @param name A human-friendly name associated to a given catalog.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreateRequest(
  catalogType: CatalogsCreateRequest.CatalogType.Value,
  name: String
)

object CatalogsCreateRequest {
  implicit lazy val catalogsCreateRequestJsonFormat: Format[CatalogsCreateRequest] = Json.format[CatalogsCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

