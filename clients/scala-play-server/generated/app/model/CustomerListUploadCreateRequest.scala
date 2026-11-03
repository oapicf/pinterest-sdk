package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListUploadCreateRequest.
  * @param totalParts Number of parts to upload the file in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomerListUploadCreateRequest(
  operation: UserListOperationType,
  totalParts: Int
)

object CustomerListUploadCreateRequest {
  implicit lazy val customerListUploadCreateRequestJsonFormat: Format[CustomerListUploadCreateRequest] = Json.format[CustomerListUploadCreateRequest]
}

