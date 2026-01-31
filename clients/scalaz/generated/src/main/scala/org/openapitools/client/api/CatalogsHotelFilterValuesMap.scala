package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelFilterValuesMap._

case class CatalogsHotelFilterValuesMap (
  brand: Option[List[String]],
customLabel0: Option[List[String]],
customLabel1: Option[List[String]],
customLabel2: Option[List[String]],
customLabel3: Option[List[String]],
customLabel4: Option[List[String]])

object CatalogsHotelFilterValuesMap {
  import DateTimeCodecs._

  implicit val CatalogsHotelFilterValuesMapCodecJson: CodecJson[CatalogsHotelFilterValuesMap] = CodecJson.derive[CatalogsHotelFilterValuesMap]
  implicit val CatalogsHotelFilterValuesMapDecoder: EntityDecoder[CatalogsHotelFilterValuesMap] = jsonOf[CatalogsHotelFilterValuesMap]
  implicit val CatalogsHotelFilterValuesMapEncoder: EntityEncoder[CatalogsHotelFilterValuesMap] = jsonEncoderOf[CatalogsHotelFilterValuesMap]
}
