package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateInvitesResultsResponseArrayItemsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
 */
case class CreateInvitesResultsResponseArray(items: Option[Seq[CreateInvitesResultsResponseArrayItemsInner]]
                )

object CreateInvitesResultsResponseArray {
    /**
     * Creates the codec for converting CreateInvitesResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[CreateInvitesResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateInvitesResultsResponseArray] = deriveEncoder
}
