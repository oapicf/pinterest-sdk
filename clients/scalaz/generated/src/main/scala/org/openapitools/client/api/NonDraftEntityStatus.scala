package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NonDraftEntityStatus._

case class NonDraftEntityStatus (
  
object NonDraftEntityStatus {
  import DateTimeCodecs._

  implicit val NonDraftEntityStatusCodecJson: CodecJson[NonDraftEntityStatus] = CodecJson.derive[NonDraftEntityStatus]
  implicit val NonDraftEntityStatusDecoder: EntityDecoder[NonDraftEntityStatus] = jsonOf[NonDraftEntityStatus]
  implicit val NonDraftEntityStatusEncoder: EntityEncoder[NonDraftEntityStatus] = jsonEncoderOf[NonDraftEntityStatus]
}
