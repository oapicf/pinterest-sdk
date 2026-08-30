package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventIngestionSource._

case class ConversionEventIngestionSource (
  
object ConversionEventIngestionSource {
  import DateTimeCodecs._

  implicit val ConversionEventIngestionSourceCodecJson: CodecJson[ConversionEventIngestionSource] = CodecJson.derive[ConversionEventIngestionSource]
  implicit val ConversionEventIngestionSourceDecoder: EntityDecoder[ConversionEventIngestionSource] = jsonOf[ConversionEventIngestionSource]
  implicit val ConversionEventIngestionSourceEncoder: EntityEncoder[ConversionEventIngestionSource] = jsonEncoderOf[ConversionEventIngestionSource]
}
