package model

import play.api.libs.json._

/**
  * User list operation type (add or remove)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class UserListOperationType(
)

object UserListOperationType {
  implicit lazy val userListOperationTypeJsonFormat: Format[UserListOperationType] = Json.format[UserListOperationType]
}

