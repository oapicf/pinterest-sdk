package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A successful OAuth client token response for the client token flow.
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 */
case class OauthAccessTokenResponseClientCredentials(responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String
                )

object OauthAccessTokenResponseClientCredentials {
    /**
     * Creates the codec for converting OauthAccessTokenResponseClientCredentials from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseClientCredentials] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseClientCredentials] = deriveEncoder
}
