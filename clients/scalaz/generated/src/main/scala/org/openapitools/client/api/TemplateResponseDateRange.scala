package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplateResponseDateRange._

case class TemplateResponseDateRange (
  dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange],
relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange],
absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange])

object TemplateResponseDateRange {
  import DateTimeCodecs._

  implicit val TemplateResponseDateRangeCodecJson: CodecJson[TemplateResponseDateRange] = CodecJson.derive[TemplateResponseDateRange]
  implicit val TemplateResponseDateRangeDecoder: EntityDecoder[TemplateResponseDateRange] = jsonOf[TemplateResponseDateRange]
  implicit val TemplateResponseDateRangeEncoder: EntityEncoder[TemplateResponseDateRange] = jsonEncoderOf[TemplateResponseDateRange]
}
