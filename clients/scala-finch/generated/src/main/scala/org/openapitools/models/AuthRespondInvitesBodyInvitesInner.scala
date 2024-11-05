package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuthRespondInvitesBodyInvitesInnerAction

/**
 * 
 * @param action 
 * @param inviteUnderscoreid Unique identifier of an invite.
 */
case class AuthRespondInvitesBodyInvitesInner(action: AuthRespondInvitesBodyInvitesInnerAction,
                inviteUnderscoreid: String
                )

object AuthRespondInvitesBodyInvitesInner {
    /**
     * Creates the codec for converting AuthRespondInvitesBodyInvitesInner from and to JSON.
     */
    implicit val decoder: Decoder[AuthRespondInvitesBodyInvitesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuthRespondInvitesBodyInvitesInner] = deriveEncoder
}
