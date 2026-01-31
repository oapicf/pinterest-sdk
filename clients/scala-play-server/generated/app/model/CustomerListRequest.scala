package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListRequest.
  * @param name Customer list name.
  * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomerListRequest(
  listType: Option[UserListType],
  name: String,
  records: String
)

object CustomerListRequest {
  implicit lazy val customerListRequestJsonFormat: Format[CustomerListRequest] = Json.format[CustomerListRequest]
}

