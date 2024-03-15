package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param username Username
 * @param _type Always \"user\"
 */
case class UserSummary(username: Option[String],
                _type: Option[String]
                )

object UserSummary {
    /**
     * Creates the codec for converting UserSummary from and to JSON.
     */
    implicit val decoder: Decoder[UserSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserSummary] = deriveEncoder
}
