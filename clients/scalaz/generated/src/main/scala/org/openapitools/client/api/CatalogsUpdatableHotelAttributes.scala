package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsUpdatableHotelAttributes._

case class CatalogsUpdatableHotelAttributes (
  address: Option[CatalogsHotelAddress],
/* Base price of the hotel room per night followed by the ISO currency code */
  basePrice: Option[String],
/* The brand to which this hotel belongs to. */
  brand: Option[String],
/* The type of property. The category can be any type of internal description desired. */
  category: Option[String],
/* Custom grouping of hotels */
  customLabel0: Option[String],
/* Custom grouping of hotels */
  customLabel1: Option[String],
/* Custom grouping of hotels */
  customLabel2: Option[String],
/* Custom grouping of hotels */
  customLabel3: Option[String],
/* Custom grouping of hotels */
  customLabel4: Option[String],
/* Brief description of the hotel. */
  description: Option[String],
guestRatings: Option[CatalogsHotelGuestRatings],
/* Latitude of the hotel. */
  latitude: Option[BigDecimal],
/* Link to the product page */
  link: Option[String],
/* Longitude of the hotel. */
  longitude: Option[BigDecimal],
/* The hotel's name. */
  name: Option[String],
/* A list of neighborhoods where the hotel is located */
  neighborhood: Option[List[String]],
/* Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. */
  salePrice: Option[String])

object CatalogsUpdatableHotelAttributes {
  import DateTimeCodecs._

  implicit val CatalogsUpdatableHotelAttributesCodecJson: CodecJson[CatalogsUpdatableHotelAttributes] = CodecJson.derive[CatalogsUpdatableHotelAttributes]
  implicit val CatalogsUpdatableHotelAttributesDecoder: EntityDecoder[CatalogsUpdatableHotelAttributes] = jsonOf[CatalogsUpdatableHotelAttributes]
  implicit val CatalogsUpdatableHotelAttributesEncoder: EntityEncoder[CatalogsUpdatableHotelAttributes] = jsonEncoderOf[CatalogsUpdatableHotelAttributes]
}
