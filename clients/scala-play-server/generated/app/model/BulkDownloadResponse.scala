package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BulkDownloadResponse.
  * @param requestId ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BulkDownloadResponse(
  requestId: Option[String]
)

object BulkDownloadResponse {
  implicit lazy val bulkDownloadResponseJsonFormat: Format[BulkDownloadResponse] = Json.format[BulkDownloadResponse]
}

