package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkOutputFormat._

case class BulkOutputFormat (
  
object BulkOutputFormat {
  import DateTimeCodecs._

  implicit val BulkOutputFormatCodecJson: CodecJson[BulkOutputFormat] = CodecJson.derive[BulkOutputFormat]
  implicit val BulkOutputFormatDecoder: EntityDecoder[BulkOutputFormat] = jsonOf[BulkOutputFormat]
  implicit val BulkOutputFormatEncoder: EntityEncoder[BulkOutputFormat] = jsonEncoderOf[BulkOutputFormat]
}
