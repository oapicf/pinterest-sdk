package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 * @param refreshUnderscoretoken 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscorein 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscoreat 
 */
case class OauthAccessTokenResponseEverlastingRefresh(responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String,
                refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int,
                refreshUnderscoretokenUnderscoreexpiresUnderscoreat: Int
                )

object OauthAccessTokenResponseEverlastingRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenResponseEverlastingRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseEverlastingRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseEverlastingRefresh] = deriveEncoder
}
