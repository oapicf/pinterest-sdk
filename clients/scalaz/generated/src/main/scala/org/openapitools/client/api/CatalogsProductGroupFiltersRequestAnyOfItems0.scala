package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFiltersRequestAnyOfItems0._

case class CatalogsProductGroupFiltersRequestAnyOfItems0 (
  anyOf: List[CatalogsProductGroupFilterKeys])

object CatalogsProductGroupFiltersRequestAnyOfItems0 {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersRequestAnyOfItems0CodecJson: CodecJson[CatalogsProductGroupFiltersRequestAnyOfItems0] = CodecJson.derive[CatalogsProductGroupFiltersRequestAnyOfItems0]
  implicit val CatalogsProductGroupFiltersRequestAnyOfItems0Decoder: EntityDecoder[CatalogsProductGroupFiltersRequestAnyOfItems0] = jsonOf[CatalogsProductGroupFiltersRequestAnyOfItems0]
  implicit val CatalogsProductGroupFiltersRequestAnyOfItems0Encoder: EntityEncoder[CatalogsProductGroupFiltersRequestAnyOfItems0] = jsonEncoderOf[CatalogsProductGroupFiltersRequestAnyOfItems0]
}
