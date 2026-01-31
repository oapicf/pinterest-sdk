package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param status Status of the verification process
 * @param verifiedUnderscoreat UTC timestamp when the verification happened - sometimes missing
 * @param website Website with path or domain only
 */
case class UserWebsiteSummary(status: Option[String],
                verifiedUnderscoreat: Option[String],
                website: Option[String]
                )

object UserWebsiteSummary {
    /**
     * Creates the codec for converting UserWebsiteSummary from and to JSON.
     */
    implicit val decoder: Decoder[UserWebsiteSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserWebsiteSummary] = deriveEncoder
}
