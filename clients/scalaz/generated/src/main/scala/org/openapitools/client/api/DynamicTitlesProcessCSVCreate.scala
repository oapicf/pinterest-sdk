package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DynamicTitlesProcessCSVCreate._

case class DynamicTitlesProcessCSVCreate (
  /* The request_id returned from the GET uploads endpoint. */
  requestId: String)

object DynamicTitlesProcessCSVCreate {
  import DateTimeCodecs._

  implicit val DynamicTitlesProcessCSVCreateCodecJson: CodecJson[DynamicTitlesProcessCSVCreate] = CodecJson.derive[DynamicTitlesProcessCSVCreate]
  implicit val DynamicTitlesProcessCSVCreateDecoder: EntityDecoder[DynamicTitlesProcessCSVCreate] = jsonOf[DynamicTitlesProcessCSVCreate]
  implicit val DynamicTitlesProcessCSVCreateEncoder: EntityEncoder[DynamicTitlesProcessCSVCreate] = jsonEncoderOf[DynamicTitlesProcessCSVCreate]
}
