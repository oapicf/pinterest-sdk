package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdReviewStatus._

case class AdReviewStatus (
  
object AdReviewStatus {
  import DateTimeCodecs._

  implicit val AdReviewStatusCodecJson: CodecJson[AdReviewStatus] = CodecJson.derive[AdReviewStatus]
  implicit val AdReviewStatusDecoder: EntityDecoder[AdReviewStatus] = jsonOf[AdReviewStatus]
  implicit val AdReviewStatusEncoder: EntityEncoder[AdReviewStatus] = jsonEncoderOf[AdReviewStatus]
}
