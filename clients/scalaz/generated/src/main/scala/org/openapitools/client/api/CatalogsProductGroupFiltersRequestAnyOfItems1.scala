package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFiltersRequestAnyOfItems1._

case class CatalogsProductGroupFiltersRequestAnyOfItems1 (
  allOf: List[CatalogsProductGroupFilterKeys])

object CatalogsProductGroupFiltersRequestAnyOfItems1 {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersRequestAnyOfItems1CodecJson: CodecJson[CatalogsProductGroupFiltersRequestAnyOfItems1] = CodecJson.derive[CatalogsProductGroupFiltersRequestAnyOfItems1]
  implicit val CatalogsProductGroupFiltersRequestAnyOfItems1Decoder: EntityDecoder[CatalogsProductGroupFiltersRequestAnyOfItems1] = jsonOf[CatalogsProductGroupFiltersRequestAnyOfItems1]
  implicit val CatalogsProductGroupFiltersRequestAnyOfItems1Encoder: EntityEncoder[CatalogsProductGroupFiltersRequestAnyOfItems1] = jsonEncoderOf[CatalogsProductGroupFiltersRequestAnyOfItems1]
}
