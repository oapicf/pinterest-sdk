package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InviteType
import org.openapitools.models.Permissions
import scala.collection.immutable.Seq

/**
 * Object declaring an asset role update to an invite.
 * @param inviteUnderscoreid Unique identifier of an invite.
 * @param inviteUnderscoretype 
 * @param assetUnderscoreidUnderscoretoUnderscorepermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
 */
case class CreateAssetInvitesRequestItem(inviteUnderscoreid: String,
                inviteUnderscoretype: InviteType,
                assetUnderscoreidUnderscoretoUnderscorepermissions: Map[String, Seq[Permissions]]
                )

object CreateAssetInvitesRequestItem {
    /**
     * Creates the codec for converting CreateAssetInvitesRequestItem from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssetInvitesRequestItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssetInvitesRequestItem] = deriveEncoder
}
