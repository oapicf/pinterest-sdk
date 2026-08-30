package model

import play.api.libs.json._

/**
  * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
  * @param createdByBusinessId Unique identifier for the business that created the invite/request.
  * @param createdByUserId Unique identifier for the user that created the invite/request.
  * @param id Unique identifier of the invite/request.
  * @param isReceivedInvite Indicates whether the invite/request was received.
  * @param user Metadata for the member/partner that was sent the invite/request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InviteBusinessRoleBinding(
  createdByBusinessId: Option[String],
  createdByUserId: Option[String],
  id: Option[String],
  inviteData: Option[InviteDataResponse],
  isReceivedInvite: Option[Boolean],
  user: Option[BusinessAccessUserSummary]
)

object InviteBusinessRoleBinding {
  implicit lazy val inviteBusinessRoleBindingJsonFormat: Format[InviteBusinessRoleBinding] = Json.format[InviteBusinessRoleBinding]
}

