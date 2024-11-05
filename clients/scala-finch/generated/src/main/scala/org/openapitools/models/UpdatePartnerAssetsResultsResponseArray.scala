package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdatePartnerAssetsResult
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of assigned/updated partner asset access.
 */
case class UpdatePartnerAssetsResultsResponseArray(items: Option[Seq[UpdatePartnerAssetsResult]]
                )

object UpdatePartnerAssetsResultsResponseArray {
    /**
     * Creates the codec for converting UpdatePartnerAssetsResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePartnerAssetsResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePartnerAssetsResultsResponseArray] = deriveEncoder
}
