package model

import play.api.libs.json._

/**
  * A user's username or email OR a partner id that caused the error.
  * @param businessRoles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  * @param createdByBusiness Metadata for the business that created the invite/request.
  * @param createdByUser Metadata for the user that created the invite/request.
  * @param createdTime The time the invite/request was created. Returned in milliseconds.
  * @param id Unique identifier of the invite/request.
  * @param isReceivedInvite Indicates whether the invite/request was received.
  * @param user Metadata for the member/partner that was sent the invite/request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InviteResponse(
  assetsSummary: Option[InviteAssetsSummary],
  businessRoles: Option[List[String]],
  createdByBusiness: Option[BusinessAccessUserSummary],
  createdByUser: Option[BusinessAccessUserSummary],
  createdTime: Option[Int],
  id: Option[String],
  inviteData: Option[InviteDataResponse],
  isReceivedInvite: Option[Boolean],
  user: Option[BusinessAccessUserSummary]
)

object InviteResponse {
  implicit lazy val inviteResponseJsonFormat: Format[InviteResponse] = Json.format[InviteResponse]
}

