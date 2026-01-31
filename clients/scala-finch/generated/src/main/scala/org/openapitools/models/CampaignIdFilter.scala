package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param campaignUnderscoreids List of campaign ids
 */
case class CampaignIdFilter(campaignUnderscoreids: Option[Seq[String]]
                )

object CampaignIdFilter {
    /**
     * Creates the codec for converting CampaignIdFilter from and to JSON.
     */
    implicit val decoder: Decoder[CampaignIdFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignIdFilter] = deriveEncoder
}
