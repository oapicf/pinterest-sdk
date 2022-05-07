package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A successful OAuth access token response.
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 */
case class OauthAccessTokenResponse(responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String
                )

object OauthAccessTokenResponse {
    /**
     * Creates the codec for converting OauthAccessTokenResponse from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponse] = deriveEncoder
}
