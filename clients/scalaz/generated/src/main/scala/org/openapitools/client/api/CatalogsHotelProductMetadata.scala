package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductMetadata._

case class CatalogsHotelProductMetadata (
  /* The user-created unique ID that represents the hotel item. */
  hotelId: String)

object CatalogsHotelProductMetadata {
  import DateTimeCodecs._

  implicit val CatalogsHotelProductMetadataCodecJson: CodecJson[CatalogsHotelProductMetadata] = CodecJson.derive[CatalogsHotelProductMetadata]
  implicit val CatalogsHotelProductMetadataDecoder: EntityDecoder[CatalogsHotelProductMetadata] = jsonOf[CatalogsHotelProductMetadata]
  implicit val CatalogsHotelProductMetadataEncoder: EntityEncoder[CatalogsHotelProductMetadata] = jsonEncoderOf[CatalogsHotelProductMetadata]
}
