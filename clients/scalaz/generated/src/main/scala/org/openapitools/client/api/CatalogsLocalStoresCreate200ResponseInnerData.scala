package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsLocalStoresCreate200ResponseInnerData._

case class CatalogsLocalStoresCreate200ResponseInnerData (
  /* Primary address line of the store. */
  addressPrimary: Option[String],
/* Secondary address line of the store. */
  addressSecondary: Option[String],
/* City where the store is located. */
  city: Option[String],
/* Country code where the store is located. */
  country: Country,
/* Creation timestamp */
  createdAt: OffsetDateTime,
/* The ID of the local store. */
  id: String,
/* Geographic latitude coordinate of the store. */
  latitude: Option[Float],
/* Geographic longitude coordinate of the store. */
  longitude: Option[Float],
/* The name of the local store. */
  name: String,
/* Postal or ZIP code of the store. */
  postalCode: Option[String],
/* State or region code where the store is located. */
  region: Option[String],
/* Merchant provided code for the local store. Unique within the merchant's catalog. */
  storeCode: String,
/* Last update timestamp */
  updatedAt: OffsetDateTime,
exceptions: Error)

object CatalogsLocalStoresCreate200ResponseInnerData {
  import DateTimeCodecs._

  implicit val CatalogsLocalStoresCreate200ResponseInnerDataCodecJson: CodecJson[CatalogsLocalStoresCreate200ResponseInnerData] = CodecJson.derive[CatalogsLocalStoresCreate200ResponseInnerData]
  implicit val CatalogsLocalStoresCreate200ResponseInnerDataDecoder: EntityDecoder[CatalogsLocalStoresCreate200ResponseInnerData] = jsonOf[CatalogsLocalStoresCreate200ResponseInnerData]
  implicit val CatalogsLocalStoresCreate200ResponseInnerDataEncoder: EntityEncoder[CatalogsLocalStoresCreate200ResponseInnerData] = jsonEncoderOf[CatalogsLocalStoresCreate200ResponseInnerData]
}
