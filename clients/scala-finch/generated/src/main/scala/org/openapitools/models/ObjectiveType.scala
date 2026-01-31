package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Intended result of the campaign.  You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter. 
 */
case class ObjectiveType()

object ObjectiveType {
    /**
     * Creates the codec for converting ObjectiveType from and to JSON.
     */
    implicit val decoder: Decoder[ObjectiveType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ObjectiveType] = deriveEncoder
}
