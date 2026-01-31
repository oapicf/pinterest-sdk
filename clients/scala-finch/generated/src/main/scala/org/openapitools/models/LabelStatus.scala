package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
 */
case class LabelStatus()

object LabelStatus {
    /**
     * Creates the codec for converting LabelStatus from and to JSON.
     */
    implicit val decoder: Decoder[LabelStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelStatus] = deriveEncoder
}
