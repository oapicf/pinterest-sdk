package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListUpdateRequest.
  * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CustomerListUpdateRequest(
  records: String,
  operationType: UserListOperationType,
  exceptions: Option[Exception]
)

object CustomerListUpdateRequest {
  implicit lazy val customerListUpdateRequestJsonFormat: Format[CustomerListUpdateRequest] = Json.format[CustomerListUpdateRequest]
}

