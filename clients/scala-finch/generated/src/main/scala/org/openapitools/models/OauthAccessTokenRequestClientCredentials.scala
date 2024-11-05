package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A request to receive a client token.
 * @param grantUnderscoretype 
 * @param scope 
 */
case class OauthAccessTokenRequestClientCredentials(grantUnderscoretype: String,
                scope: String
                )

object OauthAccessTokenRequestClientCredentials {
    /**
     * Creates the codec for converting OauthAccessTokenRequestClientCredentials from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestClientCredentials] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestClientCredentials] = deriveEncoder
}
