package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TargetingSpecAppType
import scala.collection.immutable.HashMap

/**
 * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 * @param APPUnderscoreTYPE 
 */
case class AppTypeMultipliers(APPUnderscoreTYPE: Option[TargetingSpecAppType]
                )

object AppTypeMultipliers {
    /**
     * Creates the codec for converting AppTypeMultipliers from and to JSON.
     */
    implicit val decoder: Decoder[AppTypeMultipliers] = deriveDecoder
    implicit val encoder: ObjectEncoder[AppTypeMultipliers] = deriveEncoder
}
