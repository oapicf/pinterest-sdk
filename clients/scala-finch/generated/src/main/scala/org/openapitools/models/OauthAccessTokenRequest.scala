package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Describes the valid schema for possible OAuth access token requests.
 * @param grantUnderscoretype 
 */
case class OauthAccessTokenRequest(grantUnderscoretype: String
                )

object OauthAccessTokenRequest {
    /**
     * Creates the codec for converting OauthAccessTokenRequest from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequest] = deriveEncoder
}
