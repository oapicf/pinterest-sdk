package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelAddress._

case class CatalogsHotelAddress (
  /* Primary street address of hotel. */
  addr1: Option[String],
/* City where the hotel is located. */
  city: Option[String],
/* State, county, province, where the hotel is located. */
  region: Option[String],
/* Country where the hotel is located. */
  country: Option[String],
/* Required for countries with a postal code system. Postal or zip code of the hotel. */
  postalCode: Option[String])

object CatalogsHotelAddress {
  import DateTimeCodecs._

  implicit val CatalogsHotelAddressCodecJson: CodecJson[CatalogsHotelAddress] = CodecJson.derive[CatalogsHotelAddress]
  implicit val CatalogsHotelAddressDecoder: EntityDecoder[CatalogsHotelAddress] = jsonOf[CatalogsHotelAddress]
  implicit val CatalogsHotelAddressEncoder: EntityEncoder[CatalogsHotelAddress] = jsonEncoderOf[CatalogsHotelAddress]
}
