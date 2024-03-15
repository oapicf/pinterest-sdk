package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecSHOPPINGRETARGETING._

case class TargetingSpecSHOPPINGRETARGETING (
  /* Number of days ago to start lookback timeframe for dynamic retargeting */
  lookbackWindow: Option[Integer],
/* Event types to target for dynamic retargeting */
  tagTypes: Option[List[Integer]],
/* Number of days ago to stop lookback timeframe for dynamic retargeting */
  exclusionWindow: Option[Integer])

object TargetingSpecSHOPPINGRETARGETING {
  import DateTimeCodecs._

  implicit val TargetingSpecSHOPPINGRETARGETINGCodecJson: CodecJson[TargetingSpecSHOPPINGRETARGETING] = CodecJson.derive[TargetingSpecSHOPPINGRETARGETING]
  implicit val TargetingSpecSHOPPINGRETARGETINGDecoder: EntityDecoder[TargetingSpecSHOPPINGRETARGETING] = jsonOf[TargetingSpecSHOPPINGRETARGETING]
  implicit val TargetingSpecSHOPPINGRETARGETINGEncoder: EntityEncoder[TargetingSpecSHOPPINGRETARGETING] = jsonEncoderOf[TargetingSpecSHOPPINGRETARGETING]
}
