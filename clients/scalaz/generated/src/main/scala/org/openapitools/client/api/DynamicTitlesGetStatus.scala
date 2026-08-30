package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DynamicTitlesGetStatus._

case class DynamicTitlesGetStatus (
  /* The count of generated titles. */
  generatedCount: Option[Integer],
/* Whether dynamic titles have been generated and are ready to be reviewed for the ad group. */
  isReady: Option[Boolean],
/* The count of advertiser reviewed titles. */
  reviewedCount: Option[Integer])

object DynamicTitlesGetStatus {
  import DateTimeCodecs._

  implicit val DynamicTitlesGetStatusCodecJson: CodecJson[DynamicTitlesGetStatus] = CodecJson.derive[DynamicTitlesGetStatus]
  implicit val DynamicTitlesGetStatusDecoder: EntityDecoder[DynamicTitlesGetStatus] = jsonOf[DynamicTitlesGetStatus]
  implicit val DynamicTitlesGetStatusEncoder: EntityEncoder[DynamicTitlesGetStatus] = jsonEncoderOf[DynamicTitlesGetStatus]
}
