package model

import play.api.libs.json._

/**
  * Common invite/request data returned by the business access endpoints.
  * @param id Unique identifier of the invite/request.
  * @param isReceivedInvite Indicates whether the invite/request was received.
  * @param user Metadata for the member/partner that was sent the invite/request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BaseInviteDataResponse(
  id: Option[String],
  inviteData: Option[InviteDataResponse],
  isReceivedInvite: Option[Boolean],
  user: Option[BusinessAccessUserSummary]
)

object BaseInviteDataResponse {
  implicit lazy val baseInviteDataResponseJsonFormat: Format[BaseInviteDataResponse] = Json.format[BaseInviteDataResponse]
}

