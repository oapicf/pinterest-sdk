package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import scala.collection.immutable.HashMap

/**
 * Any valid JSON object
 */
case class NotificationPostRequest()

object NotificationPostRequest {
    /**
     * Creates the codec for converting NotificationPostRequest from and to JSON.
     */
    implicit val decoder: Decoder[NotificationPostRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[NotificationPostRequest] = deriveEncoder
}
