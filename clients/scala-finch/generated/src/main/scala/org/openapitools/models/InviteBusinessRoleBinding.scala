package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BaseInviteDataResponseInviteData

/**
 * 
 * @param id Unique identifier of the invite/request.
 * @param inviteUnderscoredata 
 * @param isUnderscorereceivedUnderscoreinvite Indicates whether the invite/request was received.
 * @param user Metadata for the user that updated the invite/request.
 * @param createdUnderscorebyUnderscorebusinessUnderscoreid Unique identifier for the business that created the invite/request.
 * @param createdUnderscorebyUnderscoreuserUnderscoreid Unique identifier for the user that created the invite/request.
 */
case class InviteBusinessRoleBinding(id: Option[String],
                inviteUnderscoredata: Option[BaseInviteDataResponseInviteData],
                isUnderscorereceivedUnderscoreinvite: Option[Boolean],
                user: Option[Object],
                createdUnderscorebyUnderscorebusinessUnderscoreid: Option[String],
                createdUnderscorebyUnderscoreuserUnderscoreid: Option[String]
                )

object InviteBusinessRoleBinding {
    /**
     * Creates the codec for converting InviteBusinessRoleBinding from and to JSON.
     */
    implicit val decoder: Decoder[InviteBusinessRoleBinding] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteBusinessRoleBinding] = deriveEncoder
}
