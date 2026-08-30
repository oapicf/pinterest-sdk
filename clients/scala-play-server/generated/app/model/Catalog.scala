package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalog entity
  * @param id ID of the catalog entity.
  * @param name A human-friendly name associated to a catalog entity.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

