package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param success Returns true if the notification accepted.
 * @param receivedUnderscoreat Received time. Unix timestamp in seconds.
 * @param errorUnderscoremsg error message when success is false
 */
case class NotificationResponse(success: Option[Boolean],
                receivedUnderscoreat: Option[Int],
                errorUnderscoremsg: Option[String]
                )

object NotificationResponse {
    /**
     * Creates the codec for converting NotificationResponse from and to JSON.
     */
    implicit val decoder: Decoder[NotificationResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[NotificationResponse] = deriveEncoder
}
