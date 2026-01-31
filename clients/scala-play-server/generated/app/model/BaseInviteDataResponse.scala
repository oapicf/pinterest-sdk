package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BaseInviteDataResponse.
  * @param id Unique identifier of the invite/request.
  * @param isReceivedInvite Indicates whether the invite/request was received.
  * @param user Metadata for the member/partner that was sent the invite/request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BaseInviteDataResponse(
  id: Option[String],
  inviteData: Option[BaseInviteDataResponseInviteData],
  isReceivedInvite: Option[Boolean],
  user: Option[BusinessAccessUserSummary]
)

object BaseInviteDataResponse {
  implicit lazy val baseInviteDataResponseJsonFormat: Format[BaseInviteDataResponse] = Json.format[BaseInviteDataResponse]
}

