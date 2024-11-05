package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BaseInviteDataResponseInviteData
import org.openapitools.models.BusinessAccessUserSummary

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 * @param createdUnderscorebyUnderscorebusinessUnderscoreid Unique identifier for the business that created the invite/request.
 * @param createdUnderscorebyUnderscoreuserUnderscoreid Unique identifier for the user that created the invite/request.
 * @param user Metadata for the user that updated the invite/request.
 * @param id Unique identifier of the invite/request.
 * @param inviteUnderscoredata 
 * @param isUnderscorereceivedUnderscoreinvite Indicates whether the invite/request was received.
 */
case class InviteBusinessRoleBinding(createdUnderscorebyUnderscorebusinessUnderscoreid: Option[String],
                createdUnderscorebyUnderscoreuserUnderscoreid: Option[String],
                user: Option[BusinessAccessUserSummary],
                id: Option[String],
                inviteUnderscoredata: Option[BaseInviteDataResponseInviteData],
                isUnderscorereceivedUnderscoreinvite: Option[Boolean]
                )

object InviteBusinessRoleBinding {
    /**
     * Creates the codec for converting InviteBusinessRoleBinding from and to JSON.
     */
    implicit val decoder: Decoder[InviteBusinessRoleBinding] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteBusinessRoleBinding] = deriveEncoder
}
