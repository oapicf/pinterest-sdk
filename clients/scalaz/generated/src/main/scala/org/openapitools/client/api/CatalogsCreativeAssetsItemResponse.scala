package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsItemResponse._

case class CatalogsCreativeAssetsItemResponse (
  catalogType: CatalogsType,
/* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String],
/* The pins mapped to the item */
  pins: Option[List[Pin]],
attributes: Option[CatalogsCreativeAssetsAttributes])

object CatalogsCreativeAssetsItemResponse {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsItemResponseCodecJson: CodecJson[CatalogsCreativeAssetsItemResponse] = CodecJson.derive[CatalogsCreativeAssetsItemResponse]
  implicit val CatalogsCreativeAssetsItemResponseDecoder: EntityDecoder[CatalogsCreativeAssetsItemResponse] = jsonOf[CatalogsCreativeAssetsItemResponse]
  implicit val CatalogsCreativeAssetsItemResponseEncoder: EntityEncoder[CatalogsCreativeAssetsItemResponse] = jsonEncoderOf[CatalogsCreativeAssetsItemResponse]
}
