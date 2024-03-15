package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerListRequest.
  * @param name Customer list name.
  * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  * @param exceptions Customer list errors.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CustomerListRequest(
  name: String,
  records: String,
  listType: Option[UserListType],
  exceptions: Option[JsObject]
)

object CustomerListRequest {
  implicit lazy val customerListRequestJsonFormat: Format[CustomerListRequest] = Json.format[CustomerListRequest]
}

