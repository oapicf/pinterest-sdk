package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BulkDownloadResponse.
  * @param requestId ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkDownloadResponse(
  requestId: Option[String]
)

object BulkDownloadResponse {
  implicit lazy val bulkDownloadResponseJsonFormat: Format[BulkDownloadResponse] = Json.format[BulkDownloadResponse]
}

