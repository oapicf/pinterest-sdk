package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChangeHistoryDataType._

case class ChangeHistoryDataType (
  
object ChangeHistoryDataType {
  import DateTimeCodecs._

  implicit val ChangeHistoryDataTypeCodecJson: CodecJson[ChangeHistoryDataType] = CodecJson.derive[ChangeHistoryDataType]
  implicit val ChangeHistoryDataTypeDecoder: EntityDecoder[ChangeHistoryDataType] = jsonOf[ChangeHistoryDataType]
  implicit val ChangeHistoryDataTypeEncoder: EntityEncoder[ChangeHistoryDataType] = jsonEncoderOf[ChangeHistoryDataType]
}
