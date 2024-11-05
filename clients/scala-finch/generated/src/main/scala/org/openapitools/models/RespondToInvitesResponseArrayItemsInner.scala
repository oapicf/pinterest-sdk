package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BaseInviteDataResponse
import org.openapitools.models.InviteExceptionResponse

/**
 * 
 * @param exception 
 * @param invite 
 */
case class RespondToInvitesResponseArrayItemsInner(exception: Option[InviteExceptionResponse],
                invite: Option[BaseInviteDataResponse]
                )

object RespondToInvitesResponseArrayItemsInner {
    /**
     * Creates the codec for converting RespondToInvitesResponseArrayItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[RespondToInvitesResponseArrayItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RespondToInvitesResponseArrayItemsInner] = deriveEncoder
}
