package model

import play.api.libs.json._

/**
  * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkUpsertRequest(
  create: Option[BulkUpsertRequestCreate],
  update: Option[BulkUpsertRequestUpdate]
)

object BulkUpsertRequest {
  implicit lazy val bulkUpsertRequestJsonFormat: Format[BulkUpsertRequest] = Json.format[BulkUpsertRequest]
}

