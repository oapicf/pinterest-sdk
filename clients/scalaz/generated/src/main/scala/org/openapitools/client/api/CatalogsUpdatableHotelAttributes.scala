package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsUpdatableHotelAttributes._

case class CatalogsUpdatableHotelAttributes (
  /* The hotel's name. */
  name: Option[String],
/* Link to the product page */
  link: Option[String],
/* Brief description of the hotel. */
  description: Option[String],
/* The brand to which this hotel belongs to. */
  brand: Option[String],
/* Latitude of the hotel. */
  latitude: Option[BigDecimal],
/* Longitude of the hotel. */
  longitude: Option[BigDecimal],
/* A list of neighborhoods where the hotel is located */
  neighborhood: Option[List[String]],
address: Option[CatalogsHotelAddress],
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
/* The type of property. The category can be any type of internal description desired. */
  category: Option[String],
/* Base price of the hotel room per night followed by the ISO currency code */
  basePrice: Option[String],
/* Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. */
  salePrice: Option[String],
guestRatings: Option[CatalogsHotelGuestRatings])

object CatalogsUpdatableHotelAttributes {
  import DateTimeCodecs._

  implicit val CatalogsUpdatableHotelAttributesCodecJson: CodecJson[CatalogsUpdatableHotelAttributes] = CodecJson.derive[CatalogsUpdatableHotelAttributes]
  implicit val CatalogsUpdatableHotelAttributesDecoder: EntityDecoder[CatalogsUpdatableHotelAttributes] = jsonOf[CatalogsUpdatableHotelAttributes]
  implicit val CatalogsUpdatableHotelAttributesEncoder: EntityEncoder[CatalogsUpdatableHotelAttributes] = jsonEncoderOf[CatalogsUpdatableHotelAttributes]
}
