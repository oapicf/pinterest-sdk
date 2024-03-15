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
 * @param dynamicUnderscoredateUnderscorerange 
 * @param relativeUnderscoredateUnderscorerange 
 * @param absoluteUnderscoredateUnderscorerange 
 */
case class TemplateResponseDateRange(dynamicUnderscoredateUnderscorerange: Option[TemplateResponseDateRangeDynamicDateRange],
                relativeUnderscoredateUnderscorerange: Option[TemplateResponseDateRangeRelativeDateRange],
                absoluteUnderscoredateUnderscorerange: Option[TemplateResponseDateRangeAbsoluteDateRange]
                )

object TemplateResponseDateRange {
    /**
     * Creates the codec for converting TemplateResponseDateRange from and to JSON.
     */
    implicit val decoder: Decoder[TemplateResponseDateRange] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateResponseDateRange] = deriveEncoder
}
