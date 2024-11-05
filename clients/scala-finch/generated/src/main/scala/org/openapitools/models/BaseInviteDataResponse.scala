package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BaseInviteDataResponseInviteData
import org.openapitools.models.BusinessAccessUserSummary

/**
 * 
 * @param id Unique identifier of the invite/request.
 * @param inviteUnderscoredata 
 * @param isUnderscorereceivedUnderscoreinvite Indicates whether the invite/request was received.
 * @param user Metadata for the member/partner that was sent the invite/request.
 */
case class BaseInviteDataResponse(id: Option[String],
                inviteUnderscoredata: Option[BaseInviteDataResponseInviteData],
                isUnderscorereceivedUnderscoreinvite: Option[Boolean],
                user: Option[BusinessAccessUserSummary]
                )

object BaseInviteDataResponse {
    /**
     * Creates the codec for converting BaseInviteDataResponse from and to JSON.
     */
    implicit val decoder: Decoder[BaseInviteDataResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BaseInviteDataResponse] = deriveEncoder
}
