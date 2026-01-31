package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QualityComponentIssue._

case class QualityComponentIssue (
  /* Unique identifier for the issue check. */
  id: String,
/* Human-readable name of the issue. */
  name: String,
/* Detailed reason for the issue. */
  reason: String)

object QualityComponentIssue {
  import DateTimeCodecs._

  implicit val QualityComponentIssueCodecJson: CodecJson[QualityComponentIssue] = CodecJson.derive[QualityComponentIssue]
  implicit val QualityComponentIssueDecoder: EntityDecoder[QualityComponentIssue] = jsonOf[QualityComponentIssue]
  implicit val QualityComponentIssueEncoder: EntityEncoder[QualityComponentIssue] = jsonEncoderOf[QualityComponentIssue]
}
