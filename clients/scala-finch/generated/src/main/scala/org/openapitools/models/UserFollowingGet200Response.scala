package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items Users
 */
case class UserFollowingGet200Response(bookmark: Option[String],
                items: Seq[UserSummary]
                )

object UserFollowingGet200Response {
    /**
     * Creates the codec for converting UserFollowingGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[UserFollowingGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserFollowingGet200Response] = deriveEncoder
}
