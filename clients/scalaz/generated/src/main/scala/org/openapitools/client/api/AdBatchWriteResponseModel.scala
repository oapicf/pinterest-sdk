package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdBatchWriteResponseModel._

case class AdBatchWriteResponseModel (
  items: List[AdBatchItem])

object AdBatchWriteResponseModel {
  import DateTimeCodecs._

  implicit val AdBatchWriteResponseModelCodecJson: CodecJson[AdBatchWriteResponseModel] = CodecJson.derive[AdBatchWriteResponseModel]
  implicit val AdBatchWriteResponseModelDecoder: EntityDecoder[AdBatchWriteResponseModel] = jsonOf[AdBatchWriteResponseModel]
  implicit val AdBatchWriteResponseModelEncoder: EntityEncoder[AdBatchWriteResponseModel] = jsonEncoderOf[AdBatchWriteResponseModel]
}
