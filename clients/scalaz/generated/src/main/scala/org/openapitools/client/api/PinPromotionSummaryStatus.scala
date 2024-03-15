package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinPromotionSummaryStatus._

case class PinPromotionSummaryStatus (
  
object PinPromotionSummaryStatus {
  import DateTimeCodecs._

  implicit val PinPromotionSummaryStatusCodecJson: CodecJson[PinPromotionSummaryStatus] = CodecJson.derive[PinPromotionSummaryStatus]
  implicit val PinPromotionSummaryStatusDecoder: EntityDecoder[PinPromotionSummaryStatus] = jsonOf[PinPromotionSummaryStatus]
  implicit val PinPromotionSummaryStatusEncoder: EntityEncoder[PinPromotionSummaryStatus] = jsonEncoderOf[PinPromotionSummaryStatus]
}
