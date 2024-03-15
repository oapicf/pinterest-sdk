package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DataStatus._

case class DataStatus (
  
object DataStatus {
  import DateTimeCodecs._

  implicit val DataStatusCodecJson: CodecJson[DataStatus] = CodecJson.derive[DataStatus]
  implicit val DataStatusDecoder: EntityDecoder[DataStatus] = jsonOf[DataStatus]
  implicit val DataStatusEncoder: EntityEncoder[DataStatus] = jsonEncoderOf[DataStatus]
}
