package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreativeType._

case class CreativeType (
  
object CreativeType {
  import DateTimeCodecs._

  implicit val CreativeTypeCodecJson: CodecJson[CreativeType] = CodecJson.derive[CreativeType]
  implicit val CreativeTypeDecoder: EntityDecoder[CreativeType] = jsonOf[CreativeType]
  implicit val CreativeTypeEncoder: EntityEncoder[CreativeType] = jsonEncoderOf[CreativeType]
}
