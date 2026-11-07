package model

import play.api.libs.json._

/**
  * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CancelInviteException(
  inviteId: Option[String],
  message: Option[String]
)

object CancelInviteException {
  implicit lazy val cancelInviteExceptionJsonFormat: Format[CancelInviteException] = Json.format[CancelInviteException]
}

