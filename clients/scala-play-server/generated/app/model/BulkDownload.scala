package model

import play.api.libs.json._

/**
  * Ad entities to get in bulk request.
  * @param requestId ID of the bulk request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BulkDownload(
  requestId: Option[String]
)

object BulkDownload {
  implicit lazy val bulkDownloadJsonFormat: Format[BulkDownload] = Json.format[BulkDownload]
}

