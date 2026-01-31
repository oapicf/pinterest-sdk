package model

import play.api.libs.json._

/**
  * Metadata for the invite/request.
  * @param inviteExpiration The date and time when the invite/request will expire. Returned in milliseconds.
  * @param inviteStatus The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
  * @param inviteType The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
  * @param lastUpdatedTime The date and time the invite/request was last updated. Returned in milliseconds.
  * @param sentAt The date and time the invite/request was sent/created. Returned in milliseconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BaseInviteDataResponseInviteData(
  inviteExpiration: Option[Int],
  inviteStatus: Option[String],
  inviteType: Option[String],
  lastUpdatedTime: Option[Int],
  sentAt: Option[Int]
)

object BaseInviteDataResponseInviteData {
  implicit lazy val baseInviteDataResponseInviteDataJsonFormat: Format[BaseInviteDataResponseInviteData] = Json.format[BaseInviteDataResponseInviteData]
}

