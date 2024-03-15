package model

import play.api.libs.json._

/**
  * ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BulkUpsertResponse(
  requestId: Option[String]
)

object BulkUpsertResponse {
  implicit lazy val bulkUpsertResponseJsonFormat: Format[BulkUpsertResponse] = Json.format[BulkUpsertResponse]
}

