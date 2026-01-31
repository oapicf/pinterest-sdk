package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param scope 
 * @param grantUnderscoretype 
 */
case class OauthAccessTokenRequestClientCredentials(scope: String,
                grantUnderscoretype: String
                )

object OauthAccessTokenRequestClientCredentials {
    /**
     * Creates the codec for converting OauthAccessTokenRequestClientCredentials from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestClientCredentials] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestClientCredentials] = deriveEncoder
}
