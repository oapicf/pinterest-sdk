package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupType._

case class CatalogsProductGroupType (
  
object CatalogsProductGroupType {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupTypeCodecJson: CodecJson[CatalogsProductGroupType] = CodecJson.derive[CatalogsProductGroupType]
  implicit val CatalogsProductGroupTypeDecoder: EntityDecoder[CatalogsProductGroupType] = jsonOf[CatalogsProductGroupType]
  implicit val CatalogsProductGroupTypeEncoder: EntityEncoder[CatalogsProductGroupType] = jsonEncoderOf[CatalogsProductGroupType]
}
