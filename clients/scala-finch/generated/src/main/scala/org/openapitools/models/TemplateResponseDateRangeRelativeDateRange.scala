package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The relative date range of the template
 * @param endUnderscoredaysUnderscoreinUnderscorepast The end date of the date range
 * @param startUnderscoredaysUnderscoreinUnderscorepast The start date of the date range
 * @param _type The date range type
 */
case class TemplateResponseDateRangeRelativeDateRange(endUnderscoredaysUnderscoreinUnderscorepast: Option[BigDecimal],
                startUnderscoredaysUnderscoreinUnderscorepast: Option[BigDecimal],
                _type: Option[String]
                )

object TemplateResponseDateRangeRelativeDateRange {
    /**
     * Creates the codec for converting TemplateResponseDateRangeRelativeDateRange from and to JSON.
     */
    implicit val decoder: Decoder[TemplateResponseDateRangeRelativeDateRange] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateResponseDateRangeRelativeDateRange] = deriveEncoder
}
