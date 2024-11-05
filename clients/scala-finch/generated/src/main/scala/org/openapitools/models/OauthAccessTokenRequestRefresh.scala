package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A request to exchange a refresh token for a new access token.
 * @param grantUnderscoretype 
 * @param refreshUnderscoretoken 
 * @param scope 
 * @param refreshUnderscoreon Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
 */
case class OauthAccessTokenRequestRefresh(grantUnderscoretype: String,
                refreshUnderscoretoken: String,
                scope: Option[String],
                refreshUnderscoreon: Option[Boolean]
                )

object OauthAccessTokenRequestRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenRequestRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestRefresh] = deriveEncoder
}
