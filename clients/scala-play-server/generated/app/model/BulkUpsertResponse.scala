package model

import play.api.libs.json._

/**
  * ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkUpsertResponse(
  requestId: Option[String]
)

object BulkUpsertResponse {
  implicit lazy val bulkUpsertResponseJsonFormat: Format[BulkUpsertResponse] = Json.format[BulkUpsertResponse]
}

