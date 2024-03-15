package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailItemResponse._

case class CatalogsRetailItemResponse (
  catalogType: CatalogsType,
/* The catalog retail item id in the merchant namespace */
  itemId: Option[String],
/* The pins mapped to the item */
  pins: Option[List[Pin]],
attributes: Option[ItemAttributes])

object CatalogsRetailItemResponse {
  import DateTimeCodecs._

  implicit val CatalogsRetailItemResponseCodecJson: CodecJson[CatalogsRetailItemResponse] = CodecJson.derive[CatalogsRetailItemResponse]
  implicit val CatalogsRetailItemResponseDecoder: EntityDecoder[CatalogsRetailItemResponse] = jsonOf[CatalogsRetailItemResponse]
  implicit val CatalogsRetailItemResponseEncoder: EntityEncoder[CatalogsRetailItemResponse] = jsonEncoderOf[CatalogsRetailItemResponse]
}
