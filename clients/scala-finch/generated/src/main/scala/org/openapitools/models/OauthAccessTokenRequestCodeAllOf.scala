package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code 
 * @param redirectUnderscoreuri 
 */
case class OauthAccessTokenRequestCodeAllOf(code: String,
                redirectUnderscoreuri: String
                )

object OauthAccessTokenRequestCodeAllOf {
    /**
     * Creates the codec for converting OauthAccessTokenRequestCodeAllOf from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestCodeAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestCodeAllOf] = deriveEncoder
}
