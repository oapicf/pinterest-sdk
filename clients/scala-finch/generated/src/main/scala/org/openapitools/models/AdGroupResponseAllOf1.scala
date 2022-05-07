package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ActionType

/**
 * 
 * @param campaignUnderscoreid Campaign ID of the ad group.
 * @param billableUnderscoreevent 
 * @param id Ad group ID.
 * @param _type Always \"adgroup\".
 * @param adUnderscoreaccountUnderscoreid Advertiser ID.
 * @param createdUnderscoretime Ad group creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretime Ad group last update time. Unix timestamp in seconds.
 */
case class AdGroupResponseAllOf1(campaignUnderscoreid: Option[String],
                billableUnderscoreevent: Option[ActionType],
                id: Option[String],
                _type: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int]
                )

object AdGroupResponseAllOf1 {
    /**
     * Creates the codec for converting AdGroupResponseAllOf1 from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupResponseAllOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupResponseAllOf1] = deriveEncoder
}
