package model

import play.api.libs.json._

/**
  * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
  * @param createdByBusinessId Unique identifier for the business that created the invite/request.
  * @param createdByUserId Unique identifier for the user that created the invite/request.
  * @param user Metadata for the user that updated the invite/request.
  * @param id Unique identifier of the invite/request.
  * @param isReceivedInvite Indicates whether the invite/request was received.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class InviteBusinessRoleBinding(
  createdByBusinessId: Option[String],
  createdByUserId: Option[String],
  user: Option[BusinessAccessUserSummary],
  id: Option[String],
  inviteData: Option[BaseInviteDataResponseInviteData],
  isReceivedInvite: Option[Boolean]
)

object InviteBusinessRoleBinding {
  implicit lazy val inviteBusinessRoleBindingJsonFormat: Format[InviteBusinessRoleBinding] = Json.format[InviteBusinessRoleBinding]
}

