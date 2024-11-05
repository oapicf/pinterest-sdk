package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BaseInviteDataResponse
import org.openapitools.models.DeleteInvitesResultsResponseArrayItemsInnerException

/**
 * 
 * @param exception 
 * @param invite 
 */
case class DeleteInvitesResultsResponseArrayItemsInner(exception: Option[DeleteInvitesResultsResponseArrayItemsInnerException],
                invite: Option[BaseInviteDataResponse]
                )

object DeleteInvitesResultsResponseArrayItemsInner {
    /**
     * Creates the codec for converting DeleteInvitesResultsResponseArrayItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[DeleteInvitesResultsResponseArrayItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteInvitesResultsResponseArrayItemsInner] = deriveEncoder
}
