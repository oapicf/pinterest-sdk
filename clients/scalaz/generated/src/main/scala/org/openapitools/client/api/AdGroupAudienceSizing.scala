package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupAudienceSizing._

case class AdGroupAudienceSizing (
  /* The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. */
  audienceSizeLowerBound: Option[BigDecimal],
/* The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. */
  audienceSizeUpperBound: Option[BigDecimal])

object AdGroupAudienceSizing {
  import DateTimeCodecs._

  implicit val AdGroupAudienceSizingCodecJson: CodecJson[AdGroupAudienceSizing] = CodecJson.derive[AdGroupAudienceSizing]
  implicit val AdGroupAudienceSizingDecoder: EntityDecoder[AdGroupAudienceSizing] = jsonOf[AdGroupAudienceSizing]
  implicit val AdGroupAudienceSizingEncoder: EntityEncoder[AdGroupAudienceSizing] = jsonEncoderOf[AdGroupAudienceSizing]
}
