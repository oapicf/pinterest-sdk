package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupType._

case class CatalogsHotelProductGroupType (
  
object CatalogsHotelProductGroupType {
  import DateTimeCodecs._

  implicit val CatalogsHotelProductGroupTypeCodecJson: CodecJson[CatalogsHotelProductGroupType] = CodecJson.derive[CatalogsHotelProductGroupType]
  implicit val CatalogsHotelProductGroupTypeDecoder: EntityDecoder[CatalogsHotelProductGroupType] = jsonOf[CatalogsHotelProductGroupType]
  implicit val CatalogsHotelProductGroupTypeEncoder: EntityEncoder[CatalogsHotelProductGroupType] = jsonEncoderOf[CatalogsHotelProductGroupType]
}
