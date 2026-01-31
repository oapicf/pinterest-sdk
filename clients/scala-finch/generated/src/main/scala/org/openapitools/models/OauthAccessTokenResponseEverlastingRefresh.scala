package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param refreshUnderscoretoken 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscorein 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscoreat 
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 */
case class OauthAccessTokenResponseEverlastingRefresh(refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int,
                refreshUnderscoretokenUnderscoreexpiresUnderscoreat: Int,
                responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String
                )

object OauthAccessTokenResponseEverlastingRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenResponseEverlastingRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseEverlastingRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseEverlastingRefresh] = deriveEncoder
}
