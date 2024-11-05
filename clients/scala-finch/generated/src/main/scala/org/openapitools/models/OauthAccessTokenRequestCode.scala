package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A request to exchange an authorization code for an access token.
 * @param grantUnderscoretype 
 * @param code 
 * @param redirectUnderscoreuri 
 */
case class OauthAccessTokenRequestCode(grantUnderscoretype: String,
                code: String,
                redirectUnderscoreuri: String
                )

object OauthAccessTokenRequestCode {
    /**
     * Creates the codec for converting OauthAccessTokenRequestCode from and to JSON.
     */
    implicit val decoder: Decoder[OauthAccessTokenRequestCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[OauthAccessTokenRequestCode] = deriveEncoder
}
