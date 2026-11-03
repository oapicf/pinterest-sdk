package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListUploadCreateResponse.
  * @param customerListUpload The Customer List Upload created.
  * @param s3MultipartUploadData Pre-signed upload URLs corresponding to each part of the upload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomerListUploadCreateResponse(
  customerListUpload: CustomerListUpload,
  s3MultipartUploadData: S3MultipartUploadData
)

object CustomerListUploadCreateResponse {
  implicit lazy val customerListUploadCreateResponseJsonFormat: Format[CustomerListUploadCreateResponse] = Json.format[CustomerListUploadCreateResponse]
}

