package org.openapitools.server.model


/**
 * @param id Unique identifier of the invite/request. for example: ''383791336903426391''
 * @param inviteData  for example: ''null''
 * @param isReceivedInvite Indicates whether the invite/request was received. for example: ''null''
 * @param user Metadata for the user that updated the invite/request. for example: ''null''
 * @param createdByBusinessId Unique identifier for the business that created the invite/request. for example: ''1234567890123''
 * @param createdByUserId Unique identifier for the user that created the invite/request. for example: ''1234567890123''
*/
final case class InviteBusinessRoleBinding (
  id: Option[String] = None,
  inviteData: Option[BaseInviteDataResponseInviteData] = None,
  isReceivedInvite: Option[Boolean] = None,
  user: Option[Any] = None,
  createdByBusinessId: Option[String] = None,
  createdByUserId: Option[String] = None
)

