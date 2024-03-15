package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkEntityType._

case class BulkEntityType (
  
object BulkEntityType {
  import DateTimeCodecs._

  implicit val BulkEntityTypeCodecJson: CodecJson[BulkEntityType] = CodecJson.derive[BulkEntityType]
  implicit val BulkEntityTypeDecoder: EntityDecoder[BulkEntityType] = jsonOf[BulkEntityType]
  implicit val BulkEntityTypeEncoder: EntityEncoder[BulkEntityType] = jsonEncoderOf[BulkEntityType]
}
