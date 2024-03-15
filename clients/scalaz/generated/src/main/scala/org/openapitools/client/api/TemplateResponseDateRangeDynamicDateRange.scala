package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplateResponseDateRangeDynamicDateRange._

case class TemplateResponseDateRangeDynamicDateRange (
  /* The date range type */
  `type`: Option[String],
/* The dynamic range type */
  range: Option[Range])

object TemplateResponseDateRangeDynamicDateRange {
  import DateTimeCodecs._
  sealed trait Range
  case object YEARTODATE extends Range
  case object QUARTERTODATE extends Range
  case object MONTHTODATE extends Range
  case object LASTMONTH extends Range

  object Range {
    def toRange(s: String): Option[Range] = s match {
      case "YEARTODATE" => Some(YEARTODATE)
      case "QUARTERTODATE" => Some(QUARTERTODATE)
      case "MONTHTODATE" => Some(MONTHTODATE)
      case "LASTMONTH" => Some(LASTMONTH)
      case _ => None
    }

    def fromRange(x: Range): String = x match {
      case YEARTODATE => "YEARTODATE"
      case QUARTERTODATE => "QUARTERTODATE"
      case MONTHTODATE => "MONTHTODATE"
      case LASTMONTH => "LASTMONTH"
    }
  }

  implicit val RangeEnumEncoder: EncodeJson[Range] =
    EncodeJson[Range](is => StringEncodeJson(Range.fromRange(is)))

  implicit val RangeEnumDecoder: DecodeJson[Range] =
    DecodeJson.optionDecoder[Range](n => n.string.flatMap(jStr => Range.toRange(jStr)), "Range failed to de-serialize")

  implicit val TemplateResponseDateRangeDynamicDateRangeCodecJson: CodecJson[TemplateResponseDateRangeDynamicDateRange] = CodecJson.derive[TemplateResponseDateRangeDynamicDateRange]
  implicit val TemplateResponseDateRangeDynamicDateRangeDecoder: EntityDecoder[TemplateResponseDateRangeDynamicDateRange] = jsonOf[TemplateResponseDateRangeDynamicDateRange]
  implicit val TemplateResponseDateRangeDynamicDateRangeEncoder: EntityEncoder[TemplateResponseDateRangeDynamicDateRange] = jsonEncoderOf[TemplateResponseDateRangeDynamicDateRange]
}
