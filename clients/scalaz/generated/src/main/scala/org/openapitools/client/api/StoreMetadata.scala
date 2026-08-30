package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StoreMetadata._

case class StoreMetadata (
  /* Geohash of the store location */
  geohash: Option[String],
/* Geographic latitude coordinate of the store */
  latitude: Option[Double],
/* Geographic longitude coordinate of the store */
  longitude: Option[Double],
/* Merchant provided store code */
  storeCode: String,
/* Internal store code */
  storeId: String,
/* Store name */
  storeName: Option[String])

object StoreMetadata {
  import DateTimeCodecs._

  implicit val StoreMetadataCodecJson: CodecJson[StoreMetadata] = CodecJson.derive[StoreMetadata]
  implicit val StoreMetadataDecoder: EntityDecoder[StoreMetadata] = jsonOf[StoreMetadata]
  implicit val StoreMetadataEncoder: EntityEncoder[StoreMetadata] = jsonEncoderOf[StoreMetadata]
}
