package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param refreshUnderscoretoken 
 * @param scope 
 * @param grantUnderscoretype 
 */
case class OauthAccessTokenRequestRefresh(refreshUnderscoretoken: String,
                scope: Option[String],
                grantUnderscoretype: String
                )

object OauthAccessTokenRequestRefresh {
    /**
     * Creates the codec for converting OauthAccessTokenRequestRefresh from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestRefresh] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestRefresh] = deriveEncoder
}
