package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupUpdateManyRequestItemsOneOfItems0._

case class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 (
  description: Option[String],
filters: Option[CatalogsProductGroupFiltersRequest],
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
name: Option[String],
/* ID of the product group. */
  id: String)

object CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupUpdateManyRequestItemsOneOfItems0CodecJson: CodecJson[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0] = CodecJson.derive[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0]
  implicit val CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Decoder: EntityDecoder[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0] = jsonOf[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0]
  implicit val CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Encoder: EntityEncoder[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0] = jsonEncoderOf[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0]
}
