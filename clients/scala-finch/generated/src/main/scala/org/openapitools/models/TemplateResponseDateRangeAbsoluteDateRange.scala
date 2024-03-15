package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The absolute date range of the template
 * @param _type The date range type
 * @param startUnderscoredate The start date of the date range
 * @param endUnderscoredate The end date of the date range
 */
case class TemplateResponseDateRangeAbsoluteDateRange(_type: Option[String],
                startUnderscoredate: Option[BigDecimal],
                endUnderscoredate: Option[BigDecimal]
                )

object TemplateResponseDateRangeAbsoluteDateRange {
    /**
     * Creates the codec for converting TemplateResponseDateRangeAbsoluteDateRange from and to JSON.
     */
    implicit val decoder: Decoder[TemplateResponseDateRangeAbsoluteDateRange] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateResponseDateRangeAbsoluteDateRange] = deriveEncoder
}
