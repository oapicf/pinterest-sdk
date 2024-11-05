package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Metadata for the invite/request.
 * @param inviteUnderscoreexpiration The date and time when the invite/request will expire. Returned in milliseconds.
 * @param inviteUnderscorestatus The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
 * @param inviteUnderscoretype The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
 * @param lastUnderscoreupdatedUnderscoretime The date and time the invite/request was last updated. Returned in milliseconds.
 * @param sentUnderscoreat The date and time the invite/request was sent/created. Returned in milliseconds.
 */
case class BaseInviteDataResponseInviteData(inviteUnderscoreexpiration: Option[Int],
                inviteUnderscorestatus: Option[String],
                inviteUnderscoretype: Option[String],
                lastUnderscoreupdatedUnderscoretime: Option[Int],
                sentUnderscoreat: Option[Int]
                )

object BaseInviteDataResponseInviteData {
    /**
     * Creates the codec for converting BaseInviteDataResponseInviteData from and to JSON.
     */
    implicit val decoder: Decoder[BaseInviteDataResponseInviteData] = deriveDecoder
    implicit val encoder: ObjectEncoder[BaseInviteDataResponseInviteData] = deriveEncoder
}
