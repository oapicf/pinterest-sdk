package model

import play.api.libs.json._

/**
  * User list operation type (add or remove)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserListOperationType(
)

object UserListOperationType {
  implicit lazy val userListOperationTypeJsonFormat: Format[UserListOperationType] = Json.format[UserListOperationType]
}

