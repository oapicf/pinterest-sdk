package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Demographic detail for a single audience demographic
 * @param key Unique key for demographic item
 * @param name Display name for demographic
 * @param ratio Value of demographic item as a percent of total audience
 */
case class AudienceDemographicValue(key: Option[String],
                name: Option[String],
                ratio: Option[BigDecimal]
                )

object AudienceDemographicValue {
    /**
     * Creates the codec for converting AudienceDemographicValue from and to JSON.
     */
    implicit val decoder: Decoder[AudienceDemographicValue] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceDemographicValue] = deriveEncoder
}
