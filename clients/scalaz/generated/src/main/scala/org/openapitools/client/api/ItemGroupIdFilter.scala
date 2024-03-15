package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemGroupIdFilter._

case class ItemGroupIdFilter (
  ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria)

object ItemGroupIdFilter {
  import DateTimeCodecs._

  implicit val ItemGroupIdFilterCodecJson: CodecJson[ItemGroupIdFilter] = CodecJson.derive[ItemGroupIdFilter]
  implicit val ItemGroupIdFilterDecoder: EntityDecoder[ItemGroupIdFilter] = jsonOf[ItemGroupIdFilter]
  implicit val ItemGroupIdFilterEncoder: EntityEncoder[ItemGroupIdFilter] = jsonEncoderOf[ItemGroupIdFilter]
}
