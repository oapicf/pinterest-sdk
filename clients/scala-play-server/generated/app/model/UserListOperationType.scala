package model

import play.api.libs.json._

/**
  * User list operation type (add or remove)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserListOperationType(
)

object UserListOperationType {
  implicit lazy val userListOperationTypeJsonFormat: Format[UserListOperationType] = Json.format[UserListOperationType]
}

