package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdateInvitesResultsResponseArrayItemsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
 */
case class UpdateInvitesResultsResponseArray(items: Option[Seq[UpdateInvitesResultsResponseArrayItemsInner]]
                )

object UpdateInvitesResultsResponseArray {
    /**
     * Creates the codec for converting UpdateInvitesResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[UpdateInvitesResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateInvitesResultsResponseArray] = deriveEncoder
}
