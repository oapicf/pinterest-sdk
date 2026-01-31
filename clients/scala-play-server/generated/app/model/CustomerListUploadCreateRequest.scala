package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListUploadCreateRequest.
  * @param totalParts Number of parts to upload the file in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomerListUploadCreateRequest(
  operation: UserListOperationType,
  totalParts: Int
)

object CustomerListUploadCreateRequest {
  implicit lazy val customerListUploadCreateRequestJsonFormat: Format[CustomerListUploadCreateRequest] = Json.format[CustomerListUploadCreateRequest]
}

