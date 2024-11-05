package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Permissions
import scala.collection.immutable.Seq

/**
 * 
 * @param acceptUnderscoreinvite Whether the invite/request is accepted.
 * @param assetUnderscoreidUnderscoretoUnderscorepermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
 */
case class AuthRespondInvitesBodyInvitesInnerAction(acceptUnderscoreinvite: Boolean,
                assetUnderscoreidUnderscoretoUnderscorepermissions: Option[Map[String, Seq[Permissions]]]
                )

object AuthRespondInvitesBodyInvitesInnerAction {
    /**
     * Creates the codec for converting AuthRespondInvitesBodyInvitesInnerAction from and to JSON.
     */
    implicit val decoder: Decoder[AuthRespondInvitesBodyInvitesInnerAction] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuthRespondInvitesBodyInvitesInnerAction] = deriveEncoder
}
