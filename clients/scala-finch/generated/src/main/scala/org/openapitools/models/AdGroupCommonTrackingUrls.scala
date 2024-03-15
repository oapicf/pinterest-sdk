package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param impression 
 * @param click 
 * @param engagement 
 * @param buyableUnderscorebutton 
 * @param audienceUnderscoreverification 
 */
case class AdGroupCommonTrackingUrls(impression: Option[Seq[String]],
                click: Option[Seq[String]],
                engagement: Option[Seq[String]],
                buyableUnderscorebutton: Option[Seq[String]],
                audienceUnderscoreverification: Option[Seq[String]]
                )

object AdGroupCommonTrackingUrls {
    /**
     * Creates the codec for converting AdGroupCommonTrackingUrls from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupCommonTrackingUrls] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupCommonTrackingUrls] = deriveEncoder
}
