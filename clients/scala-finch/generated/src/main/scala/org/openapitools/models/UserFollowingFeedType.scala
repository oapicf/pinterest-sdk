package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Specifies the type of followees to be kept when filtering them.
 */
case class UserFollowingFeedType()

object UserFollowingFeedType {
    /**
     * Creates the codec for converting UserFollowingFeedType from and to JSON.
     */
    implicit val decoder: Decoder[UserFollowingFeedType] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserFollowingFeedType] = deriveEncoder
}
