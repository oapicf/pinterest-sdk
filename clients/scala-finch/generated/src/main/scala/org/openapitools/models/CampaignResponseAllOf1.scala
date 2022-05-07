package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ObjectiveType

/**
 * 
 * @param objectiveUnderscoretype 
 * @param createdUnderscoretime Campaign creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretime UTC timestamp. Last update time.
 * @param _type Always \"campaign\".
 */
case class CampaignResponseAllOf1(objectiveUnderscoretype: Option[ObjectiveType],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int],
                _type: Option[String]
                )

object CampaignResponseAllOf1 {
    /**
     * Creates the codec for converting CampaignResponseAllOf1 from and to JSON.
     */
    implicit val decoder: Decoder[CampaignResponseAllOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignResponseAllOf1] = deriveEncoder
}
