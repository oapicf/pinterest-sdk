package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalog entity
  * @param id ID of the catalog entity.
  * @param name A human-friendly name associated to a catalog entity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Catalog(
  catalogType: CatalogsType,
  createdAt: OffsetDateTime,
  id: String,
  name: String,
  updatedAt: OffsetDateTime
)

object Catalog {
  implicit lazy val catalogJsonFormat: Format[Catalog] = Json.format[Catalog]
}

