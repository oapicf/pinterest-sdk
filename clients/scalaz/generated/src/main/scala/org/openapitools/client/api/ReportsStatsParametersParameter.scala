package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReportsStatsParametersParameter._

case class ReportsStatsParametersParameter (
  catalogType: CatalogsType,
report: CatalogsHotelReportStatsParametersReport)

object ReportsStatsParametersParameter {
  import DateTimeCodecs._

  implicit val ReportsStatsParametersParameterCodecJson: CodecJson[ReportsStatsParametersParameter] = CodecJson.derive[ReportsStatsParametersParameter]
  implicit val ReportsStatsParametersParameterDecoder: EntityDecoder[ReportsStatsParametersParameter] = jsonOf[ReportsStatsParametersParameter]
  implicit val ReportsStatsParametersParameterEncoder: EntityEncoder[ReportsStatsParametersParameter] = jsonEncoderOf[ReportsStatsParametersParameter]
}
