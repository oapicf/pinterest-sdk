package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param impression 
 * @param click 
 * @param engagement 
 * @param buyableUnderscorebutton 
 * @param audienceUnderscoreverification 
 */
case class AdCommonTrackingUrls(impression: Option[Seq[String]],
                click: Option[Seq[String]],
                engagement: Option[Seq[String]],
                buyableUnderscorebutton: Option[Seq[String]],
                audienceUnderscoreverification: Option[Seq[String]]
                )

object AdCommonTrackingUrls {
    /**
     * Creates the codec for converting AdCommonTrackingUrls from and to JSON.
     */
    implicit val decoder: Decoder[AdCommonTrackingUrls] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdCommonTrackingUrls] = deriveEncoder
}
