package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsType._

case class CatalogsType (
  
object CatalogsType {
  import DateTimeCodecs._

  implicit val CatalogsTypeCodecJson: CodecJson[CatalogsType] = CodecJson.derive[CatalogsType]
  implicit val CatalogsTypeDecoder: EntityDecoder[CatalogsType] = jsonOf[CatalogsType]
  implicit val CatalogsTypeEncoder: EntityEncoder[CatalogsType] = jsonEncoderOf[CatalogsType]
}
