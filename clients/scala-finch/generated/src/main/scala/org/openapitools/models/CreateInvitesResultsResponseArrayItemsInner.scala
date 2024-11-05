package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateInvitesResultsResponseArrayItemsInnerInvite
import org.openapitools.models.InviteExceptionResponse

/**
 * 
 * @param exception 
 * @param invite 
 */
case class CreateInvitesResultsResponseArrayItemsInner(exception: Option[InviteExceptionResponse],
                invite: Option[CreateInvitesResultsResponseArrayItemsInnerInvite]
                )

object CreateInvitesResultsResponseArrayItemsInner {
    /**
     * Creates the codec for converting CreateInvitesResultsResponseArrayItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateInvitesResultsResponseArrayItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateInvitesResultsResponseArrayItemsInner] = deriveEncoder
}
