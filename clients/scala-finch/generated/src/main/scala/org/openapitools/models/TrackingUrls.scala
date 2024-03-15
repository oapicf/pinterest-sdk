package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param impression 
 * @param click 
 * @param engagement 
 * @param buyableUnderscorebutton 
 * @param audienceUnderscoreverification 
 */
case class TrackingUrls(impression: Option[Seq[String]],
                click: Option[Seq[String]],
                engagement: Option[Seq[String]],
                buyableUnderscorebutton: Option[Seq[String]],
                audienceUnderscoreverification: Option[Seq[String]]
                )

object TrackingUrls {
    /**
     * Creates the codec for converting TrackingUrls from and to JSON.
     */
    implicit val decoder: Decoder[TrackingUrls] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrackingUrls] = deriveEncoder
}
