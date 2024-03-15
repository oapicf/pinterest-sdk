package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param autoUnderscorefollow Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
 */
case class FollowUserRequest(autoUnderscorefollow: Option[Boolean]
                )

object FollowUserRequest {
    /**
     * Creates the codec for converting FollowUserRequest from and to JSON.
     */
    implicit val decoder: Decoder[FollowUserRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[FollowUserRequest] = deriveEncoder
}
