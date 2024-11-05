package org.openapitools.server.model


/**
 * Metadata for the invite/request.
 *
 * @param inviteExpiration The date and time when the invite/request will expire. Returned in milliseconds. for example: ''1709748104775''
 * @param inviteStatus The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. for example: ''PENDING''
 * @param inviteType The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets. for example: ''MEMBER_INVITE''
 * @param lastUpdatedTime The date and time the invite/request was last updated. Returned in milliseconds. for example: ''1646767577816''
 * @param sentAt The date and time the invite/request was sent/created. Returned in milliseconds. for example: ''1646767577816''
*/
final case class BaseInviteDataResponseInviteData (
  inviteExpiration: Option[Int] = None,
  inviteStatus: Option[String] = None,
  inviteType: Option[String] = None,
  lastUpdatedTime: Option[Int] = None,
  sentAt: Option[Int] = None
)

