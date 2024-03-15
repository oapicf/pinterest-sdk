package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemProcessingStatus._

case class ItemProcessingStatus (
  
object ItemProcessingStatus {
  import DateTimeCodecs._

  implicit val ItemProcessingStatusCodecJson: CodecJson[ItemProcessingStatus] = CodecJson.derive[ItemProcessingStatus]
  implicit val ItemProcessingStatusDecoder: EntityDecoder[ItemProcessingStatus] = jsonOf[ItemProcessingStatus]
  implicit val ItemProcessingStatusEncoder: EntityEncoder[ItemProcessingStatus] = jsonEncoderOf[ItemProcessingStatus]
}
