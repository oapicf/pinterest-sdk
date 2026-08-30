package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelAttributes._

case class CatalogsHotelAttributes (
  /* Hotel address */
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
/* If specified, you must provide all properties */
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
  salePrice: Option[String],
/* <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. */
  additionalImageLink: Option[List[String]],
/* AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. */
  aiDisclosures: Option[List[CatalogsAiContentDisclosure]],
/* The main hotel image */
  mainImage: Option[CatalogsHotelMainImage])

object CatalogsHotelAttributes {
  import DateTimeCodecs._

  implicit val CatalogsHotelAttributesCodecJson: CodecJson[CatalogsHotelAttributes] = CodecJson.derive[CatalogsHotelAttributes]
  implicit val CatalogsHotelAttributesDecoder: EntityDecoder[CatalogsHotelAttributes] = jsonOf[CatalogsHotelAttributes]
  implicit val CatalogsHotelAttributesEncoder: EntityEncoder[CatalogsHotelAttributes] = jsonEncoderOf[CatalogsHotelAttributes]
}
