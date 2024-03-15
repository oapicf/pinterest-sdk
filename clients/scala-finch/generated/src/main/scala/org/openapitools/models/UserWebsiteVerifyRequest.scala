package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * User website verification request
 * @param website 
 * @param verificationUnderscoremethod 
 */
case class UserWebsiteVerifyRequest(website: Option[String],
                verificationUnderscoremethod: Option[String]
                )

object UserWebsiteVerifyRequest {
    /**
     * Creates the codec for converting UserWebsiteVerifyRequest from and to JSON.
     */
    implicit val decoder: Decoder[UserWebsiteVerifyRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserWebsiteVerifyRequest] = deriveEncoder
}
