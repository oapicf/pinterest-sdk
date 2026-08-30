package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsBaseFiltersAllOf._

case class CatalogsBaseFiltersAllOf (
  allOf: List[CatalogsBaseFilterKeys])

object CatalogsBaseFiltersAllOf {
  import DateTimeCodecs._

  implicit val CatalogsBaseFiltersAllOfCodecJson: CodecJson[CatalogsBaseFiltersAllOf] = CodecJson.derive[CatalogsBaseFiltersAllOf]
  implicit val CatalogsBaseFiltersAllOfDecoder: EntityDecoder[CatalogsBaseFiltersAllOf] = jsonOf[CatalogsBaseFiltersAllOf]
  implicit val CatalogsBaseFiltersAllOfEncoder: EntityEncoder[CatalogsBaseFiltersAllOf] = jsonEncoderOf[CatalogsBaseFiltersAllOf]
}
