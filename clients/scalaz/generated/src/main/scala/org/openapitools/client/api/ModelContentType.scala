package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModelContentType._

case class ModelContentType (
  
object ModelContentType {
  import DateTimeCodecs._

  implicit val ModelContentTypeCodecJson: CodecJson[ModelContentType] = CodecJson.derive[ModelContentType]
  implicit val ModelContentTypeDecoder: EntityDecoder[ModelContentType] = jsonOf[ModelContentType]
  implicit val ModelContentTypeEncoder: EntityEncoder[ModelContentType] = jsonEncoderOf[ModelContentType]
}
