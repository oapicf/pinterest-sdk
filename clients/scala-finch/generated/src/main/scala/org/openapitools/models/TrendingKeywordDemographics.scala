package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TrendingKeywordDemographicsAgeDistribution
import org.openapitools.models.TrendingKeywordDemographicsGenderDistribution

/**
 * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.
 * @param ageUnderscoredistribution 
 * @param genderUnderscoredistribution 
 */
case class TrendingKeywordDemographics(ageUnderscoredistribution: Option[TrendingKeywordDemographicsAgeDistribution],
                genderUnderscoredistribution: Option[TrendingKeywordDemographicsGenderDistribution]
                )

object TrendingKeywordDemographics {
    /**
     * Creates the codec for converting TrendingKeywordDemographics from and to JSON.
     */
    implicit val decoder: Decoder[TrendingKeywordDemographics] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingKeywordDemographics] = deriveEncoder
}
