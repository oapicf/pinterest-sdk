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
 * @param items Users
 * @param bookmark 
 */
case class UserFollowingGet200Response(items: Seq[UserSummary],
                bookmark: Option[String]
                )

object UserFollowingGet200Response {
    /**
     * Creates the codec for converting UserFollowingGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[UserFollowingGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserFollowingGet200Response] = deriveEncoder
}
