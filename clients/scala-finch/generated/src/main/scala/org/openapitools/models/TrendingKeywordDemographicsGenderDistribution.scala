package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.HashMap

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 * @param genderUnderscoredistribution 
 */
case class TrendingKeywordDemographicsGenderDistribution(genderUnderscoredistribution: Option[String]
                )

object TrendingKeywordDemographicsGenderDistribution {
    /**
     * Creates the codec for converting TrendingKeywordDemographicsGenderDistribution from and to JSON.
     */
    implicit val decoder: Decoder[TrendingKeywordDemographicsGenderDistribution] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingKeywordDemographicsGenderDistribution] = deriveEncoder
}
