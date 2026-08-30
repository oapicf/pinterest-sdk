package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsBaseFiltersAnyOf._

case class CatalogsBaseFiltersAnyOf (
  anyOf: List[CatalogsBaseFilterKeys])

object CatalogsBaseFiltersAnyOf {
  import DateTimeCodecs._

  implicit val CatalogsBaseFiltersAnyOfCodecJson: CodecJson[CatalogsBaseFiltersAnyOf] = CodecJson.derive[CatalogsBaseFiltersAnyOf]
  implicit val CatalogsBaseFiltersAnyOfDecoder: EntityDecoder[CatalogsBaseFiltersAnyOf] = jsonOf[CatalogsBaseFiltersAnyOf]
  implicit val CatalogsBaseFiltersAnyOfEncoder: EntityEncoder[CatalogsBaseFiltersAnyOf] = jsonEncoderOf[CatalogsBaseFiltersAnyOf]
}
