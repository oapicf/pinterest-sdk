package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import LocalStore._

case class LocalStore (
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
  updatedAt: OffsetDateTime)

object LocalStore {
  import DateTimeCodecs._

  implicit val LocalStoreCodecJson: CodecJson[LocalStore] = CodecJson.derive[LocalStore]
  implicit val LocalStoreDecoder: EntityDecoder[LocalStore] = jsonOf[LocalStore]
  implicit val LocalStoreEncoder: EntityEncoder[LocalStore] = jsonEncoderOf[LocalStore]
}
