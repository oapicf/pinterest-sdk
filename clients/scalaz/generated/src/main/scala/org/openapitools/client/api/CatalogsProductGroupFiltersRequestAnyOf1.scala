package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFiltersRequestAnyOf1._

case class CatalogsProductGroupFiltersRequestAnyOf1 (
  allOf: List[CatalogsProductGroupFilterKeys])

object CatalogsProductGroupFiltersRequestAnyOf1 {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersRequestAnyOf1CodecJson: CodecJson[CatalogsProductGroupFiltersRequestAnyOf1] = CodecJson.derive[CatalogsProductGroupFiltersRequestAnyOf1]
  implicit val CatalogsProductGroupFiltersRequestAnyOf1Decoder: EntityDecoder[CatalogsProductGroupFiltersRequestAnyOf1] = jsonOf[CatalogsProductGroupFiltersRequestAnyOf1]
  implicit val CatalogsProductGroupFiltersRequestAnyOf1Encoder: EntityEncoder[CatalogsProductGroupFiltersRequestAnyOf1] = jsonEncoderOf[CatalogsProductGroupFiltersRequestAnyOf1]
}
