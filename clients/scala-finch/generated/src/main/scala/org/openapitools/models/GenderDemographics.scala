package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Gender demographic distribution
 * @param female Percentage of female users
 * @param male Percentage of male users
 * @param unspecified Percentage of users with unspecified gender
 */
case class GenderDemographics(female: BigDecimal,
                male: BigDecimal,
                unspecified: BigDecimal
                )

object GenderDemographics {
    /**
     * Creates the codec for converting GenderDemographics from and to JSON.
     */
    implicit val decoder: Decoder[GenderDemographics] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenderDemographics] = deriveEncoder
}
