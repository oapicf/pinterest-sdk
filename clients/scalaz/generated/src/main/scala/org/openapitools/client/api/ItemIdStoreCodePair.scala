package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemIdStoreCodePair._

case class ItemIdStoreCodePair (
  /* Catalog item id in the merchant namespace */
  itemId: String,
/* Store code for the local inventory item */
  storeCode: String)

object ItemIdStoreCodePair {
  import DateTimeCodecs._

  implicit val ItemIdStoreCodePairCodecJson: CodecJson[ItemIdStoreCodePair] = CodecJson.derive[ItemIdStoreCodePair]
  implicit val ItemIdStoreCodePairDecoder: EntityDecoder[ItemIdStoreCodePair] = jsonOf[ItemIdStoreCodePair]
  implicit val ItemIdStoreCodePairEncoder: EntityEncoder[ItemIdStoreCodePair] = jsonEncoderOf[ItemIdStoreCodePair]
}
