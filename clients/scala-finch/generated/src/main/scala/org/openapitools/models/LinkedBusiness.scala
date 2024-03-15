package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param username Username
 * @param imageUnderscoresmallUnderscoreurl image_small_url
 * @param imageUnderscoremediumUnderscoreurl image_medium_url
 * @param imageUnderscorelargeUnderscoreurl image_large_url
 * @param imageUnderscorexlargeUnderscoreurl image_xlarge_url
 */
case class LinkedBusiness(username: Option[String],
                imageUnderscoresmallUnderscoreurl: Option[String],
                imageUnderscoremediumUnderscoreurl: Option[String],
                imageUnderscorelargeUnderscoreurl: Option[String],
                imageUnderscorexlargeUnderscoreurl: Option[String]
                )

object LinkedBusiness {
    /**
     * Creates the codec for converting LinkedBusiness from and to JSON.
     */
    implicit val decoder: Decoder[LinkedBusiness] = deriveDecoder
    implicit val encoder: ObjectEncoder[LinkedBusiness] = deriveEncoder
}
