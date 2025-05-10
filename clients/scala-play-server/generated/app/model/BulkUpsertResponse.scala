package model

import play.api.libs.json._

/**
  * ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BulkUpsertResponse(
  requestId: Option[String]
)

object BulkUpsertResponse {
  implicit lazy val bulkUpsertResponseJsonFormat: Format[BulkUpsertResponse] = Json.format[BulkUpsertResponse]
}

