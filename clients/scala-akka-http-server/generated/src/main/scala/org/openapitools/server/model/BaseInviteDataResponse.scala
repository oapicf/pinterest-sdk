package org.openapitools.server.model


/**
 * @param id Unique identifier of the invite/request. for example: ''383791336903426391''
 * @param inviteData  for example: ''null''
 * @param isReceivedInvite Indicates whether the invite/request was received. for example: ''null''
 * @param user Metadata for the member/partner that was sent the invite/request. for example: ''null''
*/
final case class BaseInviteDataResponse (
  id: Option[String] = None,
  inviteData: Option[BaseInviteDataResponseInviteData] = None,
  isReceivedInvite: Option[Boolean] = None,
  user: Option[BusinessAccessUserSummary] = None
)

