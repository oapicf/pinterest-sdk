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
 */
case class OauthAccessTokenRequestRefreshAllOf(refreshUnderscoretoken: String,
                scope: Option[String]
                )

object OauthAccessTokenRequestRefreshAllOf {
    /**
     * Creates the codec for converting OauthAccessTokenRequestRefreshAllOf from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestRefreshAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestRefreshAllOf] = deriveEncoder
}
