package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecShoppingRetargeting._

case class TargetingSpecShoppingRetargeting (
  /* Number of days ago to stop lookback timeframe for dynamic retargeting */
  exclusionWindow: Option[Integer],
/* Number of days ago to start lookback timeframe for dynamic retargeting */
  lookbackWindow: Option[Integer],
/* Event types to target for dynamic retargeting */
  tagTypes: Option[List[Integer]])

object TargetingSpecShoppingRetargeting {
  import DateTimeCodecs._

  implicit val TargetingSpecShoppingRetargetingCodecJson: CodecJson[TargetingSpecShoppingRetargeting] = CodecJson.derive[TargetingSpecShoppingRetargeting]
  implicit val TargetingSpecShoppingRetargetingDecoder: EntityDecoder[TargetingSpecShoppingRetargeting] = jsonOf[TargetingSpecShoppingRetargeting]
  implicit val TargetingSpecShoppingRetargetingEncoder: EntityEncoder[TargetingSpecShoppingRetargeting] = jsonEncoderOf[TargetingSpecShoppingRetargeting]
}
