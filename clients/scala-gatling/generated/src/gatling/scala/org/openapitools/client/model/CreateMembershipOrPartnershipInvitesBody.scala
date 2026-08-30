
package org.openapitools.client.model


case class CreateMembershipOrPartnershipInvitesBody (
    _businessRole: BusinessRoleForInvite,
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
