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
 * @param items 
 * @param bookmark 
 */
case class FollowersList200Response(items: Seq[UserSummary],
                bookmark: Option[String]
                )

object FollowersList200Response {
    /**
     * Creates the codec for converting FollowersList200Response from and to JSON.
     */
    implicit val decoder: Decoder[FollowersList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[FollowersList200Response] = deriveEncoder
}
