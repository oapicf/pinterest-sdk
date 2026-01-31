package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A successful OAuth access token response.
 * @param accessUnderscoretoken 
 * @param expiresUnderscorein 
 * @param responseUnderscoretype 
 * @param scope 
 * @param tokenUnderscoretype 
 */
case class OauthAccessTokenResponse(accessUnderscoretoken: String,
                expiresUnderscorein: Int,
                responseUnderscoretype: Option[String],
                scope: String,
                tokenUnderscoretype: String
                )

object OauthAccessTokenResponse {
    /**
     * Creates the codec for converting OauthAccessTokenResponse from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponse] = deriveEncoder
}
