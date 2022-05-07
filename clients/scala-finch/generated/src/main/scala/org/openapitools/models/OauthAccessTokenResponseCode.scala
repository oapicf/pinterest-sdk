package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OauthAccessTokenResponse
import org.openapitools.models.OauthAccessTokenResponseCodeAllOf

/**
 * A successful OAuth access token response for the authorization code flow.
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 * @param refreshUnderscoretoken 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscorein 
 */
case class OauthAccessTokenResponseCode(responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String,
                refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int
                )

object OauthAccessTokenResponseCode {
    /**
     * Creates the codec for converting OauthAccessTokenResponseCode from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseCode] = deriveEncoder
}
