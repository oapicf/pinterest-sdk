package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OauthAccessTokenResponse

/**
 * A successful OAuth access token response for the refresh token flow.
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 */
case class OauthAccessTokenResponseRefresh(responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String
                )

object OauthAccessTokenResponseRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenResponseRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseRefresh] = deriveEncoder
}
