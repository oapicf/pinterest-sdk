package org.openapitools.server.model


/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 *
 * @param createdByBusinessId Unique identifier for the business that created the invite/request. for example: ''1234567890123''
 * @param createdByUserId Unique identifier for the user that created the invite/request. for example: ''1234567890123''
 * @param id Unique identifier of the invite/request. for example: ''383791336903426391''
 * @param inviteData  for example: ''null''
 * @param isReceivedInvite Indicates whether the invite/request was received. for example: ''null''
 * @param user Metadata for the member/partner that was sent the invite/request. for example: ''null''
*/
final case class InviteBusinessRoleBinding (
  createdByBusinessId: Option[String] = None,
  createdByUserId: Option[String] = None,
  id: Option[String] = None,
  inviteData: Option[InviteDataResponse] = None,
  isReceivedInvite: Option[Boolean] = None,
  user: Option[BusinessAccessUserSummary] = None
)

