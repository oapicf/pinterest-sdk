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
 * @param responseUnderscoretype 
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 * @param expiresUnderscorein 
 * @param scope 
 */
case class OauthAccessTokenResponseCode(refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int,
                responseUnderscoretype: Option[String],
                accessUnderscoretoken: String,
                tokenUnderscoretype: String,
                expiresUnderscorein: Int,
                scope: String
                )

object OauthAccessTokenResponseCode {
    /**
     * Creates the codec for converting OauthAccessTokenResponseCode from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseCode] = deriveEncoder
}
