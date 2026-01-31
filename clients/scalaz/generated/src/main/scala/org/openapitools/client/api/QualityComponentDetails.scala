package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QualityComponentDetails._

case class QualityComponentDetails (
  /* Coverage percentage for this event type. */
  coverage: BigDecimal,
/* List of issues detected for this event type, if any. */
  issues: Option[List[QualityComponentIssue]],
/* Overlap percentage for this event type. Only populated for external_event_id */
  overlap: Option[BigDecimal])

object QualityComponentDetails {
  import DateTimeCodecs._

  implicit val QualityComponentDetailsCodecJson: CodecJson[QualityComponentDetails] = CodecJson.derive[QualityComponentDetails]
  implicit val QualityComponentDetailsDecoder: EntityDecoder[QualityComponentDetails] = jsonOf[QualityComponentDetails]
  implicit val QualityComponentDetailsEncoder: EntityEncoder[QualityComponentDetails] = jsonEncoderOf[QualityComponentDetails]
}
