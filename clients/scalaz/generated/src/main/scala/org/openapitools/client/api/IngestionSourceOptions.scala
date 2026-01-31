package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IngestionSourceOptions._

case class IngestionSourceOptions (
  
object IngestionSourceOptions {
  import DateTimeCodecs._

  implicit val IngestionSourceOptionsCodecJson: CodecJson[IngestionSourceOptions] = CodecJson.derive[IngestionSourceOptions]
  implicit val IngestionSourceOptionsDecoder: EntityDecoder[IngestionSourceOptions] = jsonOf[IngestionSourceOptions]
  implicit val IngestionSourceOptionsEncoder: EntityEncoder[IngestionSourceOptions] = jsonEncoderOf[IngestionSourceOptions]
}
