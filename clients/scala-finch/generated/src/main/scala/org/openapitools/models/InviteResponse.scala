package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BaseInviteDataResponseInviteData
import org.openapitools.models.BusinessAccessUserSummary
import org.openapitools.models.InviteAssetsSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param assetsUnderscoresummary 
 * @param businessUnderscoreroles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
 * @param createdUnderscorebyUnderscorebusiness Metadata for the business that created the invite/request.
 * @param createdUnderscorebyUnderscoreuser Metadata for the user that created the invite/request.
 * @param createdUnderscoretime The time the invite/request was created. Returned in milliseconds.
 * @param id Unique identifier of the invite/request.
 * @param inviteUnderscoredata 
 * @param isUnderscorereceivedUnderscoreinvite Indicates whether the invite/request was received.
 * @param user Metadata for the member/partner that was sent the invite/request.
 */
case class InviteResponse(assetsUnderscoresummary: Option[InviteAssetsSummary],
                businessUnderscoreroles: Option[Seq[String]],
                createdUnderscorebyUnderscorebusiness: Option[BusinessAccessUserSummary],
                createdUnderscorebyUnderscoreuser: Option[BusinessAccessUserSummary],
                createdUnderscoretime: Option[Int],
                id: Option[String],
                inviteUnderscoredata: Option[BaseInviteDataResponseInviteData],
                isUnderscorereceivedUnderscoreinvite: Option[Boolean],
                user: Option[BusinessAccessUserSummary]
                )

object InviteResponse {
    /**
     * Creates the codec for converting InviteResponse from and to JSON.
     */
    implicit val decoder: Decoder[InviteResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteResponse] = deriveEncoder
}
