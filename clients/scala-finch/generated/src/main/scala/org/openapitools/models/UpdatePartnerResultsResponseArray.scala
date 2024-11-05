package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdatePartnerResultsResponseArrayItemsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class UpdatePartnerResultsResponseArray(items: Option[Seq[UpdatePartnerResultsResponseArrayItemsInner]]
                )

object UpdatePartnerResultsResponseArray {
    /**
     * Creates the codec for converting UpdatePartnerResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePartnerResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePartnerResultsResponseArray] = deriveEncoder
}
