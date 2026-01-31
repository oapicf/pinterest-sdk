package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * List of ingestion sources for a conversion event.
 */
case class IngestionSourceOptions()

object IngestionSourceOptions {
    /**
     * Creates the codec for converting IngestionSourceOptions from and to JSON.
     */
    implicit val decoder: Decoder[IngestionSourceOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[IngestionSourceOptions] = deriveEncoder
}
