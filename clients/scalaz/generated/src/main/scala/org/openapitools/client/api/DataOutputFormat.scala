package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DataOutputFormat._

case class DataOutputFormat (
  
object DataOutputFormat {
  import DateTimeCodecs._

  implicit val DataOutputFormatCodecJson: CodecJson[DataOutputFormat] = CodecJson.derive[DataOutputFormat]
  implicit val DataOutputFormatDecoder: EntityDecoder[DataOutputFormat] = jsonOf[DataOutputFormat]
  implicit val DataOutputFormatEncoder: EntityEncoder[DataOutputFormat] = jsonEncoderOf[DataOutputFormat]
}
