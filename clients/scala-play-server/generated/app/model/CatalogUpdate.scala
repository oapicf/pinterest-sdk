package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param name A human-friendly name associated to a catalog entity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogUpdate(
  catalogType: Option[CatalogsType],
  name: Option[String]
)

object CatalogUpdate {
  implicit lazy val catalogUpdateJsonFormat: Format[CatalogUpdate] = Json.format[CatalogUpdate]
}

