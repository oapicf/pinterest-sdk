package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFiltersRequest._

case class CatalogsProductGroupFiltersRequest (
  anyOf: List[CatalogsProductGroupFilterKeys],
allOf: List[CatalogsProductGroupFilterKeys])

object CatalogsProductGroupFiltersRequest {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersRequestCodecJson: CodecJson[CatalogsProductGroupFiltersRequest] = CodecJson.derive[CatalogsProductGroupFiltersRequest]
  implicit val CatalogsProductGroupFiltersRequestDecoder: EntityDecoder[CatalogsProductGroupFiltersRequest] = jsonOf[CatalogsProductGroupFiltersRequest]
  implicit val CatalogsProductGroupFiltersRequestEncoder: EntityEncoder[CatalogsProductGroupFiltersRequest] = jsonEncoderOf[CatalogsProductGroupFiltersRequest]
}
