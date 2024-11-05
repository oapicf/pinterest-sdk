
package org.openapitools.client.model


case class BaseInviteDataResponseInviteData (
    /* The date and time when the invite/request will expire. Returned in milliseconds. */
    _inviteExpiration: Option[Integer],
    /* The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. */
    _inviteStatus: Option[String],
    /* The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets. */
    _inviteType: Option[String],
    /* The date and time the invite/request was last updated. Returned in milliseconds. */
    _lastUpdatedTime: Option[Integer],
    /* The date and time the invite/request was sent/created. Returned in milliseconds. */
    _sentAt: Option[Integer]
)
object BaseInviteDataResponseInviteData {
    def toStringBody(var_inviteExpiration: Object, var_inviteStatus: Object, var_inviteType: Object, var_lastUpdatedTime: Object, var_sentAt: Object) =
        s"""
        | {
        | "inviteExpiration":$var_inviteExpiration,"inviteStatus":$var_inviteStatus,"inviteType":$var_inviteType,"lastUpdatedTime":$var_lastUpdatedTime,"sentAt":$var_sentAt
        | }
        """.stripMargin
}
