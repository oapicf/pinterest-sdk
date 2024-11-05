package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsReportParameters._

case class CatalogsReportParameters (
  catalogType: CatalogsType,
report: CatalogsHotelReportParametersReport)

object CatalogsReportParameters {
  import DateTimeCodecs._

  implicit val CatalogsReportParametersCodecJson: CodecJson[CatalogsReportParameters] = CodecJson.derive[CatalogsReportParameters]
  implicit val CatalogsReportParametersDecoder: EntityDecoder[CatalogsReportParameters] = jsonOf[CatalogsReportParameters]
  implicit val CatalogsReportParametersEncoder: EntityEncoder[CatalogsReportParameters] = jsonEncoderOf[CatalogsReportParameters]
}
