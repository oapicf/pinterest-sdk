package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ActionType
import org.openapitools.models.Country
import org.openapitools.models.CreativeType
import org.openapitools.models.Currency
import org.openapitools.models.ObjectiveType
import org.openapitools.models.OptimizationGoalMetadata
import scala.collection.immutable.Seq

/**
 * 
 * @param billableUnderscoreevent 
 * @param countries 
 * @param creativeUnderscoretype 
 * @param currency 
 * @param objectiveUnderscoretype 
 * @param optimizationUnderscoregoalUnderscoremetadata 
 */
case class BidFloorSpec(billableUnderscoreevent: ActionType,
                countries: Option[Seq[Country]],
                creativeUnderscoretype: Option[CreativeType],
                currency: Currency,
                objectiveUnderscoretype: Option[ObjectiveType],
                optimizationUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadata]
                )

object BidFloorSpec {
    /**
     * Creates the codec for converting BidFloorSpec from and to JSON.
     */
    implicit val decoder: Decoder[BidFloorSpec] = deriveDecoder
    implicit val encoder: ObjectEncoder[BidFloorSpec] = deriveEncoder
}
