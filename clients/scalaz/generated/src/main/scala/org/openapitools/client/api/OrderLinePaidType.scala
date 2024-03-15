package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLinePaidType._

case class OrderLinePaidType (
  
object OrderLinePaidType {
  import DateTimeCodecs._

  implicit val OrderLinePaidTypeCodecJson: CodecJson[OrderLinePaidType] = CodecJson.derive[OrderLinePaidType]
  implicit val OrderLinePaidTypeDecoder: EntityDecoder[OrderLinePaidType] = jsonOf[OrderLinePaidType]
  implicit val OrderLinePaidTypeEncoder: EntityEncoder[OrderLinePaidType] = jsonEncoderOf[OrderLinePaidType]
}
