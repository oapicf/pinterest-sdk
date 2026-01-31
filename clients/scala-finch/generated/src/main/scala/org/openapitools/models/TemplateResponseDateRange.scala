package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TemplateResponseDateRangeAbsoluteDateRange
import org.openapitools.models.TemplateResponseDateRangeDynamicDateRange
import org.openapitools.models.TemplateResponseDateRangeRelativeDateRange

/**
 * 
 * @param absoluteUnderscoredateUnderscorerange 
 * @param dynamicUnderscoredateUnderscorerange 
 * @param relativeUnderscoredateUnderscorerange 
 */
case class TemplateResponseDateRange(absoluteUnderscoredateUnderscorerange: Option[TemplateResponseDateRangeAbsoluteDateRange],
                dynamicUnderscoredateUnderscorerange: Option[TemplateResponseDateRangeDynamicDateRange],
                relativeUnderscoredateUnderscorerange: Option[TemplateResponseDateRangeRelativeDateRange]
                )

object TemplateResponseDateRange {
    /**
     * Creates the codec for converting TemplateResponseDateRange from and to JSON.
     */
    implicit val decoder: Decoder[TemplateResponseDateRange] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateResponseDateRange] = deriveEncoder
}
