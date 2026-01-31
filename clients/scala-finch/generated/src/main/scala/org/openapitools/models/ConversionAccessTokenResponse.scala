package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A successful conversion access token response.
 * @param accessUnderscoretoken 
 * @param tokenUnderscoretype 
 */
case class ConversionAccessTokenResponse(accessUnderscoretoken: String,
                tokenUnderscoretype: Option[String]
                )

object ConversionAccessTokenResponse {
    /**
     * Creates the codec for converting ConversionAccessTokenResponse from and to JSON.
     */
    implicit val decoder: Decoder[ConversionAccessTokenResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionAccessTokenResponse] = deriveEncoder
}
