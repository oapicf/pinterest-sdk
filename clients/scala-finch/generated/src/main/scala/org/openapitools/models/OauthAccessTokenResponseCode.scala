package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param refreshUnderscoretoken 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscoreat 
 * @param refreshUnderscoretokenUnderscoreexpiresUnderscorein 
 * @param accessUnderscoretoken 
 * @param expiresUnderscorein 
 * @param responseUnderscoretype 
 * @param scope 
 * @param tokenUnderscoretype 
 */
case class OauthAccessTokenResponseCode(refreshUnderscoretoken: Option[String],
                refreshUnderscoretokenUnderscoreexpiresUnderscoreat: Option[Int],
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Option[Int],
                accessUnderscoretoken: String,
                expiresUnderscorein: Int,
                responseUnderscoretype: Option[String],
                scope: String,
                tokenUnderscoretype: String
                )

object OauthAccessTokenResponseCode {
    /**
     * Creates the codec for converting OauthAccessTokenResponseCode from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseCode] = deriveEncoder
}
