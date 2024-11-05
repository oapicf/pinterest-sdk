package model

import play.api.libs.json._

/**
  * Request object for creating a catalog.
  * @param catalogType Type of the catalog entity.
  * @param name A human-friendly name associated to a given catalog.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

