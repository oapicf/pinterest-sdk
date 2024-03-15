package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OauthAccessTokenResponse

/**
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 * @param refreshUnderscoretoken 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscorein 
 */
case class OauthAccessTokenResponseIntegrationRefresh(responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String,
                refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int
                )

object OauthAccessTokenResponseIntegrationRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenResponseIntegrationRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseIntegrationRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseIntegrationRefresh] = deriveEncoder
}
