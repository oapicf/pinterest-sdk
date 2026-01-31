package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for S3MultipartUploadData.
  * @param fileParts Array of file parts with pre-signed URLs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class S3MultipartUploadData(
  fileParts: Option[List[S3FilePart]]
)

object S3MultipartUploadData {
  implicit lazy val s3MultipartUploadDataJsonFormat: Format[S3MultipartUploadData] = Json.format[S3MultipartUploadData]
}

