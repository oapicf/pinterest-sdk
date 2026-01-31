package model

import play.api.libs.json._

/**
  * Request object for creating a catalog.
  * @param name A human-friendly name associated to a given catalog.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreateRequest(
  catalogType: CatalogsType,
  name: String
)

object CatalogsCreateRequest {
  implicit lazy val catalogsCreateRequestJsonFormat: Format[CatalogsCreateRequest] = Json.format[CatalogsCreateRequest]
}

