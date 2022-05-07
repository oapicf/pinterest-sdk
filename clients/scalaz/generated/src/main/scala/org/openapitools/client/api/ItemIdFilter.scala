package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemIdFilter._

case class ItemIdFilter (
  ITEM_ID: CatalogsProductGroupCurrencyCriteria)

object ItemIdFilter {
  import DateTimeCodecs._

  implicit val ItemIdFilterCodecJson: CodecJson[ItemIdFilter] = CodecJson.derive[ItemIdFilter]
  implicit val ItemIdFilterDecoder: EntityDecoder[ItemIdFilter] = jsonOf[ItemIdFilter]
  implicit val ItemIdFilterEncoder: EntityEncoder[ItemIdFilter] = jsonEncoderOf[ItemIdFilter]
}
