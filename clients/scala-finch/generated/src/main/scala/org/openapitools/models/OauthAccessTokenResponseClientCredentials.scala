package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A successful OAuth client token response for the client token flow.
 * @param accessUnderscoretoken 
 * @param expiresUnderscorein 
 * @param responseUnderscoretype 
 * @param scope 
 * @param tokenUnderscoretype 
 */
case class OauthAccessTokenResponseClientCredentials(accessUnderscoretoken: String,
                expiresUnderscorein: Int,
                responseUnderscoretype: Option[String],
                scope: String,
                tokenUnderscoretype: String
                )

object OauthAccessTokenResponseClientCredentials {
    /**
     * Creates the codec for converting OauthAccessTokenResponseClientCredentials from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseClientCredentials] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseClientCredentials] = deriveEncoder
}
