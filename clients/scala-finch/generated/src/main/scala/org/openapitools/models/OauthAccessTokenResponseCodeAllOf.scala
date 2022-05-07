package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param refreshUnderscoretoken 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscorein 
 */
case class OauthAccessTokenResponseCodeAllOf(refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int
                )

object OauthAccessTokenResponseCodeAllOf {
    /**
     * Creates the codec for converting OauthAccessTokenResponseCodeAllOf from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseCodeAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseCodeAllOf] = deriveEncoder
}
