package model

import play.api.libs.json._

/**
  * ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BulkUpsertResponse(
  requestId: Option[String]
)

object BulkUpsertResponse {
  implicit lazy val bulkUpsertResponseJsonFormat: Format[BulkUpsertResponse] = Json.format[BulkUpsertResponse]
}

