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
 * @param accessUnderscoretoken 
 * @param expiresUnderscorein 
 * @param responseUnderscoretype 
 * @param scope 
 * @param tokenUnderscoretype 
 */
case class OauthAccessTokenResponseIntegrationRefresh(refreshUnderscoretoken: String,
                refreshUnderscoretokenUnderscoreexpiresUnderscorein: Int,
                accessUnderscoretoken: String,
                expiresUnderscorein: Int,
                responseUnderscoretype: Option[String],
                scope: String,
                tokenUnderscoretype: String
                )

object OauthAccessTokenResponseIntegrationRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenResponseIntegrationRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenResponseIntegrationRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenResponseIntegrationRefresh] = deriveEncoder
}
