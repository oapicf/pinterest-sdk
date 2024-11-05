package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InviteBusinessRoleBinding
import org.openapitools.models.InviteExceptionResponse

/**
 * 
 * @param exception 
 * @param invite 
 */
case class UpdateInvitesResultsResponseArrayItemsInner(exception: Option[InviteExceptionResponse],
                invite: Option[InviteBusinessRoleBinding]
                )

object UpdateInvitesResultsResponseArrayItemsInner {
    /**
     * Creates the codec for converting UpdateInvitesResultsResponseArrayItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[UpdateInvitesResultsResponseArrayItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateInvitesResultsResponseArrayItemsInner] = deriveEncoder
}
