package model

import play.api.libs.json._

/**
  * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BulkUpsertRequest(
  create: Option[BulkUpsertRequestCreate],
  update: Option[BulkUpsertRequestUpdate]
)

object BulkUpsertRequest {
  implicit lazy val bulkUpsertRequestJsonFormat: Format[BulkUpsertRequest] = Json.format[BulkUpsertRequest]
}

