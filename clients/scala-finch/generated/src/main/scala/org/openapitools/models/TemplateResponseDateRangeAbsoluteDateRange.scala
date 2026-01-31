package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The absolute date range of the template
 * @param endUnderscoredate The end date of the date range
 * @param startUnderscoredate The start date of the date range
 * @param _type The date range type
 */
case class TemplateResponseDateRangeAbsoluteDateRange(endUnderscoredate: Option[BigDecimal],
                startUnderscoredate: Option[BigDecimal],
                _type: Option[String]
                )

object TemplateResponseDateRangeAbsoluteDateRange {
    /**
     * Creates the codec for converting TemplateResponseDateRangeAbsoluteDateRange from and to JSON.
     */
    implicit val decoder: Decoder[TemplateResponseDateRangeAbsoluteDateRange] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateResponseDateRangeAbsoluteDateRange] = deriveEncoder
}
