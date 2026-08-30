package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CancelInviteResult.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CancelInviteResult(
  id: Option[String],
  inviteData: Option[InviteDataResponse],
  isReceivedInvite: Option[Boolean],
  user: Option[CancelInviteResultUser]
)

object CancelInviteResult {
  implicit lazy val cancelInviteResultJsonFormat: Format[CancelInviteResult] = Json.format[CancelInviteResult]
}

