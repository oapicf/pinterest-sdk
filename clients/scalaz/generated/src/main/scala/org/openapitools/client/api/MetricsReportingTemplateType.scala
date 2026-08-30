package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MetricsReportingTemplateType._

case class MetricsReportingTemplateType (
  
object MetricsReportingTemplateType {
  import DateTimeCodecs._

  implicit val MetricsReportingTemplateTypeCodecJson: CodecJson[MetricsReportingTemplateType] = CodecJson.derive[MetricsReportingTemplateType]
  implicit val MetricsReportingTemplateTypeDecoder: EntityDecoder[MetricsReportingTemplateType] = jsonOf[MetricsReportingTemplateType]
  implicit val MetricsReportingTemplateTypeEncoder: EntityEncoder[MetricsReportingTemplateType] = jsonEncoderOf[MetricsReportingTemplateType]
}
