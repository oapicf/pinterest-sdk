package org.openapitools.server.model


/**
 * @param id Unique identifier of the invite/request. for example: ''383791336903426391''
 * @param inviteData  for example: ''null''
 * @param isReceivedInvite Indicates whether the invite/request was received. for example: ''null''
 * @param user Metadata for the member/partner that was sent the invite/request. for example: ''null''
 * @param assetsSummary  for example: ''null''
 * @param businessRoles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. for example: ''["BIZ_ADMIN"]''
 * @param createdByBusiness Metadata for the business that created the invite/request. for example: ''null''
 * @param createdByUser Metadata for the user that created the invite/request. for example: ''null''
 * @param createdTime The time the invite/request was created. Returned in milliseconds. for example: ''1646767577816''
*/
final case class InviteResponse (
  id: Option[String] = None,
  inviteData: Option[BaseInviteDataResponseInviteData] = None,
  isReceivedInvite: Option[Boolean] = None,
  user: Option[BusinessAccessUserSummary] = None,
  assetsSummary: Option[InviteAssetsSummary] = None,
  businessRoles: Option[Seq[String]] = None,
  createdByBusiness: Option[Any] = None,
  createdByUser: Option[Any] = None,
  createdTime: Option[Int] = None
)

