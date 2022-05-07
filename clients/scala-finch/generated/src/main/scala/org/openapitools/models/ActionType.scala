package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Ad group billable event type.
 */
case class ActionType()

object ActionType {
    /**
     * Creates the codec for converting ActionType from and to JSON.
     */
    implicit val decoder: Decoder[ActionType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ActionType] = deriveEncoder
}
