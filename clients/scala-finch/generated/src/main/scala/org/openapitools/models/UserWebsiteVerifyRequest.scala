package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * User website verification request
 * @param verificationUnderscoremethod 
 * @param website 
 */
case class UserWebsiteVerifyRequest(verificationUnderscoremethod: Option[String],
                website: Option[String]
                )

object UserWebsiteVerifyRequest {
    /**
     * Creates the codec for converting UserWebsiteVerifyRequest from and to JSON.
     */
    implicit val decoder: Decoder[UserWebsiteVerifyRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserWebsiteVerifyRequest] = deriveEncoder
}
