package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DynamicTitlesUploadURL.
  * @param existingFilename If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
  * @param requestId Unique identifier for this upload session. Must be passed to the process endpoint.
  * @param uploadUrl Pre-signed S3 PUT URL to upload the reviewed CSV file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DynamicTitlesUploadURL(
  existingFilename: Option[String],
  requestId: String,
  uploadUrl: String
)

object DynamicTitlesUploadURL {
  implicit lazy val dynamicTitlesUploadURLJsonFormat: Format[DynamicTitlesUploadURL] = Json.format[DynamicTitlesUploadURL]
}

