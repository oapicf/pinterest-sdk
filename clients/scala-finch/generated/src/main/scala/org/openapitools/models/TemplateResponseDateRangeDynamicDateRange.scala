package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The dynamic date range of the template
 * @param _type The date range type
 * @param range The dynamic range type
 */
case class TemplateResponseDateRangeDynamicDateRange(_type: Option[String],
                range: Option[String]
                )

object TemplateResponseDateRangeDynamicDateRange {
    /**
     * Creates the codec for converting TemplateResponseDateRangeDynamicDateRange from and to JSON.
     */
    implicit val decoder: Decoder[TemplateResponseDateRangeDynamicDateRange] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateResponseDateRangeDynamicDateRange] = deriveEncoder
}
