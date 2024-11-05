package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Status of a leads export job
 */
case class LeadsExportStatus()

object LeadsExportStatus {
    /**
     * Creates the codec for converting LeadsExportStatus from and to JSON.
     */
    implicit val decoder: Decoder[LeadsExportStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadsExportStatus] = deriveEncoder
}
