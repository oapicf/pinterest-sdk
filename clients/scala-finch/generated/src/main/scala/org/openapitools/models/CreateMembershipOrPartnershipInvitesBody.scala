package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InviteType
import scala.collection.immutable.Seq

/**
 * Body to be used on path to send Members or Partners Invite or Request
 * @param businessUnderscorerole The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 * @param inviteUnderscoretype 
 * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
 * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
 */
case class CreateMembershipOrPartnershipInvitesBody(businessUnderscorerole: String,
                inviteUnderscoretype: InviteType,
                members: Option[Seq[String]],
                partners: Option[Seq[String]]
                )

object CreateMembershipOrPartnershipInvitesBody {
    /**
     * Creates the codec for converting CreateMembershipOrPartnershipInvitesBody from and to JSON.
     */
    implicit val decoder: Decoder[CreateMembershipOrPartnershipInvitesBody] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMembershipOrPartnershipInvitesBody] = deriveEncoder
}
