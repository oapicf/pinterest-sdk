package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for S3FilePart.
  * @param partNumber Part number for upload.
  * @param presignedUrl Pre-signed URL.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class S3FilePart(
  partNumber: Int,
  presignedUrl: String
)

object S3FilePart {
  implicit lazy val s3FilePartJsonFormat: Format[S3FilePart] = Json.format[S3FilePart]
}

