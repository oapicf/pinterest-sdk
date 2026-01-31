package model

import play.api.libs.json._

/**
  * An exception object if there is an error performing the action. Will only be provided if there is an error.
  * @param inviteOrRequestId Unique identifier of the invite/request.
  * @param code Error code associated with the error in performing the action on the invite/request.
  * @param message Error message associated with the error in performing the action on the invite/request.
  * @param usersOrPartnerIds A list of users' usernames or emails OR a list of partner ids that caused the error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteExceptionResponse(
  inviteOrRequestId: Option[String],
  code: Option[Int],
  message: Option[String],
  usersOrPartnerIds: Option[List[String]]
)

object InviteExceptionResponse {
  implicit lazy val inviteExceptionResponseJsonFormat: Format[InviteExceptionResponse] = Json.format[InviteExceptionResponse]
}

