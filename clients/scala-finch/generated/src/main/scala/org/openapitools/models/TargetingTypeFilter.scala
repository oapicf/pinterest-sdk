package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdsAnalyticsTargetingType
import scala.collection.immutable.Seq

/**
 * 
 * @param targetingUnderscoretypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
 */
case class TargetingTypeFilter(targetingUnderscoretypes: Option[Seq[AdsAnalyticsTargetingType]]
                )

object TargetingTypeFilter {
    /**
     * Creates the codec for converting TargetingTypeFilter from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTypeFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTypeFilter] = deriveEncoder
}
