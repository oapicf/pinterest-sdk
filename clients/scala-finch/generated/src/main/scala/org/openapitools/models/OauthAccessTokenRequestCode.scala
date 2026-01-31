package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code 
 * @param redirectUnderscoreuri 
 * @param grantUnderscoretype 
 */
case class OauthAccessTokenRequestCode(code: String,
                redirectUnderscoreuri: String,
                grantUnderscoretype: String
                )

object OauthAccessTokenRequestCode {
    /**
     * Creates the codec for converting OauthAccessTokenRequestCode from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestCode] = deriveEncoder
}
