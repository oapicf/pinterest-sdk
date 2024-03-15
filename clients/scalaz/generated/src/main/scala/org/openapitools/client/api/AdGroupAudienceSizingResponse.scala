package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupAudienceSizingResponse._

case class AdGroupAudienceSizingResponse (
  /* The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. */
  audienceSizeLowerBound: Option[BigDecimal],
/* The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. */
  audienceSizeUpperBound: Option[BigDecimal])

object AdGroupAudienceSizingResponse {
  import DateTimeCodecs._

  implicit val AdGroupAudienceSizingResponseCodecJson: CodecJson[AdGroupAudienceSizingResponse] = CodecJson.derive[AdGroupAudienceSizingResponse]
  implicit val AdGroupAudienceSizingResponseDecoder: EntityDecoder[AdGroupAudienceSizingResponse] = jsonOf[AdGroupAudienceSizingResponse]
  implicit val AdGroupAudienceSizingResponseEncoder: EntityEncoder[AdGroupAudienceSizingResponse] = jsonEncoderOf[AdGroupAudienceSizingResponse]
}
