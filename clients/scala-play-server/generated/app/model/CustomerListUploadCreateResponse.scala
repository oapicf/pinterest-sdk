package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListUploadCreateResponse.
  * @param customerListUpload The Customer List Upload created.
  * @param s3MultipartUploadData Pre-signed upload URLs corresponding to each part of the upload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerListUploadCreateResponse(
  customerListUpload: CustomerListUpload,
  s3MultipartUploadData: S3MultipartUploadData
)

object CustomerListUploadCreateResponse {
  implicit lazy val customerListUploadCreateResponseJsonFormat: Format[CustomerListUploadCreateResponse] = Json.format[CustomerListUploadCreateResponse]
}

