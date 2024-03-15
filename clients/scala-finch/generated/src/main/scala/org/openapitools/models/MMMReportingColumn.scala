package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Marketing Mix Modeling (MMM) Reporting Columns
 */
case class MMMReportingColumn()

object MMMReportingColumn {
    /**
     * Creates the codec for converting MMMReportingColumn from and to JSON.
     */
    implicit val decoder: Decoder[MMMReportingColumn] = deriveDecoder
    implicit val encoder: ObjectEncoder[MMMReportingColumn] = deriveEncoder
}
