package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A successful OAuth access token response for the refresh token flow.
 * @param accessUnderscoretoken 
 * @param expiresUnderscorein 
 * @param responseUnderscoretype 
 * @param scope 
 * @param tokenUnderscoretype 
 * @param refreshUnderscoretoken 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscoreat 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscorein 
 */
case class OauthAccessTokenResponseRefresh(accessUnderscoretoken: String,
                expiresUnderscorein: Int,
                responseUnderscoretype: Option[String],
                scope: String,
                tokenUnderscoretype: String,
                refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscoreat: Int,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int
                )

object OauthAccessTokenResponseRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenResponseRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseRefresh] = deriveEncoder
}
