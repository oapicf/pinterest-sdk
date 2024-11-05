package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DeletePartnerAssetsResult
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of terminated asset access.
 */
case class DeletePartnerAssetsResultsResponseArray(items: Option[Seq[DeletePartnerAssetsResult]]
                )

object DeletePartnerAssetsResultsResponseArray {
    /**
     * Creates the codec for converting DeletePartnerAssetsResultsResponseArray from and to JSON.
     */
    implicit val decoder: Decoder[DeletePartnerAssetsResultsResponseArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePartnerAssetsResultsResponseArray] = deriveEncoder
}
