package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalStoreBatchUpdate._

case class LocalStoreBatchUpdate (
  /* Primary address line of the store. */
  addressPrimary: Option[String],
/* Secondary address line of the store. */
  addressSecondary: Option[String],
/* City where the store is located. */
  city: Option[String],
/* Country code where the store is located. */
  country: Option[Country],
/* The ID of the local store. */
  id: String,
/* Geographic latitude coordinate of the store. */
  latitude: Option[Float],
/* Geographic longitude coordinate of the store. */
  longitude: Option[Float],
/* The name of the local store. */
  name: Option[String],
/* Postal or ZIP code of the store. */
  postalCode: Option[String],
/* State or region code where the store is located. */
  region: Option[String],
/* Merchant provided code for the local store. Unique within the merchant's catalog. */
  storeCode: Option[String])

object LocalStoreBatchUpdate {
  import DateTimeCodecs._

  implicit val LocalStoreBatchUpdateCodecJson: CodecJson[LocalStoreBatchUpdate] = CodecJson.derive[LocalStoreBatchUpdate]
  implicit val LocalStoreBatchUpdateDecoder: EntityDecoder[LocalStoreBatchUpdate] = jsonOf[LocalStoreBatchUpdate]
  implicit val LocalStoreBatchUpdateEncoder: EntityEncoder[LocalStoreBatchUpdate] = jsonEncoderOf[LocalStoreBatchUpdate]
}
