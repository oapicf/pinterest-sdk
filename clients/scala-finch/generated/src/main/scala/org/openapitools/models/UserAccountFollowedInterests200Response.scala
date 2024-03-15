package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Interest
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class UserAccountFollowedInterests200Response(items: Seq[Interest],
                bookmark: Option[String]
                )

object UserAccountFollowedInterests200Response {
    /**
     * Creates the codec for converting UserAccountFollowedInterests200Response from and to JSON.
     */
    implicit val decoder: Decoder[UserAccountFollowedInterests200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserAccountFollowedInterests200Response] = deriveEncoder
}
