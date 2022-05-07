package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MetricsReportingLevel._

case class MetricsReportingLevel (
  
object MetricsReportingLevel {
  import DateTimeCodecs._

  implicit val MetricsReportingLevelCodecJson: CodecJson[MetricsReportingLevel] = CodecJson.derive[MetricsReportingLevel]
  implicit val MetricsReportingLevelDecoder: EntityDecoder[MetricsReportingLevel] = jsonOf[MetricsReportingLevel]
  implicit val MetricsReportingLevelEncoder: EntityEncoder[MetricsReportingLevel] = jsonEncoderOf[MetricsReportingLevel]
}
