package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ObjectiveType
import scala.collection.immutable.Seq

/**
 * 
 * @param campaignUnderscoreobjectiveUnderscoretypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
 */
case class CampaignObjectivesFilter(campaignUnderscoreobjectiveUnderscoretypes: Option[Seq[ObjectiveType]]
                )

object CampaignObjectivesFilter {
    /**
     * Creates the codec for converting CampaignObjectivesFilter from and to JSON.
     */
    implicit val decoder: Decoder[CampaignObjectivesFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignObjectivesFilter] = deriveEncoder
}
