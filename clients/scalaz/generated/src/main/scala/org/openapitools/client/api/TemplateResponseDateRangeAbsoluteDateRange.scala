package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplateResponseDateRangeAbsoluteDateRange._

case class TemplateResponseDateRangeAbsoluteDateRange (
  /* The date range type */
  `type`: Option[String],
/* The start date of the date range */
  startDate: Option[BigDecimal],
/* The end date of the date range */
  endDate: Option[BigDecimal])

object TemplateResponseDateRangeAbsoluteDateRange {
  import DateTimeCodecs._

  implicit val TemplateResponseDateRangeAbsoluteDateRangeCodecJson: CodecJson[TemplateResponseDateRangeAbsoluteDateRange] = CodecJson.derive[TemplateResponseDateRangeAbsoluteDateRange]
  implicit val TemplateResponseDateRangeAbsoluteDateRangeDecoder: EntityDecoder[TemplateResponseDateRangeAbsoluteDateRange] = jsonOf[TemplateResponseDateRangeAbsoluteDateRange]
  implicit val TemplateResponseDateRangeAbsoluteDateRangeEncoder: EntityEncoder[TemplateResponseDateRangeAbsoluteDateRange] = jsonEncoderOf[TemplateResponseDateRangeAbsoluteDateRange]
}
