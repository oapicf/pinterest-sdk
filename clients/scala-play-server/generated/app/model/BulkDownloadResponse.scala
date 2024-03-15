package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BulkDownloadResponse.
  * @param requestId ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BulkDownloadResponse(
  requestId: Option[String]
)

object BulkDownloadResponse {
  implicit lazy val bulkDownloadResponseJsonFormat: Format[BulkDownloadResponse] = Json.format[BulkDownloadResponse]
}

