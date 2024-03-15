package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param lookbackUnderscorewindow Number of days ago to start lookback timeframe for dynamic retargeting
 * @param tagUnderscoretypes Event types to target for dynamic retargeting
 * @param exclusionUnderscorewindow Number of days ago to stop lookback timeframe for dynamic retargeting
 */
case class TargetingSpecSHOPPINGRETARGETING(lookbackUnderscorewindow: Option[Int],
                tagUnderscoretypes: Option[Seq[Int]],
                exclusionUnderscorewindow: Option[Int]
                )

object TargetingSpecSHOPPINGRETARGETING {
    /**
     * Creates the codec for converting TargetingSpecSHOPPINGRETARGETING from and to JSON.
     */
    implicit val decoder: Decoder[TargetingSpecSHOPPINGRETARGETING] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingSpecSHOPPINGRETARGETING] = deriveEncoder
}
