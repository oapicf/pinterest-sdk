package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CampaignCreateResponseData
import org.openapitools.models.Exception
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 * @param exceptions 
 */
case class CampaignCreateResponseItem(data: Option[CampaignCreateResponseData],
                exceptions: Option[Seq[Exception]]
                )

object CampaignCreateResponseItem {
    /**
     * Creates the codec for converting CampaignCreateResponseItem from and to JSON.
     */
    implicit val decoder: Decoder[CampaignCreateResponseItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignCreateResponseItem] = deriveEncoder
}
