
package org.openapitools.client.model


case class CreateMembershipOrPartnershipInvitesBody (
    /* The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. */
    _businessRole: String,
    _inviteType: InviteType,
    /* A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE */
    _members: Option[List[String]],
    /* A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST */
    _partners: Option[List[String]]
)
object CreateMembershipOrPartnershipInvitesBody {
    def toStringBody(var_businessRole: Object, var_inviteType: Object, var_members: Object, var_partners: Object) =
        s"""
        | {
        | "businessRole":$var_businessRole,"inviteType":$var_inviteType,"members":$var_members,"partners":$var_partners
        | }
        """.stripMargin
}
