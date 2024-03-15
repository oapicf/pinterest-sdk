package model

import play.api.libs.json._

/**
  * ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BulkUpsertStatusResponse(
  status: Option[BulkUpsertStatus],
  resultUrl: Option[String]
)

object BulkUpsertStatusResponse {
  implicit lazy val bulkUpsertStatusResponseJsonFormat: Format[BulkUpsertStatusResponse] = Json.format[BulkUpsertStatusResponse]
}

