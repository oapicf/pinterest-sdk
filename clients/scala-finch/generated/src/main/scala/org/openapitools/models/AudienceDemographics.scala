package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceDemographicValue
import scala.collection.immutable.Seq

/**
 * Audience demographics
 * @param ages Ages distribution.
 * @param genders Gender distribution.
 * @param devices Device usage distribution.
 * @param metros Geographic metro area distribution.
 * @param countries Country area distribution.
 */
case class AudienceDemographics(ages: Option[Seq[AudienceDemographicValue]],
                genders: Option[Seq[AudienceDemographicValue]],
                devices: Option[Seq[AudienceDemographicValue]],
                metros: Option[Seq[AudienceDemographicValue]],
                countries: Option[Seq[AudienceDemographicValue]]
                )

object AudienceDemographics {
    /**
     * Creates the codec for converting AudienceDemographics from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDemographics] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDemographics] = deriveEncoder
}
