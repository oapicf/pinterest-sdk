package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.HashMap

/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @param ageUnderscoredistribution 
 */
case class TrendingKeywordDemographicsAgeDistribution(ageUnderscoredistribution: Option[String]
                )

object TrendingKeywordDemographicsAgeDistribution {
    /**
     * Creates the codec for converting TrendingKeywordDemographicsAgeDistribution from and to JSON.
     */
    implicit val decoder: Decoder[TrendingKeywordDemographicsAgeDistribution] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingKeywordDemographicsAgeDistribution] = deriveEncoder
}
