package model

import play.api.libs.json._

/**
  * User list operation type (add or remove)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UserListOperationType(
)

object UserListOperationType {
  implicit lazy val userListOperationTypeJsonFormat: Format[UserListOperationType] = Json.format[UserListOperationType]
}

