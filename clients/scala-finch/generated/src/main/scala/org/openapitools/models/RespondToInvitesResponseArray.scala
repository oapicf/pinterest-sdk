package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RespondToInvitesResponseArrayItemsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
 */
case class RespondToInvitesResponseArray(items: Option[Seq[RespondToInvitesResponseArrayItemsInner]]
                )

object RespondToInvitesResponseArray {
    /**
     * Creates the codec for converting RespondToInvitesResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[RespondToInvitesResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[RespondToInvitesResponseArray] = deriveEncoder
}
