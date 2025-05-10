package model

import play.api.libs.json._

/**
  * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BulkUpsertRequest(
  create: Option[BulkUpsertRequestCreate],
  update: Option[BulkUpsertRequestUpdate]
)

object BulkUpsertRequest {
  implicit lazy val bulkUpsertRequestJsonFormat: Format[BulkUpsertRequest] = Json.format[BulkUpsertRequest]
}

