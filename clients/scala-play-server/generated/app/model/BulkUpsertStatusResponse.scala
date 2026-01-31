package model

import play.api.libs.json._

/**
  * ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkUpsertStatusResponse(
  status: Option[BulkUpsertStatus],
  resultUrl: Option[String]
)

object BulkUpsertStatusResponse {
  implicit lazy val bulkUpsertStatusResponseJsonFormat: Format[BulkUpsertStatusResponse] = Json.format[BulkUpsertStatusResponse]
}

