package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param accountUnderscoretype Type of account
 * @param profileUnderscoreimage 
 * @param websiteUnderscoreurl 
 * @param username 
 */
case class Account(accountUnderscoretype: Option[String],
                profileUnderscoreimage: Option[String],
                websiteUnderscoreurl: Option[String],
                username: Option[String]
                )

object Account {
    /**
     * Creates the codec for converting Account from and to JSON.
     */
    implicit val decoder: Decoder[Account] = deriveDecoder
    implicit val encoder: ObjectEncoder[Account] = deriveEncoder
}
