package model

import play.api.libs.json._

/**
  * ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BulkUpsertStatusResponse(
  status: Option[BulkUpsertStatus],
  resultUrl: Option[String]
)

object BulkUpsertStatusResponse {
  implicit lazy val bulkUpsertStatusResponseJsonFormat: Format[BulkUpsertStatusResponse] = Json.format[BulkUpsertStatusResponse]
}

