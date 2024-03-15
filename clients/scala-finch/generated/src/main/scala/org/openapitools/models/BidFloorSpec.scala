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
 * @param countries 
 * @param currency 
 * @param objectiveUnderscoretype 
 * @param billableUnderscoreevent 
 * @param optimizationUnderscoregoalUnderscoremetadata 
 * @param creativeUnderscoretype 
 */
case class BidFloorSpec(countries: Option[Seq[Country]],
                currency: Currency,
                objectiveUnderscoretype: Option[ObjectiveType],
                billableUnderscoreevent: ActionType,
                optimizationUnderscoregoalUnderscoremetadata: Option[OptimizationGoalMetadata],
                creativeUnderscoretype: Option[CreativeType]
                )

object BidFloorSpec {
    /**
     * Creates the codec for converting BidFloorSpec from and to JSON.
     */
    implicit val decoder: Decoder[BidFloorSpec] = deriveDecoder
    implicit val encoder: ObjectEncoder[BidFloorSpec] = deriveEncoder
}
