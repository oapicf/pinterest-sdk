package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplateResponseDateRangeRelativeDateRange._

case class TemplateResponseDateRangeRelativeDateRange (
  /* The date range type */
  `type`: Option[String],
/* The start date of the date range */
  startDaysInPast: Option[BigDecimal],
/* The end date of the date range */
  endDaysInPast: Option[BigDecimal])

object TemplateResponseDateRangeRelativeDateRange {
  import DateTimeCodecs._

  implicit val TemplateResponseDateRangeRelativeDateRangeCodecJson: CodecJson[TemplateResponseDateRangeRelativeDateRange] = CodecJson.derive[TemplateResponseDateRangeRelativeDateRange]
  implicit val TemplateResponseDateRangeRelativeDateRangeDecoder: EntityDecoder[TemplateResponseDateRangeRelativeDateRange] = jsonOf[TemplateResponseDateRangeRelativeDateRange]
  implicit val TemplateResponseDateRangeRelativeDateRangeEncoder: EntityEncoder[TemplateResponseDateRangeRelativeDateRange] = jsonEncoderOf[TemplateResponseDateRangeRelativeDateRange]
}
