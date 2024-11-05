package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdateMemberAssetsResultsResponseArrayItemsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
 */
case class UpdateMemberAssetsResultsResponseArray(items: Option[Seq[UpdateMemberAssetsResultsResponseArrayItemsInner]]
                )

object UpdateMemberAssetsResultsResponseArray {
    /**
     * Creates the codec for converting UpdateMemberAssetsResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[UpdateMemberAssetsResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateMemberAssetsResultsResponseArray] = deriveEncoder
}
