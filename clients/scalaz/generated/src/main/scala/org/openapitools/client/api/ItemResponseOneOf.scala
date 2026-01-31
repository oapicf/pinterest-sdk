package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemResponseOneOf._

case class ItemResponseOneOf (
  catalogType: CatalogsType,
attributes: Option[CatalogsCreativeAssetsAttributes],
/* The catalog retail item id in the merchant namespace */
  itemId: Option[String],
/* The pins mapped to the item */
  pins: Option[List[Pin]],
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],
/* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String])

object ItemResponseOneOf {
  import DateTimeCodecs._

  implicit val ItemResponseOneOfCodecJson: CodecJson[ItemResponseOneOf] = CodecJson.derive[ItemResponseOneOf]
  implicit val ItemResponseOneOfDecoder: EntityDecoder[ItemResponseOneOf] = jsonOf[ItemResponseOneOf]
  implicit val ItemResponseOneOfEncoder: EntityEncoder[ItemResponseOneOf] = jsonEncoderOf[ItemResponseOneOf]
}
