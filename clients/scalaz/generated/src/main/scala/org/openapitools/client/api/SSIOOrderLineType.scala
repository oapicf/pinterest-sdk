package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOOrderLineType._

case class SSIOOrderLineType (
  
object SSIOOrderLineType {
  import DateTimeCodecs._

  implicit val SSIOOrderLineTypeCodecJson: CodecJson[SSIOOrderLineType] = CodecJson.derive[SSIOOrderLineType]
  implicit val SSIOOrderLineTypeDecoder: EntityDecoder[SSIOOrderLineType] = jsonOf[SSIOOrderLineType]
  implicit val SSIOOrderLineTypeEncoder: EntityEncoder[SSIOOrderLineType] = jsonEncoderOf[SSIOOrderLineType]
}
