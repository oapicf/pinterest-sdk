package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OauthAccessTokenRequest
import org.openapitools.models.OauthAccessTokenRequestRefreshAllOf

/**
 * A request to exchange a refresh token for a new access token.
 * @param grantUnderscoretype 
 * @param refreshUnderscoretoken 
 * @param scope 
 */
case class OauthAccessTokenRequestRefresh(grantUnderscoretype: String,
                refreshUnderscoretoken: String,
                scope: Option[String]
                )

object OauthAccessTokenRequestRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenRequestRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestRefresh] = deriveEncoder
}
