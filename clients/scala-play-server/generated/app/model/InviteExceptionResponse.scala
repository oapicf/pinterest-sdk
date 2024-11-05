package model

import play.api.libs.json._

/**
  * An exception object if there is an error performing the action. Will only be provided if there is an error.
  * @param inviteOrRequestId Unique identifier of the invite/request.
  * @param code Error code associated with the error in performing the action on the invite/request.
  * @param message Error message associated with the error in performing the action on the invite/request.
  * @param usersOrPartnerIds A list of users' usernames or emails OR a list of partner ids that caused the error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class InviteExceptionResponse(
  inviteOrRequestId: Option[String],
  code: Option[Int],
  message: Option[String],
  usersOrPartnerIds: Option[List[String]]
)

object InviteExceptionResponse {
  implicit lazy val inviteExceptionResponseJsonFormat: Format[InviteExceptionResponse] = Json.format[InviteExceptionResponse]
}

